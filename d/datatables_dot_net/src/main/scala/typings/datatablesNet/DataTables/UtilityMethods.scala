package typings.datatablesNet.DataTables

import typings.datatablesNet.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "state-methods"
//#endregion "core-methods"
//#region "util-methods"
@js.native
trait UtilityMethods extends js.Object {
  
  /*
    * Get a boolean value to indicate if there are any entries in the API instance's result set (i.e. any data, selected rows, etc).
    */
  def any(): Boolean = js.native
  
  /**
    * Concatenate two or more API instances together
    *
    * @param a API instance to concatenate to the initial instance.
    * @param b Additional API instance(s) to concatenate to the initial instance.
    */
  def concat(a: js.Object, b: js.Object*): Api = js.native
  
  /**
    * Get the number of entries in an API instance's result set, regardless of multi-table grouping (e.g. any data, selected rows, etc). Since: 1.10.8
    */
  def count(): Double = js.native
  
  /**
    * Iterate over the contents of the API result set.
    *
    * @param fn Callback function which is called for each item in the API instance result set. The callback is called with three parameters
    */
  def each(fn: js.Function3[/* value */ js.Any, /* index */ Double, /* dt */ Api, Unit]): Api = js.native
  
  /**
    * Reduce an Api instance to a single context and result set.
    *
    * @param idx Index to select
    */
  def eq(idx: Double): Api = js.native
  
  /**
    * Iterate over the result set of an API instance and test each item, creating a new instance from those items which pass.
    *
    * @param fn Callback function which is called for each item in the API instance result set. The callback is called with three parameters.
    */
  def filter(fn: js.Function3[/* value */ js.Any, /* index */ Double, /* dt */ Api, Boolean]): Api = js.native
  
  /**
    * Flatten a 2D array structured API instance to a 1D array structure.
    */
  def flatten(): Api = js.native
  
  /**
    * Find the first instance of a value in the API instance's result set.
    *
    * @param value Value to find in the instance's result set.
    */
  def indexOf(value: js.Any): Double = js.native
  
  /**
    * Join the elements in the result set into a string.
    *
    * @param separator The string that will be used to separate each element of the result set.
    */
  def join(separator: String): String = js.native
  
  /**
    * Find the last instance of a value in the API instance's result set.
    *
    * @param value Value to find in the instance's result set.
    */
  def lastIndexOf(value: js.Any): Double = js.native
  
  /**
    * Number of elements in an API instance's result set.
    */
  var length: Double = js.native
  
  /**
    * Iterate over the result set of an API instance, creating a new API instance from the values returned by the callback.
    *
    * @param fn Callback function which is called for each item in the API instance result set. The callback is called with three parameters.
    */
  def map(fn: js.Function3[/* value */ js.Any, /* index */ Double, /* dt */ Api, _]): Api = js.native
  
  def pluck(property: String): Api = js.native
  /**
    * Iterate over the result set of an API instance, creating a new API instance from the values retrieved from the original elements.
    *
    * @param property object property name to use from the element in the original result set for the new result set.
    */
  def pluck(property: Double): Api = js.native
  
  /**
    * Remove the last item from an API instance's result set.
    */
  def pop(): js.Any = js.native
  
  /**
    * Add one or more items to the end of an API instance's result set.
    *
    * @param value_1 Item to add to the API instance's result set.
    */
  def push(value_1: js.Any, value_2: js.Any*): Double = js.native
  
  /**
    * Apply a callback function against and accumulator and each element in the Api's result set (left-to-right).
    *
    * @param fn Callback function which is called for each item in the API instance result set. The callback is called with four parameters.
    * @param initialValue Value to use as the first argument of the first call to the fn callback.
    */
  def reduce(
    fn: js.Function4[/* current */ Double, /* value */ js.Any, /* index */ Double, /* dt */ Api, Double]
  ): js.Any = js.native
  def reduce(
    fn: js.Function4[/* current */ Double, /* value */ js.Any, /* index */ Double, /* dt */ Api, Double],
    initialValue: js.Any
  ): js.Any = js.native
  
  /**
    * Apply a callback function against and accumulator and each element in the Api's result set (right-to-left).
    *
    * @param fn Callback function which is called for each item in the API instance result set. The callback is called with four parameters.
    * @param initialValue Value to use as the first argument of the first call to the fn callback.
    */
  def reduceRight(
    fn: js.Function4[/* current */ Double, /* value */ js.Any, /* index */ Double, /* dt */ Api, Double]
  ): js.Any = js.native
  def reduceRight(
    fn: js.Function4[/* current */ Double, /* value */ js.Any, /* index */ Double, /* dt */ Api, Double],
    initialValue: js.Any
  ): js.Any = js.native
  
  /**
    * Reverse the result set of the API instance and return the original array.
    */
  def reverse(): Api = js.native
  
  /**
    * Remove the first item from an API instance's result set.
    */
  def shift(): js.Any = js.native
  
  /**
    * Sort the elements of the API instance's result set.
    *
    * @param fn This is a standard Javascript sort comparison function. It accepts two parameters.
    */
  def sort(): Api = js.native
  def sort(fn: js.Function2[/* value1 */ js.Any, /* value2 */ js.Any, Double]): Api = js.native
  
  def splice(index: Double, howMany: Double, value_1: js.UndefOr[scala.Nothing], value_2: js.Any*): js.Array[_] = js.native
  /**
    * Modify the contents of an Api instance's result set, adding or removing items from it as required.
    *
    * @param index Index at which to start modifying the Api instance's result set.
    * @param howMany Number of elements to remove from the result set.
    * @param value_1 Item to add to the result set at the index specified by the first parameter.
    */
  def splice(index: Double, howMany: Double, value_1: js.Any, value_2: js.Any*): js.Array[_] = js.native
  
  /**
    * Convert the API instance to a jQuery object, with the objects from the instance's result set in the jQuery result set.
    */
  @JSName("to$")
  def to$(): JQuery = js.native
  
  /**
    * Create a native Javascript array object from an API instance.
    */
  def toArray(): js.Array[_] = js.native
  
  /**
    * Convert the API instance to a jQuery object, with the objects from the instance's result set in the jQuery result set.
    */
  def toJQuery(): JQuery = js.native
  
  /**
    * Create a new API instance containing only the unique items from a the elements in an instance's result set.
    */
  def unique(): Api = js.native
  
  /**
    * Add one or more items to the start of an API instance's result set.
    *
    * @param value_1 Item to add to the API instance's result set.
    */
  def unshift(value_1: js.Any, value_2: js.Any*): Double = js.native
}
