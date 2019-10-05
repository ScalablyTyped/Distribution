package typings.chromeDashApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.getDisplayLayout")
@js.native
object getDisplayLayout extends js.Object {
  /**
    * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
    * @description Requests the layout info for all displays.
    * @since Chrome 53
    * @export
    * @param callback The callback to invoke with the results.
    */
  def apply(callback: js.Function1[/* layouts */ js.Array[DisplayLayout], Unit]): Unit = js.native
}

