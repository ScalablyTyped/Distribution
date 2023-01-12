package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowsResponse extends StObject {
  
  /**
    *  ListWorkflows returns the NextToken parameter in the output. You can then pass the NextToken parameter in a subsequent command to continue listing additional workflows.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
  
  /**
    * Returns the Arn, WorkflowId, and Description for each workflow.
    */
  var Workflows: ListedWorkflows
}
object ListWorkflowsResponse {
  
  inline def apply(Workflows: ListedWorkflows): ListWorkflowsResponse = {
    val __obj = js.Dynamic.literal(Workflows = Workflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkflowsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkflowsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkflows(value: ListedWorkflows): Self = StObject.set(x, "Workflows", value.asInstanceOf[js.Any])
    
    inline def setWorkflowsVarargs(value: ListedWorkflow*): Self = StObject.set(x, "Workflows", js.Array(value*))
  }
}
