package typings.browserfs.distNodeBackendIndexedDBMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/IndexedDB", JSImport.Default)
@js.native
class default protected () extends IndexedDBFileSystem {
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
  def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String, deprecateMsg: Boolean) = this()
}

/* static members */
@JSImport("browserfs/dist/node/backend/IndexedDB", JSImport.Default)
@js.native
object default extends js.Object {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Constructs an IndexedDB file system with the given options.
    */
  def Create(opts: IndexedDBFileSystemOptions, cb: BFSCallback[IndexedDBFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

