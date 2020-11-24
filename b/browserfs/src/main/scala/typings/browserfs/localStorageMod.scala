package typings.browserfs

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.keyValueFilesystemMod.SimpleSyncStore
import typings.browserfs.keyValueFilesystemMod.SyncKeyValueFileSystem
import typings.browserfs.keyValueFilesystemMod.SyncKeyValueStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/LocalStorage", JSImport.Namespace)
@js.native
object localStorageMod extends js.Object {
  
  @js.native
  class LocalStorageStore ()
    extends SyncKeyValueStore
       with SimpleSyncStore
  
  @js.native
  /**
    * Creates a new LocalStorage file system using the contents of `localStorage`.
    */
  class default () extends SyncKeyValueFileSystem
  /* static members */
  @js.native
  object default extends js.Object {
    
    /**
      * Creates a LocalStorageFileSystem instance.
      */
    def Create(options: js.Any, cb: BFSCallback[LocalStorageFileSystem]): Unit = js.native
    
    val Name: String = js.native
    
    val Options: FileSystemOptions = js.native
    
    def isAvailable(): Boolean = js.native
  }
  
  type LocalStorageFileSystem = SyncKeyValueFileSystem
}
