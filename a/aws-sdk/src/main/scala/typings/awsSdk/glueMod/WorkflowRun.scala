package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowRun extends StObject {
  
  /**
    * The date and time when the workflow run completed.
    */
  var CompletedOn: js.UndefOr[TimestampValue] = js.undefined
  
  /**
    * This error message describes any error that may have occurred in starting the workflow run. Currently the only error message is "Concurrent runs exceeded for workflow: foo."
    */
  var ErrorMessage: js.UndefOr[ErrorString] = js.undefined
  
  /**
    * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections between them as edges.
    */
  var Graph: js.UndefOr[WorkflowGraph] = js.undefined
  
  /**
    * Name of the workflow that was executed.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * The ID of the previous workflow run.
    */
  var PreviousRunId: js.UndefOr[IdString] = js.undefined
  
  /**
    * The date and time when the workflow run was started.
    */
  var StartedOn: js.UndefOr[TimestampValue] = js.undefined
  
  /**
    * The statistics of the run.
    */
  var Statistics: js.UndefOr[WorkflowRunStatistics] = js.undefined
  
  /**
    * The status of the workflow run.
    */
  var Status: js.UndefOr[WorkflowRunStatus] = js.undefined
  
  /**
    * The ID of this workflow run.
    */
  var WorkflowRunId: js.UndefOr[IdString] = js.undefined
  
  /**
    * The workflow run properties which were set during the run.
    */
  var WorkflowRunProperties: js.UndefOr[typings.awsSdk.glueMod.WorkflowRunProperties] = js.undefined
}
object WorkflowRun {
  
  inline def apply(): WorkflowRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowRun]
  }
  
  extension [Self <: WorkflowRun](x: Self) {
    
    inline def setCompletedOn(value: TimestampValue): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    inline def setErrorMessage(value: ErrorString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setGraph(value: WorkflowGraph): Self = StObject.set(x, "Graph", value.asInstanceOf[js.Any])
    
    inline def setGraphUndefined: Self = StObject.set(x, "Graph", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPreviousRunId(value: IdString): Self = StObject.set(x, "PreviousRunId", value.asInstanceOf[js.Any])
    
    inline def setPreviousRunIdUndefined: Self = StObject.set(x, "PreviousRunId", js.undefined)
    
    inline def setStartedOn(value: TimestampValue): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    inline def setStatistics(value: WorkflowRunStatistics): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "Statistics", js.undefined)
    
    inline def setStatus(value: WorkflowRunStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWorkflowRunId(value: IdString): Self = StObject.set(x, "WorkflowRunId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowRunIdUndefined: Self = StObject.set(x, "WorkflowRunId", js.undefined)
    
    inline def setWorkflowRunProperties(value: WorkflowRunProperties): Self = StObject.set(x, "WorkflowRunProperties", value.asInstanceOf[js.Any])
    
    inline def setWorkflowRunPropertiesUndefined: Self = StObject.set(x, "WorkflowRunProperties", js.undefined)
  }
}
