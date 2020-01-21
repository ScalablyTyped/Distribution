package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInsightRulesInput extends js.Object {
  /**
    * This parameter is not currently used. Reserved for future use. If it is used in the future, the maximum value may be different.
    */
  var MaxResults: js.UndefOr[InsightRuleMaxResults] = js.native
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}

object DescribeInsightRulesInput {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: NextToken = null): DescribeInsightRulesInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInsightRulesInput]
  }
}

