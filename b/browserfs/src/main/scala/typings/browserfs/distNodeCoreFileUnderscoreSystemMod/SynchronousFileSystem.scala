package typings.browserfs.distNodeCoreFileUnderscoreSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/file_system", "SynchronousFileSystem")
@js.native
class SynchronousFileSystem () extends BaseFileSystem {
  def readlink(p: String, cb: BFSCallback[String]): Unit = js.native
  def supportsSynch(): Boolean = js.native
}

