package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionMetricDataRequest extends js.Object {
  
  /**
    * The name of the distribution for which to get metric data. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: ResourceName = js.native
  
  /**
    * The end of the time interval for which to get metric data. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify 1538427600 as the end time.   You can convert a human-friendly time to Unix time format using a converter like Epoch converter.
    */
  var endTime: timestamp = js.native
  
  /**
    * The metric for which you want to return information. Valid distribution metric names are listed below, along with the most useful statistics to include in your request, and the published unit value.     Requests  - The total number of viewer requests received by your Lightsail distribution, for all HTTP methods, and for both HTTP and HTTPS requests.  Statistics: The most useful statistic is Sum.  Unit: The published unit is None.     BytesDownloaded  - The number of bytes downloaded by viewers for GET, HEAD, and OPTIONS requests.  Statistics: The most useful statistic is Sum.  Unit: The published unit is None.     BytesUploaded   - The number of bytes uploaded to your origin by your Lightsail distribution, using POST and PUT requests.  Statistics: The most useful statistic is Sum.  Unit: The published unit is None.     TotalErrorRate  - The percentage of all viewer requests for which the response's HTTP status code was 4xx or 5xx.  Statistics: The most useful statistic is Average.  Unit: The published unit is Percent.     4xxErrorRate  - The percentage of all viewer requests for which the response's HTTP status cod was 4xx. In these cases, the client or client viewer may have made an error. For example, a status code of 404 (Not Found) means that the client requested an object that could not be found.  Statistics: The most useful statistic is Average.  Unit: The published unit is Percent.     5xxErrorRate  - The percentage of all viewer requests for which the response's HTTP status code was 5xx. In these cases, the origin server did not satisfy the requests. For example, a status code of 503 (Service Unavailable) means that the origin server is currently unavailable.  Statistics: The most useful statistic is Average.  Unit: The published unit is Percent.  
    */
  var metricName: DistributionMetricName = js.native
  
  /**
    * The granularity, in seconds, for the metric data points that will be returned.
    */
  var period: MetricPeriod = js.native
  
  /**
    * The start of the time interval for which to get metric data. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify 1538424000 as the start time.   You can convert a human-friendly time to Unix time format using a converter like Epoch converter.
    */
  var startTime: timestamp = js.native
  
  /**
    * The statistic for the metric. The following statistics are available:    Minimum - The lowest value observed during the specified period. Use this value to determine low volumes of activity for your application.    Maximum - The highest value observed during the specified period. Use this value to determine high volumes of activity for your application.    Sum - All values submitted for the matching metric added together. You can use this statistic to determine the total volume of a metric.    Average - The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your resources.    SampleCount - The count, or number, of data points used for the statistical calculation.  
    */
  var statistics: MetricStatisticList = js.native
  
  /**
    * The unit for the metric data request. Valid units depend on the metric data being requested. For the valid units with each available metric, see the metricName parameter.
    */
  var unit: MetricUnit = js.native
}
object GetDistributionMetricDataRequest {
  
  @scala.inline
  def apply(
    distributionName: ResourceName,
    endTime: timestamp,
    metricName: DistributionMetricName,
    period: MetricPeriod,
    startTime: timestamp,
    statistics: MetricStatisticList,
    unit: MetricUnit
  ): GetDistributionMetricDataRequest = {
    val __obj = js.Dynamic.literal(distributionName = distributionName.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDistributionMetricDataRequest]
  }
  
  @scala.inline
  implicit class GetDistributionMetricDataRequestOps[Self <: GetDistributionMetricDataRequest] (val x: Self) extends AnyVal {
    
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
    def setDistributionName(value: ResourceName): Self = this.set("distributionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: DistributionMetricName): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: MetricPeriod): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsVarargs(value: MetricStatistic*): Self = this.set("statistics", js.Array(value :_*))
    
    @scala.inline
    def setStatistics(value: MetricStatisticList): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: MetricUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
}
