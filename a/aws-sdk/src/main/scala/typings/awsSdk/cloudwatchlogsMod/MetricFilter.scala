package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricFilter extends js.Object {
  /**
    * The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the metric filter.
    */
  var filterName: js.UndefOr[FilterName] = js.native
  var filterPattern: js.UndefOr[FilterPattern] = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  /**
    * The metric transformations.
    */
  var metricTransformations: js.UndefOr[MetricTransformations] = js.native
}

object MetricFilter {
  @scala.inline
  def apply(
    creationTime: js.UndefOr[Timestamp] = js.undefined,
    filterName: FilterName = null,
    filterPattern: FilterPattern = null,
    logGroupName: LogGroupName = null,
    metricTransformations: MetricTransformations = null
  ): MetricFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(creationTime)) __obj.updateDynamic("creationTime")(creationTime.get.asInstanceOf[js.Any])
    if (filterName != null) __obj.updateDynamic("filterName")(filterName.asInstanceOf[js.Any])
    if (filterPattern != null) __obj.updateDynamic("filterPattern")(filterPattern.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (metricTransformations != null) __obj.updateDynamic("metricTransformations")(metricTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricFilter]
  }
}

