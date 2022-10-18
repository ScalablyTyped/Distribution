package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScheduledQueriesResponse extends StObject {
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var NextToken: js.UndefOr[NextScheduledQueriesResultsToken] = js.undefined
  
  /**
    * A list of scheduled queries.
    */
  var ScheduledQueries: ScheduledQueryList
}
object ListScheduledQueriesResponse {
  
  inline def apply(ScheduledQueries: ScheduledQueryList): ListScheduledQueriesResponse = {
    val __obj = js.Dynamic.literal(ScheduledQueries = ScheduledQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListScheduledQueriesResponse]
  }
  
  extension [Self <: ListScheduledQueriesResponse](x: Self) {
    
    inline def setNextToken(value: NextScheduledQueriesResultsToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScheduledQueries(value: ScheduledQueryList): Self = StObject.set(x, "ScheduledQueries", value.asInstanceOf[js.Any])
    
    inline def setScheduledQueriesVarargs(value: ScheduledQuery*): Self = StObject.set(x, "ScheduledQueries", js.Array(value*))
  }
}
