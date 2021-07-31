package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessagesRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var MessageRequest: typings.awsSdk.pinpointMod.MessageRequest
}
object SendMessagesRequest {
  
  @scala.inline
  def apply(ApplicationId: string, MessageRequest: MessageRequest): SendMessagesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], MessageRequest = MessageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagesRequest]
  }
  
  @scala.inline
  implicit class SendMessagesRequestMutableBuilder[Self <: SendMessagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageRequest(value: MessageRequest): Self = StObject.set(x, "MessageRequest", value.asInstanceOf[js.Any])
  }
}
