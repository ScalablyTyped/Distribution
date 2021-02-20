package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEmailTemplateRequest extends StObject {
  
  /**
    * The content of the email template, composed of a subject line, an HTML part, and a text-only part.
    */
  var TemplateContent: EmailTemplateContent = js.native
  
  /**
    * The name of the template you want to update.
    */
  var TemplateName: EmailTemplateName = js.native
}
object UpdateEmailTemplateRequest {
  
  @scala.inline
  def apply(TemplateContent: EmailTemplateContent, TemplateName: EmailTemplateName): UpdateEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateContent = TemplateContent.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailTemplateRequest]
  }
  
  @scala.inline
  implicit class UpdateEmailTemplateRequestMutableBuilder[Self <: UpdateEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateContent(value: EmailTemplateContent): Self = StObject.set(x, "TemplateContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
