package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFlowTemplateResponse extends StObject {
  
  /**
    * The object that describes the specified workflow.
    */
  var description: js.UndefOr[FlowTemplateDescription] = js.undefined
}
object GetFlowTemplateResponse {
  
  inline def apply(): GetFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFlowTemplateResponse]
  }
  
  extension [Self <: GetFlowTemplateResponse](x: Self) {
    
    inline def setDescription(value: FlowTemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
