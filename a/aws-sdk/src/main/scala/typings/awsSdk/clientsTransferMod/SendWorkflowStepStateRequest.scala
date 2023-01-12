package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendWorkflowStepStateRequest extends StObject {
  
  /**
    * A unique identifier for the execution of a workflow.
    */
  var ExecutionId: typings.awsSdk.clientsTransferMod.ExecutionId
  
  /**
    * Indicates whether the specified step succeeded or failed.
    */
  var Status: CustomStepStatus
  
  /**
    * Used to distinguish between multiple callbacks for multiple Lambda steps within the same execution.
    */
  var Token: CallbackToken
  
  /**
    * A unique identifier for the workflow.
    */
  var WorkflowId: typings.awsSdk.clientsTransferMod.WorkflowId
}
object SendWorkflowStepStateRequest {
  
  inline def apply(ExecutionId: ExecutionId, Status: CustomStepStatus, Token: CallbackToken, WorkflowId: WorkflowId): SendWorkflowStepStateRequest = {
    val __obj = js.Dynamic.literal(ExecutionId = ExecutionId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any], WorkflowId = WorkflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendWorkflowStepStateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendWorkflowStepStateRequest] (val x: Self) extends AnyVal {
    
    inline def setExecutionId(value: ExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CustomStepStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setToken(value: CallbackToken): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
  }
}
