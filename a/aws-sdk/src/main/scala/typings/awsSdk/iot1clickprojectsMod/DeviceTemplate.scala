package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceTemplate extends js.Object {
  /**
    * An optional Lambda function to invoke instead of the default Lambda function provided by the placement template.
    */
  var callbackOverrides: js.UndefOr[DeviceCallbackOverrideMap] = js.native
  /**
    * The device type, which currently must be "button".
    */
  var deviceType: js.UndefOr[DeviceType] = js.native
}

object DeviceTemplate {
  @scala.inline
  def apply(callbackOverrides: DeviceCallbackOverrideMap = null, deviceType: DeviceType = null): DeviceTemplate = {
    val __obj = js.Dynamic.literal()
    if (callbackOverrides != null) __obj.updateDynamic("callbackOverrides")(callbackOverrides.asInstanceOf[js.Any])
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceTemplate]
  }
}

