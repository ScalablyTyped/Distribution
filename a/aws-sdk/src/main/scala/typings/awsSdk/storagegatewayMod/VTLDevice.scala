package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VTLDevice extends js.Object {
  
  /**
    * A list of iSCSI information about a VTL device.
    */
  var DeviceiSCSIAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.DeviceiSCSIAttributes] = js.native
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
    */
  var VTLDeviceARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceARN] = js.native
  
  /**
    * Specifies the model number of device that the VTL device emulates.
    */
  var VTLDeviceProductIdentifier: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceProductIdentifier] = js.native
  
  /**
    * Specifies the type of device that the VTL device emulates.
    */
  var VTLDeviceType: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceType] = js.native
  
  /**
    * Specifies the vendor of the device that the VTL device object emulates.
    */
  var VTLDeviceVendor: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceVendor] = js.native
}
object VTLDevice {
  
  @scala.inline
  def apply(): VTLDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VTLDevice]
  }
  
  @scala.inline
  implicit class VTLDeviceOps[Self <: VTLDevice] (val x: Self) extends AnyVal {
    
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
    def setDeviceiSCSIAttributes(value: DeviceiSCSIAttributes): Self = this.set("DeviceiSCSIAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceiSCSIAttributes: Self = this.set("DeviceiSCSIAttributes", js.undefined)
    
    @scala.inline
    def setVTLDeviceARN(value: VTLDeviceARN): Self = this.set("VTLDeviceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVTLDeviceARN: Self = this.set("VTLDeviceARN", js.undefined)
    
    @scala.inline
    def setVTLDeviceProductIdentifier(value: VTLDeviceProductIdentifier): Self = this.set("VTLDeviceProductIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVTLDeviceProductIdentifier: Self = this.set("VTLDeviceProductIdentifier", js.undefined)
    
    @scala.inline
    def setVTLDeviceType(value: VTLDeviceType): Self = this.set("VTLDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVTLDeviceType: Self = this.set("VTLDeviceType", js.undefined)
    
    @scala.inline
    def setVTLDeviceVendor(value: VTLDeviceVendor): Self = this.set("VTLDeviceVendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVTLDeviceVendor: Self = this.set("VTLDeviceVendor", js.undefined)
  }
}
