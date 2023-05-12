package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "AssociativeArray")
@js.native
open class AssociativeArray () extends StObject {
  
  /**
    * Determines if the provided key is in the array.
    * @param key - The key to check.
    * @returns <code>true</code> if the key is in the array, <code>false</code> otherwise.
    */
  def contains(key: String): Boolean = js.native
  def contains(key: Double): Boolean = js.native
  
  /**
    * Retrieves the value associated with the provided key.
    * @param key - The key whose value is to be retrieved.
    * @returns The associated value, or undefined if the key does not exist in the collection.
    */
  def get(key: String): Any = js.native
  def get(key: Double): Any = js.native
  
  /**
    * Gets the number of items in the collection.
    */
  var length: Double = js.native
  
  /**
    * Removes a key-value pair from the collection.
    * @param key - The key to be removed.
    * @returns True if it was removed, false if the key was not in the collection.
    */
  def remove(key: String): Boolean = js.native
  def remove(key: Double): Boolean = js.native
  
  /**
    * Clears the collection.
    */
  def removeAll(): Unit = js.native
  
  /**
    * Associates the provided key with the provided value.  If the key already
    * exists, it is overwritten with the new value.
    * @param key - A unique identifier.
    * @param value - The value to associate with the provided key.
    */
  def set(key: String, value: Any): Unit = js.native
  def set(key: Double, value: Any): Unit = js.native
  
  /**
    * Gets an unordered array of all values in the collection.
    * This is a live array that will automatically reflect the values in the collection,
    * it should not be modified directly.
    */
  var values: js.Array[Any] = js.native
}
