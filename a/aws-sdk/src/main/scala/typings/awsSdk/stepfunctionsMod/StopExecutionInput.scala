package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopExecutionInput extends StObject {
  
  /**
    * A more detailed explanation of the cause of the failure.
    */
  var cause: js.UndefOr[SensitiveCause] = js.undefined
  
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the execution to stop.
    */
  var executionArn: Arn
}
object StopExecutionInput {
  
  @scala.inline
  def apply(executionArn: Arn): StopExecutionInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopExecutionInput]
  }
  
  @scala.inline
  implicit class StopExecutionInputMutableBuilder[Self <: StopExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: SensitiveCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    @scala.inline
    def setError(value: SensitiveError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExecutionArn(value: Arn): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
  }
}
