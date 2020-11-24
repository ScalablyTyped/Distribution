package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNotebookExecutionsInput extends js.Object {
  
  /**
    * The unique ID of the editor associated with the notebook execution.
    */
  var EditorId: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The beginning of time range filter for listing notebook executions. The default is the timestamp of 30 days ago.
    */
  var From: js.UndefOr[Date] = js.native
  
  /**
    * The pagination token, returned by a previous ListNotebookExecutions call, that indicates the start of the list for this ListNotebookExecutions call.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
  
  /**
    * The status filter for listing notebook executions.    START_PENDING indicates that the cluster has received the execution request but execution has not begun.    STARTING indicates that the execution is starting on the cluster.    RUNNING indicates that the execution is being processed by the cluster.    FINISHING indicates that execution processing is in the final stages.    FINISHED indicates that the execution has completed without error.    FAILING indicates that the execution is failing and will not finish successfully.    FAILED indicates that the execution failed.    STOP_PENDING indicates that the cluster has received a StopNotebookExecution request and the stop is pending.    STOPPING indicates that the cluster is in the process of stopping the execution as a result of a StopNotebookExecution request.    STOPPED indicates that the execution stopped because of a StopNotebookExecution request.  
    */
  var Status: js.UndefOr[NotebookExecutionStatus] = js.native
  
  /**
    * The end of time range filter for listing notebook executions. The default is the current timestamp.
    */
  var To: js.UndefOr[Date] = js.native
}
object ListNotebookExecutionsInput {
  
  @scala.inline
  def apply(): ListNotebookExecutionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookExecutionsInput]
  }
  
  @scala.inline
  implicit class ListNotebookExecutionsInputOps[Self <: ListNotebookExecutionsInput] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Date): Self = this.set("From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("From", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setStatus(value: NotebookExecutionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTo(value: Date): Self = this.set("To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("To", js.undefined)
  }
}
