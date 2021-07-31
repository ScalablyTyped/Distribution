package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEmailTemplateResponse extends StObject {
  
  var MessageBody: typings.awsSdk.pinpointMod.MessageBody
}
object UpdateEmailTemplateResponse {
  
  @scala.inline
  def apply(MessageBody: MessageBody): UpdateEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailTemplateResponse]
  }
  
  @scala.inline
  implicit class UpdateEmailTemplateResponseMutableBuilder[Self <: UpdateEmailTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
