package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringDictionary[T] extends js.Object {
  var _count: js.Any
  var _data: js.Any
  /**
    * Add a new key and its corresponding value
    * @param key the key to add
    * @param value the value corresponding to the key
    * @return true if the operation completed successfully, false if we couldn't insert the key/value because there was already this key in the dictionary
    */
  def add(key: String, value: T): Boolean
  /**
    * Clear the whole content of the dictionary
    */
  def clear(): Unit
  /**
    * Check if there's a given key in the dictionary
    * @param key the key to check for
    * @return true if the key is present, false otherwise
    */
  def contains(key: String): Boolean
  /**
    * This will clear this dictionary and copy the content from the 'source' one.
    * If the T value is a custom object, it won't be copied/cloned, the same object will be used
    * @param source the dictionary to take the content from and copy to this dictionary
    */
  def copyFrom(source: StringDictionary[T]): Unit
  /**
    * Gets the current count
    */
  def count: Double
  /**
    * Execute a callback on every occurrence of the dictionary until it returns a valid TRes object.
    * If the callback returns null or undefined the method will iterate to the next key/value pair
    * Note that you can remove any element in this dictionary in the callback implementation
    * @param callback the callback to execute, if it return a valid T instanced object the enumeration will stop and the object will be returned
    * @returns the first item
    */
  def first[TRes](callback: js.Function2[/* key */ String, /* val */ T, TRes]): TRes | Null
  /**
    * Execute a callback on each key/val of the dictionary.
    * Note that you can remove any element in this dictionary in the callback implementation
    * @param callback the callback to execute on a given key/value pair
    */
  def forEach(callback: js.Function2[/* key */ String, /* val */ T, Unit]): Unit
  /**
    * Get a value based from its key
    * @param key the given key to get the matching value from
    * @return the value if found, otherwise undefined is returned
    */
  def get(key: String): js.UndefOr[T]
  /**
    * Get the element of the given key and remove it from the dictionary
    * @param key defines the key to search
    * @returns the value associated with the key or null if not found
    */
  def getAndRemove(key: String): Nullable[T]
  /**
    * Get a value from its key if present in the dictionary otherwise add it
    * @param key the key to get the value from
    * @param val if there's no such key/value pair in the dictionary add it with this value
    * @return the value corresponding to the key
    */
  def getOrAdd(key: String, `val`: T): T
  /**
    * Get a value from its key or add it if it doesn't exist.
    * This method will ensure you that a given key/data will be present in the dictionary.
    * @param key the given key to get the matching value from
    * @param factory the factory that will create the value if the key is not present in the dictionary.
    * The factory will only be invoked if there's no data for the given key.
    * @return the value corresponding to the key.
    */
  def getOrAddWithFactory(key: String, factory: js.Function1[/* key */ String, T]): T
  /**
    * Remove a key/value from the dictionary.
    * @param key the key to remove
    * @return true if the item was successfully deleted, false if no item with such key exist in the dictionary
    */
  def remove(key: String): Boolean
  /**
    * Update a specific value associated to a key
    * @param key defines the key to use
    * @param value defines the value to store
    * @returns true if the value was updated (or false if the key was not found)
    */
  def set(key: String, value: T): Boolean
}

object StringDictionary {
  @scala.inline
  def apply[T](
    _count: js.Any,
    _data: js.Any,
    add: (String, T) => Boolean,
    clear: () => Unit,
    contains: String => Boolean,
    copyFrom: StringDictionary[T] => Unit,
    count: () => Double,
    first: js.Function2[/* key */ String, /* val */ T, js.Any] => js.Any | Null,
    forEach: js.Function2[/* key */ String, /* val */ T, Unit] => Unit,
    get: String => js.UndefOr[T],
    getAndRemove: String => Nullable[T],
    getOrAdd: (String, T) => T,
    getOrAddWithFactory: (String, js.Function1[/* key */ String, T]) => T,
    remove: String => Boolean,
    set: (String, T) => Boolean
  ): StringDictionary[T] = {
    val __obj = js.Dynamic.literal(_count = _count.asInstanceOf[js.Any], _data = _data.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), copyFrom = js.Any.fromFunction1(copyFrom), count = js.Any.fromFunction0(count), first = js.Any.fromFunction1(first), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), getAndRemove = js.Any.fromFunction1(getAndRemove), getOrAdd = js.Any.fromFunction2(getOrAdd), getOrAddWithFactory = js.Any.fromFunction2(getOrAddWithFactory), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[StringDictionary[T]]
  }
}

