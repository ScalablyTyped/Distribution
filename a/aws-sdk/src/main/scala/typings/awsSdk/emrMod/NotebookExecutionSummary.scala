package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookExecutionSummary extends js.Object {
  
  /**
    * The unique identifier of the editor associated with the notebook execution.
    */
  var EditorId: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The timestamp when notebook execution started.
    */
  var EndTime: js.UndefOr[Date] = js.native
  
  /**
    * The unique identifier of the notebook execution.
    */
  var NotebookExecutionId: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The name of the notebook execution.
    */
  var NotebookExecutionName: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The timestamp when notebook execution started.
    */
  var StartTime: js.UndefOr[Date] = js.native
  
  /**
    * The status of the notebook execution.    START_PENDING indicates that the cluster has received the execution request but execution has not begun.    STARTING indicates that the execution is starting on the cluster.    RUNNING indicates that the execution is being processed by the cluster.    FINISHING indicates that execution processing is in the final stages.    FINISHED indicates that the execution has completed without error.    FAILING indicates that the execution is failing and will not finish successfully.    FAILED indicates that the execution failed.    STOP_PENDING indicates that the cluster has received a StopNotebookExecution request and the stop is pending.    STOPPING indicates that the cluster is in the process of stopping the execution as a result of a StopNotebookExecution request.    STOPPED indicates that the execution stopped because of a StopNotebookExecution request.  
    */
  var Status: js.UndefOr[NotebookExecutionStatus] = js.native
}
object NotebookExecutionSummary {
  
  @scala.inline
  def apply(): NotebookExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookExecutionSummary]
  }
  
  @scala.inline
  implicit class NotebookExecutionSummaryOps[Self <: NotebookExecutionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEditorId(value: XmlStringMaxLen256): Self = this.set("EditorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorId: Self = this.set("EditorId", js.undefined)
    
    @scala.inline
    def setEndTime(value: Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setNotebookExecutionId(value: XmlStringMaxLen256): Self = this.set("NotebookExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookExecutionId: Self = this.set("NotebookExecutionId", js.undefined)
    
    @scala.inline
    def setNotebookExecutionName(value: XmlStringMaxLen256): Self = this.set("NotebookExecutionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookExecutionName: Self = this.set("NotebookExecutionName", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: NotebookExecutionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
