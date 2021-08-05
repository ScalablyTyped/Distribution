package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceMetricsRequest extends StObject {
  
  /**
    * The date and time specifiying the end of the requested time series data. The value specified is exclusive - data points less than (but not equal to) EndTime will be returned. The value for EndTime must be later than the value for StartTime.
    */
  var EndTime: ISOTimestamp
  
  /**
    * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
    */
  var Identifier: String
  
  /**
    * The maximum number of items to return in the response. If more items exist than the specified MaxRecords value, a pagination token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.piMod.MaxResults] = js.undefined
  
  /**
    * An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can optionally specify aggregation and filtering criteria.
    */
  var MetricQueries: MetricQueryList
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as one second, or as long as one day (86400 seconds). Valid values are:    1 (one second)    60 (one minute)    300 (five minutes)    3600 (one hour)    86400 (twenty-four hours)   If you don't specify PeriodInSeconds, then Performance Insights will choose a value for you, with a goal of returning roughly 100-200 data points in the response.
    */
  var PeriodInSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The AWS service for which Performance Insights will return metrics. The only valid value for ServiceType is: RDS 
    */
  var ServiceType: typings.awsSdk.piMod.ServiceType
  
  /**
    * The date and time specifying the beginning of the requested time series data. You can't specify a StartTime that's earlier than 7 days ago. The value specified is inclusive - data points equal to or greater than StartTime will be returned. The value for StartTime must be earlier than the value for EndTime.
    */
  var StartTime: ISOTimestamp
}
object GetResourceMetricsRequest {
  
  inline def apply(
    EndTime: ISOTimestamp,
    Identifier: String,
    MetricQueries: MetricQueryList,
    ServiceType: ServiceType,
    StartTime: ISOTimestamp
  ): GetResourceMetricsRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], MetricQueries = MetricQueries.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceMetricsRequest]
  }
  
  extension [Self <: GetResourceMetricsRequest](x: Self) {
    
    inline def setEndTime(value: ISOTimestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetricQueries(value: MetricQueryList): Self = StObject.set(x, "MetricQueries", value.asInstanceOf[js.Any])
    
    inline def setMetricQueriesVarargs(value: MetricQuery*): Self = StObject.set(x, "MetricQueries", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPeriodInSeconds(value: Integer): Self = StObject.set(x, "PeriodInSeconds", value.asInstanceOf[js.Any])
    
    inline def setPeriodInSecondsUndefined: Self = StObject.set(x, "PeriodInSeconds", js.undefined)
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: ISOTimestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
