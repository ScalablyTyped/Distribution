package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkflowRequest extends StObject {
  
  /**
    * A textual description for the workflow.
    */
  var Description: js.UndefOr[WorkflowDescription] = js.undefined
  
  /**
    * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.  For custom steps, the lambda function needs to send FAILURE to the call back API to kick off the exception steps. Additionally, if the lambda does not send SUCCESS before it times out, the exception steps are executed. 
    */
  var OnExceptionSteps: js.UndefOr[WorkflowSteps] = js.undefined
  
  /**
    * Specifies the details for the steps that are in the specified workflow.  The TYPE specifies which of the following actions is being taken for this step.     COPY: Copy the file to another location.    CUSTOM: Perform a custom step with an Lambda function target.    DELETE: Delete the file.    TAG: Add a tag to the file.     Currently, copying and tagging are supported only on S3.    For file location, you specify either the S3 bucket and key, or the EFS file system ID and path. 
    */
  var Steps: WorkflowSteps
  
  /**
    * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for any purpose.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsTransferMod.Tags] = js.undefined
}
object CreateWorkflowRequest {
  
  inline def apply(Steps: WorkflowSteps): CreateWorkflowRequest = {
    val __obj = js.Dynamic.literal(Steps = Steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkflowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkflowRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: WorkflowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setOnExceptionSteps(value: WorkflowSteps): Self = StObject.set(x, "OnExceptionSteps", value.asInstanceOf[js.Any])
    
    inline def setOnExceptionStepsUndefined: Self = StObject.set(x, "OnExceptionSteps", js.undefined)
    
    inline def setOnExceptionStepsVarargs(value: WorkflowStep*): Self = StObject.set(x, "OnExceptionSteps", js.Array(value*))
    
    inline def setSteps(value: WorkflowSteps): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: WorkflowStep*): Self = StObject.set(x, "Steps", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
