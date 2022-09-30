package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceMetricDataRequest extends StObject {
  
  /**
    * The end time of the time period.
    */
  var endTime: js.Date
  
  /**
    * The name of the instance for which you want to get metrics data.
    */
  var instanceName: ResourceName
  
  /**
    * The metric for which you want to return information. Valid instance metric names are listed below, along with the most useful statistics to include in your request, and the published unit value.     BurstCapacityPercentage  - The percentage of CPU performance available for your instance to burst above its baseline. Your instance continuously accrues and consumes burst capacity. Burst capacity stops accruing when your instance's BurstCapacityPercentage reaches 100%. For more information, see Viewing instance burst capacity in Amazon Lightsail.  Statistics: The most useful statistics are Maximum and Average.  Unit: The published unit is Percent.     BurstCapacityTime  - The available amount of time for your instance to burst at 100% CPU utilization. Your instance continuously accrues and consumes burst capacity. Burst capacity time stops accruing when your instance's BurstCapacityPercentage metric reaches 100%. Burst capacity time is consumed at the full rate only when your instance operates at 100% CPU utilization. For example, if your instance operates at 50% CPU utilization in the burstable zone for a 5-minute period, then it consumes CPU burst capacity minutes at a 50% rate in that period. Your instance consumed 2 minutes and 30 seconds of CPU burst capacity minutes in the 5-minute period. For more information, see Viewing instance burst capacity in Amazon Lightsail.  Statistics: The most useful statistics are Maximum and Average.  Unit: The published unit is Seconds.     CPUUtilization  - The percentage of allocated compute units that are currently in use on the instance. This metric identifies the processing power to run the applications on the instance. Tools in your operating system can show a lower percentage than Lightsail when the instance is not allocated a full processor core.  Statistics: The most useful statistics are Maximum and Average.  Unit: The published unit is Percent.     NetworkIn  - The number of bytes received on all network interfaces by the instance. This metric identifies the volume of incoming network traffic to the instance. The number reported is the number of bytes received during the period. Because this metric is reported in 5-minute intervals, divide the reported number by 300 to find Bytes/second.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Bytes.     NetworkOut  - The number of bytes sent out on all network interfaces by the instance. This metric identifies the volume of outgoing network traffic from the instance. The number reported is the number of bytes sent during the period. Because this metric is reported in 5-minute intervals, divide the reported number by 300 to find Bytes/second.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Bytes.     StatusCheckFailed  - Reports whether the instance passed or failed both the instance status check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds) granularity.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Count.     StatusCheckFailed_Instance  - Reports whether the instance passed or failed the instance status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds) granularity.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Count.     StatusCheckFailed_System  - Reports whether the instance passed or failed the system status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds) granularity.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Count.     MetadataNoToken  - Reports the number of times that the instance metadata service was successfully accessed without a token. This metric determines if there are any processes accessing instance metadata by using Instance Metadata Service Version 1, which doesn't use a token. If all requests use token-backed sessions, such as Instance Metadata Service Version 2, then the value is 0.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Count.  
    */
  var metricName: InstanceMetricName
  
  /**
    * The granularity, in seconds, of the returned data points. The StatusCheckFailed, StatusCheckFailed_Instance, and StatusCheckFailed_System instance metric data is available in 1-minute (60 seconds) granularity. All other instance metric data is available in 5-minute (300 seconds) granularity.
    */
  var period: MetricPeriod
  
  /**
    * The start time of the time period.
    */
  var startTime: js.Date
  
  /**
    * The statistic for the metric. The following statistics are available:    Minimum - The lowest value observed during the specified period. Use this value to determine low volumes of activity for your application.    Maximum - The highest value observed during the specified period. Use this value to determine high volumes of activity for your application.    Sum - All values submitted for the matching metric added together. You can use this statistic to determine the total volume of a metric.    Average - The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your resources.    SampleCount - The count, or number, of data points used for the statistical calculation.  
    */
  var statistics: MetricStatisticList
  
  /**
    * The unit for the metric data request. Valid units depend on the metric data being requested. For the valid units to specify with each available metric, see the metricName parameter.
    */
  var unit: MetricUnit
}
object GetInstanceMetricDataRequest {
  
  inline def apply(
    endTime: js.Date,
    instanceName: ResourceName,
    metricName: InstanceMetricName,
    period: MetricPeriod,
    startTime: js.Date,
    statistics: MetricStatisticList,
    unit: MetricUnit
  ): GetInstanceMetricDataRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], instanceName = instanceName.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceMetricDataRequest]
  }
  
  extension [Self <: GetInstanceMetricDataRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: InstanceMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: MetricPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: MetricStatisticList): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsVarargs(value: MetricStatistic*): Self = StObject.set(x, "statistics", js.Array(value*))
    
    inline def setUnit(value: MetricUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
