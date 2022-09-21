package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeviceProfileRequest extends StObject {
  
  /**
    * The ID of the resource to delete.
    */
  var Id: DeviceProfileId
}
object DeleteDeviceProfileRequest {
  
  inline def apply(Id: DeviceProfileId): DeleteDeviceProfileRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceProfileRequest]
  }
  
  extension [Self <: DeleteDeviceProfileRequest](x: Self) {
    
    inline def setId(value: DeviceProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
