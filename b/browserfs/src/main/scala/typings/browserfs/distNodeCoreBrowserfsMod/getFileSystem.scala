package typings.browserfs.distNodeCoreBrowserfsMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/browserfs", "getFileSystem")
@js.native
object getFileSystem extends js.Object {
  def apply(config: FileSystemConfiguration, cb: BFSCallback[FileSystem]): Unit = js.native
}

