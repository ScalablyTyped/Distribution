package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Array API (specially handled by compiler)
/////////////////////////////
@js.native
trait ReadonlyArray[T]
  extends StObject
     with /* n */ NumberDictionary[T] {
  
  /**
    * Returns the item located at the specified index.
    * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
    */
  def at(index: Double): js.UndefOr[T] = js.native
  
  /**
    * Combines two or more arrays.
    * @param items Additional items to add to the end of array1.
    */
  def concat(items: (ConcatArray[T] | T)*): Array[T] = js.native
  
  /**
    * Returns an iterable of key, value pairs for every entry in the array
    */
  def entries(): IterableIterator[js.Tuple2[Double, T]] = js.native
  
  /**
    * Determines whether all the members of an array satisfy the specified test.
    * @param predicate A function that accepts up to three arguments. The every method calls
    * the predicate function for each element in the array until the predicate returns a value
    * which is coercible to the Boolean value false, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def every(predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Any]): scala.Boolean = js.native
  def every(
    predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Any],
    thisArg: Any
  ): scala.Boolean = js.native
  /**
    * Determines whether all the members of an array satisfy the specified test.
    * @param predicate A function that accepts up to three arguments. The every method calls
    * the predicate function for each element in the array until the predicate returns a value
    * which is coercible to the Boolean value false, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  @JSName("every")
  def every_S_T[S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], /* is S */ scala.Boolean]
  ): /* is .typescript-nn5FuAjk.Array<S> */ scala.Boolean = js.native
  @JSName("every")
  def every_S_T[S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], /* is S */ scala.Boolean],
    thisArg: Any
  ): /* is .typescript-nn5FuAjk.Array<S> */ scala.Boolean = js.native
  
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
    */
  def filter(predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Any]): Array[T] = js.native
  def filter(
    predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Any],
    thisArg: Any
  ): Array[T] = js.native
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
    */
  @JSName("filter")
  def filter_S_T[S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], /* is S */ scala.Boolean]
  ): Array[S] = js.native
  @JSName("filter")
  def filter_S_T[S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], /* is S */ scala.Boolean],
    thisArg: Any
  ): Array[S] = js.native
  
  def find(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Any]): js.UndefOr[T] = js.native
  def find(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Any], thisArg: Any): js.UndefOr[T] = js.native
  /**
    * Returns the value of the first element in the array where predicate is true, and undefined
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found, find
    * immediately returns that element value. Otherwise, find returns undefined.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def find[S /* <: T */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ T, 
      /* index */ Double, 
      /* obj */ Array[T], 
      /* is S */ scala.Boolean
    ]
  ): js.UndefOr[S] = js.native
  def find[S /* <: T */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ T, 
      /* index */ Double, 
      /* obj */ Array[T], 
      /* is S */ scala.Boolean
    ],
    thisArg: Any
  ): js.UndefOr[S] = js.native
  
  /**
    * Returns the index of the first element in the array where predicate is true, and -1
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found,
    * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def findIndex(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Any]): Double = js.native
  def findIndex(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Any], thisArg: Any): Double = js.native
  
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def flat[A, D /* <: Double */](): Array[FlatArray[A, D]] = js.native
  def flat[A, D /* <: Double */](depth: D): Array[FlatArray[A, D]] = js.native
  
  /**
    * Calls a defined callback function on each element of an array. Then, flattens the result into
    * a new array.
    * This is identical to a map followed by flat with depth 1.
    *
    * @param callback A function that accepts up to three arguments. The flatMap method calls the
    * callback function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callback function. If
    * thisArg is omitted, undefined is used as the this value.
    */
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ T, 
      /* index */ Double, 
      /* array */ Array[T], 
      U | ReadonlyArray[U]
    ]
  ): Array[U] = js.native
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ T, 
      /* index */ Double, 
      /* array */ Array[T], 
      U | ReadonlyArray[U]
    ],
    thisArg: This
  ): Array[U] = js.native
  
  /**
    * Performs the specified action for each element in an array.
    * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
    * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    thisArg: Any
  ): Unit = js.native
  
  /**
    * Determines whether an array includes a certain element, returning true or false as appropriate.
    * @param searchElement The element to search for.
    * @param fromIndex The position in this array at which to begin searching for searchElement.
    */
  def includes(searchElement: T): scala.Boolean = js.native
  def includes(searchElement: T, fromIndex: Double): scala.Boolean = js.native
  
  /**
    * Returns the index of the first occurrence of a value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
    */
  def indexOf(searchElement: T): Double = js.native
  def indexOf(searchElement: T, fromIndex: Double): Double = js.native
  
  /** Iterator of values in the array. */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T]] = js.native
  
  /**
    * Adds all the elements of an array separated by the specified separator string.
    * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
    */
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  
  /**
    * Returns an iterable of keys in the array
    */
  def keys(): IterableIterator[Double] = js.native
  
  /**
    * Returns the index of the last occurrence of a specified value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
    */
  def lastIndexOf(searchElement: T): Double = js.native
  def lastIndexOf(searchElement: T, fromIndex: Double): Double = js.native
  
  /**
    * Gets the length of the array. This is a number one higher than the highest element defined in an array.
    */
  val length: Double = js.native
  
  /**
    * Calls a defined callback function on each element of an array, and returns an array that contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def map[U](callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U]): Array[U] = js.native
  def map[U](callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U], thisArg: Any): Array[U] = js.native
  
  /**
    * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  
  /**
    * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  /**
    * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  @JSName("reduceRight")
  def reduceRight_U_U[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  
  /**
    * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  @JSName("reduce")
  def reduce_U_U[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  
  /**
    * Returns a section of an array.
    * @param start The beginning of the specified portion of the array.
    * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
    */
  def slice(): Array[T] = js.native
  def slice(start: Double): Array[T] = js.native
  def slice(start: Double, end: Double): Array[T] = js.native
  def slice(start: Unit, end: Double): Array[T] = js.native
  
  /**
    * Determines whether the specified callback function returns true for any element of an array.
    * @param predicate A function that accepts up to three arguments. The some method calls
    * the predicate function for each element in the array until the predicate returns a value
    * which is coercible to the Boolean value true, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def some(predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Any]): scala.Boolean = js.native
  def some(
    predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Any],
    thisArg: Any
  ): scala.Boolean = js.native
  
  /**
    * Returns an iterable of values in the array
    */
  def values(): IterableIterator[T] = js.native
}
