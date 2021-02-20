package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListExecutionsInput extends StObject {
  
  /**
    * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[ListExecutionsPageToken] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the state machine whose executions is listed.
    */
  var stateMachineArn: Arn = js.native
  
  /**
    * If specified, only list the executions whose current execution status matches the given filter.
    */
  var statusFilter: js.UndefOr[ExecutionStatus] = js.native
}
object ListExecutionsInput {
  
  @scala.inline
  def apply(stateMachineArn: Arn): ListExecutionsInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExecutionsInput]
  }
  
  @scala.inline
  implicit class ListExecutionsInputMutableBuilder[Self <: ListExecutionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: ListExecutionsPageToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusFilter(value: ExecutionStatus): Self = StObject.set(x, "statusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusFilterUndefined: Self = StObject.set(x, "statusFilter", js.undefined)
  }
}
