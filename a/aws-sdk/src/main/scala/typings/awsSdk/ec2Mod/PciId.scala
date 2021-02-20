package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PciId extends StObject {
  
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
  implicit class PciIdMutableBuilder[Self <: PciId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    @scala.inline
    def setSubsystemId(value: String): Self = StObject.set(x, "SubsystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsystemIdUndefined: Self = StObject.set(x, "SubsystemId", js.undefined)
    
    @scala.inline
    def setSubsystemVendorId(value: String): Self = StObject.set(x, "SubsystemVendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsystemVendorIdUndefined: Self = StObject.set(x, "SubsystemVendorId", js.undefined)
    
    @scala.inline
    def setVendorId(value: String): Self = StObject.set(x, "VendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorIdUndefined: Self = StObject.set(x, "VendorId", js.undefined)
  }
}
