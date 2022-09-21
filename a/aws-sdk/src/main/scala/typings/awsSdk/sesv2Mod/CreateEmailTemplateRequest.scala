package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEmailTemplateRequest extends StObject {
  
  /**
    * The content of the email template, composed of a subject line, an HTML part, and a text-only part.
    */
  var TemplateContent: EmailTemplateContent
  
  /**
    * The name of the template.
    */
  var TemplateName: EmailTemplateName
}
object CreateEmailTemplateRequest {
  
  inline def apply(TemplateContent: EmailTemplateContent, TemplateName: EmailTemplateName): CreateEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateContent = TemplateContent.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailTemplateRequest]
  }
  
  extension [Self <: CreateEmailTemplateRequest](x: Self) {
    
    inline def setTemplateContent(value: EmailTemplateContent): Self = StObject.set(x, "TemplateContent", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
