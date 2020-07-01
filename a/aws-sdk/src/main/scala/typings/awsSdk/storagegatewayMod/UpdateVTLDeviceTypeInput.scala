package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVTLDeviceTypeInput extends js.Object {
  /**
    * The type of medium changer you want to select. Valid Values: STK-L700 | AWS-Gateway-VTL 
    */
  var DeviceType: typings.awsSdk.storagegatewayMod.DeviceType = js.native
  /**
    * The Amazon Resource Name (ARN) of the medium changer you want to select.
    */
  var VTLDeviceARN: typings.awsSdk.storagegatewayMod.VTLDeviceARN = js.native
}

object UpdateVTLDeviceTypeInput {
  @scala.inline
  def apply(DeviceType: DeviceType, VTLDeviceARN: VTLDeviceARN): UpdateVTLDeviceTypeInput = {
    val __obj = js.Dynamic.literal(DeviceType = DeviceType.asInstanceOf[js.Any], VTLDeviceARN = VTLDeviceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVTLDeviceTypeInput]
  }
}

