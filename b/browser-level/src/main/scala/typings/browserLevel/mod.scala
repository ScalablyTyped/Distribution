package typings.browserLevel

import typings.abstractLevel.abstractIteratorMod.AbstractIteratorOptions
import typings.abstractLevel.abstractIteratorMod.AbstractKeyIteratorOptions
import typings.abstractLevel.abstractIteratorMod.AbstractValueIteratorOptions
import typings.abstractLevel.abstractLevelMod.AbstractBatchOperation
import typings.abstractLevel.abstractLevelMod.AbstractBatchOptions
import typings.abstractLevel.abstractLevelMod.AbstractDatabaseOptions
import typings.abstractLevel.abstractLevelMod.AbstractDelOptions
import typings.abstractLevel.abstractLevelMod.AbstractGetManyOptions
import typings.abstractLevel.abstractLevelMod.AbstractGetOptions
import typings.abstractLevel.abstractLevelMod.AbstractOpenOptions
import typings.abstractLevel.abstractLevelMod.AbstractPutOptions
import typings.abstractLevel.interfacesMod.NodeCallback
import typings.abstractLevel.mod.AbstractChainedBatch
import typings.abstractLevel.mod.AbstractIterator
import typings.abstractLevel.mod.AbstractKeyIterator
import typings.abstractLevel.mod.AbstractLevel
import typings.abstractLevel.mod.AbstractValueIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browser-level", "BrowserLevel")
  @js.native
  open class BrowserLevel[KDefault, VDefault] protected ()
    extends AbstractLevel[js.typedarray.Uint8Array, KDefault, VDefault] {
    /**
      * Database constructor.
      *
      * @param location The name of the [`IDBDatabase`](https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase)
      * to be opened, as well as the name of the object store within that database. The name
      * of the `IDBDatabase` will be prefixed with {@link DatabaseOptions.prefix}.
      * @param options Options, of which some will be forwarded to {@link open}.
      */
    def this(location: String) = this()
    def this(location: String, options: DatabaseOptions[KDefault, VDefault]) = this()
    
    /**
      * Location that was passed to the constructor.
      */
    def location: String = js.native
    
    /**
      * Database name prefix that was passed to the constructor (as `prefix`).
      */
    def namePrefix: String = js.native
    
    /**
      * Version that was passed to the constructor.
      */
    def version: Double = js.native
  }
  /* static members */
  object BrowserLevel {
    
    @JSImport("browser-level", "BrowserLevel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Delete the IndexedDB database at the given {@link location}.
      */
    inline def destroy(location: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(location.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def destroy(location: String, callback: NodeCallback[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(location.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def destroy(location: String, prefix: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(location.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def destroy(location: String, prefix: String, callback: NodeCallback[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(location.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type BatchOperation[TDatabase, K, V] = AbstractBatchOperation[TDatabase, K, V]
  
  type BatchOptions[K, V] = AbstractBatchOptions[K, V]
  
  type ChainedBatch[TDatabase, K, V] = AbstractChainedBatch[TDatabase, K, V]
  
  trait DatabaseOptions[K, V]
    extends StObject
       with AbstractDatabaseOptions[K, V] {
    
    /**
      * Prefix for the `IDBDatabase` name. Can be set to an empty string.
      *
      * @defaultValue `'level-js-'`
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * The version to open the `IDBDatabase` with.
      *
      * @defaultValue `1`
      */
    var version: js.UndefOr[Double | String] = js.undefined
  }
  object DatabaseOptions {
    
    inline def apply[K, V](): DatabaseOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseOptions[K, V]]
    }
    
    extension [Self <: DatabaseOptions[?, ?], K, V](x: Self & (DatabaseOptions[K, V])) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setVersion(value: Double | String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type DelOptions[K] = AbstractDelOptions[K]
  
  type GetManyOptions[K, V] = AbstractGetManyOptions[K, V]
  
  type GetOptions[K, V] = AbstractGetOptions[K, V]
  
  type Iterator[TDatabase, K, V] = AbstractIterator[TDatabase, K, V]
  
  type IteratorOptions[K, V] = AbstractIteratorOptions[K, V]
  
  type KeyIterator[TDatabase, K] = AbstractKeyIterator[TDatabase, K]
  
  type KeyIteratorOptions[K] = AbstractKeyIteratorOptions[K]
  
  type OpenOptions = AbstractOpenOptions
  
  type PutOptions[K, V] = AbstractPutOptions[K, V]
  
  type ValueIterator[TDatabase, K, V] = AbstractValueIterator[TDatabase, K, V]
  
  type ValueIteratorOptions[K, V] = AbstractValueIteratorOptions[K, V]
}
