package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventsRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var EventsRequest: typings.awsSdk.pinpointMod.EventsRequest
}
object PutEventsRequest {
  
  inline def apply(ApplicationId: string, EventsRequest: EventsRequest): PutEventsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EventsRequest = EventsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsRequest]
  }
  
  extension [Self <: PutEventsRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setEventsRequest(value: EventsRequest): Self = StObject.set(x, "EventsRequest", value.asInstanceOf[js.Any])
  }
}
