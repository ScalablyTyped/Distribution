package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJourneyStateRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the journey.
    */
  var JourneyId: string
  
  var JourneyStateRequest: typings.awsSdk.pinpointMod.JourneyStateRequest
}
object UpdateJourneyStateRequest {
  
  inline def apply(ApplicationId: string, JourneyId: string, JourneyStateRequest: JourneyStateRequest): UpdateJourneyStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], JourneyStateRequest = JourneyStateRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJourneyStateRequest]
  }
  
  extension [Self <: UpdateJourneyStateRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setJourneyId(value: string): Self = StObject.set(x, "JourneyId", value.asInstanceOf[js.Any])
    
    inline def setJourneyStateRequest(value: JourneyStateRequest): Self = StObject.set(x, "JourneyStateRequest", value.asInstanceOf[js.Any])
  }
}
