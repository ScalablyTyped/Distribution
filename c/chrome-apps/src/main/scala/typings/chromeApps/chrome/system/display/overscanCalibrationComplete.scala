package typings.chromeApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.overscanCalibrationComplete")
@js.native
object overscanCalibrationComplete extends js.Object {
  /**
    * Complete overscan adjustments for a display by saving the current values and hiding the overlay.
    * @since Chrome 53
    * @param id The display's unique identifier.
    */
  def apply(id: String): Unit = js.native
}

