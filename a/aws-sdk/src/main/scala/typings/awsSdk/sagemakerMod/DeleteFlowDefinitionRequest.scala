package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFlowDefinitionRequest extends StObject {
  
  /**
    * The name of the flow definition you are deleting.
    */
  var FlowDefinitionName: typings.awsSdk.sagemakerMod.FlowDefinitionName
}
object DeleteFlowDefinitionRequest {
  
  inline def apply(FlowDefinitionName: FlowDefinitionName): DeleteFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowDefinitionRequest]
  }
  
  extension [Self <: DeleteFlowDefinitionRequest](x: Self) {
    
    inline def setFlowDefinitionName(value: FlowDefinitionName): Self = StObject.set(x, "FlowDefinitionName", value.asInstanceOf[js.Any])
  }
}
