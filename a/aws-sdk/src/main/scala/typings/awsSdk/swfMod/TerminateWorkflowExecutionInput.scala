package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateWorkflowExecutionInput extends js.Object {
  /**
    * If set, specifies the policy to use for the child workflow executions of the workflow execution being terminated. This policy overrides the child policy specified for the workflow execution at registration time or when starting the execution. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.    A child policy for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default child policy was specified at registration time then a fault is returned. 
    */
  var childPolicy: js.UndefOr[ChildPolicy] = js.native
  /**
    *  Details for terminating the workflow execution.
    */
  var details: js.UndefOr[Data] = js.native
  /**
    * The domain of the workflow execution to terminate.
    */
  var domain: DomainName = js.native
  /**
    *  A descriptive reason for terminating the workflow execution.
    */
  var reason: js.UndefOr[TerminateReason] = js.native
  /**
    * The runId of the workflow execution to terminate.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    * The workflowId of the workflow execution to terminate.
    */
  var workflowId: WorkflowId = js.native
}

object TerminateWorkflowExecutionInput {
  @scala.inline
  def apply(domain: DomainName, workflowId: WorkflowId): TerminateWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateWorkflowExecutionInput]
  }
  @scala.inline
  implicit class TerminateWorkflowExecutionInputOps[Self <: TerminateWorkflowExecutionInput] (val x: Self) extends AnyVal {
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
    def setDomain(value: DomainName): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowId(value: WorkflowId): Self = this.set("workflowId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildPolicy(value: ChildPolicy): Self = this.set("childPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildPolicy: Self = this.set("childPolicy", js.undefined)
    @scala.inline
    def setDetails(value: Data): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setReason(value: TerminateReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRunId(value: WorkflowRunIdOptional): Self = this.set("runId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunId: Self = this.set("runId", js.undefined)
  }
  
}

