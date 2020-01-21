package typings.chromeApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.clearTouchCalibration")
@js.native
object clearTouchCalibration extends js.Object {
  /**
    * Resets the touch calibration for the display and brings it back to its default state by clearing any touch calibration data associated with the display.
    * @since Chrome 57
    * @param id The display's unique identifier.
    */
  def apply(id: String): Unit = js.native
}

