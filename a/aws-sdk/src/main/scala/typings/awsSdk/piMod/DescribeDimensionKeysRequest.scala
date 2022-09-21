package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDimensionKeysRequest extends StObject {
  
  /**
    * Additional metrics for the top N dimension keys. If the specified dimension group in the GroupBy parameter is db.sql_tokenized, you can specify per-SQL metrics to get the values for the top N SQL digests. The response syntax is as follows: "AdditionalMetrics" : { "string" : "string" }. 
    */
  var AdditionalMetrics: js.UndefOr[AdditionalMetricsList] = js.undefined
  
  /**
    * The date and time specifying the end of the requested time series data. The value specified is exclusive, which means that data points less than (but not equal to) EndTime are returned. The value for EndTime must be later than the value for StartTime.
    */
  var EndTime: js.Date
  
  /**
    * One or more filters to apply in the request. Restrictions:   Any number of filters by the same dimension, as specified in the GroupBy or Partition parameters.   A single filter for any other dimension in this dimension group.  
    */
  var Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined
  
  /**
    * A specification for how to aggregate the data points from a query result. You must specify a valid dimension group. Performance Insights returns all dimensions within this group, unless you provide the names of specific dimensions within this group. You can also request that Performance Insights return a limited number of values for a dimension. 
    */
  var GroupBy: DimensionGroup
  
  /**
    * An immutable, Amazon Web Services Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value. For example, specify db-FAIHNTYBKTGAUSUZQYPDS2GW4A. 
    */
  var Identifier: RequestString
  
  /**
    * The maximum number of items to return in the response. If more items exist than the specified MaxRecords value, a pagination token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.piMod.MaxResults] = js.undefined
  
  /**
    * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - A scaled representation of the number of active sessions for the database engine.     db.sampledload.avg - The raw number of active sessions for the database engine.    If the number of active sessions is less than an internal Performance Insights threshold, db.load.avg and db.sampledload.avg are the same value. If the number of active sessions is greater than the internal threshold, Performance Insights samples the active sessions, with db.load.avg showing the scaled values, db.sampledload.avg showing the raw values, and db.sampledload.avg less than db.load.avg. For most use cases, you can query db.load.avg only. 
    */
  var Metric: RequestString
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[typings.awsSdk.piMod.NextToken] = js.undefined
  
  /**
    * For each dimension specified in GroupBy, specify a secondary dimension to further subdivide the partition keys in the response. 
    */
  var PartitionBy: js.UndefOr[DimensionGroup] = js.undefined
  
  /**
    * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as one second, or as long as one day (86400 seconds). Valid values are:     1 (one second)    60 (one minute)    300 (five minutes)    3600 (one hour)    86400 (twenty-four hours)   If you don't specify PeriodInSeconds, then Performance Insights chooses a value for you, with a goal of returning roughly 100-200 data points in the response. 
    */
  var PeriodInSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Web Services service for which Performance Insights will return metrics. Valid values are as follows:    RDS     DOCDB   
    */
  var ServiceType: typings.awsSdk.piMod.ServiceType
  
  /**
    * The date and time specifying the beginning of the requested time series data. You must specify a StartTime within the past 7 days. The value specified is inclusive, which means that data points equal to or greater than StartTime are returned.  The value for StartTime must be earlier than the value for EndTime. 
    */
  var StartTime: js.Date
}
object DescribeDimensionKeysRequest {
  
  inline def apply(
    EndTime: js.Date,
    GroupBy: DimensionGroup,
    Identifier: RequestString,
    Metric: RequestString,
    ServiceType: ServiceType,
    StartTime: js.Date
  ): DescribeDimensionKeysRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDimensionKeysRequest]
  }
  
  extension [Self <: DescribeDimensionKeysRequest](x: Self) {
    
    inline def setAdditionalMetrics(value: AdditionalMetricsList): Self = StObject.set(x, "AdditionalMetrics", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMetricsUndefined: Self = StObject.set(x, "AdditionalMetrics", js.undefined)
    
    inline def setAdditionalMetricsVarargs(value: RequestString*): Self = StObject.set(x, "AdditionalMetrics", js.Array(value*))
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: MetricQueryFilterMap): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setGroupBy(value: DimensionGroup): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: RequestString): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetric(value: RequestString): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPartitionBy(value: DimensionGroup): Self = StObject.set(x, "PartitionBy", value.asInstanceOf[js.Any])
    
    inline def setPartitionByUndefined: Self = StObject.set(x, "PartitionBy", js.undefined)
    
    inline def setPeriodInSeconds(value: Integer): Self = StObject.set(x, "PeriodInSeconds", value.asInstanceOf[js.Any])
    
    inline def setPeriodInSecondsUndefined: Self = StObject.set(x, "PeriodInSeconds", js.undefined)
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
