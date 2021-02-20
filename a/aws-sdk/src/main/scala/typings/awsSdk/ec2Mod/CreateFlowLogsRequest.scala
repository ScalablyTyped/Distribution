package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFlowLogsRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your account. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
    */
  var DeliverLogsPermissionArn: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the destination to which the flow log data is to be published. Flow log data can be published to a CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value specified for LogDestinationType. If LogDestinationType is not specified or cloud-watch-logs, specify the Amazon Resource Name (ARN) of the CloudWatch Logs log group. For example, to publish to a log group called my-logs, specify arn:aws:logs:us-east-1:123456789012:log-group:my-logs. Alternatively, use LogGroupName instead. If LogDestinationType is s3, specify the ARN of the Amazon S3 bucket. You can also specify a subfolder in the bucket. To specify a subfolder in the bucket, use the following ARN format: bucket_ARN/subfolder_name/. For example, to specify a subfolder named my-logs in a bucket named my-bucket, use the following ARN: arn:aws:s3:::my-bucket/my-logs/. You cannot use AWSLogs as a subfolder name. This is a reserved term.
    */
  var LogDestination: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of destination to which the flow log data is to be published. Flow log data can be published to CloudWatch Logs or Amazon S3. To publish flow log data to CloudWatch Logs, specify cloud-watch-logs. To publish flow log data to Amazon S3, specify s3. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName. Default: cloud-watch-logs 
    */
  var LogDestinationType: js.UndefOr[typings.awsSdk.ec2Mod.LogDestinationType] = js.native
  
  /**
    * The fields to include in the flow log record, in the order in which they should appear. For a list of available fields, see Flow Log Records. If you omit this parameter, the flow log is created using the default format. If you specify this parameter, you must specify at least one field. Specify the fields using the ${field-id} format, separated by spaces. For the AWS CLI, use single quotation marks (' ') to surround the parameter value.
    */
  var LogFormat: js.UndefOr[String] = js.native
  
  /**
    * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
    */
  var LogGroupName: js.UndefOr[String] = js.native
  
  /**
    * The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record. You can specify 60 seconds (1 minute) or 600 seconds (10 minutes). When a network interface is attached to a Nitro-based instance, the aggregation interval is always 60 seconds or less, regardless of the value that you specify. Default: 600
    */
  var MaxAggregationInterval: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the subnet, network interface, or VPC for which you want to create a flow log. Constraints: Maximum of 1000 resources
    */
  var ResourceIds: FlowLogResourceIds = js.native
  
  /**
    * The type of resource for which to create the flow log. For example, if you specified a VPC ID for the ResourceId property, specify VPC for this property.
    */
  var ResourceType: FlowLogsResourceType = js.native
  
  /**
    * The tags to apply to the flow logs.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  
  /**
    * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
    */
  var TrafficType: typings.awsSdk.ec2Mod.TrafficType = js.native
}
object CreateFlowLogsRequest {
  
  @scala.inline
  def apply(ResourceIds: FlowLogResourceIds, ResourceType: FlowLogsResourceType, TrafficType: TrafficType): CreateFlowLogsRequest = {
    val __obj = js.Dynamic.literal(ResourceIds = ResourceIds.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], TrafficType = TrafficType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowLogsRequest]
  }
  
  @scala.inline
  implicit class CreateFlowLogsRequestMutableBuilder[Self <: CreateFlowLogsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDeliverLogsPermissionArn(value: String): Self = StObject.set(x, "DeliverLogsPermissionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliverLogsPermissionArnUndefined: Self = StObject.set(x, "DeliverLogsPermissionArn", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setLogDestination(value: String): Self = StObject.set(x, "LogDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDestinationType(value: LogDestinationType): Self = StObject.set(x, "LogDestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDestinationTypeUndefined: Self = StObject.set(x, "LogDestinationType", js.undefined)
    
    @scala.inline
    def setLogDestinationUndefined: Self = StObject.set(x, "LogDestination", js.undefined)
    
    @scala.inline
    def setLogFormat(value: String): Self = StObject.set(x, "LogFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogFormatUndefined: Self = StObject.set(x, "LogFormat", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: String): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    @scala.inline
    def setMaxAggregationInterval(value: Integer): Self = StObject.set(x, "MaxAggregationInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAggregationIntervalUndefined: Self = StObject.set(x, "MaxAggregationInterval", js.undefined)
    
    @scala.inline
    def setResourceIds(value: FlowLogResourceIds): Self = StObject.set(x, "ResourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdsVarargs(value: FlowLogResourceId*): Self = StObject.set(x, "ResourceIds", js.Array(value :_*))
    
    @scala.inline
    def setResourceType(value: FlowLogsResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTrafficType(value: TrafficType): Self = StObject.set(x, "TrafficType", value.asInstanceOf[js.Any])
  }
}
