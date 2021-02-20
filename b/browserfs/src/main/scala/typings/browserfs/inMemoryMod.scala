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

object inMemoryMod {
  
  @JSImport("browserfs/dist/node/backend/InMemory", JSImport.Default)
  @js.native
  class default () extends SyncKeyValueFileSystem
  /* static members */
  object default {
    
    /**
      * Creates an InMemoryFileSystem instance.
      */
    @JSImport("browserfs/dist/node/backend/InMemory", "default.Create")
    @js.native
    def Create(options: js.Any, cb: BFSCallback[InMemoryFileSystem]): Unit = js.native
    
    @JSImport("browserfs/dist/node/backend/InMemory", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/InMemory", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
  }
  
  @JSImport("browserfs/dist/node/backend/InMemory", "InMemoryStore")
  @js.native
  class InMemoryStore ()
    extends SyncKeyValueStore
       with SimpleSyncStore {
    
    var store: js.Any = js.native
  }
  
  type InMemoryFileSystem = SyncKeyValueFileSystem
}
