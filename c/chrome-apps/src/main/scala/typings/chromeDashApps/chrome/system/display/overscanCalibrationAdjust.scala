package typings.chromeDashApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.overscanCalibrationAdjust")
@js.native
object overscanCalibrationAdjust extends js.Object {
  /**
    * Adjusts the current overscan insets for a display.
    * Typically this should etiher move the display along an axis (e.g. left+right have the same value)
    * or scale it along an axis (e.g. top+bottom have opposite values).
    * Each Adjust call is cumulative with previous calls since Start.
    * @since Chrome 53
    * @param id The display's unique identifier.
    * @param delta The amount to change the overscan insets.
    */
  def apply(id: String, delta: Insets): Unit = js.native
}

