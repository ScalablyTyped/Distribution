package typings.browserfs.overlayFSMod

import typings.browserfs.anon.Readable
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayFS
  extends typings.browserfs.lockedFsMod.default[UnlockedOverlayFS] {
  def getOverlayedFileSystems(): Readable = js.native
  def initialize(cb: BFSOneArgCallback, deprecateMsg: Boolean): Unit = js.native
  def unwrap(): UnlockedOverlayFS = js.native
}

