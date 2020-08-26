package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDeviceResponse extends js.Object {
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.cognitosyncMod.DeviceId] = js.native
}

object RegisterDeviceResponse {
  @scala.inline
  def apply(): RegisterDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDeviceResponse]
  }
  @scala.inline
  implicit class RegisterDeviceResponseOps[Self <: RegisterDeviceResponse] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: DeviceId): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("DeviceId", js.undefined)
  }
  
}

