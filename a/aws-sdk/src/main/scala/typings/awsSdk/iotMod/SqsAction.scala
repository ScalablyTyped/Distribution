package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqsAction extends js.Object {
  /**
    * The URL of the Amazon SQS queue.
    */
  var queueUrl: QueueUrl = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn = js.native
  /**
    * Specifies whether to use Base64 encoding.
    */
  var useBase64: js.UndefOr[UseBase64] = js.native
}

object SqsAction {
  @scala.inline
  def apply(queueUrl: QueueUrl, roleArn: AwsArn): SqsAction = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqsAction]
  }
  @scala.inline
  implicit class SqsActionOps[Self <: SqsAction] (val x: Self) extends AnyVal {
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
    def setQueueUrl(value: QueueUrl): Self = this.set("queueUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseBase64(value: UseBase64): Self = this.set("useBase64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBase64: Self = this.set("useBase64", js.undefined)
  }
  
}

