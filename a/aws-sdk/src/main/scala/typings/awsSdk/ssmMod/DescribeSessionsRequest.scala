package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSessionsRequest extends StObject {
  
  /**
    * One or more filters to limit the type of sessions returned by the request.
    */
  var Filters: js.UndefOr[SessionFilterList] = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[SessionMaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * The session status to retrieve a list of sessions for. For example, "Active".
    */
  var State: SessionState = js.native
}
object DescribeSessionsRequest {
  
  @scala.inline
  def apply(State: SessionState): DescribeSessionsRequest = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSessionsRequest]
  }
  
  @scala.inline
  implicit class DescribeSessionsRequestMutableBuilder[Self <: DescribeSessionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: SessionFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: SessionFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: SessionMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setState(value: SessionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
