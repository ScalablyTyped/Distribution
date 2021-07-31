package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEmailTemplateResponse extends StObject {
  
  var CreateTemplateMessageBody: typings.awsSdk.pinpointMod.CreateTemplateMessageBody
}
object CreateEmailTemplateResponse {
  
  @scala.inline
  def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreateEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailTemplateResponse]
  }
  
  @scala.inline
  implicit class CreateEmailTemplateResponseMutableBuilder[Self <: CreateEmailTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTemplateMessageBody(value: CreateTemplateMessageBody): Self = StObject.set(x, "CreateTemplateMessageBody", value.asInstanceOf[js.Any])
  }
}
