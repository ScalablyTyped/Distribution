package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryLoggingConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs to.
    */
  var CloudWatchLogsLogGroupArn: typings.awsSdk.route53Mod.CloudWatchLogsLogGroupArn = js.native
  /**
    * The ID of the hosted zone that CloudWatch Logs is logging queries for. 
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * The ID for a configuration for DNS query logging.
    */
  var Id: QueryLoggingConfigId = js.native
}

object QueryLoggingConfig {
  @scala.inline
  def apply(
    CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn,
    HostedZoneId: ResourceId,
    Id: QueryLoggingConfigId
  ): QueryLoggingConfig = {
    val __obj = js.Dynamic.literal(CloudWatchLogsLogGroupArn = CloudWatchLogsLogGroupArn.asInstanceOf[js.Any], HostedZoneId = HostedZoneId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLoggingConfig]
  }
  @scala.inline
  implicit class QueryLoggingConfigOps[Self <: QueryLoggingConfig] (val x: Self) extends AnyVal {
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
    def setCloudWatchLogsLogGroupArn(value: CloudWatchLogsLogGroupArn): Self = this.set("CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: QueryLoggingConfigId): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
  
}

