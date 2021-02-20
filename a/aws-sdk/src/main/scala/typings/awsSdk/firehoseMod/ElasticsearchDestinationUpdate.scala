package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticsearchDestinationUpdate extends StObject {
  
  /**
    * The buffering options. If no value is specified, ElasticsearchBufferingHints object default values are used. 
    */
  var BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.native
  
  /**
    * The CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  
  /**
    * The endpoint to use when communicating with the cluster. Specify either this ClusterEndpoint or the DomainARN field.
    */
  var ClusterEndpoint: js.UndefOr[ElasticsearchClusterEndpoint] = js.native
  
  /**
    * The ARN of the Amazon ES domain. The IAM role must have permissions for DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after assuming the IAM role specified in RoleARN. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces. Specify either ClusterEndpoint or DomainARN.
    */
  var DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.native
  
  /**
    * The Elasticsearch index name.
    */
  var IndexName: js.UndefOr[ElasticsearchIndexName] = js.native
  
  /**
    * The Elasticsearch index rotation period. Index rotation appends a timestamp to IndexName to facilitate the expiration of old data. For more information, see Index Rotation for the Amazon ES Destination. Default value is OneDay.
    */
  var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.native
  
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default value is 300 (5 minutes).
    */
  var RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon ES Configuration API and for indexing documents. For more information, see Grant Kinesis Data Firehose Access to an Amazon S3 Destination and Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.firehoseMod.RoleARN] = js.native
  
  /**
    * The Amazon S3 destination.
    */
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.native
  
  /**
    * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an error during runtime. If you upgrade Elasticsearch from 6.x to 7.x and don’t update your delivery stream, Kinesis Data Firehose still delivers data to Elasticsearch with the old index name and type name. If you want to update your delivery stream with a new index name, provide an empty string for TypeName. 
    */
  var TypeName: js.UndefOr[ElasticsearchTypeName] = js.native
}
object ElasticsearchDestinationUpdate {
  
  @scala.inline
  def apply(): ElasticsearchDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticsearchDestinationUpdate]
  }
  
  @scala.inline
  implicit class ElasticsearchDestinationUpdateMutableBuilder[Self <: ElasticsearchDestinationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferingHints(value: ElasticsearchBufferingHints): Self = StObject.set(x, "BufferingHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferingHintsUndefined: Self = StObject.set(x, "BufferingHints", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setClusterEndpoint(value: ElasticsearchClusterEndpoint): Self = StObject.set(x, "ClusterEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterEndpointUndefined: Self = StObject.set(x, "ClusterEndpoint", js.undefined)
    
    @scala.inline
    def setDomainARN(value: ElasticsearchDomainARN): Self = StObject.set(x, "DomainARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainARNUndefined: Self = StObject.set(x, "DomainARN", js.undefined)
    
    @scala.inline
    def setIndexName(value: ElasticsearchIndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    @scala.inline
    def setIndexRotationPeriod(value: ElasticsearchIndexRotationPeriod): Self = StObject.set(x, "IndexRotationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexRotationPeriodUndefined: Self = StObject.set(x, "IndexRotationPeriod", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryOptions(value: ElasticsearchRetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    @scala.inline
    def setS3Update(value: S3DestinationUpdate): Self = StObject.set(x, "S3Update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UpdateUndefined: Self = StObject.set(x, "S3Update", js.undefined)
    
    @scala.inline
    def setTypeName(value: ElasticsearchTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
  }
}
