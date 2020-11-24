package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountOpenWorkflowExecutionsInput extends js.Object {
  
  /**
    * The name of the domain containing the workflow executions to count.
    */
  var domain: DomainName = js.native
  
  /**
    * If specified, only workflow executions matching the WorkflowId in the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.native
  
  /**
    * Specifies the start time criteria that workflow executions must meet in order to be counted.
    */
  var startTimeFilter: ExecutionTimeFilter = js.native
  
  /**
    * If specified, only executions that have a tag that matches the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.native
  
  /**
    * Specifies the type of the workflow executions to be counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.native
}
object CountOpenWorkflowExecutionsInput {
  
  @scala.inline
  def apply(domain: DomainName, startTimeFilter: ExecutionTimeFilter): CountOpenWorkflowExecutionsInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], startTimeFilter = startTimeFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountOpenWorkflowExecutionsInput]
  }
  
  @scala.inline
  implicit class CountOpenWorkflowExecutionsInputOps[Self <: CountOpenWorkflowExecutionsInput] (val x: Self) extends AnyVal {
    
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
    def setStartTimeFilter(value: ExecutionTimeFilter): Self = this.set("startTimeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionFilter(value: WorkflowExecutionFilter): Self = this.set("executionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionFilter: Self = this.set("executionFilter", js.undefined)
    
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
