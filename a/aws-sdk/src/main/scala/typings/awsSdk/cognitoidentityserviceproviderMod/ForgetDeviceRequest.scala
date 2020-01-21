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
  def apply(DeviceKey: DeviceKeyType, AccessToken: TokenModelType = null): ForgetDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey.asInstanceOf[js.Any])
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForgetDeviceRequest]
  }
}

