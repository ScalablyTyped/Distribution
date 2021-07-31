package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomVerificationEmailTemplateRequest extends StObject {
  
  /**
    * The name of the custom verification email template that you want to delete.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName
}
object DeleteCustomVerificationEmailTemplateRequest {
  
  @scala.inline
  def apply(TemplateName: TemplateName): DeleteCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomVerificationEmailTemplateRequest]
  }
  
  @scala.inline
  implicit class DeleteCustomVerificationEmailTemplateRequestMutableBuilder[Self <: DeleteCustomVerificationEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
