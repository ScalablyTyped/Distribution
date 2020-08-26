package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueueUrlRequest extends js.Object {
  /**
    * The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric characters, hyphens (-), and underscores (_). Queue URLs and names are case-sensitive.
    */
  var QueueName: String = js.native
  /**
    * The AWS account ID of the account that created the queue.
    */
  var QueueOwnerAWSAccountId: js.UndefOr[String] = js.native
}

object GetQueueUrlRequest {
  @scala.inline
  def apply(QueueName: String): GetQueueUrlRequest = {
    val __obj = js.Dynamic.literal(QueueName = QueueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueUrlRequest]
  }
  @scala.inline
  implicit class GetQueueUrlRequestOps[Self <: GetQueueUrlRequest] (val x: Self) extends AnyVal {
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
    def setQueueName(value: String): Self = this.set("QueueName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueOwnerAWSAccountId(value: String): Self = this.set("QueueOwnerAWSAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueOwnerAWSAccountId: Self = this.set("QueueOwnerAWSAccountId", js.undefined)
  }
  
}

