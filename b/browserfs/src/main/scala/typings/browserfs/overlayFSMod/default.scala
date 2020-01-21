package typings.browserfs.overlayFSMod

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystem
import typings.browserfs.fileSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/OverlayFS", JSImport.Default)
@js.native
class default protected () extends OverlayFS {
  /**
    * **Deprecated. Please use OverlayFS.Create() method instead.**
    * @param writable The file system to write modified files to.
    * @param readable The file system that initially populates this file system.
    */
  def this(writable: FileSystem, readable: FileSystem) = this()
  def this(writable: FileSystem, readable: FileSystem, deprecateMsg: Boolean) = this()
}

/* static members */
@JSImport("browserfs/dist/node/backend/OverlayFS", JSImport.Default)
@js.native
object default extends js.Object {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Constructs and initializes an OverlayFS instance with the given options.
    */
  def Create(opts: OverlayFSOptions, cb: BFSCallback[OverlayFS]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

