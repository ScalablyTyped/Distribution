package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExecutionRequest extends StObject {
  
  /**
    * A unique identifier for the execution of a workflow.
    */
  var ExecutionId: typings.awsSdk.clientsTransferMod.ExecutionId
  
  /**
    * A unique identifier for the workflow.
    */
  var WorkflowId: typings.awsSdk.clientsTransferMod.WorkflowId
}
object DescribeExecutionRequest {
  
  inline def apply(ExecutionId: ExecutionId, WorkflowId: WorkflowId): DescribeExecutionRequest = {
    val __obj = js.Dynamic.literal(ExecutionId = ExecutionId.asInstanceOf[js.Any], WorkflowId = WorkflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setExecutionId(value: ExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
  }
}
