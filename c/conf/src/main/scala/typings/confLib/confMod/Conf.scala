package typings
package confLib.confMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
Simple config handling for your app or module.
*/
@js.native
trait Conf[T]
  extends stdLib.Iterable[js.Tuple2[java.lang.String, T]] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_Conf: js.Function0[stdLib.IterableIterator[js.Tuple2[java.lang.String, T]]] = js.native
  val path: java.lang.String = js.native
  val size: scala.Double = js.native
  var store: org.scalablytyped.runtime.StringDictionary[T] = js.native
  /**
  	Delete all items.
  	*/
  def clear(): scala.Unit = js.native
  /**
  	Delete an item.
  	@param key - The key of the item to delete.
  	*/
  def delete(key: java.lang.String): scala.Unit = js.native
  /**
  	Get an item.
  	@param key - The key of the item to get.
  	@param defaultValue - The default value if the item does not exist.
  	*/
  def get(key: java.lang.String): T = js.native
  def get(key: java.lang.String, defaultValue: T): T = js.native
  /**
  	Check if an item exists.
  	@param key - The key of the item to check.
  	*/
  def has(key: java.lang.String): scala.Boolean = js.native
  /**
  	Watches the whole config object, calling `callback` on any changes.
  	@param callback - A callback function that is called on any changes. When a `key` is first set `oldValue` will be `undefined`, and when a key is deleted `newValue` will be `undefined`.
  	*/
  def onDidAnyChange(
    callback: js.Function2[
      /* oldValue */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[T]], 
      /* newValue */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[T]], 
      scala.Unit
    ]
  ): js.Function0[scala.Unit] = js.native
  /**
  	Watches the given `key`, calling `callback` on any changes.
  	@param key - The key wo watch.
  	@param callback - A callback function that is called on any changes. When a `key` is first set `oldValue` will be `undefined`, and when a key is deleted `newValue` will be `undefined`.
  	*/
  def onDidChange(
    key: java.lang.String,
    callback: js.Function2[/* newValue */ js.UndefOr[T], /* oldValue */ js.UndefOr[T], scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  /**
  	Set an item.
  	@param key - You can use [dot-notation](https://github.com/sindresorhus/dot-prop) in a key to access nested properties.
  	@param value - Must be JSON serializable. Trying to set the type `undefined`, `function`, or `symbol` will result in a `TypeError`.
  	*/
  def set(key: java.lang.String, value: T): scala.Unit = js.native
  /**
  	Set multiple items at once.
  	@param object - A hashmap of items to set at once.
  	*/
  def set(`object`: org.scalablytyped.runtime.StringDictionary[T]): scala.Unit = js.native
}

