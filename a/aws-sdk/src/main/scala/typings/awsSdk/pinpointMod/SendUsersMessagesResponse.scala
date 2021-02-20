package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendUsersMessagesResponse extends StObject {
  
  var SendUsersMessageResponse: typings.awsSdk.pinpointMod.SendUsersMessageResponse = js.native
}
object SendUsersMessagesResponse {
  
  @scala.inline
  def apply(SendUsersMessageResponse: SendUsersMessageResponse): SendUsersMessagesResponse = {
    val __obj = js.Dynamic.literal(SendUsersMessageResponse = SendUsersMessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessagesResponse]
  }
  
  @scala.inline
  implicit class SendUsersMessagesResponseMutableBuilder[Self <: SendUsersMessagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendUsersMessageResponse(value: SendUsersMessageResponse): Self = StObject.set(x, "SendUsersMessageResponse", value.asInstanceOf[js.Any])
  }
}
