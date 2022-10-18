package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedWorkflow extends StObject {
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) for the workflow.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsTransferMod.Arn] = js.undefined
  
  /**
    * Specifies the text description for the workflow.
    */
  var Description: js.UndefOr[WorkflowDescription] = js.undefined
  
  /**
    * A unique identifier for the workflow.
    */
  var WorkflowId: js.UndefOr[typings.awsSdk.clientsTransferMod.WorkflowId] = js.undefined
}
object ListedWorkflow {
  
  inline def apply(): ListedWorkflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListedWorkflow]
  }
  
  extension [Self <: ListedWorkflow](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: WorkflowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "WorkflowId", js.undefined)
  }
}
