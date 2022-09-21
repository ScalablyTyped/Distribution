package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDevicePositionRequest extends StObject {
  
  /**
    * Devices whose position you want to retrieve.   For example, for two devices: device-ids=DeviceId1&amp;device-ids=DeviceId2   
    */
  var DeviceIds: BatchGetDevicePositionRequestDeviceIdsList
  
  /**
    * The tracker resource retrieving the device position.
    */
  var TrackerName: BatchGetDevicePositionRequestTrackerNameString
}
object BatchGetDevicePositionRequest {
  
  inline def apply(
    DeviceIds: BatchGetDevicePositionRequestDeviceIdsList,
    TrackerName: BatchGetDevicePositionRequestTrackerNameString
  ): BatchGetDevicePositionRequest = {
    val __obj = js.Dynamic.literal(DeviceIds = DeviceIds.asInstanceOf[js.Any], TrackerName = TrackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDevicePositionRequest]
  }
  
  extension [Self <: BatchGetDevicePositionRequest](x: Self) {
    
    inline def setDeviceIds(value: BatchGetDevicePositionRequestDeviceIdsList): Self = StObject.set(x, "DeviceIds", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdsVarargs(value: Id*): Self = StObject.set(x, "DeviceIds", js.Array(value*))
    
    inline def setTrackerName(value: BatchGetDevicePositionRequestTrackerNameString): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
  }
}
