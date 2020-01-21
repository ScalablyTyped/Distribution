package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMetricFiltersResponse extends js.Object {
  /**
    * The metric filters.
    */
  var metricFilters: js.UndefOr[MetricFilters] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeMetricFiltersResponse {
  @scala.inline
  def apply(metricFilters: MetricFilters = null, nextToken: NextToken = null): DescribeMetricFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (metricFilters != null) __obj.updateDynamic("metricFilters")(metricFilters.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMetricFiltersResponse]
  }
}

