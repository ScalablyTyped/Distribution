package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOptionDescription extends js.Object {
  /**
    * ID of the CloudWatch logging option description.
    */
  var CloudWatchLoggingOptionId: js.UndefOr[Id] = js.native
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typings.awsSdk.kinesisanalyticsMod.LogStreamARN = js.native
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role used must have the PutLogEvents policy action enabled.
    */
  var RoleARN: typings.awsSdk.kinesisanalyticsMod.RoleARN = js.native
}

object CloudWatchLoggingOptionDescription {
  @scala.inline
  def apply(LogStreamARN: LogStreamARN, RoleARN: RoleARN): CloudWatchLoggingOptionDescription = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionDescription]
  }
  @scala.inline
  implicit class CloudWatchLoggingOptionDescriptionOps[Self <: CloudWatchLoggingOptionDescription] (val x: Self) extends AnyVal {
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
    def setLogStreamARN(value: LogStreamARN): Self = this.set("LogStreamARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudWatchLoggingOptionId(value: Id): Self = this.set("CloudWatchLoggingOptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLoggingOptionId: Self = this.set("CloudWatchLoggingOptionId", js.undefined)
  }
  
}

