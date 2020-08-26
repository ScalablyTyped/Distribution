package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowLog extends js.Object {
  /**
    * The date and time the flow log was created.
    */
  var CreationTime: js.UndefOr[MillisecondDateTime] = js.native
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
    * The maximum interval of time, in seconds, during which a flow of packets is captured and aggregated into a flow log record. When a network interface is attached to a Nitro-based instance, the aggregation interval is always 60 seconds (1 minute) or less, regardless of the specified value. Valid Values: 60 | 600 
    */
  var MaxAggregationInterval: js.UndefOr[Integer] = js.native
  /**
    * The ID of the resource on which the flow log was created.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * The tags for the flow log.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The type of traffic captured for the flow log.
    */
  var TrafficType: js.UndefOr[typings.awsSdk.ec2Mod.TrafficType] = js.native
}

object FlowLog {
  @scala.inline
  def apply(): FlowLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowLog]
  }
  @scala.inline
  implicit class FlowLogOps[Self <: FlowLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationTime(value: MillisecondDateTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDeliverLogsErrorMessage(value: String): Self = this.set("DeliverLogsErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliverLogsErrorMessage: Self = this.set("DeliverLogsErrorMessage", js.undefined)
    @scala.inline
    def setDeliverLogsPermissionArn(value: String): Self = this.set("DeliverLogsPermissionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliverLogsPermissionArn: Self = this.set("DeliverLogsPermissionArn", js.undefined)
    @scala.inline
    def setDeliverLogsStatus(value: String): Self = this.set("DeliverLogsStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliverLogsStatus: Self = this.set("DeliverLogsStatus", js.undefined)
    @scala.inline
    def setFlowLogId(value: String): Self = this.set("FlowLogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowLogId: Self = this.set("FlowLogId", js.undefined)
    @scala.inline
    def setFlowLogStatus(value: String): Self = this.set("FlowLogStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowLogStatus: Self = this.set("FlowLogStatus", js.undefined)
    @scala.inline
    def setLogDestination(value: String): Self = this.set("LogDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogDestination: Self = this.set("LogDestination", js.undefined)
    @scala.inline
    def setLogDestinationType(value: LogDestinationType): Self = this.set("LogDestinationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogDestinationType: Self = this.set("LogDestinationType", js.undefined)
    @scala.inline
    def setLogFormat(value: String): Self = this.set("LogFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogFormat: Self = this.set("LogFormat", js.undefined)
    @scala.inline
    def setLogGroupName(value: String): Self = this.set("LogGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupName: Self = this.set("LogGroupName", js.undefined)
    @scala.inline
    def setMaxAggregationInterval(value: Integer): Self = this.set("MaxAggregationInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAggregationInterval: Self = this.set("MaxAggregationInterval", js.undefined)
    @scala.inline
    def setResourceId(value: String): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTrafficType(value: TrafficType): Self = this.set("TrafficType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficType: Self = this.set("TrafficType", js.undefined)
  }
  
}

