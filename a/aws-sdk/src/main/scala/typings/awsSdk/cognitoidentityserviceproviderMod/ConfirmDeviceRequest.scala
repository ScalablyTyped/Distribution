package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmDeviceRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType = js.native
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
  /**
    * The device name.
    */
  var DeviceName: js.UndefOr[DeviceNameType] = js.native
  /**
    * The configuration of the device secret verifier.
    */
  var DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType] = js.native
}

object ConfirmDeviceRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, DeviceKey: DeviceKeyType): ConfirmDeviceRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDeviceRequest]
  }
  @scala.inline
  implicit class ConfirmDeviceRequestOps[Self <: ConfirmDeviceRequest] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: TokenModelType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = this.set("DeviceKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceName(value: DeviceNameType): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("DeviceName", js.undefined)
    @scala.inline
    def setDeviceSecretVerifierConfig(value: DeviceSecretVerifierConfigType): Self = this.set("DeviceSecretVerifierConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceSecretVerifierConfig: Self = this.set("DeviceSecretVerifierConfig", js.undefined)
  }
  
}

