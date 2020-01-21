package typings.browserfs.browserfsMod

import typings.browserfs.fileSystemMod.BFSCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/browserfs", "getFileSystem")
@js.native
object getFileSystem extends js.Object {
  def apply(config: FileSystemConfiguration, cb: BFSCallback[typings.browserfs.fileSystemMod.FileSystem]): Unit = js.native
}

