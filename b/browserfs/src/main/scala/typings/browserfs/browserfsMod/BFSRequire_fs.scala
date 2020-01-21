package typings.browserfs.browserfsMod

import typings.browserfs.browserfsStrings.fs
import typings.browserfs.fSMod.FSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/browserfs", "BFSRequire")
@js.native
object BFSRequire_fs extends js.Object {
  def apply(module: fs): FSModule = js.native
}

