package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubMerchantAccountDeclinedNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_SubMerchantAccountDeclinedNotification: SubMerchantAccountDeclinedNotificationKind = js.native
  var merchantAccount: MerchantAccount = js.native
}

object SubMerchantAccountDeclinedNotification {
  @scala.inline
  def apply(
    kind: SubMerchantAccountDeclinedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: Date
  ): SubMerchantAccountDeclinedNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMerchantAccountDeclinedNotification]
  }
  @scala.inline
  implicit class SubMerchantAccountDeclinedNotificationOps[Self <: SubMerchantAccountDeclinedNotification] (val x: Self) extends AnyVal {
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
    def setKind(value: SubMerchantAccountDeclinedNotificationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerchantAccount(value: MerchantAccount): Self = this.set("merchantAccount", value.asInstanceOf[js.Any])
  }
  
}

