package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewDeviceMetadataType extends js.Object {
  /**
    * The device group key.
    */
  var DeviceGroupKey: js.UndefOr[StringType] = js.native
  /**
    * The device key.
    */
  var DeviceKey: js.UndefOr[DeviceKeyType] = js.native
}

object NewDeviceMetadataType {
  @scala.inline
  def apply(DeviceGroupKey: StringType = null, DeviceKey: DeviceKeyType = null): NewDeviceMetadataType = {
    val __obj = js.Dynamic.literal()
    if (DeviceGroupKey != null) __obj.updateDynamic("DeviceGroupKey")(DeviceGroupKey.asInstanceOf[js.Any])
    if (DeviceKey != null) __obj.updateDynamic("DeviceKey")(DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDeviceMetadataType]
  }
}

