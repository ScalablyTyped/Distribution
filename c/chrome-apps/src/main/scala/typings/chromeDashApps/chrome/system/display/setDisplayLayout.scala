package typings.chromeDashApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.setDisplayLayout")
@js.native
object setDisplayLayout extends js.Object {
  /**
    * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
    * @description
    * Set the layout for all displays.
    * Any display not included will use the default layout.
    * If a layout would overlap or be otherwise invalid it will be adjusted to a valid layout.
    * After layout is resolved, an onDisplayChanged event will be triggered.
    * @since Chrome 53
    * @param layouts The layout information, required for all displays except the primary display.
    * @param callback Empty function called when the function finishes. To find out whether the function succeeded, runtime.lastError should be queried.
    */
  def apply(layouts: js.Array[DisplayLayout]): Unit = js.native
  def apply(layouts: js.Array[DisplayLayout], callback: js.Function0[Unit]): Unit = js.native
}

