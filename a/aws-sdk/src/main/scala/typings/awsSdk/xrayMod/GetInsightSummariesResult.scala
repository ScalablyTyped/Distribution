package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightSummariesResult extends StObject {
  
  /**
    * The summary of each insight within the group matching the provided filters. The summary contains the InsightID, start and end time, the root cause service, the root cause and client impact statistics, the top anomalous services, and the status of the insight.
    */
  var InsightSummaries: js.UndefOr[InsightSummaryList] = js.native
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetInsightSummariesResult {
  
  @scala.inline
  def apply(): GetInsightSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightSummariesResult]
  }
  
  @scala.inline
  implicit class GetInsightSummariesResultMutableBuilder[Self <: GetInsightSummariesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightSummaries(value: InsightSummaryList): Self = StObject.set(x, "InsightSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightSummariesUndefined: Self = StObject.set(x, "InsightSummaries", js.undefined)
    
    @scala.inline
    def setInsightSummariesVarargs(value: InsightSummary*): Self = StObject.set(x, "InsightSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
