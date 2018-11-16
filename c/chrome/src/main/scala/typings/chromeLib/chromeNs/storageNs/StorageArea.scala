package typings
package chromeLib.chromeNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageArea extends js.Object {
  /**
           * Removes all items from storage.
           * @param callback Optional.
           * Callback on success, or on failure (in which case runtime.lastError will be set).
           */
  def clear(): scala.Unit = js.native
  /**
           * Removes all items from storage.
           * @param callback Optional.
           * Callback on success, or on failure (in which case runtime.lastError will be set).
           */
  def clear(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Gets one or more items from storage.
           * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
           * Parameter items: Object with items in their key-value mappings.
           */
  def get(callback: js.Function1[/* items */ ScalablyTyped.runtime.StringDictionary[js.Any], scala.Unit]): scala.Unit = js.native
  /**
           * Gets one or more items from storage.
           * @param keys A single key to get, list of keys to get, or a dictionary specifying default values.
           * An empty list or object will return an empty result object. Pass in null to get the entire contents of storage.
           * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
           * Parameter items: Object with items in their key-value mappings.
           */
  def get(
    keys: java.lang.String,
    callback: js.Function1[/* items */ ScalablyTyped.runtime.StringDictionary[js.Any], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Gets one or more items from storage.
           * @param keys A single key to get, list of keys to get, or a dictionary specifying default values.
           * An empty list or object will return an empty result object. Pass in null to get the entire contents of storage.
           * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
           * Parameter items: Object with items in their key-value mappings.
           */
  def get(
    keys: js.Array[java.lang.String],
    callback: js.Function1[/* items */ ScalablyTyped.runtime.StringDictionary[js.Any], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Gets one or more items from storage.
           * @param keys A single key to get, list of keys to get, or a dictionary specifying default values.
           * An empty list or object will return an empty result object. Pass in null to get the entire contents of storage.
           * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
           * Parameter items: Object with items in their key-value mappings.
           */
  def get(
    keys: js.Object,
    callback: js.Function1[/* items */ ScalablyTyped.runtime.StringDictionary[js.Any], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Gets one or more items from storage.
           * @param keys A single key to get, list of keys to get, or a dictionary specifying default values.
           * An empty list or object will return an empty result object. Pass in null to get the entire contents of storage.
           * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
           * Parameter items: Object with items in their key-value mappings.
           */
  def get(
    keys: scala.Null,
    callback: js.Function1[/* items */ ScalablyTyped.runtime.StringDictionary[js.Any], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Gets the amount of space (in bytes) being used by one or more items.
           * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
           * Parameter bytesInUse: Amount of space being used in storage, in bytes.
           */
  def getBytesInUse(callback: js.Function1[/* bytesInUse */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
           * Gets the amount of space (in bytes) being used by one or more items.
           * @param keys A single key or list of keys to get the total usage for. An empty list will return 0. Pass in null to get the total usage of all of storage.
           * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
           * Parameter bytesInUse: Amount of space being used in storage, in bytes.
           */
  def getBytesInUse(keys: java.lang.String, callback: js.Function1[/* bytesInUse */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
           * Gets the amount of space (in bytes) being used by one or more items.
           * @param keys A single key or list of keys to get the total usage for. An empty list will return 0. Pass in null to get the total usage of all of storage.
           * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
           * Parameter bytesInUse: Amount of space being used in storage, in bytes.
           */
  def getBytesInUse(
    keys: js.Array[java.lang.String],
    callback: js.Function1[/* bytesInUse */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Gets the amount of space (in bytes) being used by one or more items.
           * @param keys A single key or list of keys to get the total usage for. An empty list will return 0. Pass in null to get the total usage of all of storage.
           * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
           * Parameter bytesInUse: Amount of space being used in storage, in bytes.
           */
  def getBytesInUse(keys: scala.Null, callback: js.Function1[/* bytesInUse */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
           * Removes one or more items from storage.
           * @param A single key or a list of keys for items to remove.
           * @param callback Optional.
           * Callback on success, or on failure (in which case runtime.lastError will be set).
           */
  def remove(keys: java.lang.String): scala.Unit = js.native
  /**
           * Removes one or more items from storage.
           * @param A single key or a list of keys for items to remove.
           * @param callback Optional.
           * Callback on success, or on failure (in which case runtime.lastError will be set).
           */
  def remove(keys: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Removes one or more items from storage.
           * @param A single key or a list of keys for items to remove.
           * @param callback Optional.
           * Callback on success, or on failure (in which case runtime.lastError will be set).
           */
  def remove(keys: js.Array[java.lang.String]): scala.Unit = js.native
  /**
           * Removes one or more items from storage.
           * @param A single key or a list of keys for items to remove.
           * @param callback Optional.
           * Callback on success, or on failure (in which case runtime.lastError will be set).
           */
  def remove(keys: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Sets multiple items.
           * @param items An object which gives each key/value pair to update storage with. Any other key/value pairs in storage will not be affected.
           * Primitive values such as numbers will serialize as expected. Values with a typeof "object" and "function" will typically serialize to {}, with the exception of Array (serializes as expected), Date, and Regex (serialize using their String representation).
           * @param callback Optional.
           * Callback on success, or on failure (in which case runtime.lastError will be set).
           */
  def set(items: js.Object): scala.Unit = js.native
  /**
           * Sets multiple items.
           * @param items An object which gives each key/value pair to update storage with. Any other key/value pairs in storage will not be affected.
           * Primitive values such as numbers will serialize as expected. Values with a typeof "object" and "function" will typically serialize to {}, with the exception of Array (serializes as expected), Date, and Regex (serialize using their String representation).
           * @param callback Optional.
           * Callback on success, or on failure (in which case runtime.lastError will be set).
           */
  def set(items: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

