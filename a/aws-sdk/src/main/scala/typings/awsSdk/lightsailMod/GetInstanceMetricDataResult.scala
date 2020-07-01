package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceMetricDataResult extends js.Object {
  /**
    * An array of objects that describe the metric data returned.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.native
  /**
    * The name of the metric returned.
    */
  var metricName: js.UndefOr[InstanceMetricName] = js.native
}

object GetInstanceMetricDataResult {
  @scala.inline
  def apply(metricData: MetricDatapointList = null, metricName: InstanceMetricName = null): GetInstanceMetricDataResult = {
    val __obj = js.Dynamic.literal()
    if (metricData != null) __obj.updateDynamic("metricData")(metricData.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceMetricDataResult]
  }
}

