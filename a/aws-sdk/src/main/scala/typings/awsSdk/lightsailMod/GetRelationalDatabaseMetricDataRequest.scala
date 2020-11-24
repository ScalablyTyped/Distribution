package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseMetricDataRequest extends js.Object {
  
  /**
    * The end of the time interval from which to get metric data. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the end time.  
    */
  var endTime: IsoDate = js.native
  
  /**
    * The metric for which you want to return information. Valid relational database metric names are listed below, along with the most useful statistics to include in your request, and the published unit value. All relational database metric data is available in 1-minute (60 seconds) granularity.     CPUUtilization  - The percentage of CPU utilization currently in use on the database.  Statistics: The most useful statistics are Maximum and Average.  Unit: The published unit is Percent.     DatabaseConnections  - The number of database connections in use.  Statistics: The most useful statistics are Maximum and Sum.  Unit: The published unit is Count.     DiskQueueDepth  - The number of outstanding IOs (read/write requests) that are waiting to access the disk.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Count.     FreeStorageSpace  - The amount of available storage space.  Statistics: The most useful statistic is Sum.  Unit: The published unit is Bytes.     NetworkReceiveThroughput  - The incoming (Receive) network traffic on the database, including both customer database traffic and AWS traffic used for monitoring and replication.  Statistics: The most useful statistic is Average.  Unit: The published unit is Bytes/Second.     NetworkTransmitThroughput  - The outgoing (Transmit) network traffic on the database, including both customer database traffic and AWS traffic used for monitoring and replication.  Statistics: The most useful statistic is Average.  Unit: The published unit is Bytes/Second.  
    */
  var metricName: RelationalDatabaseMetricName = js.native
  
  /**
    * The granularity, in seconds, of the returned data points. All relational database metric data is available in 1-minute (60 seconds) granularity.
    */
  var period: MetricPeriod = js.native
  
  /**
    * The name of your database from which to get metric data.
    */
  var relationalDatabaseName: ResourceName = js.native
  
  /**
    * The start of the time interval from which to get metric data. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the start time.  
    */
  var startTime: IsoDate = js.native
  
  /**
    * The statistic for the metric. The following statistics are available:    Minimum - The lowest value observed during the specified period. Use this value to determine low volumes of activity for your application.    Maximum - The highest value observed during the specified period. Use this value to determine high volumes of activity for your application.    Sum - All values submitted for the matching metric added together. You can use this statistic to determine the total volume of a metric.    Average - The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your resources.    SampleCount - The count, or number, of data points used for the statistical calculation.  
    */
  var statistics: MetricStatisticList = js.native
  
  /**
    * The unit for the metric data request. Valid units depend on the metric data being requested. For the valid units with each available metric, see the metricName parameter.
    */
  var unit: MetricUnit = js.native
}
object GetRelationalDatabaseMetricDataRequest {
  
  @scala.inline
  def apply(
    endTime: IsoDate,
    metricName: RelationalDatabaseMetricName,
    period: MetricPeriod,
    relationalDatabaseName: ResourceName,
    startTime: IsoDate,
    statistics: MetricStatisticList,
    unit: MetricUnit
  ): GetRelationalDatabaseMetricDataRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseMetricDataRequest]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseMetricDataRequestOps[Self <: GetRelationalDatabaseMetricDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTime(value: IsoDate): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: RelationalDatabaseMetricName): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: MetricPeriod): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseName(value: ResourceName): Self = this.set("relationalDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: IsoDate): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsVarargs(value: MetricStatistic*): Self = this.set("statistics", js.Array(value :_*))
    
    @scala.inline
    def setStatistics(value: MetricStatisticList): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: MetricUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
}
