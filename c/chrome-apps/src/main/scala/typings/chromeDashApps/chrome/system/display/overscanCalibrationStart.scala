package typings.chromeDashApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.overscanCalibrationStart")
@js.native
object overscanCalibrationStart extends js.Object {
  /**
    * Starts overscan calibration for a display.
    * This will show an overlay on the screen indicating the current overscan insets.
    * If overscan calibration for display **id** is in progress this will reset calibration.
    * @since Chrome 53
    * @param id The display's unique identifier.
    */
  def apply(id: String): Unit = js.native
}

