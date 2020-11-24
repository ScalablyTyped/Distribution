package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticsearchDestinationDescription extends js.Object {
  
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
  implicit class ElasticsearchDestinationDescriptionOps[Self <: ElasticsearchDestinationDescription] (val x: Self) extends AnyVal {
    
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
    def setBufferingHints(value: ElasticsearchBufferingHints): Self = this.set("BufferingHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferingHints: Self = this.set("BufferingHints", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = this.set("CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLoggingOptions: Self = this.set("CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setClusterEndpoint(value: ElasticsearchClusterEndpoint): Self = this.set("ClusterEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterEndpoint: Self = this.set("ClusterEndpoint", js.undefined)
    
    @scala.inline
    def setDomainARN(value: ElasticsearchDomainARN): Self = this.set("DomainARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainARN: Self = this.set("DomainARN", js.undefined)
    
    @scala.inline
    def setIndexName(value: ElasticsearchIndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
    
    @scala.inline
    def setIndexRotationPeriod(value: ElasticsearchIndexRotationPeriod): Self = this.set("IndexRotationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexRotationPeriod: Self = this.set("IndexRotationPeriod", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = this.set("ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryOptions(value: ElasticsearchRetryOptions): Self = this.set("RetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryOptions: Self = this.set("RetryOptions", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: ElasticsearchS3BackupMode): Self = this.set("S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BackupMode: Self = this.set("S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3DestinationDescription(value: S3DestinationDescription): Self = this.set("S3DestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3DestinationDescription: Self = this.set("S3DestinationDescription", js.undefined)
    
    @scala.inline
    def setTypeName(value: ElasticsearchTypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeName: Self = this.set("TypeName", js.undefined)
    
    @scala.inline
    def setVpcConfigurationDescription(value: VpcConfigurationDescription): Self = this.set("VpcConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfigurationDescription: Self = this.set("VpcConfigurationDescription", js.undefined)
  }
}
