package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEmailTemplateRequest extends StObject {
  
  var EmailTemplateRequest: typings.awsSdk.pinpointMod.EmailTemplateRequest = js.native
  
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string = js.native
}
object CreateEmailTemplateRequest {
  
  @scala.inline
  def apply(EmailTemplateRequest: EmailTemplateRequest, TemplateName: string): CreateEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(EmailTemplateRequest = EmailTemplateRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailTemplateRequest]
  }
  
  @scala.inline
  implicit class CreateEmailTemplateRequestMutableBuilder[Self <: CreateEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailTemplateRequest(value: EmailTemplateRequest): Self = StObject.set(x, "EmailTemplateRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
