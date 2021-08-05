package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDimensionKeysRequest extends StObject {
  
  /**
    * The date and time specifying the end of the requested time series data. The value specified is exclusive - data points less than (but not equal to) EndTime will be returned. The value for EndTime must be later than the value for StartTime.
    */
  var EndTime: ISOTimestamp
  
  /**
    * One or more filters to apply in the request. Restrictions:   Any number of filters by the same dimension, as specified in the GroupBy or Partition parameters.   A single filter for any other dimension in this dimension group.  
    */
  var Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined
  
  /**
    * A specification for how to aggregate the data points from a query result. You must specify a valid dimension group. Performance Insights will return all of the dimensions within that group, unless you provide the names of specific dimensions within that group. You can also request that Performance Insights return a limited number of values for a dimension.
    */
  var GroupBy: DimensionGroup
  
  /**
    * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
    */
  var Identifier: String
  
  /**
    * The maximum number of items to return in the response. If more items exist than the specified MaxRecords value, a pagination token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.piMod.MaxResults] = js.undefined
  
  /**
    * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
    */
  var Metric: String
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * For each dimension specified in GroupBy, specify a secondary dimension to further subdivide the partition keys in the response.
    */
  var PartitionBy: js.UndefOr[DimensionGroup] = js.undefined
  
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
object DescribeDimensionKeysRequest {
  
  inline def apply(
    EndTime: ISOTimestamp,
    GroupBy: DimensionGroup,
    Identifier: String,
    Metric: String,
    ServiceType: ServiceType,
    StartTime: ISOTimestamp
  ): DescribeDimensionKeysRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDimensionKeysRequest]
  }
  
  extension [Self <: DescribeDimensionKeysRequest](x: Self) {
    
    inline def setEndTime(value: ISOTimestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: MetricQueryFilterMap): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setGroupBy(value: DimensionGroup): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPartitionBy(value: DimensionGroup): Self = StObject.set(x, "PartitionBy", value.asInstanceOf[js.Any])
    
    inline def setPartitionByUndefined: Self = StObject.set(x, "PartitionBy", js.undefined)
    
    inline def setPeriodInSeconds(value: Integer): Self = StObject.set(x, "PeriodInSeconds", value.asInstanceOf[js.Any])
    
    inline def setPeriodInSecondsUndefined: Self = StObject.set(x, "PeriodInSeconds", js.undefined)
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: ISOTimestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
