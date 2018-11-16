package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class implement a typical dictionary using a string as key and the generic type T as value.
     * The underlying implementation relies on an associative array to ensure the best performances.
     * The value can be anything including 'null' but except 'undefined'
     */
@JSGlobal("BABYLON.StringDictionary")
@js.native
class StringDictionary[T] () extends js.Object {
  var _count: js.Any = js.native
  var _data: js.Any = js.native
  /**
           * Gets the current count
           */
  val count: scala.Double = js.native
  /**
           * Add a new key and its corresponding value
           * @param key the key to add
           * @param value the value corresponding to the key
           * @return true if the operation completed successfully, false if we couldn't insert the key/value because there was already this key in the dictionary
           */
  def add(key: java.lang.String, value: T): scala.Boolean = js.native
  /**
           * Clear the whole content of the dictionary
           */
  def clear(): scala.Unit = js.native
  /**
           * Check if there's a given key in the dictionary
           * @param key the key to check for
           * @return true if the key is present, false otherwise
           */
  def contains(key: java.lang.String): scala.Boolean = js.native
  /**
           * This will clear this dictionary and copy the content from the 'source' one.
           * If the T value is a custom object, it won't be copied/cloned, the same object will be used
           * @param source the dictionary to take the content from and copy to this dictionary
           */
  def copyFrom(source: StringDictionary[T]): scala.Unit = js.native
  /**
           * Execute a callback on every occurrence of the dictionary until it returns a valid TRes object.
           * If the callback returns null or undefined the method will iterate to the next key/value pair
           * Note that you can remove any element in this dictionary in the callback implementation
           * @param callback the callback to execute, if it return a valid T instanced object the enumeration will stop and the object will be returned
           * @returns the first item
           */
  def first[TRes](callback: js.Function2[/* key */ java.lang.String, /* val */ T, TRes]): TRes | scala.Null = js.native
  /**
           * Execute a callback on each key/val of the dictionary.
           * Note that you can remove any element in this dictionary in the callback implementation
           * @param callback the callback to execute on a given key/value pair
           */
  def forEach(callback: js.Function2[/* key */ java.lang.String, /* val */ T, scala.Unit]): scala.Unit = js.native
  /**
           * Get a value based from its key
           * @param key the given key to get the matching value from
           * @return the value if found, otherwise undefined is returned
           */
  def get(key: java.lang.String): js.UndefOr[T] = js.native
  /**
           * Get the element of the given key and remove it from the dictionary
           * @param key defines the key to search
           * @returns the value associated with the key or null if not found
           */
  def getAndRemove(key: java.lang.String): Nullable[T] = js.native
  /**
           * Get a value from its key if present in the dictionary otherwise add it
           * @param key the key to get the value from
           * @param val if there's no such key/value pair in the dictionary add it with this value
           * @return the value corresponding to the key
           */
  def getOrAdd(key: java.lang.String, `val`: T): T = js.native
  /**
           * Get a value from its key or add it if it doesn't exist.
           * This method will ensure you that a given key/data will be present in the dictionary.
           * @param key the given key to get the matching value from
           * @param factory the factory that will create the value if the key is not present in the dictionary.
           * The factory will only be invoked if there's no data for the given key.
           * @return the value corresponding to the key.
           */
  def getOrAddWithFactory(key: java.lang.String, factory: js.Function1[/* key */ java.lang.String, T]): T = js.native
  /**
           * Remove a key/value from the dictionary.
           * @param key the key to remove
           * @return true if the item was successfully deleted, false if no item with such key exist in the dictionary
           */
  def remove(key: java.lang.String): scala.Boolean = js.native
  /**
           * Update a specific value associated to a key
           * @param key defines the key to use
           * @param value defines the value to store
           * @returns true if the value was updated (or false if the key was not found)
           */
  def set(key: java.lang.String, value: T): scala.Boolean = js.native
}

