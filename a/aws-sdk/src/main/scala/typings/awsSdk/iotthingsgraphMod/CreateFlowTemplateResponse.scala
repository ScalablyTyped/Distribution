package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFlowTemplateResponse extends StObject {
  
  /**
    * The summary object that describes the created workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.native
}
object CreateFlowTemplateResponse {
  
  @scala.inline
  def apply(): CreateFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowTemplateResponse]
  }
  
  @scala.inline
  implicit class CreateFlowTemplateResponseMutableBuilder[Self <: CreateFlowTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummary(value: FlowTemplateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
