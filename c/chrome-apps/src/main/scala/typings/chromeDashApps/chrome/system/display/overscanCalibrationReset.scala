package typings.chromeDashApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.overscanCalibrationReset")
@js.native
object overscanCalibrationReset extends js.Object {
  /**
    * Resets the overscan insets for a display to the last saved value (i.e before Start was called).
    * @since Chrome 53
    * @param id The display's unique identifier.
    */
  def apply(id: String): Unit = js.native
}

