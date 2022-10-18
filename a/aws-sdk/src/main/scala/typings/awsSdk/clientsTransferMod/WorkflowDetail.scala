package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowDetail extends StObject {
  
  /**
    * Includes the necessary permissions for S3, EFS, and Lambda operations that Transfer can assume, so that all workflow steps can operate on the required resources
    */
  var ExecutionRole: Role
  
  /**
    * A unique identifier for the workflow.
    */
  var WorkflowId: typings.awsSdk.clientsTransferMod.WorkflowId
}
object WorkflowDetail {
  
  inline def apply(ExecutionRole: Role, WorkflowId: WorkflowId): WorkflowDetail = {
    val __obj = js.Dynamic.literal(ExecutionRole = ExecutionRole.asInstanceOf[js.Any], WorkflowId = WorkflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowDetail]
  }
  
  extension [Self <: WorkflowDetail](x: Self) {
    
    inline def setExecutionRole(value: Role): Self = StObject.set(x, "ExecutionRole", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
  }
}
