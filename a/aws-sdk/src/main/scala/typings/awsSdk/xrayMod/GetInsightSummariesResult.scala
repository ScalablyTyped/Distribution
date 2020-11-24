package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightSummariesResult extends js.Object {
  
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
  implicit class GetInsightSummariesResultOps[Self <: GetInsightSummariesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsightSummariesVarargs(value: InsightSummary*): Self = this.set("InsightSummaries", js.Array(value :_*))
    
    @scala.inline
    def setInsightSummaries(value: InsightSummaryList): Self = this.set("InsightSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsightSummaries: Self = this.set("InsightSummaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
