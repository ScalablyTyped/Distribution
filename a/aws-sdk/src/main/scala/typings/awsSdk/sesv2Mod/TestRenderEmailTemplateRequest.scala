package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRenderEmailTemplateRequest extends StObject {
  
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var TemplateData: EmailTemplateData
  
  /**
    * The name of the template that you want to render.
    */
  var TemplateName: EmailTemplateName
}
object TestRenderEmailTemplateRequest {
  
  inline def apply(TemplateData: EmailTemplateData, TemplateName: EmailTemplateName): TestRenderEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateData = TemplateData.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRenderEmailTemplateRequest]
  }
  
  extension [Self <: TestRenderEmailTemplateRequest](x: Self) {
    
    inline def setTemplateData(value: EmailTemplateData): Self = StObject.set(x, "TemplateData", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
