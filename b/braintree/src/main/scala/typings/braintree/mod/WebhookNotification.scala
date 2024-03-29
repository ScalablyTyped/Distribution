package typings.braintree.mod

import typings.braintree.anon.CustomerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.braintree.mod.TransactionNotification
  - typings.braintree.mod.SubMerchantAccountApprovedNotification
  - typings.braintree.mod.SubMerchantAccountDeclinedNotification
  - typings.braintree.mod.SubscriptionNotification
  - typings.braintree.mod.DisputeNotification
  - typings.braintree.mod.AccountUpdaterNotification
  - typings.braintree.mod.PaymentMethodNotification
  - typings.braintree.mod.DisbursementNotification
*/
trait WebhookNotification extends StObject
object WebhookNotification {
  
  inline def AccountUpdaterNotification(
    accountUpdaterDailyReport: AccountUpdaterDailyReport,
    kind: AccountUpdaterNotificationKind,
    timestamp: js.Date
  ): typings.braintree.mod.AccountUpdaterNotification = {
    val __obj = js.Dynamic.literal(accountUpdaterDailyReport = accountUpdaterDailyReport.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.braintree.mod.AccountUpdaterNotification]
  }
  
  inline def DisbursementNotification(disbursement: Disbursement, kind: DisbursementNotificationKind, timestamp: js.Date): typings.braintree.mod.DisbursementNotification = {
    val __obj = js.Dynamic.literal(disbursement = disbursement.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.braintree.mod.DisbursementNotification]
  }
  
  inline def DisputeNotification(dispute: Dispute, kind: DisputeNotificationKind, timestamp: js.Date): typings.braintree.mod.DisputeNotification = {
    val __obj = js.Dynamic.literal(dispute = dispute.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.braintree.mod.DisputeNotification]
  }
  
  inline def PaymentMethodNotification(kind: PaymentMethodNotificationKind, revokedPaymentMethodMetadata: CustomerId, timestamp: js.Date): typings.braintree.mod.PaymentMethodNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], revokedPaymentMethodMetadata = revokedPaymentMethodMetadata.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.braintree.mod.PaymentMethodNotification]
  }
  
  inline def SubMerchantAccountApprovedNotification(
    kind: SubMerchantAccountApprovedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: js.Date
  ): typings.braintree.mod.SubMerchantAccountApprovedNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.braintree.mod.SubMerchantAccountApprovedNotification]
  }
  
  inline def SubMerchantAccountDeclinedNotification(
    kind: SubMerchantAccountDeclinedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: js.Date
  ): typings.braintree.mod.SubMerchantAccountDeclinedNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.braintree.mod.SubMerchantAccountDeclinedNotification]
  }
  
  inline def SubscriptionNotification(kind: SubscriptionNotificationKind, subscription: Subscription, timestamp: js.Date): typings.braintree.mod.SubscriptionNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.braintree.mod.SubscriptionNotification]
  }
  
  inline def TransactionNotification(kind: TransactionNotificationKind, timestamp: js.Date, transaction: Transaction): typings.braintree.mod.TransactionNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.braintree.mod.TransactionNotification]
  }
}
