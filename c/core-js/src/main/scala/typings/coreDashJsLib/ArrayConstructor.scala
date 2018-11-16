package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #############################################################################################
// Mozilla JavaScript: Array generics
// Modules: js.array.statics
// #############################################################################################
@js.native
trait ArrayConstructor extends js.Object {
  /**
       * Combines two or more arrays.
       * @param items Additional items to add to the end of array1.
       */
  def concat[T](array: stdLib.ArrayLike[T], items: (Array[T] | T)*): Array[T] = js.native
  /**
       * Returns the this object after copying a section of the array identified by start and end
       * to the same array starting at position target
       * @param target If target is negative, it is treated as length+target where length is the
       * length of the array.
       * @param start If start is negative, it is treated as length+start. If end is negative, it
       * is treated as length+end.
       * @param end If not specified, length of the this object is used as its default value.
       */
  def copyWithin[T](array: stdLib.ArrayLike[T], target: scala.Double, start: scala.Double): Array[T] = js.native
  /**
       * Returns the this object after copying a section of the array identified by start and end
       * to the same array starting at position target
       * @param target If target is negative, it is treated as length+target where length is the
       * length of the array.
       * @param start If start is negative, it is treated as length+start. If end is negative, it
       * is treated as length+end.
       * @param end If not specified, length of the this object is used as its default value.
       */
  def copyWithin[T](array: stdLib.ArrayLike[T], target: scala.Double, start: scala.Double, end: scala.Double): Array[T] = js.native
  /**
       * Returns an array of key, value pairs for every entry in the array
       */
  def entries[T](array: stdLib.ArrayLike[T]): nodeLib.IterableIterator[js.Tuple2[scala.Double, T]] = js.native
  /**
       * Determines whether all the members of an array satisfy the specified test.
       * @param callbackfn  A function that accepts up to three arguments.
       *        The every method calls the callbackfn function for each element in array1 until the callbackfn returns false, or until the end of the array.
       * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
       */
  def every[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean]
  ): scala.Boolean = js.native
  /**
       * Determines whether all the members of an array satisfy the specified test.
       * @param callbackfn  A function that accepts up to three arguments.
       *        The every method calls the callbackfn function for each element in array1 until the callbackfn returns false, or until the end of the array.
       * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
       */
  def every[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean],
    thisArg: js.Any
  ): scala.Boolean = js.native
  /**
       * Returns the this object after filling the section identified by start and end with value
       * @param value value to fill array section with
       * @param start index to start filling the array at. If start is negative, it is treated as
       * length+start where length is the length of the array.
       * @param end index to stop filling the array at. If end is negative, it is treated as
       * length+end.
       */
  def fill[T](array: stdLib.ArrayLike[T], value: T): Array[T] = js.native
  /**
       * Returns the this object after filling the section identified by start and end with value
       * @param value value to fill array section with
       * @param start index to start filling the array at. If start is negative, it is treated as
       * length+start where length is the length of the array.
       * @param end index to stop filling the array at. If end is negative, it is treated as
       * length+end.
       */
  def fill[T](array: stdLib.ArrayLike[T], value: T, start: scala.Double): Array[T] = js.native
  /**
       * Returns the this object after filling the section identified by start and end with value
       * @param value value to fill array section with
       * @param start index to start filling the array at. If start is negative, it is treated as
       * length+start where length is the length of the array.
       * @param end index to stop filling the array at. If end is negative, it is treated as
       * length+end.
       */
  def fill[T](array: stdLib.ArrayLike[T], value: T, start: scala.Double, end: scala.Double): Array[T] = js.native
  /**
       * Returns the elements of an array that meet the condition specified in a callback function.
       * @param callbackfn A function that accepts up to three arguments. The filter method calls the callbackfn function one time for each element in the array.
       * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
       */
  def filter[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean]
  ): Array[T] = js.native
  /**
       * Returns the elements of an array that meet the condition specified in a callback function.
       * @param callbackfn A function that accepts up to three arguments. The filter method calls the callbackfn function one time for each element in the array.
       * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
       */
  def filter[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean],
    thisArg: js.Any
  ): Array[T] = js.native
  /**
       * Returns the value of the first element in the array where predicate is true, and undefined
       * otherwise.
       * @param predicate find calls predicate once for each element of the array, in ascending
       * order, until it finds one where predicate returns true. If such an element is found, find
       * immediately returns that element value. Otherwise, find returns undefined.
       * @param thisArg If provided, it will be used as the this value for each invocation of
       * predicate. If it is not provided, undefined is used instead.
       */
  def find[T](
    array: stdLib.ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ Array[T], scala.Boolean]
  ): T = js.native
  /**
       * Returns the value of the first element in the array where predicate is true, and undefined
       * otherwise.
       * @param predicate find calls predicate once for each element of the array, in ascending
       * order, until it finds one where predicate returns true. If such an element is found, find
       * immediately returns that element value. Otherwise, find returns undefined.
       * @param thisArg If provided, it will be used as the this value for each invocation of
       * predicate. If it is not provided, undefined is used instead.
       */
  def find[T](
    array: stdLib.ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ Array[T], scala.Boolean],
    thisArg: js.Any
  ): T = js.native
  /**
       * Returns the index of the first element in the array where predicate is true, and undefined
       * otherwise.
       * @param predicate find calls predicate once for each element of the array, in ascending
       * order, until it finds one where predicate returns true. If such an element is found, find
       * immediately returns that element value. Otherwise, find returns undefined.
       * @param thisArg If provided, it will be used as the this value for each invocation of
       * predicate. If it is not provided, undefined is used instead.
       */
  def findIndex[T](array: stdLib.ArrayLike[T], predicate: js.Function1[/* value */ T, scala.Boolean]): scala.Double = js.native
  /**
       * Returns the index of the first element in the array where predicate is true, and undefined
       * otherwise.
       * @param predicate find calls predicate once for each element of the array, in ascending
       * order, until it finds one where predicate returns true. If such an element is found, find
       * immediately returns that element value. Otherwise, find returns undefined.
       * @param thisArg If provided, it will be used as the this value for each invocation of
       * predicate. If it is not provided, undefined is used instead.
       */
  def findIndex[T](array: stdLib.ArrayLike[T], predicate: js.Function1[/* value */ T, scala.Boolean], thisArg: js.Any): scala.Double = js.native
  /**
       * Performs the specified action for each element in an array.
       * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
       * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
       */
  def forEach[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Performs the specified action for each element in an array.
       * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
       * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
       */
  def forEach[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def includes[T](array: stdLib.ArrayLike[T], value: T): scala.Boolean = js.native
  def includes[T](array: stdLib.ArrayLike[T], value: T, fromIndex: scala.Double): scala.Boolean = js.native
  /**
       * Returns the index of the first occurrence of a value in an array.
       * @param searchElement The value to locate in the array.
       * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
       */
  def indexOf[T](array: stdLib.ArrayLike[T], searchElement: T): scala.Double = js.native
  /**
       * Returns the index of the first occurrence of a value in an array.
       * @param searchElement The value to locate in the array.
       * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
       */
  def indexOf[T](array: stdLib.ArrayLike[T], searchElement: T, fromIndex: scala.Double): scala.Double = js.native
  /**
       * Adds all the elements of an array separated by the specified separator string.
       * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
       */
  def join[T](array: stdLib.ArrayLike[T]): java.lang.String = js.native
  /**
       * Adds all the elements of an array separated by the specified separator string.
       * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
       */
  def join[T](array: stdLib.ArrayLike[T], separator: java.lang.String): java.lang.String = js.native
  /**
       * Returns an list of keys in the array
       */
  def keys[T](array: stdLib.ArrayLike[T]): nodeLib.IterableIterator[scala.Double] = js.native
  /**
       * Returns the index of the last occurrence of a specified value in an array.
       * @param searchElement The value to locate in the array.
       * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
       */
  def lastIndexOf[T](array: stdLib.ArrayLike[T], earchElement: T): scala.Double = js.native
  /**
       * Returns the index of the last occurrence of a specified value in an array.
       * @param searchElement The value to locate in the array.
       * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
       */
  def lastIndexOf[T](array: stdLib.ArrayLike[T], earchElement: T, fromIndex: scala.Double): scala.Double = js.native
  /**
       * Calls a defined callback function on each element of an array, and returns an array that contains the results.
       * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
       * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
       */
  def map[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], U]
  ): Array[U] = js.native
  /**
       * Calls a defined callback function on each element of an array, and returns an array that contains the results.
       * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
       * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
       */
  def map[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], U],
    thisArg: js.Any
  ): Array[U] = js.native
  /**
       * Removes the last element from an array and returns it.
       */
  def pop[T](array: stdLib.ArrayLike[T]): T = js.native
  /**
       * Appends new elements to an array, and returns the new length of the array.
       * @param items New elements of the Array.
       */
  def push[T](array: stdLib.ArrayLike[T], items: T*): scala.Double = js.native
  /**
       * Calls the specified callback function for all the elements in an array.
       * The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
       * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
       * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation.
       *        The first call to the callbackfn function provides this value as an argument instead of an array value.
       */
  def reduce[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = js.native
  /**
       * Calls the specified callback function for all the elements in an array.
       * The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
       * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
       * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation.
       *        The first call to the callbackfn function provides this value as an argument instead of an array value.
       */
  def reduce[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  /**
       * Calls the specified callback function for all the elements in an array, in descending order.
       * The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
       * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
       * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation.
       *        The first call to the callbackfn function provides this value as an argument instead of an array value.
       */
  def reduceRight[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = js.native
  /**
       * Calls the specified callback function for all the elements in an array, in descending order.
       * The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
       * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
       * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation.
       *        The first call to the callbackfn function provides this value as an argument instead of an array value.
       */
  def reduceRight[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  /**
       * Calls the specified callback function for all the elements in an array, in descending order.
       * The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
       * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
       * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation.
       *        The first call to the callbackfn function provides this value as an argument instead of an array value.
       */
  @JSName("reduceRight")
  def reduceRight_TUU[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  /**
       * Calls the specified callback function for all the elements in an array.
       * The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
       * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
       * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation.
       *        The first call to the callbackfn function provides this value as an argument instead of an array value.
       */
  @JSName("reduce")
  def reduce_TUU[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  /**
       * Reverses the elements in an Array.
       */
  def reverse[T](array: stdLib.ArrayLike[T]): Array[T] = js.native
  /**
       * Removes the first element from an array and returns it.
       */
  def shift[T](array: stdLib.ArrayLike[T]): T = js.native
  /**
       * Returns a section of an array.
       * @param start The beginning of the specified portion of the array.
       * @param end The end of the specified portion of the array.
       */
  def slice[T](array: stdLib.ArrayLike[T]): Array[T] = js.native
  /**
       * Returns a section of an array.
       * @param start The beginning of the specified portion of the array.
       * @param end The end of the specified portion of the array.
       */
  def slice[T](array: stdLib.ArrayLike[T], start: scala.Double): Array[T] = js.native
  /**
       * Returns a section of an array.
       * @param start The beginning of the specified portion of the array.
       * @param end The end of the specified portion of the array.
       */
  def slice[T](array: stdLib.ArrayLike[T], start: scala.Double, end: scala.Double): Array[T] = js.native
  /**
       * Determines whether the specified callback function returns true for any element of an array.
       * @param callbackfn A function that accepts up to three arguments.
       *        The some method calls the callbackfn function for each element in array1 until the callbackfn returns true, or until the end of the array.
       * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
       */
  def some[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean]
  ): scala.Boolean = js.native
  /**
       * Determines whether the specified callback function returns true for any element of an array.
       * @param callbackfn A function that accepts up to three arguments.
       *        The some method calls the callbackfn function for each element in array1 until the callbackfn returns true, or until the end of the array.
       * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
       */
  def some[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean],
    thisArg: js.Any
  ): scala.Boolean = js.native
  /**
       * Sorts an array.
       * @param compareFn The name of the function used to determine the order of the elements. If omitted, the elements are sorted in ascending, ASCII character order.
       */
  def sort[T](array: stdLib.ArrayLike[T]): Array[T] = js.native
  /**
       * Sorts an array.
       * @param compareFn The name of the function used to determine the order of the elements. If omitted, the elements are sorted in ascending, ASCII character order.
       */
  def sort[T](array: stdLib.ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]): Array[T] = js.native
  /**
       * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
       * @param start The zero-based location in the array from which to start removing elements.
       * @param deleteCount The number of elements to remove.
       * @param items Elements to insert into the array in place of the deleted elements.
       */
  def splice[T](array: stdLib.ArrayLike[T], start: scala.Double): Array[T] = js.native
  /**
       * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
       * @param start The zero-based location in the array from which to start removing elements.
       * @param deleteCount The number of elements to remove.
       * @param items Elements to insert into the array in place of the deleted elements.
       */
  def splice[T](array: stdLib.ArrayLike[T], start: scala.Double, deleteCount: scala.Double, items: T*): Array[T] = js.native
  def turn[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ Array[T], 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ Array[T], 
      scala.Unit
    ]
  ): Array[T] = js.native
  def turn[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[
      /* memo */ Array[T], 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ Array[T], 
      scala.Unit
    ],
    memo: Array[T]
  ): Array[T] = js.native
  def turn[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit],
    memo: U
  ): U = js.native
  @JSName("turn")
  def turn_TUU[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit]
  ): U = js.native
  /**
       * Inserts new elements at the start of an array.
       * @param items  Elements to insert at the start of the Array.
       */
  def unshift[T](array: stdLib.ArrayLike[T], items: T*): scala.Double = js.native
  /**
       * Returns an list of values in the array
       */
  def values[T](array: stdLib.ArrayLike[T]): nodeLib.IterableIterator[T] = js.native
}

