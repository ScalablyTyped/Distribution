package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEmailTemplateRequest extends StObject {
  
  /**
    * The name of the template.
    */
  var TemplateName: EmailTemplateName
}
object GetEmailTemplateRequest {
  
  inline def apply(TemplateName: EmailTemplateName): GetEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailTemplateRequest]
  }
  
  extension [Self <: GetEmailTemplateRequest](x: Self) {
    
    inline def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
