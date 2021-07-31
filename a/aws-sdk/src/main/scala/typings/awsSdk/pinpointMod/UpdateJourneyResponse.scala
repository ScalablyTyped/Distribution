package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJourneyResponse extends StObject {
  
  var JourneyResponse: typings.awsSdk.pinpointMod.JourneyResponse
}
object UpdateJourneyResponse {
  
  @scala.inline
  def apply(JourneyResponse: JourneyResponse): UpdateJourneyResponse = {
    val __obj = js.Dynamic.literal(JourneyResponse = JourneyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJourneyResponse]
  }
  
  @scala.inline
  implicit class UpdateJourneyResponseMutableBuilder[Self <: UpdateJourneyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJourneyResponse(value: JourneyResponse): Self = StObject.set(x, "JourneyResponse", value.asInstanceOf[js.Any])
  }
}
