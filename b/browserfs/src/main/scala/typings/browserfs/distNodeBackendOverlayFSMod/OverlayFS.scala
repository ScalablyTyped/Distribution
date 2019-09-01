package typings.browserfs.distNodeBackendOverlayFSMod

import typings.browserfs.Anon_Readable
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSOneArgCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayFS
  extends typings.browserfs.distNodeGenericLockedUnderscoreFsMod.default[UnlockedOverlayFS] {
  def getOverlayedFileSystems(): Anon_Readable = js.native
  def initialize(cb: BFSOneArgCallback, deprecateMsg: Boolean): Unit = js.native
  def unwrap(): UnlockedOverlayFS = js.native
}

