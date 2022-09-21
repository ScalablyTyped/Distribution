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

object inMemoryDTsMod {
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/InMemory.d.ts", JSImport.Default)
  @js.native
  open class default () extends SyncKeyValueFileSystem
  /* static members */
  object default {
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/InMemory.d.ts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an InMemoryFileSystem instance.
      */
    inline def Create(options: Any, cb: BFSCallback[InMemoryFileSystem]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/InMemory.d.ts", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/InMemory.d.ts", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
  }
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/InMemory.d.ts", "InMemoryStore")
  @js.native
  open class InMemoryStore ()
    extends StObject
       with SyncKeyValueStore
       with SimpleSyncStore {
    
    /* CompleteClass */
    override def del(key: String): Unit = js.native
    
    /* CompleteClass */
    override def get(key: String): js.UndefOr[Buffer] = js.native
    
    /* CompleteClass */
    override def put(key: String, data: Buffer, overwrite: Boolean): Boolean = js.native
    
    /* private */ var store: Any = js.native
  }
  
  type InMemoryFileSystem = SyncKeyValueFileSystem
}
