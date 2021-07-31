package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExecutionHistoryInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the execution.
    */
  var executionArn: Arn
  
  /**
    * You can select whether execution data (input or output of a history event) is returned. The default is true.
    */
  var includeExecutionData: js.UndefOr[IncludeExecutionDataGetExecutionHistory] = js.undefined
  
  /**
    * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
    */
  var maxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Lists events in descending order of their timeStamp.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
}
object GetExecutionHistoryInput {
  
  @scala.inline
  def apply(executionArn: Arn): GetExecutionHistoryInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExecutionHistoryInput]
  }
  
  @scala.inline
  implicit class GetExecutionHistoryInputMutableBuilder[Self <: GetExecutionHistoryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionArn(value: Arn): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeExecutionData(value: IncludeExecutionDataGetExecutionHistory): Self = StObject.set(x, "includeExecutionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeExecutionDataUndefined: Self = StObject.set(x, "includeExecutionData", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PageToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setReverseOrder(value: ReverseOrder): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
  }
}
