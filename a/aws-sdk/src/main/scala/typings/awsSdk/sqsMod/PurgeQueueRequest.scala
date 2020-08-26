package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurgeQueueRequest extends js.Object {
  /**
    * The URL of the queue from which the PurgeQueue action deletes messages. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object PurgeQueueRequest {
  @scala.inline
  def apply(QueueUrl: String): PurgeQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeQueueRequest]
  }
  @scala.inline
  implicit class PurgeQueueRequestOps[Self <: PurgeQueueRequest] (val x: Self) extends AnyVal {
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
  }
  
}

