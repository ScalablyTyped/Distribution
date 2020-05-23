package typings.braintree.mod

import typings.braintree.anon.CustomerId
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.mod.TransactionNotification
  - typings.braintree.mod.SubMerchantAccountApprovedNotification
  - typings.braintree.mod.SubMerchantAccountDeclinedNotification
  - typings.braintree.mod.SubscriptionNotification
  - typings.braintree.mod.DisputeNotification
  - typings.braintree.mod.AccountUpdaterNotification
  - typings.braintree.mod.PaymentMethodNotification
*/
trait WebhookNotification extends js.Object

object WebhookNotification {
  @scala.inline
  def SubMerchantAccountApprovedNotification(
    kind: SubMerchantAccountApprovedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: Date
  ): WebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def DisputeNotification(dispute: Dispute, kind: DisputeNotificationKind, timestamp: Date): WebhookNotification = {
    val __obj = js.Dynamic.literal(dispute = dispute.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def PaymentMethodNotification(kind: PaymentMethodNotificationKind, revokedPaymentMethodMetadata: CustomerId, timestamp: Date): WebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], revokedPaymentMethodMetadata = revokedPaymentMethodMetadata.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def SubMerchantAccountDeclinedNotification(
    kind: SubMerchantAccountDeclinedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: Date
  ): WebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def SubscriptionNotification(kind: SubscriptionNotificationKind, subscription: Subscription, timestamp: Date): WebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def TransactionNotification(kind: TransactionNotificationKind, timestamp: Date, transaction: Transaction): WebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def AccountUpdaterNotification(
    accountUpdaterDailyReport: AccountUpdaterDailyReport,
    kind: AccountUpdaterNotificationKind,
    timestamp: Date
  ): WebhookNotification = {
    val __obj = js.Dynamic.literal(accountUpdaterDailyReport = accountUpdaterDailyReport.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookNotification]
  }
}

