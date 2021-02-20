package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.RDS
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object piMod {
  
  @JSImport("aws-sdk/clients/pi", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends PI {
    def this(options: ClientConfiguration) = this()
  }
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.piMod.apiVersion] = js.native
  }
  object ClientApiVersions {
    
    @scala.inline
    def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit class ClientApiVersionsMutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  
  @js.native
  trait DataPoint extends StObject {
    
    /**
      * The time, in epoch format, associated with a particular Value.
      */
    var Timestamp: ISOTimestamp = js.native
    
    /**
      * The actual value associated with a particular Timestamp.
      */
    var Value: Double = js.native
  }
  object DataPoint {
    
    @scala.inline
    def apply(Timestamp: ISOTimestamp, Value: Double): DataPoint = {
      val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataPoint]
    }
    
    @scala.inline
    implicit class DataPointMutableBuilder[Self <: DataPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimestamp(value: ISOTimestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  type DataPointsList = js.Array[DataPoint]
  
  @js.native
  trait DescribeDimensionKeysRequest extends StObject {
    
    /**
      * The date and time specifying the end of the requested time series data. The value specified is exclusive - data points less than (but not equal to) EndTime will be returned. The value for EndTime must be later than the value for StartTime.
      */
    var EndTime: ISOTimestamp = js.native
    
    /**
      * One or more filters to apply in the request. Restrictions:   Any number of filters by the same dimension, as specified in the GroupBy or Partition parameters.   A single filter for any other dimension in this dimension group.  
      */
    var Filter: js.UndefOr[MetricQueryFilterMap] = js.native
    
    /**
      * A specification for how to aggregate the data points from a query result. You must specify a valid dimension group. Performance Insights will return all of the dimensions within that group, unless you provide the names of specific dimensions within that group. You can also request that Performance Insights return a limited number of values for a dimension.
      */
    var GroupBy: DimensionGroup = js.native
    
    /**
      * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
      */
    var Identifier: String = js.native
    
    /**
      * The maximum number of items to return in the response. If more items exist than the specified MaxRecords value, a pagination token is included in the response so that the remaining results can be retrieved. 
      */
    var MaxResults: js.UndefOr[typings.awsSdk.piMod.MaxResults] = js.native
    
    /**
      * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
      */
    var Metric: String = js.native
    
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * For each dimension specified in GroupBy, specify a secondary dimension to further subdivide the partition keys in the response.
      */
    var PartitionBy: js.UndefOr[DimensionGroup] = js.native
    
    /**
      * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as one second, or as long as one day (86400 seconds). Valid values are:    1 (one second)    60 (one minute)    300 (five minutes)    3600 (one hour)    86400 (twenty-four hours)   If you don't specify PeriodInSeconds, then Performance Insights will choose a value for you, with a goal of returning roughly 100-200 data points in the response.
      */
    var PeriodInSeconds: js.UndefOr[Integer] = js.native
    
    /**
      * The AWS service for which Performance Insights will return metrics. The only valid value for ServiceType is: RDS 
      */
    var ServiceType: typings.awsSdk.piMod.ServiceType = js.native
    
    /**
      * The date and time specifying the beginning of the requested time series data. You can't specify a StartTime that's earlier than 7 days ago. The value specified is inclusive - data points equal to or greater than StartTime will be returned. The value for StartTime must be earlier than the value for EndTime.
      */
    var StartTime: ISOTimestamp = js.native
  }
  object DescribeDimensionKeysRequest {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DescribeDimensionKeysRequestMutableBuilder[Self <: DescribeDimensionKeysRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: ISOTimestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: MetricQueryFilterMap): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setGroupBy(value: DimensionGroup): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setMetric(value: String): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setPartitionBy(value: DimensionGroup): Self = StObject.set(x, "PartitionBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionByUndefined: Self = StObject.set(x, "PartitionBy", js.undefined)
      
      @scala.inline
      def setPeriodInSeconds(value: Integer): Self = StObject.set(x, "PeriodInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodInSecondsUndefined: Self = StObject.set(x, "PeriodInSeconds", js.undefined)
      
      @scala.inline
      def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: ISOTimestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeDimensionKeysResponse extends StObject {
    
    /**
      * The end time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedEndTime will be greater than or equal to the value of the user-specified Endtime.
      */
    var AlignedEndTime: js.UndefOr[ISOTimestamp] = js.native
    
    /**
      * The start time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedStartTime will be less than or equal to the value of the user-specified StartTime.
      */
    var AlignedStartTime: js.UndefOr[ISOTimestamp] = js.native
    
    /**
      * The dimension keys that were requested.
      */
    var Keys: js.UndefOr[DimensionKeyDescriptionList] = js.native
    
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * If PartitionBy was present in the request, PartitionKeys contains the breakdown of dimension keys by the specified partitions.
      */
    var PartitionKeys: js.UndefOr[ResponsePartitionKeyList] = js.native
  }
  object DescribeDimensionKeysResponse {
    
    @scala.inline
    def apply(): DescribeDimensionKeysResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeDimensionKeysResponse]
    }
    
    @scala.inline
    implicit class DescribeDimensionKeysResponseMutableBuilder[Self <: DescribeDimensionKeysResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignedEndTime(value: ISOTimestamp): Self = StObject.set(x, "AlignedEndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignedEndTimeUndefined: Self = StObject.set(x, "AlignedEndTime", js.undefined)
      
      @scala.inline
      def setAlignedStartTime(value: ISOTimestamp): Self = StObject.set(x, "AlignedStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignedStartTimeUndefined: Self = StObject.set(x, "AlignedStartTime", js.undefined)
      
      @scala.inline
      def setKeys(value: DimensionKeyDescriptionList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: DimensionKeyDescription*): Self = StObject.set(x, "Keys", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setPartitionKeys(value: ResponsePartitionKeyList): Self = StObject.set(x, "PartitionKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionKeysUndefined: Self = StObject.set(x, "PartitionKeys", js.undefined)
      
      @scala.inline
      def setPartitionKeysVarargs(value: ResponsePartitionKey*): Self = StObject.set(x, "PartitionKeys", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DimensionGroup extends StObject {
    
    /**
      * A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies that all of the dimensions in the group were requested, or are present in the response. Valid values for elements in the Dimensions array are:   db.user.id   db.user.name   db.host.id   db.host.name   db.sql.id   db.sql.db_id   db.sql.statement   db.sql.tokenized_id   db.sql_tokenized.id   db.sql_tokenized.db_id   db.sql_tokenized.statement   db.wait_event.name   db.wait_event.type   db.wait_event_type.name  
      */
    var Dimensions: js.UndefOr[StringList] = js.native
    
    /**
      * The name of the dimension group. Valid values are:    db.user     db.host     db.sql     db.sql_tokenized     db.wait_event     db.wait_event_type   
      */
    var Group: String = js.native
    
    /**
      * The maximum number of items to fetch for this dimension group.
      */
    var Limit: js.UndefOr[typings.awsSdk.piMod.Limit] = js.native
  }
  object DimensionGroup {
    
    @scala.inline
    def apply(Group: String): DimensionGroup = {
      val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any])
      __obj.asInstanceOf[DimensionGroup]
    }
    
    @scala.inline
    implicit class DimensionGroupMutableBuilder[Self <: DimensionGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: StringList): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      @scala.inline
      def setDimensionsVarargs(value: String*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    }
  }
  
  @js.native
  trait DimensionKeyDescription extends StObject {
    
    /**
      * A map of name-value pairs for the dimensions in the group.
      */
    var Dimensions: js.UndefOr[DimensionMap] = js.native
    
    /**
      * If PartitionBy was specified, PartitionKeys contains the dimensions that were.
      */
    var Partitions: js.UndefOr[MetricValuesList] = js.native
    
    /**
      * The aggregated metric value for the dimension(s), over the requested time range.
      */
    var Total: js.UndefOr[Double] = js.native
  }
  object DimensionKeyDescription {
    
    @scala.inline
    def apply(): DimensionKeyDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DimensionKeyDescription]
    }
    
    @scala.inline
    implicit class DimensionKeyDescriptionMutableBuilder[Self <: DimensionKeyDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: DimensionMap): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      @scala.inline
      def setPartitions(value: MetricValuesList): Self = StObject.set(x, "Partitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionsUndefined: Self = StObject.set(x, "Partitions", js.undefined)
      
      @scala.inline
      def setPartitionsVarargs(value: Double*): Self = StObject.set(x, "Partitions", js.Array(value :_*))
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
    }
  }
  
  type DimensionKeyDescriptionList = js.Array[DimensionKeyDescription]
  
  type DimensionMap = StringDictionary[String]
  
  type Double = scala.Double
  
  @js.native
  trait GetResourceMetricsRequest extends StObject {
    
    /**
      * The date and time specifiying the end of the requested time series data. The value specified is exclusive - data points less than (but not equal to) EndTime will be returned. The value for EndTime must be later than the value for StartTime.
      */
    var EndTime: ISOTimestamp = js.native
    
    /**
      * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
      */
    var Identifier: String = js.native
    
    /**
      * The maximum number of items to return in the response. If more items exist than the specified MaxRecords value, a pagination token is included in the response so that the remaining results can be retrieved. 
      */
    var MaxResults: js.UndefOr[typings.awsSdk.piMod.MaxResults] = js.native
    
    /**
      * An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can optionally specify aggregation and filtering criteria.
      */
    var MetricQueries: MetricQueryList = js.native
    
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as one second, or as long as one day (86400 seconds). Valid values are:    1 (one second)    60 (one minute)    300 (five minutes)    3600 (one hour)    86400 (twenty-four hours)   If you don't specify PeriodInSeconds, then Performance Insights will choose a value for you, with a goal of returning roughly 100-200 data points in the response.
      */
    var PeriodInSeconds: js.UndefOr[Integer] = js.native
    
    /**
      * The AWS service for which Performance Insights will return metrics. The only valid value for ServiceType is: RDS 
      */
    var ServiceType: typings.awsSdk.piMod.ServiceType = js.native
    
    /**
      * The date and time specifying the beginning of the requested time series data. You can't specify a StartTime that's earlier than 7 days ago. The value specified is inclusive - data points equal to or greater than StartTime will be returned. The value for StartTime must be earlier than the value for EndTime.
      */
    var StartTime: ISOTimestamp = js.native
  }
  object GetResourceMetricsRequest {
    
    @scala.inline
    def apply(
      EndTime: ISOTimestamp,
      Identifier: String,
      MetricQueries: MetricQueryList,
      ServiceType: ServiceType,
      StartTime: ISOTimestamp
    ): GetResourceMetricsRequest = {
      val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], MetricQueries = MetricQueries.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResourceMetricsRequest]
    }
    
    @scala.inline
    implicit class GetResourceMetricsRequestMutableBuilder[Self <: GetResourceMetricsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: ISOTimestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setMetricQueries(value: MetricQueryList): Self = StObject.set(x, "MetricQueries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricQueriesVarargs(value: MetricQuery*): Self = StObject.set(x, "MetricQueries", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setPeriodInSeconds(value: Integer): Self = StObject.set(x, "PeriodInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodInSecondsUndefined: Self = StObject.set(x, "PeriodInSeconds", js.undefined)
      
      @scala.inline
      def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: ISOTimestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetResourceMetricsResponse extends StObject {
    
    /**
      * The end time for the returned metrics, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedEndTime will be greater than or equal to the value of the user-specified Endtime.
      */
    var AlignedEndTime: js.UndefOr[ISOTimestamp] = js.native
    
    /**
      * The start time for the returned metrics, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedStartTime will be less than or equal to the value of the user-specified StartTime.
      */
    var AlignedStartTime: js.UndefOr[ISOTimestamp] = js.native
    
    /**
      * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
      */
    var Identifier: js.UndefOr[String] = js.native
    
    /**
      * An array of metric results,, where each array element contains all of the data points for a particular dimension.
      */
    var MetricList: js.UndefOr[MetricKeyDataPointsList] = js.native
    
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
      */
    var NextToken: js.UndefOr[String] = js.native
  }
  object GetResourceMetricsResponse {
    
    @scala.inline
    def apply(): GetResourceMetricsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetResourceMetricsResponse]
    }
    
    @scala.inline
    implicit class GetResourceMetricsResponseMutableBuilder[Self <: GetResourceMetricsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignedEndTime(value: ISOTimestamp): Self = StObject.set(x, "AlignedEndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignedEndTimeUndefined: Self = StObject.set(x, "AlignedEndTime", js.undefined)
      
      @scala.inline
      def setAlignedStartTime(value: ISOTimestamp): Self = StObject.set(x, "AlignedStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignedStartTimeUndefined: Self = StObject.set(x, "AlignedStartTime", js.undefined)
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
      
      @scala.inline
      def setMetricList(value: MetricKeyDataPointsList): Self = StObject.set(x, "MetricList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricListUndefined: Self = StObject.set(x, "MetricList", js.undefined)
      
      @scala.inline
      def setMetricListVarargs(value: MetricKeyDataPoints*): Self = StObject.set(x, "MetricList", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  type ISOTimestamp = Date
  
  type Integer = scala.Double
  
  type Limit = scala.Double
  
  type MaxResults = scala.Double
  
  @js.native
  trait MetricKeyDataPoints extends StObject {
    
    /**
      * An array of timestamp-value pairs, representing measurements over a period of time.
      */
    var DataPoints: js.UndefOr[DataPointsList] = js.native
    
    /**
      * The dimension(s) to which the data points apply.
      */
    var Key: js.UndefOr[ResponseResourceMetricKey] = js.native
  }
  object MetricKeyDataPoints {
    
    @scala.inline
    def apply(): MetricKeyDataPoints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricKeyDataPoints]
    }
    
    @scala.inline
    implicit class MetricKeyDataPointsMutableBuilder[Self <: MetricKeyDataPoints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataPoints(value: DataPointsList): Self = StObject.set(x, "DataPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataPointsUndefined: Self = StObject.set(x, "DataPoints", js.undefined)
      
      @scala.inline
      def setDataPointsVarargs(value: DataPoint*): Self = StObject.set(x, "DataPoints", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: ResponseResourceMetricKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    }
  }
  
  type MetricKeyDataPointsList = js.Array[MetricKeyDataPoints]
  
  @js.native
  trait MetricQuery extends StObject {
    
    /**
      * One or more filters to apply in the request. Restrictions:   Any number of filters by the same dimension, as specified in the GroupBy parameter.   A single filter for any other dimension in this dimension group.  
      */
    var Filter: js.UndefOr[MetricQueryFilterMap] = js.native
    
    /**
      * A specification for how to aggregate the data points from a query result. You must specify a valid dimension group. Performance Insights will return all of the dimensions within that group, unless you provide the names of specific dimensions within that group. You can also request that Performance Insights return a limited number of values for a dimension.
      */
    var GroupBy: js.UndefOr[DimensionGroup] = js.native
    
    /**
      * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
      */
    var Metric: String = js.native
  }
  object MetricQuery {
    
    @scala.inline
    def apply(Metric: String): MetricQuery = {
      val __obj = js.Dynamic.literal(Metric = Metric.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricQuery]
    }
    
    @scala.inline
    implicit class MetricQueryMutableBuilder[Self <: MetricQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: MetricQueryFilterMap): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setGroupBy(value: DimensionGroup): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "GroupBy", js.undefined)
      
      @scala.inline
      def setMetric(value: String): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    }
  }
  
  type MetricQueryFilterMap = StringDictionary[String]
  
  type MetricQueryList = js.Array[MetricQuery]
  
  type MetricValuesList = js.Array[Double]
  
  @js.native
  trait PI extends Service {
    
    @JSName("config")
    var config_PI: ConfigBase with ClientConfiguration = js.native
    
    /**
      * For a specific time period, retrieve the top N dimension keys for a metric.
      */
    def describeDimensionKeys(): Request[DescribeDimensionKeysResponse, AWSError] = js.native
    def describeDimensionKeys(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDimensionKeysResponse, Unit]): Request[DescribeDimensionKeysResponse, AWSError] = js.native
    /**
      * For a specific time period, retrieve the top N dimension keys for a metric.
      */
    def describeDimensionKeys(params: DescribeDimensionKeysRequest): Request[DescribeDimensionKeysResponse, AWSError] = js.native
    def describeDimensionKeys(
      params: DescribeDimensionKeysRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ DescribeDimensionKeysResponse, Unit]
    ): Request[DescribeDimensionKeysResponse, AWSError] = js.native
    
    /**
      * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
      */
    def getResourceMetrics(): Request[GetResourceMetricsResponse, AWSError] = js.native
    def getResourceMetrics(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceMetricsResponse, Unit]): Request[GetResourceMetricsResponse, AWSError] = js.native
    /**
      * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
      */
    def getResourceMetrics(params: GetResourceMetricsRequest): Request[GetResourceMetricsResponse, AWSError] = js.native
    def getResourceMetrics(
      params: GetResourceMetricsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetResourceMetricsResponse, Unit]
    ): Request[GetResourceMetricsResponse, AWSError] = js.native
  }
  
  @js.native
  trait ResponsePartitionKey extends StObject {
    
    /**
      * A dimension map that contains the dimension(s) for this partition.
      */
    var Dimensions: DimensionMap = js.native
  }
  object ResponsePartitionKey {
    
    @scala.inline
    def apply(Dimensions: DimensionMap): ResponsePartitionKey = {
      val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsePartitionKey]
    }
    
    @scala.inline
    implicit class ResponsePartitionKeyMutableBuilder[Self <: ResponsePartitionKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: DimensionMap): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    }
  }
  
  type ResponsePartitionKeyList = js.Array[ResponsePartitionKey]
  
  @js.native
  trait ResponseResourceMetricKey extends StObject {
    
    /**
      * The valid dimensions for the metric.
      */
    var Dimensions: js.UndefOr[DimensionMap] = js.native
    
    /**
      * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
      */
    var Metric: String = js.native
  }
  object ResponseResourceMetricKey {
    
    @scala.inline
    def apply(Metric: String): ResponseResourceMetricKey = {
      val __obj = js.Dynamic.literal(Metric = Metric.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseResourceMetricKey]
    }
    
    @scala.inline
    implicit class ResponseResourceMetricKeyMutableBuilder[Self <: ResponseResourceMetricKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: DimensionMap): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      @scala.inline
      def setMetric(value: String): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    }
  }
  
  type ServiceType = RDS | java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[String]
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-02-27`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
