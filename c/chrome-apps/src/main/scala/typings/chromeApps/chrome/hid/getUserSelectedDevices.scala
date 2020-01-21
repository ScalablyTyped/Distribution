package typings.chromeApps.chrome.hid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.hid.getUserSelectedDevices")
@js.native
object getUserSelectedDevices extends js.Object {
  /**
    * @requires(dev) **Dev channel only!**
    * @see[Learn more]{@link https://developer.chrome.com/apps/api_index#dev_apis}
    * @description
    * Presents a device picker to the user and returns
    * HidDeviceInfo objects for the devices selected. If the user
    * cancels the picker devices will be empty. A user gesture is
    * required for the dialog to display. Without a user gesture,
    * the callback will run as though the user cancelled. If multiple
    * filters are provided devices matching any filter will be displayed.
    * @param callback Invoked with a list of chosen Devices.
    */
  def apply(callback: js.Function1[/* devices */ HidDeviceInfo, Unit]): Unit = js.native
  /**
    * @since Chrome 45.
    * @requires(dev) **Dev channel only!**
    * @see[Learn more]{@link https://developer.chrome.com/apps/api_index#dev_apis}
    * Presents a device picker to the user and returns
    * HidDeviceInfo objects for the devices selected. If the user
    * cancels the picker devices will be empty. A user gesture is
    * required for the dialog to display. Without a user gesture,
    * the callback will run as though the user cancelled. If multiple
    * filters are provided devices matching any filter will be displayed.
    * @param options Configuration of the device picker dialog box.
    * @param callback Invoked with a list of chosen Devices.
    */
  def apply(
    options: UserSelectedDevicePickerOptions,
    callback: js.Function1[/* devices */ HidDeviceInfo, Unit]
  ): Unit = js.native
}

