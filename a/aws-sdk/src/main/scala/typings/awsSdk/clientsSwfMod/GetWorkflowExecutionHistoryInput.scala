package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowExecutionHistoryInput extends StObject {
  
  /**
    * The name of the domain containing the workflow execution.
    */
  var domain: DomainName
  
  /**
    * Specifies the workflow execution for which to return the history.
    */
  var execution: WorkflowExecution
  
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.undefined
  
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * When set to true, returns the events in reverse order. By default the results are returned in ascending order of the eventTimeStamp of the events.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
}
object GetWorkflowExecutionHistoryInput {
  
  inline def apply(domain: DomainName, execution: WorkflowExecution): GetWorkflowExecutionHistoryInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowExecutionHistoryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkflowExecutionHistoryInput] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setExecution(value: WorkflowExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setMaximumPageSize(value: PageSize): Self = StObject.set(x, "maximumPageSize", value.asInstanceOf[js.Any])
    
    inline def setMaximumPageSizeUndefined: Self = StObject.set(x, "maximumPageSize", js.undefined)
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReverseOrder(value: ReverseOrder): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
  }
}
