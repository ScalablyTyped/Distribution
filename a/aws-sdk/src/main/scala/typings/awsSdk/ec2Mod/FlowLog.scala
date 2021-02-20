package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowLog extends StObject {
  
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
  implicit class FlowLogMutableBuilder[Self <: FlowLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: MillisecondDateTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDeliverLogsErrorMessage(value: String): Self = StObject.set(x, "DeliverLogsErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliverLogsErrorMessageUndefined: Self = StObject.set(x, "DeliverLogsErrorMessage", js.undefined)
    
    @scala.inline
    def setDeliverLogsPermissionArn(value: String): Self = StObject.set(x, "DeliverLogsPermissionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliverLogsPermissionArnUndefined: Self = StObject.set(x, "DeliverLogsPermissionArn", js.undefined)
    
    @scala.inline
    def setDeliverLogsStatus(value: String): Self = StObject.set(x, "DeliverLogsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliverLogsStatusUndefined: Self = StObject.set(x, "DeliverLogsStatus", js.undefined)
    
    @scala.inline
    def setFlowLogId(value: String): Self = StObject.set(x, "FlowLogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogIdUndefined: Self = StObject.set(x, "FlowLogId", js.undefined)
    
    @scala.inline
    def setFlowLogStatus(value: String): Self = StObject.set(x, "FlowLogStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogStatusUndefined: Self = StObject.set(x, "FlowLogStatus", js.undefined)
    
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
    def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTrafficType(value: TrafficType): Self = StObject.set(x, "TrafficType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficTypeUndefined: Self = StObject.set(x, "TrafficType", js.undefined)
  }
}
