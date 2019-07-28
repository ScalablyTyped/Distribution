package typings.chromeDashApps.chromeNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageAreaWrite extends js.Object {
  /**
    * Removes all items from storage.
    * @param callback Optional.
    * Callback on success, or on failure (in which case runtime.lastError will be set).
    */
  def clear(): Unit = js.native
  def clear(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Removes one or more items from storage.
    * @param A single key or a list of keys for items to remove.
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
    * Primitive values such as numbers will serialize as expected. Values with a typeof 'object' and 'function' will typically serialize to {}, with the exception of Array (serializes as expected), Date, and Regex (serialize using their String representation).
    * @param callback Optional.
    * Callback on success, or on failure (in which case runtime.lastError will be set).
    */
  def set(items: js.Object): Unit = js.native
  def set(items: js.Object, callback: js.Function0[Unit]): Unit = js.native
}

