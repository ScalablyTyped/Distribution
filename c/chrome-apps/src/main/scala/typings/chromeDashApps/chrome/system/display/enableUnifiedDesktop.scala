package typings.chromeDashApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.enableUnifiedDesktop")
@js.native
object enableUnifiedDesktop extends js.Object {
  /**
    * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
    * @description
    * Enables/disables the unified desktop feature.
    * Note that this simply enables the feature, but will not change the actual desktop mode.
    * (That is, if the desktop is in mirror mode, it will stay in mirror mode)
    * @since Chrome 46
    * @param {boolean} enabled True if unified desktop should be enabled.
    */
  def apply(enabled: Boolean): Unit = js.native
}

