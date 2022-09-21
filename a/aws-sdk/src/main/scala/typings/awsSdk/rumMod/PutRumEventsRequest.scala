package typings.awsSdk.rumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRumEventsRequest extends StObject {
  
  /**
    * A structure that contains information about the app monitor that collected this telemetry information.
    */
  var AppMonitorDetails: typings.awsSdk.rumMod.AppMonitorDetails
  
  /**
    * A unique identifier for this batch of RUM event data.
    */
  var BatchId: String
  
  /**
    * The ID of the app monitor that is sending this data.
    */
  var Id: AppMonitorId
  
  /**
    * An array of structures that contain the telemetry event data.
    */
  var RumEvents: RumEventList
  
  /**
    * A structure that contains information about the user session that this batch of events was collected from.
    */
  var UserDetails: typings.awsSdk.rumMod.UserDetails
}
object PutRumEventsRequest {
  
  inline def apply(
    AppMonitorDetails: AppMonitorDetails,
    BatchId: String,
    Id: AppMonitorId,
    RumEvents: RumEventList,
    UserDetails: UserDetails
  ): PutRumEventsRequest = {
    val __obj = js.Dynamic.literal(AppMonitorDetails = AppMonitorDetails.asInstanceOf[js.Any], BatchId = BatchId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], RumEvents = RumEvents.asInstanceOf[js.Any], UserDetails = UserDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRumEventsRequest]
  }
  
  extension [Self <: PutRumEventsRequest](x: Self) {
    
    inline def setAppMonitorDetails(value: AppMonitorDetails): Self = StObject.set(x, "AppMonitorDetails", value.asInstanceOf[js.Any])
    
    inline def setBatchId(value: String): Self = StObject.set(x, "BatchId", value.asInstanceOf[js.Any])
    
    inline def setId(value: AppMonitorId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setRumEvents(value: RumEventList): Self = StObject.set(x, "RumEvents", value.asInstanceOf[js.Any])
    
    inline def setRumEventsVarargs(value: RumEvent*): Self = StObject.set(x, "RumEvents", js.Array(value*))
    
    inline def setUserDetails(value: UserDetails): Self = StObject.set(x, "UserDetails", value.asInstanceOf[js.Any])
  }
}
