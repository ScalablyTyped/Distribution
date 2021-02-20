package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVoiceTemplateResponse extends StObject {
  
  var MessageBody: typings.awsSdk.pinpointMod.MessageBody = js.native
}
object DeleteVoiceTemplateResponse {
  
  @scala.inline
  def apply(MessageBody: MessageBody): DeleteVoiceTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceTemplateResponse]
  }
  
  @scala.inline
  implicit class DeleteVoiceTemplateResponseMutableBuilder[Self <: DeleteVoiceTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
