package typings.braintree.mod

import typings.braintree.anon.CustomerId
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_PaymentMethodNotification: PaymentMethodNotificationKind = js.native
  var revokedPaymentMethodMetadata: CustomerId = js.native
}

object PaymentMethodNotification {
  @scala.inline
  def apply(kind: PaymentMethodNotificationKind, revokedPaymentMethodMetadata: CustomerId, timestamp: Date): PaymentMethodNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], revokedPaymentMethodMetadata = revokedPaymentMethodMetadata.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodNotification]
  }
  @scala.inline
  implicit class PaymentMethodNotificationOps[Self <: PaymentMethodNotification] (val x: Self) extends AnyVal {
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
    def setKind(value: PaymentMethodNotificationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevokedPaymentMethodMetadata(value: CustomerId): Self = this.set("revokedPaymentMethodMetadata", value.asInstanceOf[js.Any])
  }
  
}

