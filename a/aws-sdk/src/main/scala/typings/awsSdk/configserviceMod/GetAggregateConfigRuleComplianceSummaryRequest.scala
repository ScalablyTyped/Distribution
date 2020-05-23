package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateConfigRuleComplianceSummaryRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  /**
    * Filters the results based on the ConfigRuleComplianceSummaryFilters object.
    */
  var Filters: js.UndefOr[ConfigRuleComplianceSummaryFilters] = js.native
  /**
    * Groups the result based on ACCOUNT_ID or AWS_REGION.
    */
  var GroupByKey: js.UndefOr[ConfigRuleComplianceSummaryGroupKey] = js.native
  /**
    * The maximum number of evaluation results returned on each page. The default is 1000. You cannot specify a number greater than 1000. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[GroupByAPILimit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object GetAggregateConfigRuleComplianceSummaryRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    Filters: ConfigRuleComplianceSummaryFilters = null,
    GroupByKey: ConfigRuleComplianceSummaryGroupKey = null,
    Limit: js.UndefOr[GroupByAPILimit] = js.undefined,
    NextToken: NextToken = null
  ): GetAggregateConfigRuleComplianceSummaryRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (GroupByKey != null) __obj.updateDynamic("GroupByKey")(GroupByKey.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateConfigRuleComplianceSummaryRequest]
  }
}

