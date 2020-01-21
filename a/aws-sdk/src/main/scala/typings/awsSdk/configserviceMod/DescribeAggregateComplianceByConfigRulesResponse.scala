package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAggregateComplianceByConfigRulesResponse extends js.Object {
  /**
    * Returns a list of AggregateComplianceByConfigRule object.
    */
  var AggregateComplianceByConfigRules: js.UndefOr[AggregateComplianceByConfigRuleList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object DescribeAggregateComplianceByConfigRulesResponse {
  @scala.inline
  def apply(
    AggregateComplianceByConfigRules: AggregateComplianceByConfigRuleList = null,
    NextToken: NextToken = null
  ): DescribeAggregateComplianceByConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (AggregateComplianceByConfigRules != null) __obj.updateDynamic("AggregateComplianceByConfigRules")(AggregateComplianceByConfigRules.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAggregateComplianceByConfigRulesResponse]
  }
}

