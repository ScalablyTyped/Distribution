package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScheduledQueriesRequest extends StObject {
  
  /**
    * The maximum number of items to return in the output. If the total number of items available is more than the value specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as the argument to the subsequent call to ListScheduledQueriesRequest.
    */
  var MaxResults: js.UndefOr[MaxScheduledQueriesResults] = js.undefined
  
  /**
    *  A pagination token to resume pagination.
    */
  var NextToken: js.UndefOr[NextScheduledQueriesResultsToken] = js.undefined
}
object ListScheduledQueriesRequest {
  
  inline def apply(): ListScheduledQueriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScheduledQueriesRequest]
  }
  
  extension [Self <: ListScheduledQueriesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxScheduledQueriesResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextScheduledQueriesResultsToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
