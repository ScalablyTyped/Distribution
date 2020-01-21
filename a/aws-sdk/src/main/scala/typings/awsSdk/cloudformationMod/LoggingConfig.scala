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
}

