package typings.braintree.braintreeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "WebhookNotification")
@js.native
class WebhookNotification () extends js.Object {
  var dispute: js.UndefOr[Dispute] = js.native
  var kind: WebhookNotificationKind = js.native
  var merchantAccount: js.UndefOr[MerchantAccount] = js.native
  var subscription: js.UndefOr[Subscription] = js.native
  var timestamp: Date = js.native
  var transaction: js.UndefOr[Transaction] = js.native
}

