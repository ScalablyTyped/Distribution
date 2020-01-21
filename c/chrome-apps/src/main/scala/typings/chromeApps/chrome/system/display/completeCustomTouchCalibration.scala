package typings.chromeApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.completeCustomTouchCalibration")
@js.native
object completeCustomTouchCalibration extends js.Object {
  /**
    * Sets the touch calibration pairs for a display.
    * These **pairs** would be used to calibrate the touch screen for display with **id** called in startCustomTouchCalibration().
    * Always call **startCustomTouchCalibration** before calling this method.
    * If another touch calibration is already in progress this will throw an error.
    * @since Chrome 57
    * @param pairs The pairs of point used to calibrate the display.
    * @param bounds Bounds of the display when the touch calibration was performed. |bounds.left| and |bounds.top| values are ignored.
    * @throws Error
    */
  def apply(pairs: TouchCalibrationPairs, bounds: Bounds): Unit = js.native
}

