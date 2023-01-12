package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribedWorkflow extends StObject {
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) for the workflow.
    */
  var Arn: typings.awsSdk.clientsTransferMod.Arn
  
  /**
    * Specifies the text description for the workflow.
    */
  var Description: js.UndefOr[WorkflowDescription] = js.undefined
  
  /**
    * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
    */
  var OnExceptionSteps: js.UndefOr[WorkflowSteps] = js.undefined
  
  /**
    * Specifies the details for the steps that are in the specified workflow.
    */
  var Steps: js.UndefOr[WorkflowSteps] = js.undefined
  
  /**
    * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for any purpose.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsTransferMod.Tags] = js.undefined
  
  /**
    * A unique identifier for the workflow.
    */
  var WorkflowId: js.UndefOr[typings.awsSdk.clientsTransferMod.WorkflowId] = js.undefined
}
object DescribedWorkflow {
  
  inline def apply(Arn: Arn): DescribedWorkflow = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedWorkflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribedWorkflow] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: WorkflowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setOnExceptionSteps(value: WorkflowSteps): Self = StObject.set(x, "OnExceptionSteps", value.asInstanceOf[js.Any])
    
    inline def setOnExceptionStepsUndefined: Self = StObject.set(x, "OnExceptionSteps", js.undefined)
    
    inline def setOnExceptionStepsVarargs(value: WorkflowStep*): Self = StObject.set(x, "OnExceptionSteps", js.Array(value*))
    
    inline def setSteps(value: WorkflowSteps): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    inline def setStepsVarargs(value: WorkflowStep*): Self = StObject.set(x, "Steps", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "WorkflowId", js.undefined)
  }
}
