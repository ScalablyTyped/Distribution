package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEmailTemplateRequest extends StObject {
  
  var EmailTemplateRequest: typings.awsSdk.pinpointMod.EmailTemplateRequest
  
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string
}
object CreateEmailTemplateRequest {
  
  inline def apply(EmailTemplateRequest: EmailTemplateRequest, TemplateName: string): CreateEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(EmailTemplateRequest = EmailTemplateRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailTemplateRequest]
  }
  
  extension [Self <: CreateEmailTemplateRequest](x: Self) {
    
    inline def setEmailTemplateRequest(value: EmailTemplateRequest): Self = StObject.set(x, "EmailTemplateRequest", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
