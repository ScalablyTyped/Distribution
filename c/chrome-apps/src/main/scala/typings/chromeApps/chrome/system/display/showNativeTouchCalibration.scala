package typings.chromeApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.showNativeTouchCalibration")
@js.native
object showNativeTouchCalibration extends js.Object {
  /**
    * Displays the native touch calibration UX for the display with **id** as display id.
    * This will show an overlay on the screen with required instructions on how to proceed.
    * The callback will be invoked in case of successful calibraion only.
    * If the calibration fails, this will throw an error.
    * @since Chrome 57
    * @param id The display's unique identifier.
    * @param callback Optional callback to inform the caller that the touch calibration has ended. The argument of the callback informs if the calibration was a success or not.
    */
  def apply(id: String, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
}

