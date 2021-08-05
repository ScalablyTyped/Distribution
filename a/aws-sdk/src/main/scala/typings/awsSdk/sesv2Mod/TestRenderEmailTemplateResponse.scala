package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRenderEmailTemplateResponse extends StObject {
  
  /**
    * The complete MIME message rendered by applying the data in the TemplateData parameter to the template specified in the TemplateName parameter.
    */
  var RenderedTemplate: RenderedEmailTemplate
}
object TestRenderEmailTemplateResponse {
  
  inline def apply(RenderedTemplate: RenderedEmailTemplate): TestRenderEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(RenderedTemplate = RenderedTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRenderEmailTemplateResponse]
  }
  
  extension [Self <: TestRenderEmailTemplateResponse](x: Self) {
    
    inline def setRenderedTemplate(value: RenderedEmailTemplate): Self = StObject.set(x, "RenderedTemplate", value.asInstanceOf[js.Any])
  }
}
