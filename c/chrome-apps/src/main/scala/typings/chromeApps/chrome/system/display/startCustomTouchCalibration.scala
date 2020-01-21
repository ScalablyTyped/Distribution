package typings.chromeApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.startCustomTouchCalibration")
@js.native
object startCustomTouchCalibration extends js.Object {
  /**
    * Starts custom touch calibration for a display.
    * This should be called when using a custom UX for collecting calibration data.
    * If another touch calibration is already in progress this will throw an error.
    * @since Chrome 57
    * @param id The display's unique identifier.
    */
  def apply(id: String): Unit = js.native
}

