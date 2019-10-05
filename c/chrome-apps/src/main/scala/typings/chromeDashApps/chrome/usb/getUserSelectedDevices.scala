package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.Anon_FiltersMultiple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.getUserSelectedDevices")
@js.native
object getUserSelectedDevices extends js.Object {
  /**
    * Presents a device picker to the user and returns the Devices selected.
    * If the user cancels the picker devices will be empty.
    * A user gesture is required for the dialog to display. Without a user gesture,
    * the callback will run as though the user cancelled.
    * @since Chrome 40.
    * @param options Configuration of the device picker dialog box.
    *               - multiple: Allow the user to select multiple devices.
    *               - filters: Filter the list of devices presented to the user.
    *                   If multiple filters are provided, devices matching any filter will be displayed.
    * @param callback Invoked with a list of chosen Devices.
    */
  def apply(options: Anon_FiltersMultiple, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
}

