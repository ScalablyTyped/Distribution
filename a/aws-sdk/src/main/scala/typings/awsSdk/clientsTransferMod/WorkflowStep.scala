package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowStep extends StObject {
  
  /**
    * Details for a step that performs a file copy.  Consists of the following values:    A description   An S3 location for the destination of the file copy.   A flag that indicates whether or not to overwrite an existing file of the same name. The default is FALSE.  
    */
  var CopyStepDetails: js.UndefOr[typings.awsSdk.clientsTransferMod.CopyStepDetails] = js.undefined
  
  /**
    * Details for a step that invokes a lambda function.  Consists of the lambda function name, target, and timeout (in seconds). 
    */
  var CustomStepDetails: js.UndefOr[typings.awsSdk.clientsTransferMod.CustomStepDetails] = js.undefined
  
  /**
    * Details for a step that deletes the file.
    */
  var DeleteStepDetails: js.UndefOr[typings.awsSdk.clientsTransferMod.DeleteStepDetails] = js.undefined
  
  /**
    * Details for a step that creates one or more tags. You specify one or more tags: each tag contains a key/value pair.
    */
  var TagStepDetails: js.UndefOr[typings.awsSdk.clientsTransferMod.TagStepDetails] = js.undefined
  
  /**
    *  Currently, the following step types are supported.     COPY: Copy the file to another location.    CUSTOM: Perform a custom step with an Lambda function target.    DELETE: Delete the file.    TAG: Add a tag to the file.  
    */
  var Type: js.UndefOr[WorkflowStepType] = js.undefined
}
object WorkflowStep {
  
  inline def apply(): WorkflowStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowStep] (val x: Self) extends AnyVal {
    
    inline def setCopyStepDetails(value: CopyStepDetails): Self = StObject.set(x, "CopyStepDetails", value.asInstanceOf[js.Any])
    
    inline def setCopyStepDetailsUndefined: Self = StObject.set(x, "CopyStepDetails", js.undefined)
    
    inline def setCustomStepDetails(value: CustomStepDetails): Self = StObject.set(x, "CustomStepDetails", value.asInstanceOf[js.Any])
    
    inline def setCustomStepDetailsUndefined: Self = StObject.set(x, "CustomStepDetails", js.undefined)
    
    inline def setDeleteStepDetails(value: DeleteStepDetails): Self = StObject.set(x, "DeleteStepDetails", value.asInstanceOf[js.Any])
    
    inline def setDeleteStepDetailsUndefined: Self = StObject.set(x, "DeleteStepDetails", js.undefined)
    
    inline def setTagStepDetails(value: TagStepDetails): Self = StObject.set(x, "TagStepDetails", value.asInstanceOf[js.Any])
    
    inline def setTagStepDetailsUndefined: Self = StObject.set(x, "TagStepDetails", js.undefined)
    
    inline def setType(value: WorkflowStepType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
