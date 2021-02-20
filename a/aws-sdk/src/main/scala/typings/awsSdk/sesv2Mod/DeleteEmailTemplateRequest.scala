package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEmailTemplateRequest extends StObject {
  
  /**
    * The name of the template to be deleted.
    */
  var TemplateName: EmailTemplateName = js.native
}
object DeleteEmailTemplateRequest {
  
  @scala.inline
  def apply(TemplateName: EmailTemplateName): DeleteEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailTemplateRequest]
  }
  
  @scala.inline
  implicit class DeleteEmailTemplateRequestMutableBuilder[Self <: DeleteEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
