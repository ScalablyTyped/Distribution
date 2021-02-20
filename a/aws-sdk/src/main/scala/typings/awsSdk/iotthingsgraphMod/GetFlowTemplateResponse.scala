package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFlowTemplateResponse extends StObject {
  
  /**
    * The object that describes the specified workflow.
    */
  var description: js.UndefOr[FlowTemplateDescription] = js.native
}
object GetFlowTemplateResponse {
  
  @scala.inline
  def apply(): GetFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFlowTemplateResponse]
  }
  
  @scala.inline
  implicit class GetFlowTemplateResponseMutableBuilder[Self <: GetFlowTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: FlowTemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
