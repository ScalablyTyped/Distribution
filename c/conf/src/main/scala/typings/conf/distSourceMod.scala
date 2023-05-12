package typings.conf

import typings.conf.distSourceTypesMod.OnDidAnyChangeCallback
import typings.conf.distSourceTypesMod.OnDidChangeCallback
import typings.conf.distSourceTypesMod.Options
import typings.conf.distSourceTypesMod.Unsubscribe
import typings.node.eventsMod.EventEmitter
import typings.std.Exclude
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSourceMod {
  
  @JSImport("conf/dist/source", JSImport.Default)
  @js.native
  open class default[T /* <: Record[String, Any] */] ()
    extends StObject
       with Conf[T] {
    def this(partialOptions: Partial[Options[T]]) = this()
  }
  
  @js.native
  trait Conf[T /* <: Record[String, Any] */]
    extends StObject
       with Iterable[
          js.Tuple2[
            /* keyof T */ String, 
            /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
          ]
        ] {
    
    /* private */ var _containsReservedKey: Any = js.native
    
    /* private */ val _deserialize: Any = js.native
    
    /* private */ var _encryptData: Any = js.native
    
    /* private */ var _ensureDirectory: Any = js.native
    
    /* private */ var _get: Any = js.native
    
    /* private */ var _handleChange: Any = js.native
    
    /* private */ var _isVersionInRangeFormat: Any = js.native
    
    /* private */ var _migrate: Any = js.native
    
    /* private */ val _serialize: Any = js.native
    
    /* private */ var _set: Any = js.native
    
    /* private */ var _shouldPerformMigration: Any = js.native
    
    /* private */ var _validate: Any = js.native
    
    /* private */ var _watch: Any = js.native
    
    /* private */ var _write: Any = js.native
    
    /**
      Delete all items.
      This resets known items to their default values, if defined by the `defaults` or `schema` option.
      */
    def clear(): Unit = js.native
    
    /**
      Delete an item.
      @param key - The key of the item to delete.
      */
    def delete[Key /* <: /* keyof T */ String */](key: Key): Unit = js.native
    
    val events: EventEmitter = js.native
    
    /**
      Get an item.
      @param key - The key of the item to get.
      @param defaultValue - The default value if the item does not exist.
      */
    def get[Key /* <: /* keyof T */ String */](key: Key): /* import warning: importer.ImportType#apply Failed type conversion: T[Key] */ js.Any = js.native
    def get[Key /* <: /* keyof T */ String */](
      key: Key,
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[Key] */ js.Any
    ): /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[Key] */ js.Any = js.native
    def get[Key /* <: String */, Value](key: Exclude[Key, /* keyof T */ String], defaultValue: Value): Value = js.native
    @JSName("get")
    def get_KeyValue_Value[Key /* <: String */, Value](key: Exclude[Key, /* keyof T */ String]): Value = js.native
    
    /**
      Check if an item exists.
      @param key - The key of the item to check.
      */
    def has[Key /* <: /* keyof T */ String */](key: Key): Boolean = js.native
    def has[Key /* <: /* keyof T */ String */](key: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Conf: js.Function0[
        IterableIterator[
          js.Tuple2[
            /* keyof T */ String, 
            /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
          ]
        ]
      ] = js.native
    
    /**
      Watches the whole config object, calling `callback` on any changes.
      @param callback - A callback function that is called on any changes. When a `key` is first set `oldValue` will be `undefined`, and when a key is deleted `newValue` will be `undefined`.
      @returns A function, that when called, will unsubscribe.
      */
    def onDidAnyChange(callback: OnDidAnyChangeCallback[T]): Unsubscribe = js.native
    
    /**
      Watches the given `key`, calling `callback` on any changes.
      @param key - The key wo watch.
      @param callback - A callback function that is called on any changes. When a `key` is first set `oldValue` will be `undefined`, and when a key is deleted `newValue` will be `undefined`.
      @returns A function, that when called, will unsubscribe.
      */
    def onDidChange[Key /* <: /* keyof T */ String */](
      key: Key,
      callback: OnDidChangeCallback[
          /* import warning: importer.ImportType#apply Failed type conversion: T[Key] */ js.Any
        ]
    ): Unsubscribe = js.native
    
    val path: String = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      Reset items to their default values, as defined by the `defaults` or `schema` option.
      @see `clear()` to reset all items.
      @param keys - The keys of the items to reset.
      */
    def reset[Key /* <: /* keyof T */ String */](keys: Key*): Unit = js.native
    
    def set(key: String, value: Any): Unit = js.native
    def set(`object`: Partial[T]): Unit = js.native
    def set[Key /* <: /* keyof T */ String */](
      key: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[Key] */ js.Any
    ): Unit = js.native
    /**
      Set an item or multiple items at once.
      @param {key|object} - You can use [dot-notation](https://github.com/sindresorhus/dot-prop) in a key to access nested properties. Or a hashmap of items to set at once.
      @param value - Must be JSON serializable. Trying to set the type `undefined`, `function`, or `symbol` will result in a `TypeError`.
      */
    @JSName("set")
    def set_Key[Key /* <: /* keyof T */ String */](key: Key): Unit = js.native
    
    def size: Double = js.native
    
    def store: T = js.native
    def store_=(value: T): Unit = js.native
  }
}
