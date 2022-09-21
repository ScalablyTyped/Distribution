package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkflowRequest extends StObject {
  
  /**
    * A unique identifier for the workflow.
    */
  var WorkflowId: typings.awsSdk.transferMod.WorkflowId
}
object DeleteWorkflowRequest {
  
  inline def apply(WorkflowId: WorkflowId): DeleteWorkflowRequest = {
    val __obj = js.Dynamic.literal(WorkflowId = WorkflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkflowRequest]
  }
  
  extension [Self <: DeleteWorkflowRequest](x: Self) {
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
  }
}
