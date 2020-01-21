package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowLogsRequest extends js.Object {
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
    * The fields to include in the flow log record, in the order in which they should appear. For a list of available fields, see Flow Log Records. If you omit this parameter, the flow log is created using the default format. If you specify this parameter, you must specify at least one field. Specify the fields using the ${field-id} format, separated by spaces. For the AWS CLI, use single quotation marks (' ') to surround the parameter value. Only applicable to flow logs that are published to an Amazon S3 bucket.
    */
  var LogFormat: js.UndefOr[String] = js.native
  /**
    * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
    */
  var LogGroupName: js.UndefOr[String] = js.native
  /**
    * The ID of the subnet, network interface, or VPC for which you want to create a flow log. Constraints: Maximum of 1000 resources
    */
  var ResourceIds: ValueStringList = js.native
  /**
    * The type of resource for which to create the flow log. For example, if you specified a VPC ID for the ResourceId property, specify VPC for this property.
    */
  var ResourceType: FlowLogsResourceType = js.native
  /**
    * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
    */
  var TrafficType: typings.awsSdk.ec2Mod.TrafficType = js.native
}

object CreateFlowLogsRequest {
  @scala.inline
  def apply(
    ResourceIds: ValueStringList,
    ResourceType: FlowLogsResourceType,
    TrafficType: TrafficType,
    ClientToken: String = null,
    DeliverLogsPermissionArn: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    LogDestination: String = null,
    LogDestinationType: LogDestinationType = null,
    LogFormat: String = null,
    LogGroupName: String = null
  ): CreateFlowLogsRequest = {
    val __obj = js.Dynamic.literal(ResourceIds = ResourceIds.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], TrafficType = TrafficType.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (DeliverLogsPermissionArn != null) __obj.updateDynamic("DeliverLogsPermissionArn")(DeliverLogsPermissionArn.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (LogDestination != null) __obj.updateDynamic("LogDestination")(LogDestination.asInstanceOf[js.Any])
    if (LogDestinationType != null) __obj.updateDynamic("LogDestinationType")(LogDestinationType.asInstanceOf[js.Any])
    if (LogFormat != null) __obj.updateDynamic("LogFormat")(LogFormat.asInstanceOf[js.Any])
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowLogsRequest]
  }
}

