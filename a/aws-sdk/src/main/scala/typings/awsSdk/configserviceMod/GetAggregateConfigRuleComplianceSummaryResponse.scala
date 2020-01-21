package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateConfigRuleComplianceSummaryResponse extends js.Object {
  /**
    * Returns a list of AggregateComplianceCounts object.
    */
  var AggregateComplianceCounts: js.UndefOr[AggregateComplianceCountList] = js.native
  /**
    * Groups the result based on ACCOUNT_ID or AWS_REGION.
    */
  var GroupByKey: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object GetAggregateConfigRuleComplianceSummaryResponse {
  @scala.inline
  def apply(
    AggregateComplianceCounts: AggregateComplianceCountList = null,
    GroupByKey: StringWithCharLimit256 = null,
    NextToken: NextToken = null
  ): GetAggregateConfigRuleComplianceSummaryResponse = {
    val __obj = js.Dynamic.literal()
    if (AggregateComplianceCounts != null) __obj.updateDynamic("AggregateComplianceCounts")(AggregateComplianceCounts.asInstanceOf[js.Any])
    if (GroupByKey != null) __obj.updateDynamic("GroupByKey")(GroupByKey.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateConfigRuleComplianceSummaryResponse]
  }
}

