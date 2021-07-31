package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJourneyStateResponse extends StObject {
  
  var JourneyResponse: typings.awsSdk.pinpointMod.JourneyResponse
}
object UpdateJourneyStateResponse {
  
  @scala.inline
  def apply(JourneyResponse: JourneyResponse): UpdateJourneyStateResponse = {
    val __obj = js.Dynamic.literal(JourneyResponse = JourneyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJourneyStateResponse]
  }
  
  @scala.inline
  implicit class UpdateJourneyStateResponseMutableBuilder[Self <: UpdateJourneyStateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJourneyResponse(value: JourneyResponse): Self = StObject.set(x, "JourneyResponse", value.asInstanceOf[js.Any])
  }
}
