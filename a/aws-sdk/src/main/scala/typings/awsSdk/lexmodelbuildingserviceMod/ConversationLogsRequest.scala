package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationLogsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an IAM role with permission to write to your CloudWatch Logs for text logs and your S3 bucket for audio logs. If audio encryption is enabled, this role also provides access permission for the AWS KMS key used for encrypting audio logs. For more information, see Creating an IAM Role and Policy for Conversation Logs.
    */
  var iamRoleArn: IamRoleArn = js.native
  /**
    * The settings for your conversation logs. You can log the conversation text, conversation audio, or both.
    */
  var logSettings: LogSettingsRequestList = js.native
}

object ConversationLogsRequest {
  @scala.inline
  def apply(iamRoleArn: IamRoleArn, logSettings: LogSettingsRequestList): ConversationLogsRequest = {
    val __obj = js.Dynamic.literal(iamRoleArn = iamRoleArn.asInstanceOf[js.Any], logSettings = logSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationLogsRequest]
  }
}

