package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSmsTemplateRequest extends StObject {
  
  var SMSTemplateRequest: typings.awsSdk.pinpointMod.SMSTemplateRequest
  
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string
}
object CreateSmsTemplateRequest {
  
  @scala.inline
  def apply(SMSTemplateRequest: SMSTemplateRequest, TemplateName: string): CreateSmsTemplateRequest = {
    val __obj = js.Dynamic.literal(SMSTemplateRequest = SMSTemplateRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSmsTemplateRequest]
  }
  
  @scala.inline
  implicit class CreateSmsTemplateRequestMutableBuilder[Self <: CreateSmsTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSMSTemplateRequest(value: SMSTemplateRequest): Self = StObject.set(x, "SMSTemplateRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
