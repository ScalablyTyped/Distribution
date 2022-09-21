package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowStepsResponse extends StObject {
  
  /**
    * List containing workflow step details.
    */
  var Items: js.UndefOr[WorkflowStepsList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[token] = js.undefined
  
  /**
    * Unique identifier for the workflow.
    */
  var WorkflowId: js.UndefOr[uuid] = js.undefined
  
  /**
    * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
    */
  var WorkflowType: js.UndefOr[typings.awsSdk.customerprofilesMod.WorkflowType] = js.undefined
}
object GetWorkflowStepsResponse {
  
  inline def apply(): GetWorkflowStepsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowStepsResponse]
  }
  
  extension [Self <: GetWorkflowStepsResponse](x: Self) {
    
    inline def setItems(value: WorkflowStepsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: WorkflowStepItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkflowId(value: uuid): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "WorkflowId", js.undefined)
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "WorkflowType", value.asInstanceOf[js.Any])
    
    inline def setWorkflowTypeUndefined: Self = StObject.set(x, "WorkflowType", js.undefined)
  }
}
