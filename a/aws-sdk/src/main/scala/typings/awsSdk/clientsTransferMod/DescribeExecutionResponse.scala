package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExecutionResponse extends StObject {
  
  /**
    * The structure that contains the details of the workflow' execution.
    */
  var Execution: DescribedExecution
  
  /**
    * A unique identifier for the workflow.
    */
  var WorkflowId: typings.awsSdk.clientsTransferMod.WorkflowId
}
object DescribeExecutionResponse {
  
  inline def apply(Execution: DescribedExecution, WorkflowId: WorkflowId): DescribeExecutionResponse = {
    val __obj = js.Dynamic.literal(Execution = Execution.asInstanceOf[js.Any], WorkflowId = WorkflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExecutionResponse]
  }
  
  extension [Self <: DescribeExecutionResponse](x: Self) {
    
    inline def setExecution(value: DescribedExecution): Self = StObject.set(x, "Execution", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
  }
}
