package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansCoverageRequest extends js.Object {
  /**
    * Filters Savings Plans coverage data by dimensions. You can filter data for Savings Plans usage with the following dimensions:    LINKED_ACCOUNT     REGION     SERVICE     INSTANCE_FAMILY     GetSavingsPlansCoverage uses the same Expression object as the other operations, but only AND is supported among each dimension. If there are multiple values for a dimension, they are OR'd together.
    */
  var Filter: js.UndefOr[Expression] = js.native
  /**
    * The granularity of the Amazon Web Services cost data for your Savings Plans. Granularity can't be set if GroupBy is set. The GetSavingsPlansCoverage operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: js.UndefOr[typings.awsSdk.costexplorerMod.Granularity] = js.native
  /**
    * You can group the data using the attributes INSTANCE_FAMILY, REGION, or SERVICE.
    */
  var GroupBy: js.UndefOr[GroupDefinitions] = js.native
  /**
    * The number of items to be returned in a response. The default is 20, with a minimum value of 1.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.costexplorerMod.MaxResults] = js.native
  /**
    * The measurement that you want your Savings Plans coverage reported in. The only valid value is SpendCoveredBySavingsPlans.
    */
  var Metrics: js.UndefOr[MetricNames] = js.native
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
  /**
    * The time period that you want the usage and costs for. The Start date must be within 13 months. The End date must be after the Start date, and before the current date. Future dates can't be used as an End date.
    */
  var TimePeriod: DateInterval = js.native
}

object GetSavingsPlansCoverageRequest {
  @scala.inline
  def apply(
    TimePeriod: DateInterval,
    Filter: Expression = null,
    Granularity: Granularity = null,
    GroupBy: GroupDefinitions = null,
    MaxResults: Int | Double = null,
    Metrics: MetricNames = null,
    NextToken: NextPageToken = null
  ): GetSavingsPlansCoverageRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (Granularity != null) __obj.updateDynamic("Granularity")(Granularity.asInstanceOf[js.Any])
    if (GroupBy != null) __obj.updateDynamic("GroupBy")(GroupBy.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansCoverageRequest]
  }
}

