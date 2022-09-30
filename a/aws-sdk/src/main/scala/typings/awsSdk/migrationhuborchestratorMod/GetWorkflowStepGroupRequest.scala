package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowStepGroupRequest extends StObject {
  
  /**
    * The ID of the step group.
    */
  var id: StepGroupId
  
  /**
    * The ID of the migration workflow.
    */
  var workflowId: MigrationWorkflowId
}
object GetWorkflowStepGroupRequest {
  
  inline def apply(id: StepGroupId, workflowId: MigrationWorkflowId): GetWorkflowStepGroupRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowStepGroupRequest]
  }
  
  extension [Self <: GetWorkflowStepGroupRequest](x: Self) {
    
    inline def setId(value: StepGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: MigrationWorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
