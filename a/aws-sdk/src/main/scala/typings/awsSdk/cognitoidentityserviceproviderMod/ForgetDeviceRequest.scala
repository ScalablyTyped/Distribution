package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForgetDeviceRequest extends js.Object {
  /**
    * The access token for the forgotten device request.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.native
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
}

object ForgetDeviceRequest {
  @scala.inline
  def apply(DeviceKey: DeviceKeyType): ForgetDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForgetDeviceRequest]
  }
  @scala.inline
  implicit class ForgetDeviceRequestOps[Self <: ForgetDeviceRequest] (val x: Self) extends AnyVal {
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
    def setDeviceKey(value: DeviceKeyType): Self = this.set("DeviceKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("AccessToken", js.undefined)
  }
  
}

