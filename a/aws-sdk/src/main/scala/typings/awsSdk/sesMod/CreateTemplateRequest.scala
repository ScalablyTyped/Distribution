package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTemplateRequest extends StObject {
  
  /**
    * The content of the email, composed of a subject line, an HTML part, and a text-only part.
    */
  var Template: typings.awsSdk.sesMod.Template = js.native
}
object CreateTemplateRequest {
  
  @scala.inline
  def apply(Template: Template): CreateTemplateRequest = {
    val __obj = js.Dynamic.literal(Template = Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateRequest]
  }
  
  @scala.inline
  implicit class CreateTemplateRequestMutableBuilder[Self <: CreateTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
  }
}
