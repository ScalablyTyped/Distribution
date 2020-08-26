package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceSelectionResult extends js.Object {
  /**
    * The filters in a device selection result.
    */
  var filters: js.UndefOr[DeviceFilters] = js.native
  /**
    * The number of devices that matched the device filter selection criteria.
    */
  var matchedDevicesCount: js.UndefOr[Integer] = js.native
  /**
    * The maximum number of devices to be selected by a device filter and included in a test run.
    */
  var maxDevices: js.UndefOr[Integer] = js.native
}

object DeviceSelectionResult {
  @scala.inline
  def apply(): DeviceSelectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSelectionResult]
  }
  @scala.inline
  implicit class DeviceSelectionResultOps[Self <: DeviceSelectionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiltersVarargs(value: DeviceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: DeviceFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMatchedDevicesCount(value: Integer): Self = this.set("matchedDevicesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchedDevicesCount: Self = this.set("matchedDevicesCount", js.undefined)
    @scala.inline
    def setMaxDevices(value: Integer): Self = this.set("maxDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDevices: Self = this.set("maxDevices", js.undefined)
  }
  
}

