package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeviceDefinitionVersionRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string
  
  /**
    * A list of devices in the definition version.
    */
  var Devices: js.UndefOr[listOfDevice] = js.undefined
}
object CreateDeviceDefinitionVersionRequest {
  
  inline def apply(DeviceDefinitionId: string): CreateDeviceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeviceDefinitionVersionRequest]
  }
  
  extension [Self <: CreateDeviceDefinitionVersionRequest](x: Self) {
    
    inline def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    inline def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    inline def setDeviceDefinitionId(value: string): Self = StObject.set(x, "DeviceDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setDevices(value: listOfDevice): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "Devices", js.Array(value :_*))
  }
}
