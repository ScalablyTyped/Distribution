package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomVerificationEmailTemplateRequest extends StObject {
  
  /**
    * The name of the custom verification email template that you want to retrieve.
    */
  var TemplateName: typings.awsSdk2Types.clientsSesMod.TemplateName
}
object GetCustomVerificationEmailTemplateRequest {
  
  inline def apply(TemplateName: TemplateName): GetCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomVerificationEmailTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCustomVerificationEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
