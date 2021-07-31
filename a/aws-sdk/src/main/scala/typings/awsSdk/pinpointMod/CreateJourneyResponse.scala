package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJourneyResponse extends StObject {
  
  var JourneyResponse: typings.awsSdk.pinpointMod.JourneyResponse
}
object CreateJourneyResponse {
  
  @scala.inline
  def apply(JourneyResponse: JourneyResponse): CreateJourneyResponse = {
    val __obj = js.Dynamic.literal(JourneyResponse = JourneyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJourneyResponse]
  }
  
  @scala.inline
  implicit class CreateJourneyResponseMutableBuilder[Self <: CreateJourneyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJourneyResponse(value: JourneyResponse): Self = StObject.set(x, "JourneyResponse", value.asInstanceOf[js.Any])
  }
}
