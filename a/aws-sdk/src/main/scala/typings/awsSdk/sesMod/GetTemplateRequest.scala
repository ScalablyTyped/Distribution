package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTemplateRequest extends StObject {
  
  /**
    * The name of the template you want to retrieve.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName = js.native
}
object GetTemplateRequest {
  
  @scala.inline
  def apply(TemplateName: TemplateName): GetTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateRequest]
  }
  
  @scala.inline
  implicit class GetTemplateRequestMutableBuilder[Self <: GetTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
