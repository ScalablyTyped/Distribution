package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExecutionRequest extends StObject {
  
  /**
    * A unique identifier for the execution of a workflow.
    */
  var ExecutionId: typings.awsSdk.transferMod.ExecutionId
  
  /**
    * A unique identifier for the workflow.
    */
  var WorkflowId: typings.awsSdk.transferMod.WorkflowId
}
object DescribeExecutionRequest {
  
  inline def apply(ExecutionId: ExecutionId, WorkflowId: WorkflowId): DescribeExecutionRequest = {
    val __obj = js.Dynamic.literal(ExecutionId = ExecutionId.asInstanceOf[js.Any], WorkflowId = WorkflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExecutionRequest]
  }
  
  extension [Self <: DescribeExecutionRequest](x: Self) {
    
    inline def setExecutionId(value: ExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
  }
}
