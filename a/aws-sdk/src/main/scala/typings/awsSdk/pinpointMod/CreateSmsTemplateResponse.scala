package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSmsTemplateResponse extends StObject {
  
  var CreateTemplateMessageBody: typings.awsSdk.pinpointMod.CreateTemplateMessageBody = js.native
}
object CreateSmsTemplateResponse {
  
  @scala.inline
  def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreateSmsTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSmsTemplateResponse]
  }
  
  @scala.inline
  implicit class CreateSmsTemplateResponseMutableBuilder[Self <: CreateSmsTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTemplateMessageBody(value: CreateTemplateMessageBody): Self = StObject.set(x, "CreateTemplateMessageBody", value.asInstanceOf[js.Any])
  }
}
