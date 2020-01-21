package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationLogsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to write your logs to CloudWatch Logs or an S3 bucket.
    */
  var iamRoleArn: js.UndefOr[IamRoleArn] = js.native
  /**
    * The settings for your conversation logs. You can log text, audio, or both.
    */
  var logSettings: js.UndefOr[LogSettingsResponseList] = js.native
}

object ConversationLogsResponse {
  @scala.inline
  def apply(iamRoleArn: IamRoleArn = null, logSettings: LogSettingsResponseList = null): ConversationLogsResponse = {
    val __obj = js.Dynamic.literal()
    if (iamRoleArn != null) __obj.updateDynamic("iamRoleArn")(iamRoleArn.asInstanceOf[js.Any])
    if (logSettings != null) __obj.updateDynamic("logSettings")(logSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationLogsResponse]
  }
}

