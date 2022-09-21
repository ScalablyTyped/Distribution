package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppsResponse extends StObject {
  
  /**
    * Summaries for the Resilience Hub application.
    */
  var appSummaries: AppSummaryList
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAppsResponse {
  
  inline def apply(appSummaries: AppSummaryList): ListAppsResponse = {
    val __obj = js.Dynamic.literal(appSummaries = appSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppsResponse]
  }
  
  extension [Self <: ListAppsResponse](x: Self) {
    
    inline def setAppSummaries(value: AppSummaryList): Self = StObject.set(x, "appSummaries", value.asInstanceOf[js.Any])
    
    inline def setAppSummariesVarargs(value: AppSummary*): Self = StObject.set(x, "appSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
