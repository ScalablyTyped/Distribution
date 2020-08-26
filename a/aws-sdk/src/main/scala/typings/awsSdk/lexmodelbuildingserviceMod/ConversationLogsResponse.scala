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
  def apply(): ConversationLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationLogsResponse]
  }
  @scala.inline
  implicit class ConversationLogsResponseOps[Self <: ConversationLogsResponse] (val x: Self) extends AnyVal {
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
    def deleteIamRoleArn: Self = this.set("iamRoleArn", js.undefined)
    @scala.inline
    def setLogSettingsVarargs(value: LogSettingsResponse*): Self = this.set("logSettings", js.Array(value :_*))
    @scala.inline
    def setLogSettings(value: LogSettingsResponseList): Self = this.set("logSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogSettings: Self = this.set("logSettings", js.undefined)
  }
  
}

