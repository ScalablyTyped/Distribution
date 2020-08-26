package typings.chromeApps.chrome.hid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSelectedDevicePickerOptions extends js.Object {
  /**
    * Filter the list of devices presented to the user.
    * If multiple filters are provided devices matching any filter will be displayed.
    */
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.native
  /**
    * Allow the user to select multiple devices.
    */
  var multiple: js.UndefOr[Boolean] = js.native
}

object UserSelectedDevicePickerOptions {
  @scala.inline
  def apply(): UserSelectedDevicePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSelectedDevicePickerOptions]
  }
  @scala.inline
  implicit class UserSelectedDevicePickerOptionsOps[Self <: UserSelectedDevicePickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiltersVarargs(value: DeviceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[DeviceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
  
}

