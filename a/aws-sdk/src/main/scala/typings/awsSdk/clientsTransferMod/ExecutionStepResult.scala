package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionStepResult extends StObject {
  
  /**
    * Specifies the details for an error, if it occurred during execution of the specified workflow step.
    */
  var Error: js.UndefOr[ExecutionError] = js.undefined
  
  /**
    * The values for the key/value pair applied as a tag to the file. Only applicable if the step type is TAG.
    */
  var Outputs: js.UndefOr[StepResultOutputsJson] = js.undefined
  
  /**
    * One of the available step types.    COPY: Copy the file to another location.    CUSTOM: Perform a custom step with an Lambda function target.    DELETE: Delete the file.    TAG: Add a tag to the file.  
    */
  var StepType: js.UndefOr[WorkflowStepType] = js.undefined
}
object ExecutionStepResult {
  
  inline def apply(): ExecutionStepResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStepResult]
  }
  
  extension [Self <: ExecutionStepResult](x: Self) {
    
    inline def setError(value: ExecutionError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setOutputs(value: StepResultOutputsJson): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setStepType(value: WorkflowStepType): Self = StObject.set(x, "StepType", value.asInstanceOf[js.Any])
    
    inline def setStepTypeUndefined: Self = StObject.set(x, "StepType", js.undefined)
  }
}
