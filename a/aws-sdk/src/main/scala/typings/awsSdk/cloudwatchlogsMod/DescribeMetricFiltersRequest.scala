package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMetricFiltersRequest extends js.Object {
  /**
    * The prefix to match.
    */
  var filterNamePrefix: js.UndefOr[FilterName] = js.native
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  /**
    * Filters results to include only those with the specified metric name. If you include this parameter in your request, you must also include the metricNamespace parameter.
    */
  var metricName: js.UndefOr[MetricName] = js.native
  /**
    * Filters results to include only those in the specified namespace. If you include this parameter in your request, you must also include the metricName parameter.
    */
  var metricNamespace: js.UndefOr[MetricNamespace] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeMetricFiltersRequest {
  @scala.inline
  def apply(
    filterNamePrefix: FilterName = null,
    limit: Int | Double = null,
    logGroupName: LogGroupName = null,
    metricName: MetricName = null,
    metricNamespace: MetricNamespace = null,
    nextToken: NextToken = null
  ): DescribeMetricFiltersRequest = {
    val __obj = js.Dynamic.literal()
    if (filterNamePrefix != null) __obj.updateDynamic("filterNamePrefix")(filterNamePrefix.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (metricNamespace != null) __obj.updateDynamic("metricNamespace")(metricNamespace.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMetricFiltersRequest]
  }
}

