package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowTemplateResponse extends StObject {
  
  /**
    * An object containing summary information about the updated workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.undefined
}
object UpdateFlowTemplateResponse {
  
  inline def apply(): UpdateFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowTemplateResponse]
  }
  
  extension [Self <: UpdateFlowTemplateResponse](x: Self) {
    
    inline def setSummary(value: FlowTemplateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
