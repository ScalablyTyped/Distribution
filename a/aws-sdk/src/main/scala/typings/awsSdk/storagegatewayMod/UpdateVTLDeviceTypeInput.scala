package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVTLDeviceTypeInput extends js.Object {
  
  /**
    * The type of medium changer you want to select. Valid Values: STK-L700 | AWS-Gateway-VTL | IBM-03584L32-0402 
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
  
  @scala.inline
  implicit class UpdateVTLDeviceTypeInputOps[Self <: UpdateVTLDeviceTypeInput] (val x: Self) extends AnyVal {
    
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
    def setDeviceType(value: DeviceType): Self = this.set("DeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVTLDeviceARN(value: VTLDeviceARN): Self = this.set("VTLDeviceARN", value.asInstanceOf[js.Any])
  }
}
