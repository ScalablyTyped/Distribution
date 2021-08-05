package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVirtualMFADeviceResponse extends StObject {
  
  /**
    * A structure containing details about the new virtual MFA device.
    */
  var VirtualMFADevice: typings.awsSdk.iamMod.VirtualMFADevice
}
object CreateVirtualMFADeviceResponse {
  
  inline def apply(VirtualMFADevice: VirtualMFADevice): CreateVirtualMFADeviceResponse = {
    val __obj = js.Dynamic.literal(VirtualMFADevice = VirtualMFADevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualMFADeviceResponse]
  }
  
  extension [Self <: CreateVirtualMFADeviceResponse](x: Self) {
    
    inline def setVirtualMFADevice(value: VirtualMFADevice): Self = StObject.set(x, "VirtualMFADevice", value.asInstanceOf[js.Any])
  }
}
