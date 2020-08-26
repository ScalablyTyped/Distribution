package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decision extends js.Object {
  /**
    * Provides the details of the CancelTimer decision. It isn't set for other decision types.
    */
  var cancelTimerDecisionAttributes: js.UndefOr[CancelTimerDecisionAttributes] = js.native
  /**
    * Provides the details of the CancelWorkflowExecution decision. It isn't set for other decision types.
    */
  var cancelWorkflowExecutionDecisionAttributes: js.UndefOr[CancelWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the CompleteWorkflowExecution decision. It isn't set for other decision types.
    */
  var completeWorkflowExecutionDecisionAttributes: js.UndefOr[CompleteWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the ContinueAsNewWorkflowExecution decision. It isn't set for other decision types.
    */
  var continueAsNewWorkflowExecutionDecisionAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Specifies the type of the decision.
    */
  var decisionType: DecisionType = js.native
  /**
    * Provides the details of the FailWorkflowExecution decision. It isn't set for other decision types.
    */
  var failWorkflowExecutionDecisionAttributes: js.UndefOr[FailWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the RecordMarker decision. It isn't set for other decision types.
    */
  var recordMarkerDecisionAttributes: js.UndefOr[RecordMarkerDecisionAttributes] = js.native
  /**
    * Provides the details of the RequestCancelActivityTask decision. It isn't set for other decision types.
    */
  var requestCancelActivityTaskDecisionAttributes: js.UndefOr[RequestCancelActivityTaskDecisionAttributes] = js.native
  /**
    * Provides the details of the RequestCancelExternalWorkflowExecution decision. It isn't set for other decision types.
    */
  var requestCancelExternalWorkflowExecutionDecisionAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the ScheduleActivityTask decision. It isn't set for other decision types.
    */
  var scheduleActivityTaskDecisionAttributes: js.UndefOr[ScheduleActivityTaskDecisionAttributes] = js.native
  /**
    * Provides the details of the ScheduleLambdaFunction decision. It isn't set for other decision types.
    */
  var scheduleLambdaFunctionDecisionAttributes: js.UndefOr[ScheduleLambdaFunctionDecisionAttributes] = js.native
  /**
    * Provides the details of the SignalExternalWorkflowExecution decision. It isn't set for other decision types.
    */
  var signalExternalWorkflowExecutionDecisionAttributes: js.UndefOr[SignalExternalWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the StartChildWorkflowExecution decision. It isn't set for other decision types.
    */
  var startChildWorkflowExecutionDecisionAttributes: js.UndefOr[StartChildWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the StartTimer decision. It isn't set for other decision types.
    */
  var startTimerDecisionAttributes: js.UndefOr[StartTimerDecisionAttributes] = js.native
}

object Decision {
  @scala.inline
  def apply(decisionType: DecisionType): Decision = {
    val __obj = js.Dynamic.literal(decisionType = decisionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decision]
  }
  @scala.inline
  implicit class DecisionOps[Self <: Decision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecisionType(value: DecisionType): Self = this.set("decisionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelTimerDecisionAttributes(value: CancelTimerDecisionAttributes): Self = this.set("cancelTimerDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelTimerDecisionAttributes: Self = this.set("cancelTimerDecisionAttributes", js.undefined)
    @scala.inline
    def setCancelWorkflowExecutionDecisionAttributes(value: CancelWorkflowExecutionDecisionAttributes): Self = this.set("cancelWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelWorkflowExecutionDecisionAttributes: Self = this.set("cancelWorkflowExecutionDecisionAttributes", js.undefined)
    @scala.inline
    def setCompleteWorkflowExecutionDecisionAttributes(value: CompleteWorkflowExecutionDecisionAttributes): Self = this.set("completeWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleteWorkflowExecutionDecisionAttributes: Self = this.set("completeWorkflowExecutionDecisionAttributes", js.undefined)
    @scala.inline
    def setContinueAsNewWorkflowExecutionDecisionAttributes(value: ContinueAsNewWorkflowExecutionDecisionAttributes): Self = this.set("continueAsNewWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueAsNewWorkflowExecutionDecisionAttributes: Self = this.set("continueAsNewWorkflowExecutionDecisionAttributes", js.undefined)
    @scala.inline
    def setFailWorkflowExecutionDecisionAttributes(value: FailWorkflowExecutionDecisionAttributes): Self = this.set("failWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailWorkflowExecutionDecisionAttributes: Self = this.set("failWorkflowExecutionDecisionAttributes", js.undefined)
    @scala.inline
    def setRecordMarkerDecisionAttributes(value: RecordMarkerDecisionAttributes): Self = this.set("recordMarkerDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordMarkerDecisionAttributes: Self = this.set("recordMarkerDecisionAttributes", js.undefined)
    @scala.inline
    def setRequestCancelActivityTaskDecisionAttributes(value: RequestCancelActivityTaskDecisionAttributes): Self = this.set("requestCancelActivityTaskDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCancelActivityTaskDecisionAttributes: Self = this.set("requestCancelActivityTaskDecisionAttributes", js.undefined)
    @scala.inline
    def setRequestCancelExternalWorkflowExecutionDecisionAttributes(value: RequestCancelExternalWorkflowExecutionDecisionAttributes): Self = this.set("requestCancelExternalWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCancelExternalWorkflowExecutionDecisionAttributes: Self = this.set("requestCancelExternalWorkflowExecutionDecisionAttributes", js.undefined)
    @scala.inline
    def setScheduleActivityTaskDecisionAttributes(value: ScheduleActivityTaskDecisionAttributes): Self = this.set("scheduleActivityTaskDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleActivityTaskDecisionAttributes: Self = this.set("scheduleActivityTaskDecisionAttributes", js.undefined)
    @scala.inline
    def setScheduleLambdaFunctionDecisionAttributes(value: ScheduleLambdaFunctionDecisionAttributes): Self = this.set("scheduleLambdaFunctionDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleLambdaFunctionDecisionAttributes: Self = this.set("scheduleLambdaFunctionDecisionAttributes", js.undefined)
    @scala.inline
    def setSignalExternalWorkflowExecutionDecisionAttributes(value: SignalExternalWorkflowExecutionDecisionAttributes): Self = this.set("signalExternalWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignalExternalWorkflowExecutionDecisionAttributes: Self = this.set("signalExternalWorkflowExecutionDecisionAttributes", js.undefined)
    @scala.inline
    def setStartChildWorkflowExecutionDecisionAttributes(value: StartChildWorkflowExecutionDecisionAttributes): Self = this.set("startChildWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartChildWorkflowExecutionDecisionAttributes: Self = this.set("startChildWorkflowExecutionDecisionAttributes", js.undefined)
    @scala.inline
    def setStartTimerDecisionAttributes(value: StartTimerDecisionAttributes): Self = this.set("startTimerDecisionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimerDecisionAttributes: Self = this.set("startTimerDecisionAttributes", js.undefined)
  }
  
}

