package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecutionInfo extends js.Object {
  
  /**
    * Set to true if a cancellation is requested for this workflow execution.
    */
  var cancelRequested: js.UndefOr[Canceled] = js.native
  
  /**
    * If the execution status is closed then this specifies how the execution was closed:    COMPLETED – the execution was successfully completed.    CANCELED – the execution was canceled.Cancellation allows the implementation to gracefully clean up before the execution is closed.    TERMINATED – the execution was force terminated.    FAILED – the execution failed to complete.    TIMED_OUT – the execution did not complete in the alloted time and was automatically timed out.    CONTINUED_AS_NEW – the execution is logically continued. This means the current execution was completed and a new execution was started to carry on the workflow.  
    */
  var closeStatus: js.UndefOr[CloseStatus] = js.native
  
  /**
    * The time when the workflow execution was closed. Set only if the execution status is CLOSED.
    */
  var closeTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The workflow execution this information is about.
    */
  var execution: WorkflowExecution = js.native
  
  /**
    * The current status of the execution.
    */
  var executionStatus: ExecutionStatus = js.native
  
  /**
    * If this workflow execution is a child of another execution then contains the workflow execution that started this execution.
    */
  var parent: js.UndefOr[WorkflowExecution] = js.native
  
  /**
    * The time when the execution was started.
    */
  var startTimestamp: Timestamp = js.native
  
  /**
    * The list of tags associated with the workflow execution. Tags can be used to identify and list workflow executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
    */
  var tagList: js.UndefOr[TagList] = js.native
  
  /**
    * The type of the workflow execution.
    */
  var workflowType: WorkflowType = js.native
}
object WorkflowExecutionInfo {
  
  @scala.inline
  def apply(
    execution: WorkflowExecution,
    executionStatus: ExecutionStatus,
    startTimestamp: Timestamp,
    workflowType: WorkflowType
  ): WorkflowExecutionInfo = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], executionStatus = executionStatus.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionInfo]
  }
  
  @scala.inline
  implicit class WorkflowExecutionInfoOps[Self <: WorkflowExecutionInfo] (val x: Self) extends AnyVal {
    
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
    def setExecution(value: WorkflowExecution): Self = this.set("execution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStatus(value: ExecutionStatus): Self = this.set("executionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestamp(value: Timestamp): Self = this.set("startTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = this.set("workflowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelRequested(value: Canceled): Self = this.set("cancelRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelRequested: Self = this.set("cancelRequested", js.undefined)
    
    @scala.inline
    def setCloseStatus(value: CloseStatus): Self = this.set("closeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseStatus: Self = this.set("closeStatus", js.undefined)
    
    @scala.inline
    def setCloseTimestamp(value: Timestamp): Self = this.set("closeTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseTimestamp: Self = this.set("closeTimestamp", js.undefined)
    
    @scala.inline
    def setParent(value: WorkflowExecution): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("tagList", js.Array(value :_*))
    
    @scala.inline
    def setTagList(value: TagList): Self = this.set("tagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagList: Self = this.set("tagList", js.undefined)
  }
}
