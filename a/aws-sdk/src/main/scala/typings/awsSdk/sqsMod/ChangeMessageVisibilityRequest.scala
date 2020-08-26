package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeMessageVisibilityRequest extends js.Object {
  /**
    * The URL of the Amazon SQS queue whose message's visibility is changed. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
  /**
    * The receipt handle associated with the message whose visibility timeout is changed. This parameter is returned by the  ReceiveMessage  action.
    */
  var ReceiptHandle: String = js.native
  /**
    * The new value for the message's visibility timeout (in seconds). Values values: 0 to 43200. Maximum: 12 hours.
    */
  var VisibilityTimeout: Integer = js.native
}

object ChangeMessageVisibilityRequest {
  @scala.inline
  def apply(QueueUrl: String, ReceiptHandle: String, VisibilityTimeout: Integer): ChangeMessageVisibilityRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any], VisibilityTimeout = VisibilityTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityRequest]
  }
  @scala.inline
  implicit class ChangeMessageVisibilityRequestOps[Self <: ChangeMessageVisibilityRequest] (val x: Self) extends AnyVal {
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
    def setQueueUrl(value: String): Self = this.set("QueueUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceiptHandle(value: String): Self = this.set("ReceiptHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibilityTimeout(value: Integer): Self = this.set("VisibilityTimeout", value.asInstanceOf[js.Any])
  }
  
}

