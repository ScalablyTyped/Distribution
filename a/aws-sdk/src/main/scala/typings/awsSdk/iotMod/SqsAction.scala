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
  def apply(queueUrl: QueueUrl, roleArn: AwsArn, useBase64: js.UndefOr[UseBase64] = js.undefined): SqsAction = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(useBase64)) __obj.updateDynamic("useBase64")(useBase64.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqsAction]
  }
}

