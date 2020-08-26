package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionTerminatedEventAttributes extends js.Object {
  /**
    * If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This happens if the parent workflow execution times out or is terminated and the child policy is set to terminate child executions.
    */
  var cause: js.UndefOr[WorkflowExecutionTerminatedCause] = js.native
  /**
    * The policy used for the child workflow executions of this workflow execution. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy = js.native
  /**
    * The details provided for the termination.
    */
  var details: js.UndefOr[Data] = js.native
  /**
    * The reason provided for the termination.
    */
  var reason: js.UndefOr[TerminateReason] = js.native
}

object WorkflowExecutionTerminatedEventAttributes {
  @scala.inline
  def apply(childPolicy: ChildPolicy): WorkflowExecutionTerminatedEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionTerminatedEventAttributes]
  }
  @scala.inline
  implicit class WorkflowExecutionTerminatedEventAttributesOps[Self <: WorkflowExecutionTerminatedEventAttributes] (val x: Self) extends AnyVal {
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
    def setChildPolicy(value: ChildPolicy): Self = this.set("childPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setCause(value: WorkflowExecutionTerminatedCause): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    @scala.inline
    def setDetails(value: Data): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setReason(value: TerminateReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

