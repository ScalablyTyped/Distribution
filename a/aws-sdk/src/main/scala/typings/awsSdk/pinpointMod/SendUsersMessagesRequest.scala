package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendUsersMessagesRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var SendUsersMessageRequest: typings.awsSdk.pinpointMod.SendUsersMessageRequest
}
object SendUsersMessagesRequest {
  
  @scala.inline
  def apply(ApplicationId: string, SendUsersMessageRequest: SendUsersMessageRequest): SendUsersMessagesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SendUsersMessageRequest = SendUsersMessageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessagesRequest]
  }
  
  @scala.inline
  implicit class SendUsersMessagesRequestMutableBuilder[Self <: SendUsersMessagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendUsersMessageRequest(value: SendUsersMessageRequest): Self = StObject.set(x, "SendUsersMessageRequest", value.asInstanceOf[js.Any])
  }
}
