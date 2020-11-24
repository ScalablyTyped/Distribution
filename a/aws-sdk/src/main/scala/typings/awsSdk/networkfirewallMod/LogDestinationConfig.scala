package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogDestinationConfig extends js.Object {
  
  /**
    * The named location for the logs, provided in a key:value mapping that is specific to the chosen destination type.    For an Amazon S3 bucket, provide the name of the bucket, with key bucketName, and optionally provide a prefix, with key prefix. The following example specifies an Amazon S3 bucket named DOC-EXAMPLE-BUCKET and the prefix alerts:   "LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }    For a CloudWatch log group, provide the name of the CloudWatch log group, with key logGroup. The following example specifies a log group named alert-log-group:   "LogDestination": { "logGroup": "alert-log-group" }    For a Kinesis Data Firehose delivery stream, provide the name of the delivery stream, with key deliveryStream. The following example specifies a delivery stream named alert-delivery-stream:   "LogDestination": { "deliveryStream": "alert-delivery-stream" }   
    */
  var LogDestination: LogDestinationMap = js.native
  
  /**
    * The type of storage destination to send these logs to. You can send logs to an Amazon S3 bucket, a CloudWatch log group, or a Kinesis Data Firehose delivery stream.
    */
  var LogDestinationType: typings.awsSdk.networkfirewallMod.LogDestinationType = js.native
  
  /**
    * The type of log to send. Alert logs report traffic that matches a StatefulRule with an action setting that sends an alert log message. Flow logs are standard network traffic flow logs. 
    */
  var LogType: typings.awsSdk.networkfirewallMod.LogType = js.native
}
object LogDestinationConfig {
  
  @scala.inline
  def apply(LogDestination: LogDestinationMap, LogDestinationType: LogDestinationType, LogType: LogType): LogDestinationConfig = {
    val __obj = js.Dynamic.literal(LogDestination = LogDestination.asInstanceOf[js.Any], LogDestinationType = LogDestinationType.asInstanceOf[js.Any], LogType = LogType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDestinationConfig]
  }
  
  @scala.inline
  implicit class LogDestinationConfigOps[Self <: LogDestinationConfig] (val x: Self) extends AnyVal {
    
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
    def setLogDestination(value: LogDestinationMap): Self = this.set("LogDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDestinationType(value: LogDestinationType): Self = this.set("LogDestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogType(value: LogType): Self = this.set("LogType", value.asInstanceOf[js.Any])
  }
}
