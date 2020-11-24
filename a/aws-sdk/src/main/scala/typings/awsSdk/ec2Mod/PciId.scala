package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PciId extends js.Object {
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the subsystem.
    */
  var SubsystemId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the vendor for the subsystem.
    */
  var SubsystemVendorId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the vendor.
    */
  var VendorId: js.UndefOr[String] = js.native
}
object PciId {
  
  @scala.inline
  def apply(): PciId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PciId]
  }
  
  @scala.inline
  implicit class PciIdOps[Self <: PciId] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: String): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("DeviceId", js.undefined)
    
    @scala.inline
    def setSubsystemId(value: String): Self = this.set("SubsystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubsystemId: Self = this.set("SubsystemId", js.undefined)
    
    @scala.inline
    def setSubsystemVendorId(value: String): Self = this.set("SubsystemVendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubsystemVendorId: Self = this.set("SubsystemVendorId", js.undefined)
    
    @scala.inline
    def setVendorId(value: String): Self = this.set("VendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorId: Self = this.set("VendorId", js.undefined)
  }
}
