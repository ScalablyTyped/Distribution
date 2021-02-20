package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTemplateRequest extends StObject {
  
  var Template: typings.awsSdk.sesMod.Template = js.native
}
object UpdateTemplateRequest {
  
  @scala.inline
  def apply(Template: Template): UpdateTemplateRequest = {
    val __obj = js.Dynamic.literal(Template = Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateRequest]
  }
  
  @scala.inline
  implicit class UpdateTemplateRequestMutableBuilder[Self <: UpdateTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
  }
}
