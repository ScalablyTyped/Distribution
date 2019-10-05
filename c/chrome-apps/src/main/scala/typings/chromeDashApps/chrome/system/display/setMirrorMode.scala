package typings.chromeDashApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.setMirrorMode")
@js.native
object setMirrorMode extends js.Object {
  def apply(info: MirrorModeInfoMixed, callback: js.Function0[Unit]): Unit = js.native
  /**
    * @requires(CrOS Kiosk app) Chrome OS Kiosk apps only
    * @since Chrome 65.
    * @description
    * Sets the display mode to the specified mirror mode.
    * Each call resets the state from previous calls.
    * Calling setDisplayProperties() will fail for the
    * mirroring destination displays.
    */
  def apply(info: MirrorModeInfo, callback: js.Function0[Unit]): Unit = js.native
}

