package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePushTemplateResponse extends StObject {
  
  var CreateTemplateMessageBody: typings.awsSdk.pinpointMod.CreateTemplateMessageBody = js.native
}
object CreatePushTemplateResponse {
  
  @scala.inline
  def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreatePushTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePushTemplateResponse]
  }
  
  @scala.inline
  implicit class CreatePushTemplateResponseMutableBuilder[Self <: CreatePushTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTemplateMessageBody(value: CreateTemplateMessageBody): Self = StObject.set(x, "CreateTemplateMessageBody", value.asInstanceOf[js.Any])
  }
}
