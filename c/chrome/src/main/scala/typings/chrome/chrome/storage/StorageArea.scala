package typings.chrome.chrome.storage

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageArea extends js.Object {
  
  /**
    * Removes all items from storage.
    * @param callback Optional.
    * Callback on success, or on failure (in which case runtime.lastError will be set).
    */
  def clear(): Unit = js.native
  def clear(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Gets one or more items from storage.
    * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
    * Parameter items: Object with items in their key-value mappings.
    */
  def get(callback: js.Function1[/* items */ StringDictionary[js.Any], Unit]): Unit = js.native
  /**
    * Gets one or more items from storage.
    * @param keys A single key to get, list of keys to get, or a dictionary specifying default values.
    * An empty list or object will return an empty result object. Pass in null to get the entire contents of storage.
    * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
    * Parameter items: Object with items in their key-value mappings.
    */
  def get(keys: String, callback: js.Function1[/* items */ StringDictionary[js.Any], Unit]): Unit = js.native
  def get(keys: js.Array[String], callback: js.Function1[/* items */ StringDictionary[js.Any], Unit]): Unit = js.native
  def get(keys: js.Object, callback: js.Function1[/* items */ StringDictionary[js.Any], Unit]): Unit = js.native
  def get(keys: Null, callback: js.Function1[/* items */ StringDictionary[js.Any], Unit]): Unit = js.native
  
  /**
    * Gets the amount of space (in bytes) being used by one or more items.
    * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
    * Parameter bytesInUse: Amount of space being used in storage, in bytes.
    */
  def getBytesInUse(callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
  /**
    * Gets the amount of space (in bytes) being used by one or more items.
    * @param keys A single key or list of keys to get the total usage for. An empty list will return 0. Pass in null to get the total usage of all of storage.
    * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
    * Parameter bytesInUse: Amount of space being used in storage, in bytes.
    */
  def getBytesInUse(keys: String, callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
  def getBytesInUse(keys: js.Array[String], callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
  def getBytesInUse(keys: Null, callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
  
  /**
    * Removes one or more items from storage.
    * @param keys A single key or a list of keys for items to remove.
    * @param callback Optional.
    * Callback on success, or on failure (in which case runtime.lastError will be set).
    */
  def remove(keys: String): Unit = js.native
  def remove(keys: String, callback: js.Function0[Unit]): Unit = js.native
  def remove(keys: js.Array[String]): Unit = js.native
  def remove(keys: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sets multiple items.
    * @param items An object which gives each key/value pair to update storage with. Any other key/value pairs in storage will not be affected.
    * Primitive values such as numbers will serialize as expected. Values with a typeof "object" and "function" will typically serialize to {}, with the exception of Array (serializes as expected), Date, and Regex (serialize using their String representation).
    * @param callback Optional.
    * Callback on success, or on failure (in which case runtime.lastError will be set).
    */
  def set(items: js.Object): Unit = js.native
  def set(items: js.Object, callback: js.Function0[Unit]): Unit = js.native
}
