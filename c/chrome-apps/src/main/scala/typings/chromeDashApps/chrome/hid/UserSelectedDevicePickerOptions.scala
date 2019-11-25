package typings.chromeDashApps.chrome.hid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSelectedDevicePickerOptions extends js.Object {
  /**
    * Filter the list of devices presented to the user.
    * If multiple filters are provided devices matching any filter will be displayed.
    */
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.undefined
  /**
    * Allow the user to select multiple devices.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
}

object UserSelectedDevicePickerOptions {
  @scala.inline
  def apply(filters: js.Array[DeviceFilter] = null, multiple: js.UndefOr[Boolean] = js.undefined): UserSelectedDevicePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSelectedDevicePickerOptions]
  }
}

