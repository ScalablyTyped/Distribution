package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollForDecisionTaskInput extends StObject {
  
  /**
    * The name of the domain containing the task lists to poll.
    */
  var domain: DomainName
  
  /**
    * Identity of the decider making the request, which is recorded in the DecisionTaskStarted event in the workflow history. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
    */
  var identity: js.UndefOr[Identity] = js.undefined
  
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results.  This is an upper limit only; the actual number of results returned per call may be fewer than the specified maximum.
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.undefined
  
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call.   The nextPageToken returned by this action cannot be used with GetWorkflowExecutionHistory to get the next page. You must call PollForDecisionTask again (with the nextPageToken) to retrieve the next page of history records. Calling PollForDecisionTask with a nextPageToken doesn't return a new decision task. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * When set to true, returns the events in reverse order. By default the results are returned in ascending order of the eventTimestamp of the events.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  
  /**
    * Specifies the task list to poll for decision tasks. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var taskList: TaskList
}
object PollForDecisionTaskInput {
  
  @scala.inline
  def apply(domain: DomainName, taskList: TaskList): PollForDecisionTaskInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForDecisionTaskInput]
  }
  
  @scala.inline
  implicit class PollForDecisionTaskInputMutableBuilder[Self <: PollForDecisionTaskInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    @scala.inline
    def setMaximumPageSize(value: PageSize): Self = StObject.set(x, "maximumPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPageSizeUndefined: Self = StObject.set(x, "maximumPageSize", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setReverseOrder(value: ReverseOrder): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
    
    @scala.inline
    def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
  }
}
