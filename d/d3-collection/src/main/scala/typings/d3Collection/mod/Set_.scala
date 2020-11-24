package typings.d3Collection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set_ extends js.Object {
  
  /**
    * Adds the specified value string to this set and returns the set.
    *
    * @param value Value to add to set.
    */
  def add(value: String): this.type = js.native
  def add(value: Stringifiable): this.type = js.native
  
  /**
    * Removes all values from this set.
    */
  def clear(): Unit = js.native
  
  /**
    * Calls the specified function for each value in this set, passing the value as the first two arguments (for symmetry with map.each),
    * followed by the set itself. Returns undefined.
    * The iteration order is arbitrary.
    *
    * @param func Function to call for each set element. The first and second argument of the function are both passed
    * the 'value' of the set entry for consistency with the map.each(...) signature, as a third argument the entire set is passed in.
    */
  def each(func: js.Function3[/* value */ String, /* valueRepeat */ String, /* set */ this.type, Unit]): Unit = js.native
  
  /**
    * Returns true if and only if this set has zero values.
    */
  def empty(): Boolean = js.native
  
  /**
    * Returns true if and only if this set has an entry for the specified value string.
    *
    * @param value Value whose membership in the class to test.
    */
  def has(value: String): Boolean = js.native
  def has(value: Stringifiable): Boolean = js.native
  
  /**
    * If the set contains the specified value string, removes it and returns true.
    * Otherwise, this method does nothing and returns false.
    *
    * @param value Value to remove from set.
    */
  def remove(value: String): Boolean = js.native
  def remove(value: Stringifiable): Boolean = js.native
  
  /**
    * Returns the number of values in this set.
    */
  def size(): Double = js.native
  
  /**
    * Returns an array of the string values in this set. The order of the returned values is arbitrary.
    * Can be used as a convenient way of computing the unique values for a set of strings.
    */
  def values(): js.Array[String] = js.native
}
