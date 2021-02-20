package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticsearchDestinationConfiguration extends StObject {
  
  /**
    * The buffering options. If no value is specified, the default values for ElasticsearchBufferingHints are used.
    */
  var BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.native
  
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  
  /**
    * The endpoint to use when communicating with the cluster. Specify either this ClusterEndpoint or the DomainARN field.
    */
  var ClusterEndpoint: js.UndefOr[ElasticsearchClusterEndpoint] = js.native
  
  /**
    * The ARN of the Amazon ES domain. The IAM role must have permissions for DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after assuming the role specified in RoleARN. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces. Specify either ClusterEndpoint or DomainARN.
    */
  var DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.native
  
  /**
    * The Elasticsearch index name.
    */
  var IndexName: ElasticsearchIndexName = js.native
  
  /**
    * The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate the expiration of old data. For more information, see Index Rotation for the Amazon ES Destination. The default value is OneDay.
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
  var RoleARN: typings.awsSdk.firehoseMod.RoleARN = js.native
  
  /**
    * Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with elasticsearch-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents with elasticsearch-failed/ appended to the prefix. For more information, see Amazon S3 Backup for the Amazon ES Destination. Default value is FailedDocumentsOnly. You can't change this backup mode after you create the delivery stream. 
    */
  var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.native
  
  /**
    * The configuration for the backup Amazon S3 location.
    */
  var S3Configuration: S3DestinationConfiguration = js.native
  
  /**
    * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an error during run time. For Elasticsearch 7.x, don't specify a TypeName.
    */
  var TypeName: js.UndefOr[ElasticsearchTypeName] = js.native
  
  /**
    * The details of the VPC of the Amazon ES destination.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.VpcConfiguration] = js.native
}
object ElasticsearchDestinationConfiguration {
  
  @scala.inline
  def apply(IndexName: ElasticsearchIndexName, RoleARN: RoleARN, S3Configuration: S3DestinationConfiguration): ElasticsearchDestinationConfiguration = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], S3Configuration = S3Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchDestinationConfiguration]
  }
  
  @scala.inline
  implicit class ElasticsearchDestinationConfigurationMutableBuilder[Self <: ElasticsearchDestinationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setS3BackupMode(value: ElasticsearchS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3Configuration(value: S3DestinationConfiguration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: ElasticsearchTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
