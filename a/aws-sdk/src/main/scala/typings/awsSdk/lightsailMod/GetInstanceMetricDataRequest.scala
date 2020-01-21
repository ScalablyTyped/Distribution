package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceMetricDataRequest extends js.Object {
  /**
    * The end time of the time period.
    */
  var endTime: timestamp = js.native
  /**
    * The name of the instance for which you want to get metrics data.
    */
  var instanceName: ResourceName = js.native
  /**
    * The metric name to get data about. 
    */
  var metricName: InstanceMetricName = js.native
  /**
    * The granularity, in seconds, of the returned data points.
    */
  var period: MetricPeriod = js.native
  /**
    * The start time of the time period.
    */
  var startTime: timestamp = js.native
  /**
    * The instance statistics. 
    */
  var statistics: MetricStatisticList = js.native
  /**
    * The unit. The list of valid values is below.
    */
  var unit: MetricUnit = js.native
}

object GetInstanceMetricDataRequest {
  @scala.inline
  def apply(
    endTime: timestamp,
    instanceName: ResourceName,
    metricName: InstanceMetricName,
    period: MetricPeriod,
    startTime: timestamp,
    statistics: MetricStatisticList,
    unit: MetricUnit
  ): GetInstanceMetricDataRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], instanceName = instanceName.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstanceMetricDataRequest]
  }
}

