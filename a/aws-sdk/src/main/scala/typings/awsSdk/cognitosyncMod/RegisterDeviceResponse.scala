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
  def apply(DeviceId: DeviceId = null): RegisterDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDeviceResponse]
  }
}

