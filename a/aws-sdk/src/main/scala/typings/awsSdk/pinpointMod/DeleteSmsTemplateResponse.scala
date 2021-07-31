package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSmsTemplateResponse extends StObject {
  
  var MessageBody: typings.awsSdk.pinpointMod.MessageBody
}
object DeleteSmsTemplateResponse {
  
  @scala.inline
  def apply(MessageBody: MessageBody): DeleteSmsTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSmsTemplateResponse]
  }
  
  @scala.inline
  implicit class DeleteSmsTemplateResponseMutableBuilder[Self <: DeleteSmsTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
