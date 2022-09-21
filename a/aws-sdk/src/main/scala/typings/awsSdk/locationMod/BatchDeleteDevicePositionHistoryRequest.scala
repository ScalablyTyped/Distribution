package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteDevicePositionHistoryRequest extends StObject {
  
  /**
    * Devices whose position history you want to delete.   For example, for two devices: “DeviceIds” : [DeviceId1,DeviceId2]   
    */
  var DeviceIds: BatchDeleteDevicePositionHistoryRequestDeviceIdsList
  
  /**
    * The name of the tracker resource to delete the device position history from.
    */
  var TrackerName: ResourceName
}
object BatchDeleteDevicePositionHistoryRequest {
  
  inline def apply(DeviceIds: BatchDeleteDevicePositionHistoryRequestDeviceIdsList, TrackerName: ResourceName): BatchDeleteDevicePositionHistoryRequest = {
    val __obj = js.Dynamic.literal(DeviceIds = DeviceIds.asInstanceOf[js.Any], TrackerName = TrackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDevicePositionHistoryRequest]
  }
  
  extension [Self <: BatchDeleteDevicePositionHistoryRequest](x: Self) {
    
    inline def setDeviceIds(value: BatchDeleteDevicePositionHistoryRequestDeviceIdsList): Self = StObject.set(x, "DeviceIds", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdsVarargs(value: Id*): Self = StObject.set(x, "DeviceIds", js.Array(value*))
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
  }
}
