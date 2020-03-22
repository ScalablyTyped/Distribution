package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudwatchLogsAction extends js.Object {
  /**
    * The CloudWatch log group to which the action sends data.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * The IAM role that allows access to the CloudWatch log.
    */
  var roleArn: AwsArn = js.native
}

object CloudwatchLogsAction {
  @scala.inline
  def apply(logGroupName: LogGroupName, roleArn: AwsArn): CloudwatchLogsAction = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudwatchLogsAction]
  }
}

