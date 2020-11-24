package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowRun extends js.Object {
  
  /**
    * The date and time when the workflow run completed.
    */
  var CompletedOn: js.UndefOr[TimestampValue] = js.native
  
  /**
    * This error message describes any error that may have occurred in starting the workflow run. Currently the only error message is "Concurrent runs exceeded for workflow: foo."
    */
  var ErrorMessage: js.UndefOr[ErrorString] = js.native
  
  /**
    * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections between them as edges.
    */
  var Graph: js.UndefOr[WorkflowGraph] = js.native
  
  /**
    * Name of the workflow that was executed.
    */
  var Name: js.UndefOr[NameString] = js.native
  
  /**
    * The ID of the previous workflow run.
    */
  var PreviousRunId: js.UndefOr[IdString] = js.native
  
  /**
    * The date and time when the workflow run was started.
    */
  var StartedOn: js.UndefOr[TimestampValue] = js.native
  
  /**
    * The statistics of the run.
    */
  var Statistics: js.UndefOr[WorkflowRunStatistics] = js.native
  
  /**
    * The status of the workflow run.
    */
  var Status: js.UndefOr[WorkflowRunStatus] = js.native
  
  /**
    * The ID of this workflow run.
    */
  var WorkflowRunId: js.UndefOr[IdString] = js.native
  
  /**
    * The workflow run properties which were set during the run.
    */
  var WorkflowRunProperties: js.UndefOr[typings.awsSdk.glueMod.WorkflowRunProperties] = js.native
}
object WorkflowRun {
  
  @scala.inline
  def apply(): WorkflowRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowRun]
  }
  
  @scala.inline
  implicit class WorkflowRunOps[Self <: WorkflowRun] (val x: Self) extends AnyVal {
    
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
    def setCompletedOn(value: TimestampValue): Self = this.set("CompletedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedOn: Self = this.set("CompletedOn", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorString): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setGraph(value: WorkflowGraph): Self = this.set("Graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraph: Self = this.set("Graph", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPreviousRunId(value: IdString): Self = this.set("PreviousRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousRunId: Self = this.set("PreviousRunId", js.undefined)
    
    @scala.inline
    def setStartedOn(value: TimestampValue): Self = this.set("StartedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartedOn: Self = this.set("StartedOn", js.undefined)
    
    @scala.inline
    def setStatistics(value: WorkflowRunStatistics): Self = this.set("Statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistics: Self = this.set("Statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: WorkflowRunStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setWorkflowRunId(value: IdString): Self = this.set("WorkflowRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflowRunId: Self = this.set("WorkflowRunId", js.undefined)
    
    @scala.inline
    def setWorkflowRunProperties(value: WorkflowRunProperties): Self = this.set("WorkflowRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflowRunProperties: Self = this.set("WorkflowRunProperties", js.undefined)
  }
}
