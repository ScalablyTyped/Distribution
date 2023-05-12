package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomStepDetails extends StObject {
  
  /**
    * The name of the step, used as an identifier.
    */
  var Name: js.UndefOr[WorkflowStepName] = js.undefined
  
  /**
    * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow.   To use the previous file as the input, enter ${previous.file}. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value.   To use the originally uploaded file location as input for this step, enter ${original.file}.  
    */
  var SourceFileLocation: js.UndefOr[typings.awsSdk.clientsTransferMod.SourceFileLocation] = js.undefined
  
  /**
    * The ARN for the lambda function that is being called.
    */
  var Target: js.UndefOr[CustomStepTarget] = js.undefined
  
  /**
    * Timeout, in seconds, for the step.
    */
  var TimeoutSeconds: js.UndefOr[CustomStepTimeoutSeconds] = js.undefined
}
object CustomStepDetails {
  
  inline def apply(): CustomStepDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomStepDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomStepDetails] (val x: Self) extends AnyVal {
    
    inline def setName(value: WorkflowStepName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSourceFileLocation(value: SourceFileLocation): Self = StObject.set(x, "SourceFileLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceFileLocationUndefined: Self = StObject.set(x, "SourceFileLocation", js.undefined)
    
    inline def setTarget(value: CustomStepTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    
    inline def setTimeoutSeconds(value: CustomStepTimeoutSeconds): Self = StObject.set(x, "TimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "TimeoutSeconds", js.undefined)
  }
}
