package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSummary extends StObject {
  
  /**
    * Edge Manager agent version.
    */
  var AgentVersion: js.UndefOr[EdgeVersion] = js.undefined
  
  /**
    * A description of the device.
    */
  var Description: js.UndefOr[DeviceDescription] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the device.
    */
  var DeviceArn: typings.awsSdk.sagemakerMod.DeviceArn
  
  /**
    * The name of the fleet the device belongs to.
    */
  var DeviceFleetName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The unique identifier of the device.
    */
  var DeviceName: EntityName
  
  /**
    * The Amazon Web Services Internet of Things (IoT) object thing name associated with the device..
    */
  var IotThingName: js.UndefOr[ThingName] = js.undefined
  
  /**
    * The last heartbeat received from the device.
    */
  var LatestHeartbeat: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Models on the device.
    */
  var Models: js.UndefOr[EdgeModelSummaries] = js.undefined
  
  /**
    * The timestamp of the last registration or de-reregistration.
    */
  var RegistrationTime: js.UndefOr[js.Date] = js.undefined
}
object DeviceSummary {
  
  inline def apply(DeviceArn: DeviceArn, DeviceName: EntityName): DeviceSummary = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSummary]
  }
  
  extension [Self <: DeviceSummary](x: Self) {
    
    inline def setAgentVersion(value: EdgeVersion): Self = StObject.set(x, "AgentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "AgentVersion", js.undefined)
    
    inline def setDescription(value: DeviceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceFleetNameUndefined: Self = StObject.set(x, "DeviceFleetName", js.undefined)
    
    inline def setDeviceName(value: EntityName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setIotThingName(value: ThingName): Self = StObject.set(x, "IotThingName", value.asInstanceOf[js.Any])
    
    inline def setIotThingNameUndefined: Self = StObject.set(x, "IotThingName", js.undefined)
    
    inline def setLatestHeartbeat(value: js.Date): Self = StObject.set(x, "LatestHeartbeat", value.asInstanceOf[js.Any])
    
    inline def setLatestHeartbeatUndefined: Self = StObject.set(x, "LatestHeartbeat", js.undefined)
    
    inline def setModels(value: EdgeModelSummaries): Self = StObject.set(x, "Models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "Models", js.undefined)
    
    inline def setModelsVarargs(value: EdgeModelSummary*): Self = StObject.set(x, "Models", js.Array(value*))
    
    inline def setRegistrationTime(value: js.Date): Self = StObject.set(x, "RegistrationTime", value.asInstanceOf[js.Any])
    
    inline def setRegistrationTimeUndefined: Self = StObject.set(x, "RegistrationTime", js.undefined)
  }
}
