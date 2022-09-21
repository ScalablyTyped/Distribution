package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowLogsRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role that allows Amazon EC2 to publish flow logs across accounts.
    */
  var DeliverCrossAccountRole: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your account. This parameter is required if the destination type is cloud-watch-logs and unsupported otherwise.
    */
  var DeliverLogsPermissionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The destination options.
    */
  var DestinationOptions: js.UndefOr[DestinationOptionsRequest] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The destination for the flow log data. The meaning of this parameter depends on the destination type.   If the destination type is cloud-watch-logs, specify the ARN of a CloudWatch Logs log group. For example: arn:aws:logs:region:account_id:log-group:my_group  Alternatively, use the LogGroupName parameter.   If the destination type is s3, specify the ARN of an S3 bucket. For example: arn:aws:s3:::my_bucket/my_subfolder/ The subfolder is optional. Note that you can't use AWSLogs as a subfolder name.   If the destination type is kinesis-data-firehose, specify the ARN of a Kinesis Data Firehose delivery stream. For example: arn:aws:firehose:region:account_id:deliverystream:my_stream   
    */
  var LogDestination: js.UndefOr[String] = js.undefined
  
  /**
    * The type of destination for the flow log data. Default: cloud-watch-logs 
    */
  var LogDestinationType: js.UndefOr[typings.awsSdk.ec2Mod.LogDestinationType] = js.undefined
  
  /**
    * The fields to include in the flow log record. List the fields in the order in which they should appear. For more information about the available fields, see Flow log records. If you omit this parameter, the flow log is created using the default format. If you specify this parameter, you must include at least one field. Specify the fields using the ${field-id} format, separated by spaces. For the CLI, surround this parameter value with single quotes on Linux or double quotes on Windows.
    */
  var LogFormat: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs. This parameter is valid only if the destination type is cloud-watch-logs.
    */
  var LogGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record. You can specify 60 seconds (1 minute) or 600 seconds (10 minutes). When a network interface is attached to a Nitro-based instance, the aggregation interval is always 60 seconds or less, regardless of the value that you specify. Default: 600
    */
  var MaxAggregationInterval: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IDs of the resources to monitor. For example, if the resource type is VPC, specify the IDs of the VPCs. Constraints: Maximum of 1000 resources
    */
  var ResourceIds: FlowLogResourceIds
  
  /**
    * The type of resource to monitor.
    */
  var ResourceType: FlowLogsResourceType
  
  /**
    * The tags to apply to the flow logs.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic).
    */
  var TrafficType: js.UndefOr[typings.awsSdk.ec2Mod.TrafficType] = js.undefined
}
object CreateFlowLogsRequest {
  
  inline def apply(ResourceIds: FlowLogResourceIds, ResourceType: FlowLogsResourceType): CreateFlowLogsRequest = {
    val __obj = js.Dynamic.literal(ResourceIds = ResourceIds.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowLogsRequest]
  }
  
  extension [Self <: CreateFlowLogsRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDeliverCrossAccountRole(value: String): Self = StObject.set(x, "DeliverCrossAccountRole", value.asInstanceOf[js.Any])
    
    inline def setDeliverCrossAccountRoleUndefined: Self = StObject.set(x, "DeliverCrossAccountRole", js.undefined)
    
    inline def setDeliverLogsPermissionArn(value: String): Self = StObject.set(x, "DeliverLogsPermissionArn", value.asInstanceOf[js.Any])
    
    inline def setDeliverLogsPermissionArnUndefined: Self = StObject.set(x, "DeliverLogsPermissionArn", js.undefined)
    
    inline def setDestinationOptions(value: DestinationOptionsRequest): Self = StObject.set(x, "DestinationOptions", value.asInstanceOf[js.Any])
    
    inline def setDestinationOptionsUndefined: Self = StObject.set(x, "DestinationOptions", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setLogDestination(value: String): Self = StObject.set(x, "LogDestination", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationType(value: LogDestinationType): Self = StObject.set(x, "LogDestinationType", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationTypeUndefined: Self = StObject.set(x, "LogDestinationType", js.undefined)
    
    inline def setLogDestinationUndefined: Self = StObject.set(x, "LogDestination", js.undefined)
    
    inline def setLogFormat(value: String): Self = StObject.set(x, "LogFormat", value.asInstanceOf[js.Any])
    
    inline def setLogFormatUndefined: Self = StObject.set(x, "LogFormat", js.undefined)
    
    inline def setLogGroupName(value: String): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    inline def setMaxAggregationInterval(value: Integer): Self = StObject.set(x, "MaxAggregationInterval", value.asInstanceOf[js.Any])
    
    inline def setMaxAggregationIntervalUndefined: Self = StObject.set(x, "MaxAggregationInterval", js.undefined)
    
    inline def setResourceIds(value: FlowLogResourceIds): Self = StObject.set(x, "ResourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsVarargs(value: FlowLogResourceId*): Self = StObject.set(x, "ResourceIds", js.Array(value*))
    
    inline def setResourceType(value: FlowLogsResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTrafficType(value: TrafficType): Self = StObject.set(x, "TrafficType", value.asInstanceOf[js.Any])
    
    inline def setTrafficTypeUndefined: Self = StObject.set(x, "TrafficType", js.undefined)
  }
}
