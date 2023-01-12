package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionResults extends StObject {
  
  /**
    * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
    */
  var OnExceptionSteps: js.UndefOr[ExecutionStepResults] = js.undefined
  
  /**
    * Specifies the details for the steps that are in the specified workflow.
    */
  var Steps: js.UndefOr[ExecutionStepResults] = js.undefined
}
object ExecutionResults {
  
  inline def apply(): ExecutionResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionResults] (val x: Self) extends AnyVal {
    
    inline def setOnExceptionSteps(value: ExecutionStepResults): Self = StObject.set(x, "OnExceptionSteps", value.asInstanceOf[js.Any])
    
    inline def setOnExceptionStepsUndefined: Self = StObject.set(x, "OnExceptionSteps", js.undefined)
    
    inline def setOnExceptionStepsVarargs(value: ExecutionStepResult*): Self = StObject.set(x, "OnExceptionSteps", js.Array(value*))
    
    inline def setSteps(value: ExecutionStepResults): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    inline def setStepsVarargs(value: ExecutionStepResult*): Self = StObject.set(x, "Steps", js.Array(value*))
  }
}
