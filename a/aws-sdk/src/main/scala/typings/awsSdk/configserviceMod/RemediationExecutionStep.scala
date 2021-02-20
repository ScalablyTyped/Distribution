package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemediationExecutionStep extends StObject {
  
  /**
    * An error message if the step was interrupted during execution.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * The details of the step.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The time when the step started.
    */
  var StartTime: js.UndefOr[Date] = js.native
  
  /**
    * The valid status of the step.
    */
  var State: js.UndefOr[RemediationExecutionStepState] = js.native
  
  /**
    * The time when the step stopped.
    */
  var StopTime: js.UndefOr[Date] = js.native
}
object RemediationExecutionStep {
  
  @scala.inline
  def apply(): RemediationExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExecutionStep]
  }
  
  @scala.inline
  implicit class RemediationExecutionStepMutableBuilder[Self <: RemediationExecutionStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setState(value: RemediationExecutionStepState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStopTime(value: Date): Self = StObject.set(x, "StopTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTimeUndefined: Self = StObject.set(x, "StopTime", js.undefined)
  }
}
