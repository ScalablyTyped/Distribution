package typings.browserfs.isoFSMod

import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/IsoFS", JSImport.Default)
@js.native
class default protected () extends IsoFS {
  /**
    * **Deprecated. Please use IsoFS.Create() method instead.**
    *
    * Constructs a read-only file system from the given ISO.
    * @param data The ISO file in a buffer.
    * @param name The name of the ISO (optional; used for debug messages / identification via getName()).
    */
  def this(data: Buffer) = this()
  def this(data: Buffer, name: String) = this()
  def this(data: Buffer, name: String, deprecateMsg: Boolean) = this()
}

/* static members */
@JSImport("browserfs/dist/node/backend/IsoFS", JSImport.Default)
@js.native
object default extends js.Object {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates an IsoFS instance with the given options.
    */
  def Create(opts: IsoFSOptions, cb: BFSCallback[IsoFS]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

