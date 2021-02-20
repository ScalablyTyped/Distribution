package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJourneyRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  /**
    * The unique identifier for the journey.
    */
  var JourneyId: string = js.native
  
  var WriteJourneyRequest: typings.awsSdk.pinpointMod.WriteJourneyRequest = js.native
}
object UpdateJourneyRequest {
  
  @scala.inline
  def apply(ApplicationId: string, JourneyId: string, WriteJourneyRequest: WriteJourneyRequest): UpdateJourneyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], WriteJourneyRequest = WriteJourneyRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJourneyRequest]
  }
  
  @scala.inline
  implicit class UpdateJourneyRequestMutableBuilder[Self <: UpdateJourneyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJourneyId(value: string): Self = StObject.set(x, "JourneyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteJourneyRequest(value: WriteJourneyRequest): Self = StObject.set(x, "WriteJourneyRequest", value.asInstanceOf[js.Any])
  }
}
