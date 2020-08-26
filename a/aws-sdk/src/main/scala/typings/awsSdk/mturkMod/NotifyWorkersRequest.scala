package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyWorkersRequest extends js.Object {
  /**
    * The text of the email message to send. Can include up to 4,096 characters
    */
  var MessageText: String = js.native
  /**
    * The subject line of the email message to send. Can include up to 200 characters.
    */
  var Subject: String = js.native
  /**
    * A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
    */
  var WorkerIds: CustomerIdList = js.native
}

object NotifyWorkersRequest {
  @scala.inline
  def apply(MessageText: String, Subject: String, WorkerIds: CustomerIdList): NotifyWorkersRequest = {
    val __obj = js.Dynamic.literal(MessageText = MessageText.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], WorkerIds = WorkerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyWorkersRequest]
  }
  @scala.inline
  implicit class NotifyWorkersRequestOps[Self <: NotifyWorkersRequest] (val x: Self) extends AnyVal {
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
    def setMessageText(value: String): Self = this.set("MessageText", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkerIdsVarargs(value: CustomerId*): Self = this.set("WorkerIds", js.Array(value :_*))
    @scala.inline
    def setWorkerIds(value: CustomerIdList): Self = this.set("WorkerIds", value.asInstanceOf[js.Any])
  }
  
}

