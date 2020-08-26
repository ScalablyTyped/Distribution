package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfig extends js.Object {
  /**
    * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type's handlers.
    */
  var LogGroupName: typings.awsSdk.cloudformationMod.LogGroupName = js.native
  /**
    * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
    */
  var LogRoleArn: RoleArn = js.native
}

object LoggingConfig {
  @scala.inline
  def apply(LogGroupName: LogGroupName, LogRoleArn: RoleArn): LoggingConfig = {
    val __obj = js.Dynamic.literal(LogGroupName = LogGroupName.asInstanceOf[js.Any], LogRoleArn = LogRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfig]
  }
  @scala.inline
  implicit class LoggingConfigOps[Self <: LoggingConfig] (val x: Self) extends AnyVal {
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
    def setLogGroupName(value: LogGroupName): Self = this.set("LogGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogRoleArn(value: RoleArn): Self = this.set("LogRoleArn", value.asInstanceOf[js.Any])
  }
  
}

