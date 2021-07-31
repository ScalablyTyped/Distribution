package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJourneyRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the journey.
    */
  var JourneyId: string
}
object GetJourneyRequest {
  
  @scala.inline
  def apply(ApplicationId: string, JourneyId: string): GetJourneyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyRequest]
  }
  
  @scala.inline
  implicit class GetJourneyRequestMutableBuilder[Self <: GetJourneyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJourneyId(value: string): Self = StObject.set(x, "JourneyId", value.asInstanceOf[js.Any])
  }
}
