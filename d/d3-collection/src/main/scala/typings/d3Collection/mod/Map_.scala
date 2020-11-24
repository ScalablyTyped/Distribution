package typings.d3Collection.mod

import typings.d3Collection.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map_[T] extends js.Object {
  
  /**
    * Removes all entries from this map.
    */
  def clear(): Unit = js.native
  
  /**
    * Calls the specified function for each entry in this map and returns undefined.
    * The iteration order is arbitrary.
    *
    * @param func Function to call for each entry. The function is passed the entry’s value and key as arguments,
    * followed by the map itself.
    */
  def each(func: js.Function3[/* value */ T, /* key */ String, /* map */ Map_[T], Unit]): Unit = js.native
  
  /**
    * Returns true if and only if this map has zero entries.
    */
  def empty(): Boolean = js.native
  
  /**
    * Returns an array of key-value objects for each entry in this map. The order of the returned entries is arbitrary.
    * Each entry’s key is a string, but the value can have arbitrary type.
    */
  def entries(): js.Array[Key[T]] = js.native
  
  /**
    * Returns the value for the specified key string.
    * If the map does not have an entry for the specified key, returns undefined.
    *
    * @param key Key of map entry to access.
    */
  def get(key: String): js.UndefOr[T] = js.native
  
  /**
    * Returns true if and only if this map has an entry for the specified key string.
    * Note: the value may be null or undefined.
    *
    * @param key Key of map entry to access.
    */
  def has(key: String): Boolean = js.native
  
  /**
    * Returns an array of string keys for every entry in this map.
    * The order of the returned keys is arbitrary.
    */
  def keys(): js.Array[String] = js.native
  
  /**
    * If the map has an entry for the specified key string, removes the entry and returns true.
    * Otherwise, this method does nothing and returns false.
    *
    * @param key Map key for which to remove the entry.
    */
  def remove(key: String): Boolean = js.native
  
  /**
    * Sets the value for the specified key string and returns the updated map.
    * If the map previously had an entry for the same key string, the old entry is replaced with the new value.
    *
    * @param key Key of map entry to access.
    * @param value Value to set for entry at key.
    */
  def set(key: String, value: T): this.type = js.native
  
  /**
    * Returns the number of entries in this map.
    */
  def size(): Double = js.native
  
  /**
    * Returns an array of values for every entry in this map.
    * The order of the returned values is arbitrary.
    */
  def values(): js.Array[T] = js.native
}
object Map_ {
  
  @scala.inline
  def apply[T](
    clear: () => Unit,
    each: js.Function3[/* value */ T, /* key */ String, /* map */ Map_[T], Unit] => Unit,
    empty: () => Boolean,
    entries: () => js.Array[Key[T]],
    get: String => js.UndefOr[T],
    has: String => Boolean,
    keys: () => js.Array[String],
    remove: String => Boolean,
    set: (String, T) => Map_[T],
    size: () => Double,
    values: () => js.Array[T]
  ): Map_[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), each = js.Any.fromFunction1(each), empty = js.Any.fromFunction0(empty), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[Map_[T]]
  }
  
  @scala.inline
  implicit class Map_Ops[Self <: Map_[_], T] (val x: Self with Map_[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEach(value: js.Function3[/* value */ T, /* key */ String, /* map */ Map_[T], Unit] => Unit): Self = this.set("each", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmpty(value: () => Boolean): Self = this.set("empty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEntries(value: () => js.Array[Key[T]]): Self = this.set("entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: String => js.UndefOr[T]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeys(value: () => js.Array[String]): Self = this.set("keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: String => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, T) => Map_[T]): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValues(value: () => js.Array[T]): Self = this.set("values", js.Any.fromFunction0(value))
  }
}
