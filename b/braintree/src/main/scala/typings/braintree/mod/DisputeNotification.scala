package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisputeNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  var dispute: Dispute
  @JSName("kind")
  var kind_DisputeNotification: DisputeNotificationKind
}

object DisputeNotification {
  @scala.inline
  def apply(dispute: Dispute, kind: DisputeNotificationKind, timestamp: Date): DisputeNotification = {
    val __obj = js.Dynamic.literal(dispute = dispute.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeNotification]
  }
}

