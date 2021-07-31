package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotebookExecutionsInput extends StObject {
  
  /**
    * The unique ID of the editor associated with the notebook execution.
    */
  var EditorId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The beginning of time range filter for listing notebook executions. The default is the timestamp of 30 days ago.
    */
  var From: js.UndefOr[Date] = js.undefined
  
  /**
    * The pagination token, returned by a previous ListNotebookExecutions call, that indicates the start of the list for this ListNotebookExecutions call.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.undefined
  
  /**
    * The status filter for listing notebook executions.    START_PENDING indicates that the cluster has received the execution request but execution has not begun.    STARTING indicates that the execution is starting on the cluster.    RUNNING indicates that the execution is being processed by the cluster.    FINISHING indicates that execution processing is in the final stages.    FINISHED indicates that the execution has completed without error.    FAILING indicates that the execution is failing and will not finish successfully.    FAILED indicates that the execution failed.    STOP_PENDING indicates that the cluster has received a StopNotebookExecution request and the stop is pending.    STOPPING indicates that the cluster is in the process of stopping the execution as a result of a StopNotebookExecution request.    STOPPED indicates that the execution stopped because of a StopNotebookExecution request.  
    */
  var Status: js.UndefOr[NotebookExecutionStatus] = js.undefined
  
  /**
    * The end of time range filter for listing notebook executions. The default is the current timestamp.
    */
  var To: js.UndefOr[Date] = js.undefined
}
object ListNotebookExecutionsInput {
  
  @scala.inline
  def apply(): ListNotebookExecutionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookExecutionsInput]
  }
  
  @scala.inline
  implicit class ListNotebookExecutionsInputMutableBuilder[Self <: ListNotebookExecutionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditorId(value: XmlStringMaxLen256): Self = StObject.set(x, "EditorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorIdUndefined: Self = StObject.set(x, "EditorId", js.undefined)
    
    @scala.inline
    def setFrom(value: Date): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setStatus(value: NotebookExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTo(value: Date): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
