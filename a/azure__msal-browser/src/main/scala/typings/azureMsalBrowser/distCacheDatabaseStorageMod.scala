package typings.azureMsalBrowser

import typings.azureMsalBrowser.distCacheIasyncmemorystorageMod.IAsyncStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheDatabaseStorageMod {
  
  @JSImport("@azure/msal-browser/dist/cache/DatabaseStorage", "DatabaseStorage")
  @js.native
  open class DatabaseStorage[T] ()
    extends StObject
       with IAsyncStorage[T] {
    
    /**
      * Closes the connection to IndexedDB database when all pending transactions
      * complete.
      */
    def closeConnection(): Unit = js.native
    
    /**
      * Returns true or false if the given key is present in the cache.
      * @param key
      */
    /* CompleteClass */
    override def containsKey(key: String): js.Promise[Boolean] = js.native
    
    /* private */ var db: Any = js.native
    
    /* private */ var dbName: Any = js.native
    
    /* private */ var dbOpen: Any = js.native
    
    /**
      * Deletes the MSAL database. The database is deleted rather than cleared to make it possible
      * for client applications to downgrade to a previous MSAL version without worrying about forward compatibility issues
      * with IndexedDB database versions.
      */
    def deleteDatabase(): js.Promise[Boolean] = js.native
    
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
    
    /**
      * Opens IndexedDB instance.
      */
    def open(): js.Promise[Unit] = js.native
    
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
    
    /* private */ var tableName: Any = js.native
    
    /**
      * Opens database if it's not already open
      */
    /* private */ var validateDbIsOpen: Any = js.native
    
    /* private */ var version: Any = js.native
  }
}
