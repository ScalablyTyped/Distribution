package typings.conf.confMod

import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
Simple config handling for your app or module.
*/
@js.native
trait Conf[T]
  extends Iterable[
      js.Tuple2[
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_Conf: js.Function0[
    IterableIterator[
      js.Tuple2[
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ] = js.native
  val path: String = js.native
  val size: Double = js.native
  var store: T = js.native
  /**
  	Delete all items.
  	*/
  def clear(): Unit = js.native
  /**
  	Delete an item.
  	@param key - The key of the item to delete.
  	*/
  def delete[K /* <: String */](key: K): Unit = js.native
  /**
  	Get an item.
  	@param key - The key of the item to get.
  	@param defaultValue - The default value if the item does not exist.
  	*/
  def get[K /* <: String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  def get[K /* <: String */](
    key: K,
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  /**
  	Check if an item exists.
  	@param key - The key of the item to check.
  	*/
  def has[K /* <: String */](key: K): Boolean = js.native
  /**
  	Watches the whole config object, calling `callback` on any changes.
  	@param callback - A callback function that is called on any changes. When a `key` is first set `oldValue` will be `undefined`, and when a key is deleted `newValue` will be `undefined`.
  	*/
  def onDidAnyChange(callback: js.Function2[/* newValue */ js.UndefOr[T], /* oldValue */ js.UndefOr[T], Unit]): js.Function0[Unit] = js.native
  /**
  	Watches the given `key`, calling `callback` on any changes.
  	@param key - The key wo watch.
  	@param callback - A callback function that is called on any changes. When a `key` is first set `oldValue` will be `undefined`, and when a key is deleted `newValue` will be `undefined`.
  	*/
  def onDidChange[K /* <: String */](
    key: K,
    callback: js.Function2[
      /* newValue */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      /* oldValue */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ]
  ): js.Function0[Unit] = js.native
  /**
  	Reset items to their default values, as defined by the `defaults` or `schema` option.
  	@param keys - The keys of the items to reset.
  	*/
  def reset[K /* <: String */](keys: K*): Unit = js.native
  /**
  	Set multiple items at once.
  	@param object - A hashmap of items to set at once.
  	*/
  def set(`object`: Partial[T]): Unit = js.native
  /**
  	Set an item.
  	@param key - You can use [dot-notation](https://github.com/sindresorhus/dot-prop) in a key to access nested properties.
  	@param value - Must be JSON serializable. Trying to set the type `undefined`, `function`, or `symbol` will result in a `TypeError`.
  	*/
  def set[K /* <: String */](key: K, value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Unit = js.native
}

