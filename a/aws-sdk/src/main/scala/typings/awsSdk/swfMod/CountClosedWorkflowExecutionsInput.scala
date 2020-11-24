package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountClosedWorkflowExecutionsInput extends js.Object {
  
  /**
    * If specified, only workflow executions that match this close status are counted. This filter has an affect only if executionStatus is specified as CLOSED.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.native
  
  /**
    * If specified, only workflow executions that meet the close time criteria of the filter are counted.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
    */
  var closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.native
  
  /**
    * The name of the domain containing the workflow executions to count.
    */
  var domain: DomainName = js.native
  
  /**
    * If specified, only workflow executions matching the WorkflowId in the filter are counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.native
  
  /**
    * If specified, only workflow executions that meet the start time criteria of the filter are counted.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
    */
  var startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.native
  
  /**
    * If specified, only executions that have a tag that matches the filter are counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.native
  
  /**
    * If specified, indicates the type of the workflow executions to be counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.native
}
object CountClosedWorkflowExecutionsInput {
  
  @scala.inline
  def apply(domain: DomainName): CountClosedWorkflowExecutionsInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountClosedWorkflowExecutionsInput]
  }
  
  @scala.inline
  implicit class CountClosedWorkflowExecutionsInputOps[Self <: CountClosedWorkflowExecutionsInput] (val x: Self) extends AnyVal {
    
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
    def setCloseStatusFilter(value: CloseStatusFilter): Self = this.set("closeStatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseStatusFilter: Self = this.set("closeStatusFilter", js.undefined)
    
    @scala.inline
    def setCloseTimeFilter(value: ExecutionTimeFilter): Self = this.set("closeTimeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseTimeFilter: Self = this.set("closeTimeFilter", js.undefined)
    
    @scala.inline
    def setExecutionFilter(value: WorkflowExecutionFilter): Self = this.set("executionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionFilter: Self = this.set("executionFilter", js.undefined)
    
    @scala.inline
    def setStartTimeFilter(value: ExecutionTimeFilter): Self = this.set("startTimeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeFilter: Self = this.set("startTimeFilter", js.undefined)
    
    @scala.inline
    def setTagFilter(value: TagFilter): Self = this.set("tagFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagFilter: Self = this.set("tagFilter", js.undefined)
    
    @scala.inline
    def setTypeFilter(value: WorkflowTypeFilter): Self = this.set("typeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeFilter: Self = this.set("typeFilter", js.undefined)
  }
}
