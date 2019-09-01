package typings.browserfs.distNodeBackendHTML5FSMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/HTML5FS", JSImport.Default)
@js.native
/**
  * **Deprecated. Please use HTML5FS.Create() method instead.**
  *
  * Creates a new HTML5 FileSystem-backed BrowserFS file system of the given size
  * and storage type.
  *
  * **IMPORTANT**: You must call `allocate` on the resulting object before the file system
  * can be used.
  *
  * @param size storage quota to request, in megabytes. Allocated value may be less.
  * @param type window.PERSISTENT or window.TEMPORARY. Defaults to PERSISTENT.
  */
class default () extends HTML5FS {
  def this(size: Double) = this()
  def this(size: Double, `type`: Double) = this()
  def this(size: Double, `type`: Double, deprecateMsg: Boolean) = this()
}

/* static members */
@JSImport("browserfs/dist/node/backend/HTML5FS", JSImport.Default)
@js.native
object default extends js.Object {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates an HTML5FS instance with the given options.
    */
  def Create(opts: HTML5FSOptions, cb: BFSCallback[HTML5FS]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

