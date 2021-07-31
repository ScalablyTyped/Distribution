package typings.browserfs

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.keyValueFilesystemMod.SimpleSyncStore
import typings.browserfs.keyValueFilesystemMod.SyncKeyValueFileSystem
import typings.browserfs.keyValueFilesystemMod.SyncKeyValueStore
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inMemoryMod {
  
  @JSImport("browserfs/dist/node/backend/InMemory", JSImport.Default)
  @js.native
  class default () extends SyncKeyValueFileSystem
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/backend/InMemory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an InMemoryFileSystem instance.
      */
    @scala.inline
    def Create(options: js.Any, cb: BFSCallback[InMemoryFileSystem]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    extends StObject
       with SyncKeyValueStore
       with SimpleSyncStore {
    
    /* CompleteClass */
    override def del(key: String): Unit = js.native
    
    /* CompleteClass */
    override def get(key: String): js.UndefOr[Buffer] = js.native
    
    /* CompleteClass */
    override def put(key: String, data: Buffer, overwrite: Boolean): Boolean = js.native
    
    var store: js.Any = js.native
  }
  
  type InMemoryFileSystem = SyncKeyValueFileSystem
}
