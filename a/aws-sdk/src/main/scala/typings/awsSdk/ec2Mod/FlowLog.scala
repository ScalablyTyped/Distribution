package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowLog extends StObject {
  
  /**
    * The date and time the flow log was created.
    */
  var CreationTime: js.UndefOr[MillisecondDateTime] = js.undefined
  
  /**
    * Information about the error that occurred. Rate limited indicates that CloudWatch Logs throttling has been applied for one or more network interfaces, or that you've reached the limit on the number of log groups that you can create. Access error indicates that the IAM role associated with the flow log does not have sufficient permissions to publish to CloudWatch Logs. Unknown error indicates an internal error.
    */
  var DeliverLogsErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role that posts logs to CloudWatch Logs.
    */
  var DeliverLogsPermissionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the logs delivery (SUCCESS | FAILED).
    */
  var DeliverLogsStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The flow log ID.
    */
  var FlowLogId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the flow log (ACTIVE).
    */
  var FlowLogStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the destination to which the flow log data is published. Flow log data can be published to an CloudWatch Logs log group or an Amazon S3 bucket. If the flow log publishes to CloudWatch Logs, this element indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group to which the data is published. If the flow log publishes to Amazon S3, this element indicates the ARN of the Amazon S3 bucket to which the data is published.
    */
  var LogDestination: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of destination to which the flow log data is published. Flow log data can be published to CloudWatch Logs or Amazon S3.
    */
  var LogDestinationType: js.UndefOr[typings.awsSdk.ec2Mod.LogDestinationType] = js.undefined
  
  /**
    * The format of the flow log record.
    */
  var LogFormat: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the flow log group.
    */
  var LogGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum interval of time, in seconds, during which a flow of packets is captured and aggregated into a flow log record. When a network interface is attached to a Nitro-based instance, the aggregation interval is always 60 seconds (1 minute) or less, regardless of the specified value. Valid Values: 60 | 600 
    */
  var MaxAggregationInterval: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the resource on which the flow log was created.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The tags for the flow log.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of traffic captured for the flow log.
    */
  var TrafficType: js.UndefOr[typings.awsSdk.ec2Mod.TrafficType] = js.undefined
}
object FlowLog {
  
  inline def apply(): FlowLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowLog]
  }
  
  extension [Self <: FlowLog](x: Self) {
    
    inline def setCreationTime(value: MillisecondDateTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDeliverLogsErrorMessage(value: String): Self = StObject.set(x, "DeliverLogsErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setDeliverLogsErrorMessageUndefined: Self = StObject.set(x, "DeliverLogsErrorMessage", js.undefined)
    
    inline def setDeliverLogsPermissionArn(value: String): Self = StObject.set(x, "DeliverLogsPermissionArn", value.asInstanceOf[js.Any])
    
    inline def setDeliverLogsPermissionArnUndefined: Self = StObject.set(x, "DeliverLogsPermissionArn", js.undefined)
    
    inline def setDeliverLogsStatus(value: String): Self = StObject.set(x, "DeliverLogsStatus", value.asInstanceOf[js.Any])
    
    inline def setDeliverLogsStatusUndefined: Self = StObject.set(x, "DeliverLogsStatus", js.undefined)
    
    inline def setFlowLogId(value: String): Self = StObject.set(x, "FlowLogId", value.asInstanceOf[js.Any])
    
    inline def setFlowLogIdUndefined: Self = StObject.set(x, "FlowLogId", js.undefined)
    
    inline def setFlowLogStatus(value: String): Self = StObject.set(x, "FlowLogStatus", value.asInstanceOf[js.Any])
    
    inline def setFlowLogStatusUndefined: Self = StObject.set(x, "FlowLogStatus", js.undefined)
    
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
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTrafficType(value: TrafficType): Self = StObject.set(x, "TrafficType", value.asInstanceOf[js.Any])
    
    inline def setTrafficTypeUndefined: Self = StObject.set(x, "TrafficType", js.undefined)
  }
}
