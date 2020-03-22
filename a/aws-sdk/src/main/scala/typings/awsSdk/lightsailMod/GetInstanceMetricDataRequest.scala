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
    * The metric for which you want to return information. Valid instance metric names are listed below, along with the most useful statistics to include in your request, and the published unit value.     CPUUtilization  — The percentage of allocated compute units that are currently in use on the instance. This metric identifies the processing power to run the applications on the instance. Tools in your operating system can show a lower percentage than Lightsail when the instance is not allocated a full processor core.  Statistics: The most useful statistics are Maximum and Average.  Unit: The published unit is Percent.     NetworkIn  — The number of bytes received on all network interfaces by the instance. This metric identifies the volume of incoming network traffic to the instance. The number reported is the number of bytes received during the period. Because this metric is reported in 5-minute intervals, divide the reported number by 300 to find Bytes/second.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Bytes.     NetworkOut  — The number of bytes sent out on all network interfaces by the instance. This metric identifies the volume of outgoing network traffic from the instance. The number reported is the number of bytes sent during the period. Because this metric is reported in 5-minute intervals, divide the reported number by 300 to find Bytes/second.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Bytes.     StatusCheckFailed  — Reports whether the instance passed or failed both the instance status check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds) granularity.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Count.     StatusCheckFailed_Instance  — Reports whether the instance passed or failed the instance status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds) granularity.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Count.     StatusCheckFailed_System  — Reports whether the instance passed or failed the system status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds) granularity.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Count.  
    */
  var metricName: InstanceMetricName = js.native
  /**
    * The granularity, in seconds, of the returned data points. The StatusCheckFailed, StatusCheckFailed_Instance, and StatusCheckFailed_System instance metric data is available in 1-minute (60 seconds) granularity. All other instance metric data is available in 5-minute (300 seconds) granularity.
    */
  var period: MetricPeriod = js.native
  /**
    * The start time of the time period.
    */
  var startTime: timestamp = js.native
  /**
    * The statistic for the metric. The following statistics are available:    Minimum — The lowest value observed during the specified period. Use this value to determine low volumes of activity for your application.    Maximum — The highest value observed during the specified period. Use this value to determine high volumes of activity for your application.    Sum — All values submitted for the matching metric added together. You can use this statistic to determine the total volume of a metric.    Average — The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your resources.    SampleCount — The count, or number, of data points used for the statistical calculation.  
    */
  var statistics: MetricStatisticList = js.native
  /**
    * The unit for the metric data request. Valid units depend on the metric data being required. For the valid units with each available metric, see the metricName parameter.
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

