package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowLog extends js.Object {
  /**
    * The date and time the flow log was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  /**
    * Information about the error that occurred. Rate limited indicates that CloudWatch Logs throttling has been applied for one or more network interfaces, or that you've reached the limit on the number of log groups that you can create. Access error indicates that the IAM role associated with the flow log does not have sufficient permissions to publish to CloudWatch Logs. Unknown error indicates an internal error.
    */
  var DeliverLogsErrorMessage: js.UndefOr[String] = js.native
  /**
    * The ARN of the IAM role that posts logs to CloudWatch Logs.
    */
  var DeliverLogsPermissionArn: js.UndefOr[String] = js.native
  /**
    * The status of the logs delivery (SUCCESS | FAILED).
    */
  var DeliverLogsStatus: js.UndefOr[String] = js.native
  /**
    * The flow log ID.
    */
  var FlowLogId: js.UndefOr[String] = js.native
  /**
    * The status of the flow log (ACTIVE).
    */
  var FlowLogStatus: js.UndefOr[String] = js.native
  /**
    * Specifies the destination to which the flow log data is published. Flow log data can be published to an CloudWatch Logs log group or an Amazon S3 bucket. If the flow log publishes to CloudWatch Logs, this element indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group to which the data is published. If the flow log publishes to Amazon S3, this element indicates the ARN of the Amazon S3 bucket to which the data is published.
    */
  var LogDestination: js.UndefOr[String] = js.native
  /**
    * Specifies the type of destination to which the flow log data is published. Flow log data can be published to CloudWatch Logs or Amazon S3.
    */
  var LogDestinationType: js.UndefOr[typings.awsSdk.ec2Mod.LogDestinationType] = js.native
  /**
    * The format of the flow log record.
    */
  var LogFormat: js.UndefOr[String] = js.native
  /**
    * The name of the flow log group.
    */
  var LogGroupName: js.UndefOr[String] = js.native
  /**
    * The ID of the resource on which the flow log was created.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * The type of traffic captured for the flow log.
    */
  var TrafficType: js.UndefOr[typings.awsSdk.ec2Mod.TrafficType] = js.native
}

object FlowLog {
  @scala.inline
  def apply(
    CreationTime: DateTime = null,
    DeliverLogsErrorMessage: String = null,
    DeliverLogsPermissionArn: String = null,
    DeliverLogsStatus: String = null,
    FlowLogId: String = null,
    FlowLogStatus: String = null,
    LogDestination: String = null,
    LogDestinationType: LogDestinationType = null,
    LogFormat: String = null,
    LogGroupName: String = null,
    ResourceId: String = null,
    TrafficType: TrafficType = null
  ): FlowLog = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DeliverLogsErrorMessage != null) __obj.updateDynamic("DeliverLogsErrorMessage")(DeliverLogsErrorMessage.asInstanceOf[js.Any])
    if (DeliverLogsPermissionArn != null) __obj.updateDynamic("DeliverLogsPermissionArn")(DeliverLogsPermissionArn.asInstanceOf[js.Any])
    if (DeliverLogsStatus != null) __obj.updateDynamic("DeliverLogsStatus")(DeliverLogsStatus.asInstanceOf[js.Any])
    if (FlowLogId != null) __obj.updateDynamic("FlowLogId")(FlowLogId.asInstanceOf[js.Any])
    if (FlowLogStatus != null) __obj.updateDynamic("FlowLogStatus")(FlowLogStatus.asInstanceOf[js.Any])
    if (LogDestination != null) __obj.updateDynamic("LogDestination")(LogDestination.asInstanceOf[js.Any])
    if (LogDestinationType != null) __obj.updateDynamic("LogDestinationType")(LogDestinationType.asInstanceOf[js.Any])
    if (LogFormat != null) __obj.updateDynamic("LogFormat")(LogFormat.asInstanceOf[js.Any])
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (TrafficType != null) __obj.updateDynamic("TrafficType")(TrafficType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLog]
  }
}

