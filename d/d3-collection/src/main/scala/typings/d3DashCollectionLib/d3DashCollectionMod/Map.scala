package typings
package d3DashCollectionLib.d3DashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Map[T] extends js.Object {
  /**
       * Removes all entries from this map.
       */
  def clear(): scala.Unit
  /**
       * Calls the specified function for each entry in this map and returns undefined.
       * The iteration order is arbitrary.
       *
       * @param func Function to call for each entry. The function is passed the entry’s value and key as arguments,
       * followed by the map itself.
       */
  def each(func: js.Function3[/* value */ T, /* key */ java.lang.String, /* map */ Map[T], scala.Unit]): scala.Unit
  /**
       * Returns true if and only if this map has zero entries.
       */
  def empty(): scala.Boolean
  /**
       * Returns an array of key-value objects for each entry in this map. The order of the returned entries is arbitrary.
       * Each entry’s key is a string, but the value can have arbitrary type.
       */
  def entries(): js.Array[d3DashCollectionLib.Anon_Key[T]]
  /**
       * Returns the value for the specified key string.
       * If the map does not have an entry for the specified key, returns undefined.
       *
       * @param key Key of map entry to access.
       */
  def get(key: java.lang.String): js.UndefOr[T]
  /**
       * Returns true if and only if this map has an entry for the specified key string.
       * Note: the value may be null or undefined.
       *
       * @param key Key of map entry to access.
       */
  def has(key: java.lang.String): scala.Boolean
  /**
       * Returns an array of string keys for every entry in this map.
       * The order of the returned keys is arbitrary.
       */
  def keys(): js.Array[java.lang.String]
  /**
       * If the map has an entry for the specified key string, removes the entry and returns true.
       * Otherwise, this method does nothing and returns false.
       *
       * @param key Map key for which to remove the entry.
       */
  def remove(key: java.lang.String): scala.Boolean
  /**
       * Sets the value for the specified key string and returns the updated map.
       * If the map previously had an entry for the same key string, the old entry is replaced with the new value.
       *
       * @param key Key of map entry to access.
       * @param value Value to set for entry at key.
       */
  def set(key: java.lang.String, value: T): this.type
  /**
       * Returns the number of entries in this map.
       */
  def size(): scala.Double
  /**
       * Returns an array of values for every entry in this map.
       * The order of the returned values is arbitrary.
       */
  def values(): js.Array[T]
}

