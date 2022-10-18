package typings.azureMsalBrowser

import typings.azureMsalBrowser.distCacheIasyncmemorystorageMod.IAsyncStorage
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheAsyncMemoryStorageMod {
  
  @JSImport("@azure/msal-browser/dist/cache/AsyncMemoryStorage", "AsyncMemoryStorage")
  @js.native
  open class AsyncMemoryStorage[T] protected ()
    extends StObject
       with IAsyncStorage[T] {
    def this(logger: Logger, storeName: String) = this()
    
    /**
      * Clears in-memory Map
      */
    def clearInMemory(): Unit = js.native
    
    /**
      * Tries to delete the IndexedDB database
      * @returns
      */
    def clearPersistent(): js.Promise[Boolean] = js.native
    
    /**
      * Returns true or false if the given key is present in the cache.
      * @param key
      */
    /* CompleteClass */
    override def containsKey(key: String): js.Promise[Boolean] = js.native
    
    /**
      * Get the item from the asynchronous storage object matching the given key.
      * @param key
      */
    /* CompleteClass */
    override def getItem(key: String): js.Promise[T | Null] = js.native
    
    /**
      * Get all the keys from the asynchronous storage object as an iterable array of strings.
      */
    /* CompleteClass */
    override def getKeys(): js.Promise[js.Array[String]] = js.native
    
    /* private */ var handleDatabaseAccessError: Any = js.native
    
    /* private */ var inMemoryCache: Any = js.native
    
    /* private */ var indexedDBCache: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Removes the item in the asynchronous storage object matching the given key.
      * @param key
      */
    /* CompleteClass */
    override def removeItem(key: String): js.Promise[Unit] = js.native
    
    /**
      * Sets the item in the asynchronous storage object with the given key.
      * @param key
      * @param value
      */
    /* CompleteClass */
    override def setItem(key: String, value: T): js.Promise[Unit] = js.native
    
    /* private */ var storeName: Any = js.native
  }
}
