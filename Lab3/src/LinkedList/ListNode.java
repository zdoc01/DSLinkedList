package LinkedList;

public class ListNode {
	
	int 		dataItem;
	Integer 	col;
	ListNode 	next;
	ListNode 	previous;
	
	// constructor - adds the data value and column number to the node
	public ListNode(int data, Integer col) {
		dataItem = data;
		this.col = col;
	}
	
	// print the current node
	public void printNode() {
		System.out.print(dataItem + " ");
	}
	
	// return the value of the node
	public int value(){
		return dataItem;
	}
	
	// return the column number of the node
	public int colNo() {
		return col;
	}
} 