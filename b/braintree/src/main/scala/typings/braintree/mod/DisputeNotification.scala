package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisputeNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  var dispute: Dispute = js.native
  @JSName("kind")
  var kind_DisputeNotification: DisputeNotificationKind = js.native
}

object DisputeNotification {
  @scala.inline
  def apply(dispute: Dispute, kind: DisputeNotificationKind, timestamp: Date): DisputeNotification = {
    val __obj = js.Dynamic.literal(dispute = dispute.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeNotification]
  }
  @scala.inline
  implicit class DisputeNotificationOps[Self <: DisputeNotification] (val x: Self) extends AnyVal {
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
    def setDispute(value: Dispute): Self = this.set("dispute", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: DisputeNotificationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

