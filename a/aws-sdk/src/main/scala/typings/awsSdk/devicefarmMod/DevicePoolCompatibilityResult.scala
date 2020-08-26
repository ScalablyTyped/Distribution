package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicePoolCompatibilityResult extends js.Object {
  /**
    * Whether the result was compatible with the device pool.
    */
  var compatible: js.UndefOr[Boolean] = js.native
  /**
    * The device (phone or tablet) to return information about.
    */
  var device: js.UndefOr[Device] = js.native
  /**
    * Information about the compatibility.
    */
  var incompatibilityMessages: js.UndefOr[IncompatibilityMessages] = js.native
}

object DevicePoolCompatibilityResult {
  @scala.inline
  def apply(): DevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePoolCompatibilityResult]
  }
  @scala.inline
  implicit class DevicePoolCompatibilityResultOps[Self <: DevicePoolCompatibilityResult] (val x: Self) extends AnyVal {
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
    def setCompatible(value: Boolean): Self = this.set("compatible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatible: Self = this.set("compatible", js.undefined)
    @scala.inline
    def setDevice(value: Device): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setIncompatibilityMessagesVarargs(value: IncompatibilityMessage*): Self = this.set("incompatibilityMessages", js.Array(value :_*))
    @scala.inline
    def setIncompatibilityMessages(value: IncompatibilityMessages): Self = this.set("incompatibilityMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncompatibilityMessages: Self = this.set("incompatibilityMessages", js.undefined)
  }
  
}

