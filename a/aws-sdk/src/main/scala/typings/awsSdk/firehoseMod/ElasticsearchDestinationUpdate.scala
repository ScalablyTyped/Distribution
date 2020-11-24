package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticsearchDestinationUpdate extends js.Object {
  
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
  implicit class ElasticsearchDestinationUpdateOps[Self <: ElasticsearchDestinationUpdate] (val x: Self) extends AnyVal {
    
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
    def setS3Update(value: S3DestinationUpdate): Self = this.set("S3Update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Update: Self = this.set("S3Update", js.undefined)
    
    @scala.inline
    def setTypeName(value: ElasticsearchTypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeName: Self = this.set("TypeName", js.undefined)
  }
}
