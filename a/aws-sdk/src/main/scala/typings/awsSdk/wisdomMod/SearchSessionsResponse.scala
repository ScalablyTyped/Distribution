package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSessionsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Summary information about the sessions.
    */
  var sessionSummaries: SessionSummaries
}
object SearchSessionsResponse {
  
  inline def apply(sessionSummaries: SessionSummaries): SearchSessionsResponse = {
    val __obj = js.Dynamic.literal(sessionSummaries = sessionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSessionsResponse]
  }
  
  extension [Self <: SearchSessionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSessionSummaries(value: SessionSummaries): Self = StObject.set(x, "sessionSummaries", value.asInstanceOf[js.Any])
    
    inline def setSessionSummariesVarargs(value: SessionSummary*): Self = StObject.set(x, "sessionSummaries", js.Array(value*))
  }
}
