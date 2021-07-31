package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepStatus extends StObject {
  
  /**
    * The details for the step failure including reason, message, and log file path where the root cause was identified.
    */
  var FailureDetails: js.UndefOr[typings.awsSdk.emrMod.FailureDetails] = js.undefined
  
  /**
    * The execution state of the cluster step.
    */
  var State: js.UndefOr[StepState] = js.undefined
  
  /**
    * The reason for the step execution status change.
    */
  var StateChangeReason: js.UndefOr[StepStateChangeReason] = js.undefined
  
  /**
    * The timeline of the cluster step status over time.
    */
  var Timeline: js.UndefOr[StepTimeline] = js.undefined
}
object StepStatus {
  
  @scala.inline
  def apply(): StepStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepStatus]
  }
  
  @scala.inline
  implicit class StepStatusMutableBuilder[Self <: StepStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureDetails(value: FailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    @scala.inline
    def setState(value: StepState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeReason(value: StepStateChangeReason): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTimeline(value: StepTimeline): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
  }
}
