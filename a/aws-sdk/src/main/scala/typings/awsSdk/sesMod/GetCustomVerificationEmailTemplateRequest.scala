package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomVerificationEmailTemplateRequest extends StObject {
  
  /**
    * The name of the custom verification email template that you want to retrieve.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName
}
object GetCustomVerificationEmailTemplateRequest {
  
  inline def apply(TemplateName: TemplateName): GetCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomVerificationEmailTemplateRequest]
  }
  
  extension [Self <: GetCustomVerificationEmailTemplateRequest](x: Self) {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
