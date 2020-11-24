package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkflowExecutionHistoryInput extends js.Object {
  
  /**
    * The name of the domain containing the workflow execution.
    */
  var domain: DomainName = js.native
  
  /**
    * Specifies the workflow execution for which to return the history.
    */
  var execution: WorkflowExecution = js.native
  
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.native
  
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * When set to true, returns the events in reverse order. By default the results are returned in ascending order of the eventTimeStamp of the events.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.native
}
object GetWorkflowExecutionHistoryInput {
  
  @scala.inline
  def apply(domain: DomainName, execution: WorkflowExecution): GetWorkflowExecutionHistoryInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowExecutionHistoryInput]
  }
  
  @scala.inline
  implicit class GetWorkflowExecutionHistoryInputOps[Self <: GetWorkflowExecutionHistoryInput] (val x: Self) extends AnyVal {
    
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
    def setExecution(value: WorkflowExecution): Self = this.set("execution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPageSize(value: PageSize): Self = this.set("maximumPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumPageSize: Self = this.set("maximumPageSize", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setReverseOrder(value: ReverseOrder): Self = this.set("reverseOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseOrder: Self = this.set("reverseOrder", js.undefined)
  }
}
