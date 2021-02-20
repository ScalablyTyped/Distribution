package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticsearchDestinationDescription extends StObject {
  
  /**
    * The buffering options.
    */
  var BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.native
  
  /**
    * The Amazon CloudWatch logging options.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  
  /**
    * The endpoint to use when communicating with the cluster. Kinesis Data Firehose uses either this ClusterEndpoint or the DomainARN field to send data to Amazon ES.
    */
  var ClusterEndpoint: js.UndefOr[ElasticsearchClusterEndpoint] = js.native
  
  /**
    * The ARN of the Amazon ES domain. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces. Kinesis Data Firehose uses either ClusterEndpoint or DomainARN to send data to Amazon ES.
    */
  var DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.native
  
  /**
    * The Elasticsearch index name.
    */
  var IndexName: js.UndefOr[ElasticsearchIndexName] = js.native
  
  /**
    * The Elasticsearch index rotation period
    */
  var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.native
  
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  
  /**
    * The Amazon ES retry options.
    */
  var RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.firehoseMod.RoleARN] = js.native
  
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.native
  
  /**
    * The Amazon S3 destination.
    */
  var S3DestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.S3DestinationDescription] = js.native
  
  /**
    * The Elasticsearch type name. This applies to Elasticsearch 6.x and lower versions. For Elasticsearch 7.x, there's no value for TypeName.
    */
  var TypeName: js.UndefOr[ElasticsearchTypeName] = js.native
  
  /**
    * The details of the VPC of the Amazon ES destination.
    */
  var VpcConfigurationDescription: js.UndefOr[typings.awsSdk.firehoseMod.VpcConfigurationDescription] = js.native
}
object ElasticsearchDestinationDescription {
  
  @scala.inline
  def apply(): ElasticsearchDestinationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticsearchDestinationDescription]
  }
  
  @scala.inline
  implicit class ElasticsearchDestinationDescriptionMutableBuilder[Self <: ElasticsearchDestinationDescription] (val x: Self) extends AnyVal {
    
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
    def setS3BackupMode(value: ElasticsearchS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3DestinationDescription(value: S3DestinationDescription): Self = StObject.set(x, "S3DestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationDescriptionUndefined: Self = StObject.set(x, "S3DestinationDescription", js.undefined)
    
    @scala.inline
    def setTypeName(value: ElasticsearchTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    @scala.inline
    def setVpcConfigurationDescription(value: VpcConfigurationDescription): Self = StObject.set(x, "VpcConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationDescriptionUndefined: Self = StObject.set(x, "VpcConfigurationDescription", js.undefined)
  }
}
