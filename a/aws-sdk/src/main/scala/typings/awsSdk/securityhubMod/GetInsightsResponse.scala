package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInsightsResponse extends js.Object {
  /**
    * The insights returned by the operation.
    */
  var Insights: InsightList = js.native
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}

object GetInsightsResponse {
  @scala.inline
  def apply(Insights: InsightList): GetInsightsResponse = {
    val __obj = js.Dynamic.literal(Insights = Insights.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightsResponse]
  }
  @scala.inline
  implicit class GetInsightsResponseOps[Self <: GetInsightsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInsightsVarargs(value: Insight*): Self = this.set("Insights", js.Array(value :_*))
    @scala.inline
    def setInsights(value: InsightList): Self = this.set("Insights", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

