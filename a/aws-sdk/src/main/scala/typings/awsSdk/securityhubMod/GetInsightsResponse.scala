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
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}

object GetInsightsResponse {
  @scala.inline
  def apply(Insights: InsightList, NextToken: NextToken = null): GetInsightsResponse = {
    val __obj = js.Dynamic.literal(Insights = Insights.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightsResponse]
  }
}

