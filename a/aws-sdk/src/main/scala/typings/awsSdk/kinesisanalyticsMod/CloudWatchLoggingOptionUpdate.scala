package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOptionUpdate extends js.Object {
  /**
    * ID of the CloudWatch logging option to update
    */
  var CloudWatchLoggingOptionId: Id = js.native
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.native
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role used must have the PutLogEvents policy action enabled.
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.native
}

object CloudWatchLoggingOptionUpdate {
  @scala.inline
  def apply(
    CloudWatchLoggingOptionId: Id,
    LogStreamARNUpdate: LogStreamARN = null,
    RoleARNUpdate: RoleARN = null
  ): CloudWatchLoggingOptionUpdate = {
    val __obj = js.Dynamic.literal(CloudWatchLoggingOptionId = CloudWatchLoggingOptionId.asInstanceOf[js.Any])
    if (LogStreamARNUpdate != null) __obj.updateDynamic("LogStreamARNUpdate")(LogStreamARNUpdate.asInstanceOf[js.Any])
    if (RoleARNUpdate != null) __obj.updateDynamic("RoleARNUpdate")(RoleARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionUpdate]
  }
}

