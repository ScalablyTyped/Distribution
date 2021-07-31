package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJourneyResponse extends StObject {
  
  var JourneyResponse: typings.awsSdk.pinpointMod.JourneyResponse
}
object DeleteJourneyResponse {
  
  @scala.inline
  def apply(JourneyResponse: JourneyResponse): DeleteJourneyResponse = {
    val __obj = js.Dynamic.literal(JourneyResponse = JourneyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJourneyResponse]
  }
  
  @scala.inline
  implicit class DeleteJourneyResponseMutableBuilder[Self <: DeleteJourneyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJourneyResponse(value: JourneyResponse): Self = StObject.set(x, "JourneyResponse", value.asInstanceOf[js.Any])
  }
}
