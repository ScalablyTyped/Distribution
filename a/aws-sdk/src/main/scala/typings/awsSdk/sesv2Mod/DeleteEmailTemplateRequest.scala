package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEmailTemplateRequest extends StObject {
  
  /**
    * The name of the template to be deleted.
    */
  var TemplateName: EmailTemplateName
}
object DeleteEmailTemplateRequest {
  
  inline def apply(TemplateName: EmailTemplateName): DeleteEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailTemplateRequest]
  }
  
  extension [Self <: DeleteEmailTemplateRequest](x: Self) {
    
    inline def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
