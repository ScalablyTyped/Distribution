package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////////////////
// blocks array
/////////////////////////////////////////
@js.native
trait BlocksArray extends BlocksObservable {
  
  /**
    * Adds values to the end of the observable array
    * 
    * @param value The values that will be added to the end of the array
    */
  def add(value: js.Any): BlocksArray = js.native
  /**
    * @param value The values that will be added to the end of the array
    * @param index Optional index specifying where to insert the value
    */
  def add(value: js.Any, index: Double): BlocksArray = js.native
  
  /**
    * Adds the values from the provided array(s) to the end of the collection
    * 
    * @param value The array that will be added to the end of the array
    */
  def addMany(value: js.Array[_]): BlocksArray = js.native
  /**
    * @param value The array that will be added to the end of the array
    * @param index Optional position where the array of values to be inserted
    */
  def addMany(value: js.Array[_], index: Double): BlocksArray = js.native
  
  /**
    * The concat() method is used to join two or more arrays
    * 
    * @param arrays The arrays to be joined
    */
  def concat(arrays: js.Any*): js.Array[_] = js.native
  
  /**
    * Extends the current observable with particular functionality depending on the parameters specified.
    * If the method is called without arguments and jsvalue framework is included the observable will be
    * extended with the methods available in jsvalue for the current type.
    * 
    * @param options Optional options
    */
  def extend(options: js.Any*): BlocksArray = js.native
  
  /**
    * The join() method joins the elements of an array into a string, and returns the string
    */
  def join(): String = js.native
  /**
    * @param separator The separator to be used. If omitted, the elements are separated with a comma
    */
  def join(seperator: String): String = js.native
  
  /**
    * Moves an item from one location to another in the array. Note: Faster than removing the item and adding it at the location
    * 
    * @param sourceIndex The index pointing to the item that will be moved
    * @param targetIndex The index where the item will be moved to
    */
  def move(sourceIndex: Double, targetIndex: Double): BlocksArray = js.native
  
  /**
    * The pop() method removes the last element of a observable array, and returns that element
    */
  def pop(): js.Any = js.native
  
  /** 
    * The push() method adds new items to the end of the observable array, and returns the new length
    * 
    * @param values The item(s) to add to the observable array
    */
  def push(values: js.Any*): Double = js.native
  
  /**
    * Removes an item from the observable array
    * 
    * @param value The value that will be removed or a callback function which returns true or false to determine if the value should be removed
    */
  def remove(value: js.Any): BlocksArray = js.native
  /**
    * @param value The value that will be removed or a callback function which returns true or false to determine if the value should be removed
    * @param thisArg Optional this context for the callback
    */
  def remove(value: js.Any, thisArg: js.Function): BlocksArray = js.native
  
  /**
    * Removes all items from the observable array and optionally filter which items to be removed by providing a callback
    */
  def removeAll(): BlocksArray = js.native
  /**
    * @param callback Optional callback function which filters which items to be removed. Returning a truthy value will remove the item and vice versa
    */
  def removeAll(callback: js.Function): BlocksArray = js.native
  /**
    * @param callback Optional callback function which filters which items to be removed. Returning a truthy value will remove the item and vice versa
    * @param thisArg Optional this context for the callback function
    */
  def removeAll(callback: js.Function, thisArg: js.Any): BlocksArray = js.native
  
  /**
    * Removes an item at the specified index
    * 
    * @param index The index location of the item that will be removed
    */
  def removeAt(index: Double): BlocksArray = js.native
  /**
    * @param index The index location of the item that will be removed
    * @param count Optional parameter that if specified will remove the next items starting from the specified index
    */
  def removeAt(index: Double, count: Double): BlocksArray = js.native
  
  /**
    * Removes all items from the collection and replaces them with the new value provided.
    * The value could be Array, observable array or jsvalue.Array
    * 
    * @param value The new value that will be populated
    */
  def reset(value: js.Array[_]): BlocksArray = js.native
  
  /**
    * Reverses the order of the elements in the observable array
    */
  def reverse(): js.Array[_] = js.native
  
  /**
    * Removes the first element of a observable array, and returns that element
    */
  def shift(): js.Any = js.native
  
  /**
    * The slice() method returns the selected elements in an array, as a new array object
    * 
    * @param start An integer that specifies where to start the selection (The first element has an index of 0)
    */
  def slice(start: Double): js.Array[_] = js.native
  /**
    * @param start An integer that specifies where to start the selection (The first element has an index of 0)
    * @param end An integer that specifies where to end the selection. If omitted, all elements from the start position and to the end of the array will be selected.
    *            Use negative numbers to select from the end of an array
    */
  def slice(start: Double, end: Double): js.Array[_] = js.native
  
  /**
    * Sorts the elements of an array
    */
  def sort(): js.Array[_] = js.native
  /**
    * @param sortfunction A function that defines the sort order
    */
  def sort(sortfunction: js.Function): js.Array[_] = js.native
  
  /**
    * Adds and/or removes elements from the observable array
    * Returns A new array containing the removed items, if any.
    * 
    * @param index An integer that specifies at what position to add/remove items. Use negative values to specify the position from the end of the array.
    * @param howMany The number of items to be removed. If set to 0, no items will be removed.
    * @param items The new item(s) to be added to the array.
    */
  def splice(index: Double, howMany: Double, items: js.Any*): js.Array[_] = js.native
  
  /**
    * Swaps two values in the observable array. Note: Faster than removing the items and adding them at the locations
    * 
    * @param indexA The first index that points to the index in the array that will be swapped
    * @param indexB The second index that points to the index in the array that will be swapped
    */
  def swap(indexA: Double, indexB: Double): BlocksArray = js.native
  
  /**
    * The unshift() method adds new items to the beginning of an array, and returns the new length.
    * 
    * @param items
    */
  def unshift(items: js.Any*): Double = js.native
}
