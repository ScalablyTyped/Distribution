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
  @scala.inline
  implicit class ConversationLogsRequestOps[Self <: ConversationLogsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIamRoleArn(value: IamRoleArn): Self = this.set("iamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogSettingsVarargs(value: LogSettingsRequest*): Self = this.set("logSettings", js.Array(value :_*))
    @scala.inline
    def setLogSettings(value: LogSettingsRequestList): Self = this.set("logSettings", value.asInstanceOf[js.Any])
  }
  
}

