package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightSummariesResult extends StObject {
  
  /**
    * The summary of each insight within the group matching the provided filters. The summary contains the InsightID, start and end time, the root cause service, the root cause and client impact statistics, the top anomalous services, and the status of the insight.
    */
  var InsightSummaries: js.UndefOr[InsightSummaryList] = js.undefined
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetInsightSummariesResult {
  
  inline def apply(): GetInsightSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightSummariesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInsightSummariesResult] (val x: Self) extends AnyVal {
    
    inline def setInsightSummaries(value: InsightSummaryList): Self = StObject.set(x, "InsightSummaries", value.asInstanceOf[js.Any])
    
    inline def setInsightSummariesUndefined: Self = StObject.set(x, "InsightSummaries", js.undefined)
    
    inline def setInsightSummariesVarargs(value: InsightSummary*): Self = StObject.set(x, "InsightSummaries", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
