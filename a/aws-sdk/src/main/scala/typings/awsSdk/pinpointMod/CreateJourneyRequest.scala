package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJourneyRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  var WriteJourneyRequest: typings.awsSdk.pinpointMod.WriteJourneyRequest = js.native
}
object CreateJourneyRequest {
  
  @scala.inline
  def apply(ApplicationId: string, WriteJourneyRequest: WriteJourneyRequest): CreateJourneyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteJourneyRequest = WriteJourneyRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJourneyRequest]
  }
  
  @scala.inline
  implicit class CreateJourneyRequestMutableBuilder[Self <: CreateJourneyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteJourneyRequest(value: WriteJourneyRequest): Self = StObject.set(x, "WriteJourneyRequest", value.asInstanceOf[js.Any])
  }
}
