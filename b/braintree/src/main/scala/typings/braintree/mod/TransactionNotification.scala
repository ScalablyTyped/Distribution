package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_TransactionNotification: TransactionNotificationKind = js.native
  var transaction: Transaction = js.native
}

object TransactionNotification {
  @scala.inline
  def apply(kind: TransactionNotificationKind, timestamp: Date, transaction: Transaction): TransactionNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionNotification]
  }
  @scala.inline
  implicit class TransactionNotificationOps[Self <: TransactionNotification] (val x: Self) extends AnyVal {
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
    def setKind(value: TransactionNotificationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransaction(value: Transaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
  }
  
}

