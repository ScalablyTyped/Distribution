package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalExternalWorkflowExecutionDecisionAttributes extends js.Object {
  
  /**
    * The data attached to the event that can be used by the decider in subsequent decision tasks.
    */
  var control: js.UndefOr[Data] = js.native
  
  /**
    *  The input data to be provided with the signal. The target workflow execution uses the signal name and input data to process the signal.
    */
  var input: js.UndefOr[Data] = js.native
  
  /**
    * The runId of the workflow execution to be signaled.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  
  /**
    *  The name of the signal.The target workflow execution uses the signal name and input to process the signal.
    */
  var signalName: SignalName = js.native
  
  /**
    *  The workflowId of the workflow execution to be signaled.
    */
  var workflowId: WorkflowId = js.native
}
object SignalExternalWorkflowExecutionDecisionAttributes {
  
  @scala.inline
  def apply(signalName: SignalName, workflowId: WorkflowId): SignalExternalWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal(signalName = signalName.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalExternalWorkflowExecutionDecisionAttributes]
  }
  
  @scala.inline
  implicit class SignalExternalWorkflowExecutionDecisionAttributesOps[Self <: SignalExternalWorkflowExecutionDecisionAttributes] (val x: Self) extends AnyVal {
    
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
    def setSignalName(value: SignalName): Self = this.set("signalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowId(value: WorkflowId): Self = this.set("workflowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: Data): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    
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
