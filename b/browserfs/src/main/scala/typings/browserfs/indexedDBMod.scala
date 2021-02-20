package typings.browserfs

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.keyValueFilesystemMod.AsyncKeyValueFileSystem
import typings.browserfs.keyValueFilesystemMod.AsyncKeyValueROTransaction
import typings.browserfs.keyValueFilesystemMod.AsyncKeyValueRWTransaction
import typings.browserfs.keyValueFilesystemMod.AsyncKeyValueStore
import typings.std.IDBObjectStore
import typings.std.IDBTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexedDBMod {
  
  @JSImport("browserfs/dist/node/backend/IndexedDB", JSImport.Default)
  @js.native
  class default protected () extends AsyncKeyValueFileSystem {
    /**
      * **Deprecated. Use IndexedDB.Create() method instead.**
      *
      * Constructs an IndexedDB file system.
      * @param cb Called once the database is instantiated and ready for use.
      *   Passes an error if there was an issue instantiating the database.
      * @param storeName The name of this file system. You can have
      *   multiple IndexedDB file systems operating at once, but each must have
      *   a different name.
      */
    def this(cb: BFSCallback[IndexedDBFileSystem]) = this()
    def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String) = this()
    def this(cb: BFSCallback[IndexedDBFileSystem], storeName: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
    def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String, deprecateMsg: Boolean) = this()
  }
  /* static members */
  object default {
    
    /**
      * Constructs an IndexedDB file system with the given options.
      */
    @JSImport("browserfs/dist/node/backend/IndexedDB", "default.Create")
    @js.native
    def Create(opts: IndexedDBFileSystemOptions, cb: BFSCallback[IndexedDBFileSystem]): Unit = js.native
    
    @JSImport("browserfs/dist/node/backend/IndexedDB", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/IndexedDB", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    @JSImport("browserfs/dist/node/backend/IndexedDB", "default.isAvailable")
    @js.native
    def isAvailable(): Boolean = js.native
  }
  
  @JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBROTransaction")
  @js.native
  class IndexedDBROTransaction protected () extends AsyncKeyValueROTransaction {
    def this(tx: IDBTransaction, store: IDBObjectStore) = this()
    
    var store: IDBObjectStore = js.native
    
    var tx: IDBTransaction = js.native
  }
  
  @JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBRWTransaction")
  @js.native
  class IndexedDBRWTransaction protected ()
    extends IndexedDBROTransaction
       with AsyncKeyValueRWTransaction {
    def this(tx: IDBTransaction, store: IDBObjectStore) = this()
  }
  
  @JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBStore")
  @js.native
  class IndexedDBStore protected () extends AsyncKeyValueStore {
    def this(cb: BFSCallback[IndexedDBStore]) = this()
    def this(cb: BFSCallback[IndexedDBStore], storeName: String) = this()
    
    var db: js.Any = js.native
    
    var storeName: js.Any = js.native
  }
  
  type IndexedDBFileSystem = AsyncKeyValueFileSystem
  
  @js.native
  trait IndexedDBFileSystemOptions extends StObject {
    
    var storeName: js.UndefOr[String] = js.native
  }
  object IndexedDBFileSystemOptions {
    
    @scala.inline
    def apply(): IndexedDBFileSystemOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndexedDBFileSystemOptions]
    }
    
    @scala.inline
    implicit class IndexedDBFileSystemOptionsMutableBuilder[Self <: IndexedDBFileSystemOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    }
  }
}
