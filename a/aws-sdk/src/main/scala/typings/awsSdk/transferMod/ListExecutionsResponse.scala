package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExecutionsResponse extends StObject {
  
  /**
    * Returns the details for each execution.    NextToken: returned from a call to several APIs, you can use pass it to a subsequent command to continue listing additional executions.    StartTime: timestamp indicating when the execution began.    Executions: details of the execution, including the execution ID, initial file location, and Service metadata.    Status: one of the following values: IN_PROGRESS, COMPLETED, EXCEPTION, HANDLING_EXEPTION.   
    */
  var Executions: ListedExecutions
  
  /**
    *  ListExecutions returns the NextToken parameter in the output. You can then pass the NextToken parameter in a subsequent command to continue listing additional executions.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.undefined
  
  /**
    * A unique identifier for the workflow.
    */
  var WorkflowId: typings.awsSdk.transferMod.WorkflowId
}
object ListExecutionsResponse {
  
  inline def apply(Executions: ListedExecutions, WorkflowId: WorkflowId): ListExecutionsResponse = {
    val __obj = js.Dynamic.literal(Executions = Executions.asInstanceOf[js.Any], WorkflowId = WorkflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExecutionsResponse]
  }
  
  extension [Self <: ListExecutionsResponse](x: Self) {
    
    inline def setExecutions(value: ListedExecutions): Self = StObject.set(x, "Executions", value.asInstanceOf[js.Any])
    
    inline def setExecutionsVarargs(value: ListedExecution*): Self = StObject.set(x, "Executions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
  }
}
