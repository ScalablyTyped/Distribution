package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSmsTemplateResponse extends StObject {
  
  var SMSTemplateResponse: typings.awsSdk.pinpointMod.SMSTemplateResponse = js.native
}
object GetSmsTemplateResponse {
  
  @scala.inline
  def apply(SMSTemplateResponse: SMSTemplateResponse): GetSmsTemplateResponse = {
    val __obj = js.Dynamic.literal(SMSTemplateResponse = SMSTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsTemplateResponse]
  }
  
  @scala.inline
  implicit class GetSmsTemplateResponseMutableBuilder[Self <: GetSmsTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSMSTemplateResponse(value: SMSTemplateResponse): Self = StObject.set(x, "SMSTemplateResponse", value.asInstanceOf[js.Any])
  }
}
