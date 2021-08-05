package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookExecutionSummary extends StObject {
  
  /**
    * The unique identifier of the editor associated with the notebook execution.
    */
  var EditorId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The timestamp when notebook execution started.
    */
  var EndTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The unique identifier of the notebook execution.
    */
  var NotebookExecutionId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The name of the notebook execution.
    */
  var NotebookExecutionName: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The timestamp when notebook execution started.
    */
  var StartTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The status of the notebook execution.    START_PENDING indicates that the cluster has received the execution request but execution has not begun.    STARTING indicates that the execution is starting on the cluster.    RUNNING indicates that the execution is being processed by the cluster.    FINISHING indicates that execution processing is in the final stages.    FINISHED indicates that the execution has completed without error.    FAILING indicates that the execution is failing and will not finish successfully.    FAILED indicates that the execution failed.    STOP_PENDING indicates that the cluster has received a StopNotebookExecution request and the stop is pending.    STOPPING indicates that the cluster is in the process of stopping the execution as a result of a StopNotebookExecution request.    STOPPED indicates that the execution stopped because of a StopNotebookExecution request.  
    */
  var Status: js.UndefOr[NotebookExecutionStatus] = js.undefined
}
object NotebookExecutionSummary {
  
  inline def apply(): NotebookExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookExecutionSummary]
  }
  
  extension [Self <: NotebookExecutionSummary](x: Self) {
    
    inline def setEditorId(value: XmlStringMaxLen256): Self = StObject.set(x, "EditorId", value.asInstanceOf[js.Any])
    
    inline def setEditorIdUndefined: Self = StObject.set(x, "EditorId", js.undefined)
    
    inline def setEndTime(value: Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setNotebookExecutionId(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookExecutionId", value.asInstanceOf[js.Any])
    
    inline def setNotebookExecutionIdUndefined: Self = StObject.set(x, "NotebookExecutionId", js.undefined)
    
    inline def setNotebookExecutionName(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookExecutionName", value.asInstanceOf[js.Any])
    
    inline def setNotebookExecutionNameUndefined: Self = StObject.set(x, "NotebookExecutionName", js.undefined)
    
    inline def setStartTime(value: Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: NotebookExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
