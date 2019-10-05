package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.restart")
@js.native
object restart extends js.Object {
  /**
    * Restart the ChromeOS device when the app runs in kiosk mode. Otherwise, it's no-op.
    * @since Chrome 32.
    */
  def apply(): Unit = js.native
}

