package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEmailTemplateRequest extends StObject {
  
  /**
    * The name of the template you want to retrieve.
    */
  var TemplateName: EmailTemplateName = js.native
}
object GetEmailTemplateRequest {
  
  @scala.inline
  def apply(TemplateName: EmailTemplateName): GetEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailTemplateRequest]
  }
  
  @scala.inline
  implicit class GetEmailTemplateRequestMutableBuilder[Self <: GetEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
