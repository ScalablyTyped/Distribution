package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePushTemplateResponse extends StObject {
  
  var MessageBody: typings.awsSdk.pinpointMod.MessageBody
}
object UpdatePushTemplateResponse {
  
  @scala.inline
  def apply(MessageBody: MessageBody): UpdatePushTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePushTemplateResponse]
  }
  
  @scala.inline
  implicit class UpdatePushTemplateResponseMutableBuilder[Self <: UpdatePushTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
