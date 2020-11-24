package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetWorkflowsResponse extends js.Object {
  
  /**
    * A list of names of workflows not found.
    */
  var MissingWorkflows: js.UndefOr[WorkflowNames] = js.native
  
  /**
    * A list of workflow resource metadata.
    */
  var Workflows: js.UndefOr[typings.awsSdk.glueMod.Workflows] = js.native
}
object BatchGetWorkflowsResponse {
  
  @scala.inline
  def apply(): BatchGetWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetWorkflowsResponse]
  }
  
  @scala.inline
  implicit class BatchGetWorkflowsResponseOps[Self <: BatchGetWorkflowsResponse] (val x: Self) extends AnyVal {
    
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
    def setMissingWorkflowsVarargs(value: NameString*): Self = this.set("MissingWorkflows", js.Array(value :_*))
    
    @scala.inline
    def setMissingWorkflows(value: WorkflowNames): Self = this.set("MissingWorkflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingWorkflows: Self = this.set("MissingWorkflows", js.undefined)
    
    @scala.inline
    def setWorkflowsVarargs(value: Workflow*): Self = this.set("Workflows", js.Array(value :_*))
    
    @scala.inline
    def setWorkflows(value: Workflows): Self = this.set("Workflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflows: Self = this.set("Workflows", js.undefined)
  }
}
