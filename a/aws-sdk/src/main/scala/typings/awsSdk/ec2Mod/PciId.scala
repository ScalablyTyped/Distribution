package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PciId extends StObject {
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the subsystem.
    */
  var SubsystemId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the vendor for the subsystem.
    */
  var SubsystemVendorId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the vendor.
    */
  var VendorId: js.UndefOr[String] = js.undefined
}
object PciId {
  
  inline def apply(): PciId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PciId]
  }
  
  extension [Self <: PciId](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setSubsystemId(value: String): Self = StObject.set(x, "SubsystemId", value.asInstanceOf[js.Any])
    
    inline def setSubsystemIdUndefined: Self = StObject.set(x, "SubsystemId", js.undefined)
    
    inline def setSubsystemVendorId(value: String): Self = StObject.set(x, "SubsystemVendorId", value.asInstanceOf[js.Any])
    
    inline def setSubsystemVendorIdUndefined: Self = StObject.set(x, "SubsystemVendorId", js.undefined)
    
    inline def setVendorId(value: String): Self = StObject.set(x, "VendorId", value.asInstanceOf[js.Any])
    
    inline def setVendorIdUndefined: Self = StObject.set(x, "VendorId", js.undefined)
  }
}
