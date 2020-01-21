package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogDestination extends js.Object {
  /**
    * An object describing a CloudWatch log group. For more information, see AWS::Logs::LogGroup in the AWS CloudFormation User Guide.
    */
  var cloudWatchLogsLogGroup: js.UndefOr[CloudWatchLogsLogGroup] = js.native
}

object LogDestination {
  @scala.inline
  def apply(cloudWatchLogsLogGroup: CloudWatchLogsLogGroup = null): LogDestination = {
    val __obj = js.Dynamic.literal()
    if (cloudWatchLogsLogGroup != null) __obj.updateDynamic("cloudWatchLogsLogGroup")(cloudWatchLogsLogGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDestination]
  }
}

