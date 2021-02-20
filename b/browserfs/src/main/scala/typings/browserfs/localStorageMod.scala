package typings.browserfs

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.keyValueFilesystemMod.SimpleSyncStore
import typings.browserfs.keyValueFilesystemMod.SyncKeyValueFileSystem
import typings.browserfs.keyValueFilesystemMod.SyncKeyValueStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localStorageMod {
  
  @JSImport("browserfs/dist/node/backend/LocalStorage", JSImport.Default)
  @js.native
  /**
    * Creates a new LocalStorage file system using the contents of `localStorage`.
    */
  class default () extends SyncKeyValueFileSystem
  /* static members */
  object default {
    
    /**
      * Creates a LocalStorageFileSystem instance.
      */
    @JSImport("browserfs/dist/node/backend/LocalStorage", "default.Create")
    @js.native
    def Create(options: js.Any, cb: BFSCallback[LocalStorageFileSystem]): Unit = js.native
    
    @JSImport("browserfs/dist/node/backend/LocalStorage", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/LocalStorage", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    @JSImport("browserfs/dist/node/backend/LocalStorage", "default.isAvailable")
    @js.native
    def isAvailable(): Boolean = js.native
  }
  
  @JSImport("browserfs/dist/node/backend/LocalStorage", "LocalStorageStore")
  @js.native
  class LocalStorageStore ()
    extends SyncKeyValueStore
       with SimpleSyncStore
  
  type LocalStorageFileSystem = SyncKeyValueFileSystem
}
