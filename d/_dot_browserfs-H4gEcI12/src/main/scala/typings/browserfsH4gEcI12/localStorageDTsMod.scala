package typings.browserfsH4gEcI12

import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystemOptions
import typings.browserfsH4gEcI12.keyValueFilesystemDTsMod.SimpleSyncStore
import typings.browserfsH4gEcI12.keyValueFilesystemDTsMod.SyncKeyValueFileSystem
import typings.browserfsH4gEcI12.keyValueFilesystemDTsMod.SyncKeyValueStore
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localStorageDTsMod {
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/LocalStorage.d.ts", JSImport.Default)
  @js.native
  /**
    * Creates a new LocalStorage file system using the contents of `localStorage`.
    */
  open class default () extends SyncKeyValueFileSystem
  /* static members */
  object default {
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/LocalStorage.d.ts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a LocalStorageFileSystem instance.
      */
    inline def Create(options: Any, cb: BFSCallback[LocalStorageFileSystem]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/LocalStorage.d.ts", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/LocalStorage.d.ts", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/LocalStorage.d.ts", "LocalStorageStore")
  @js.native
  open class LocalStorageStore ()
    extends StObject
       with SyncKeyValueStore
       with SimpleSyncStore {
    
    /* CompleteClass */
    override def del(key: String): Unit = js.native
    
    /* CompleteClass */
    override def get(key: String): js.UndefOr[Buffer] = js.native
    
    /* CompleteClass */
    override def put(key: String, data: Buffer, overwrite: Boolean): Boolean = js.native
  }
  
  type LocalStorageFileSystem = SyncKeyValueFileSystem
}
