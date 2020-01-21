package typings.browserfs.utilMod

import typings.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/util", "mkdirpSync")
@js.native
object mkdirpSync extends js.Object {
  def apply(p: String, mode: Double, fs: FileSystem): Unit = js.native
}

