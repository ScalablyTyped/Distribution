package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevicePoolCompatibilityResult extends js.Object {
  /**
    * Information about compatible devices.
    */
  var compatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.native
  /**
    * Information about incompatible devices.
    */
  var incompatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.native
}

object GetDevicePoolCompatibilityResult {
  @scala.inline
  def apply(): GetDevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevicePoolCompatibilityResult]
  }
  @scala.inline
  implicit class GetDevicePoolCompatibilityResultOps[Self <: GetDevicePoolCompatibilityResult] (val x: Self) extends AnyVal {
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
    def setCompatibleDevicesVarargs(value: DevicePoolCompatibilityResult*): Self = this.set("compatibleDevices", js.Array(value :_*))
    @scala.inline
    def setCompatibleDevices(value: DevicePoolCompatibilityResults): Self = this.set("compatibleDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibleDevices: Self = this.set("compatibleDevices", js.undefined)
    @scala.inline
    def setIncompatibleDevicesVarargs(value: DevicePoolCompatibilityResult*): Self = this.set("incompatibleDevices", js.Array(value :_*))
    @scala.inline
    def setIncompatibleDevices(value: DevicePoolCompatibilityResults): Self = this.set("incompatibleDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncompatibleDevices: Self = this.set("incompatibleDevices", js.undefined)
  }
  
}

