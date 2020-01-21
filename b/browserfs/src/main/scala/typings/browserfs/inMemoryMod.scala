package typings.browserfs

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.keyValueFilesystemMod.SimpleSyncStore
import typings.browserfs.keyValueFilesystemMod.SyncKeyValueFileSystem
import typings.browserfs.keyValueFilesystemMod.SyncKeyValueStore
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/InMemory", JSImport.Namespace)
@js.native
object inMemoryMod extends js.Object {
  @js.native
  class InMemoryStore ()
    extends SyncKeyValueStore
       with SimpleSyncStore {
    var store: js.Any = js.native
    /* CompleteClass */
    override def del(key: String): Unit = js.native
    /* CompleteClass */
    override def get(key: String): js.UndefOr[Buffer] = js.native
    /* CompleteClass */
    override def put(key: String, data: Buffer, overwrite: Boolean): Boolean = js.native
  }
  
  @js.native
  class default () extends SyncKeyValueFileSystem
  
  /* static members */
  @js.native
  object default extends js.Object {
    val Name: String = js.native
    val Options: FileSystemOptions = js.native
    /**
      * Creates an InMemoryFileSystem instance.
      */
    def Create(options: js.Any, cb: BFSCallback[InMemoryFileSystem]): Unit = js.native
  }
  
  type InMemoryFileSystem = SyncKeyValueFileSystem
}

