package typings.browserfs

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.keyValueFilesystemMod.SimpleSyncStore
import typings.browserfs.keyValueFilesystemMod.SyncKeyValueFileSystem
import typings.browserfs.keyValueFilesystemMod.SyncKeyValueStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/InMemory", JSImport.Namespace)
@js.native
object inMemoryMod extends js.Object {
  
  @js.native
  class InMemoryStore ()
    extends SyncKeyValueStore
       with SimpleSyncStore {
    
    var store: js.Any = js.native
  }
  
  @js.native
  class default () extends SyncKeyValueFileSystem
  /* static members */
  @js.native
  object default extends js.Object {
    
    /**
      * Creates an InMemoryFileSystem instance.
      */
    def Create(options: js.Any, cb: BFSCallback[InMemoryFileSystem]): Unit = js.native
    
    val Name: String = js.native
    
    val Options: FileSystemOptions = js.native
  }
  
  type InMemoryFileSystem = SyncKeyValueFileSystem
}
