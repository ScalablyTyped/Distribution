package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogsLogGroup extends js.Object {
  /**
    * The ARN of the the CloudWatch log group to which you want your logs emitted to. The ARN must end with :* 
    */
  var logGroupArn: js.UndefOr[Arn] = js.native
}

object CloudWatchLogsLogGroup {
  @scala.inline
  def apply(logGroupArn: Arn = null): CloudWatchLogsLogGroup = {
    val __obj = js.Dynamic.literal()
    if (logGroupArn != null) __obj.updateDynamic("logGroupArn")(logGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsLogGroup]
  }
}

