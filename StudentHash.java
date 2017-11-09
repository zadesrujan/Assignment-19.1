package hash;
//here we cretaed package as hash which that organizes a set of related classes and interfaces.
import java.util.HashSet;
import java.util.Iterator;

class Student//default constructor
{
    String name;
 // String will refer set of characters
    int rollNo;
 //int is datatype which consists of integer
    String department;
 
    public Student(String name, int rollNo, String department)
    //parameterized constructor
    {
        this.name = name;
 //this will refer current object 
        this.rollNo = rollNo;
 
        this.department = department;
    }
 
    @Override
    public int hashCode()
   //hashCode() method which digest the data stored in a instance of the class
    {
        return rollNo;
        //return the value
    }
 
    @Override
    public boolean equals(Object obj)
    //This method checks if some other object passed to it as an argument is equal to the object on which this method is invoked.
    {
        Student student = (Student) obj;
        //This method is used to compare two objects.
        return (rollNo == student.rollNo);
    }
 
    @Override
    //This method returns itself a string.
    public String toString()
    {
        return rollNo+", "+name+", "+department;
    }
}
 
public class StudentHash
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class

{
    public static void main(String[] args)
  //public : it can be called from anywhere.
  	//static : doesn't belong to a specific object.
  	//void : returns to no value.
  	//main : is special because it will start the program.
		
    {
       //creating the object
    	HashSet<Student> set = new HashSet<Student>();
 
        //Adding elements to HashSet
        //set is an interface which extends Collection 
        //add method inserts the specified element E at the specified position in this list.
        set.add(new Student("Srujan", 456, "ECE"));
 
        set.add(new Student("Avinash", 345, "EEE"));
 
        set.add(new Student("Sudha", 987, "Civil"));
 
        set.add(new Student("Priya", 233, "IT"));
 
        set.add(new Student("Uma", 876, "CS"));
 
        set.add(new Student("Ankit", 103, "IT"));
 
        set.add(new Student("Amit", 301, "IT"));          
        //duplicate element
 
        set.add(new Student("Vidu", 872, "ECE"));
 
        set.add(new Student("Mehra", 301, "CS"));       
        //duplicate element
 
        set.add(new Student("Ankit", 565, "Civil"));
 
        //Iterating through HashSet
        //Iterators are used in Collection framework in Java
        Iterator<Student> it = set.iterator();
      //while loop is used to iterate a part of the program several times
        while (it.hasNext())
        {
        	//creating the object
            Student student = (Student) it.next();
	          
            System.out.println(student);
          //system : is a class in java language pacakge.
    		//out : static member of the system class.
    		//println : to print what is output.
        }
    }
}