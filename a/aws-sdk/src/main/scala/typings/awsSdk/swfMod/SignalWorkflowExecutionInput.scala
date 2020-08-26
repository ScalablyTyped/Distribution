package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalWorkflowExecutionInput extends js.Object {
  /**
    * The name of the domain containing the workflow execution to signal.
    */
  var domain: DomainName = js.native
  /**
    * Data to attach to the WorkflowExecutionSignaled event in the target workflow execution's history.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The runId of the workflow execution to signal.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    * The name of the signal. This name must be meaningful to the target workflow.
    */
  var signalName: SignalName = js.native
  /**
    * The workflowId of the workflow execution to signal.
    */
  var workflowId: WorkflowId = js.native
}

object SignalWorkflowExecutionInput {
  @scala.inline
  def apply(domain: DomainName, signalName: SignalName, workflowId: WorkflowId): SignalWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], signalName = signalName.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalWorkflowExecutionInput]
  }
  @scala.inline
  implicit class SignalWorkflowExecutionInputOps[Self <: SignalWorkflowExecutionInput] (val x: Self) extends AnyVal {
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
    def setSignalName(value: SignalName): Self = this.set("signalName", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowId(value: WorkflowId): Self = this.set("workflowId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Data): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setRunId(value: WorkflowRunIdOptional): Self = this.set("runId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunId: Self = this.set("runId", js.undefined)
  }
  
}

