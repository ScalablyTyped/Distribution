package typings.d3DashCollection.d3DashCollectionMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.d3DashCollection.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map[T] extends js.Object {
  /**
    * Removes all entries from this map.
    */
  def clear(): Unit
  /**
    * Calls the specified function for each entry in this map and returns undefined.
    * The iteration order is arbitrary.
    *
    * @param func Function to call for each entry. The function is passed the entry’s value and key as arguments,
    * followed by the map itself.
    */
  def each(func: js.Function3[/* value */ T, /* key */ String, /* map */ Map[T], Unit]): Unit
  /**
    * Returns true if and only if this map has zero entries.
    */
  def empty(): Boolean
  /**
    * Returns an array of key-value objects for each entry in this map. The order of the returned entries is arbitrary.
    * Each entry’s key is a string, but the value can have arbitrary type.
    */
  def entries(): js.Array[Anon_Key[T]]
  /**
    * Returns the value for the specified key string.
    * If the map does not have an entry for the specified key, returns undefined.
    *
    * @param key Key of map entry to access.
    */
  def get(key: String): js.UndefOr[T]
  /**
    * Returns true if and only if this map has an entry for the specified key string.
    * Note: the value may be null or undefined.
    *
    * @param key Key of map entry to access.
    */
  def has(key: String): Boolean
  /**
    * Returns an array of string keys for every entry in this map.
    * The order of the returned keys is arbitrary.
    */
  def keys(): js.Array[String]
  /**
    * If the map has an entry for the specified key string, removes the entry and returns true.
    * Otherwise, this method does nothing and returns false.
    *
    * @param key Map key for which to remove the entry.
    */
  def remove(key: String): Boolean
  /**
    * Sets the value for the specified key string and returns the updated map.
    * If the map previously had an entry for the same key string, the old entry is replaced with the new value.
    *
    * @param key Key of map entry to access.
    * @param value Value to set for entry at key.
    */
  def set(key: String, value: T): this.type
  /**
    * Returns the number of entries in this map.
    */
  def size(): Double
  /**
    * Returns an array of values for every entry in this map.
    * The order of the returned values is arbitrary.
    */
  def values(): js.Array[T]
}

object Map {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    each: js.Function3[/* value */ T, /* key */ String, /* map */ Map[T], Unit] => Unit,
    empty: () => Boolean,
    entries: () => js.Array[Anon_Key[T]],
    get: String => js.UndefOr[T],
    has: String => Boolean,
    keys: () => js.Array[String],
    remove: String => Boolean,
    set: (String, T) => Map[T],
    size: () => Double,
    values: () => js.Array[T]
  ): Map[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), each = js.Any.fromFunction1(each), empty = js.Any.fromFunction0(empty), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[Map[T]]
  }
}

@JSImport("d3-collection", "map")
@js.native
object map extends js.Object {
  def apply(obj: js.Object): Map[_] = js.native
  def apply[T](): Map[T] = js.native
  def apply[T](array: js.Array[T]): Map[T] = js.native
  def apply[T](
    array: js.Array[T],
    key: js.Function3[/* value */ T, /* i */ js.UndefOr[Double], /* array */ js.UndefOr[js.Array[T]], String]
  ): Map[T] = js.native
  def apply[T](d3Map: Map[T]): Map[T] = js.native
  def apply[T](obj: NumberDictionary[T]): Map[T] = js.native
  def apply[T](obj: StringDictionary[T]): Map[T] = js.native
}

