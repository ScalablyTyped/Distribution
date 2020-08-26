package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyWorkersFailureStatus extends js.Object {
  /**
    *  Encoded value for the failure type. 
    */
  var NotifyWorkersFailureCode: js.UndefOr[typings.awsSdk.mturkMod.NotifyWorkersFailureCode] = js.native
  /**
    *  A message detailing the reason the Worker could not be notified. 
    */
  var NotifyWorkersFailureMessage: js.UndefOr[String] = js.native
  /**
    *  The ID of the Worker.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object NotifyWorkersFailureStatus {
  @scala.inline
  def apply(): NotifyWorkersFailureStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyWorkersFailureStatus]
  }
  @scala.inline
  implicit class NotifyWorkersFailureStatusOps[Self <: NotifyWorkersFailureStatus] (val x: Self) extends AnyVal {
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
    def setNotifyWorkersFailureCode(value: NotifyWorkersFailureCode): Self = this.set("NotifyWorkersFailureCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyWorkersFailureCode: Self = this.set("NotifyWorkersFailureCode", js.undefined)
    @scala.inline
    def setNotifyWorkersFailureMessage(value: String): Self = this.set("NotifyWorkersFailureMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyWorkersFailureMessage: Self = this.set("NotifyWorkersFailureMessage", js.undefined)
    @scala.inline
    def setWorkerId(value: CustomerId): Self = this.set("WorkerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerId: Self = this.set("WorkerId", js.undefined)
  }
  
}

