package typings.chromeApps.chrome.storage

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageAreaRead extends js.Object {
  /**
    * Gets one or more items from storage.
    * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
    * Parameter items: Object with items in their key-value mappings.
    */
  def get(callback: js.Function1[/* items */ StringDictionary[js.Any], Unit]): Unit = js.native
  /**
    * Gets one or more items from storage.
    * @param keys A single key to get, list of keys to get, or a interface specifying default values.
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
  def getBytesInUse(callback: js.Function1[/* bytesInUse */ integer, Unit]): Unit = js.native
  /**
    * Gets the amount of space (in bytes) being used by one or more items.
    * @param keys A single key or list of keys to get the total usage for. An empty list will return 0. Pass in null to get the total usage of all of storage.
    * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
    * Parameter bytesInUse: Amount of space being used in storage, in bytes.
    */
  def getBytesInUse(keys: String, callback: js.Function1[/* bytesInUse */ integer, Unit]): Unit = js.native
  def getBytesInUse(keys: js.Array[String], callback: js.Function1[/* bytesInUse */ integer, Unit]): Unit = js.native
  def getBytesInUse(keys: Null, callback: js.Function1[/* bytesInUse */ integer, Unit]): Unit = js.native
}

