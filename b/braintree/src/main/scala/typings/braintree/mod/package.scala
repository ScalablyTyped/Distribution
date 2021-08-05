package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def connect(config: typings.braintree.mod.GatewayConfig): typings.braintree.mod.BraintreeGateway = typings.braintree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(config.asInstanceOf[js.Any]).asInstanceOf[typings.braintree.mod.BraintreeGateway]

type AccountUpdaterNotificationKind = typings.braintree.braintreeStrings.account_updater_daily_report

type AuthenticationError = typings.std.Error

type AuthorizationError = typings.std.Error

type DownForMaintenanceError = typings.std.Error

type InvalidChallengeError = typings.std.Error

type InvalidKeysError = typings.std.Error

type InvalidSignatureError = typings.std.Error

type InvalidTransparentRedirectHashError = typings.std.Error

type NotFoundError = typings.std.Error

type PaymentMethodNotificationKind = typings.braintree.braintreeStrings.payment_method_revoked_by_customer

type ServerError = typings.std.Error

type SubMerchantAccountApprovedNotificationKind = typings.braintree.braintreeStrings.sub_merchant_account_approved

type SubMerchantAccountDeclinedNotificationKind = typings.braintree.braintreeStrings.sub_merchant_account_declined

type TestOperationPerformedInProductionError = typings.std.Error

type TooManyRequestsError = typings.std.Error

type UnexpectedError = typings.std.Error

type UpgradeRequired = typings.std.Error

/* Rewritten from type alias, can be one of: 
  - typings.braintree.mod.AccountUpdaterNotificationKind
  - typings.braintree.mod.DisputeNotificationKind
  - typings.braintree.mod.SubscriptionNotificationKind
  - typings.braintree.mod.SubMerchantAccountApprovedNotificationKind
  - typings.braintree.mod.SubMerchantAccountDeclinedNotificationKind
  - typings.braintree.mod.TransactionNotificationKind
  - typings.braintree.mod.PaymentMethodNotificationKind
  - typings.braintree.braintreeStrings.check
  - typings.braintree.braintreeStrings.connected_merchant_paypal_status_changed
  - typings.braintree.braintreeStrings.connected_merchant_status_transitioned
  - typings.braintree.braintreeStrings.disbursement
  - typings.braintree.braintreeStrings.disbursement_exception
  - typings.braintree.braintreeStrings.grantor_updated_granted_payment_method
  - typings.braintree.braintreeStrings.granted_payment_method_revoked
  - typings.braintree.braintreeStrings.local_payment_completed
  - typings.braintree.braintreeStrings.partner_merchant_connected
  - typings.braintree.braintreeStrings.partner_merchant_disconnected
  - typings.braintree.braintreeStrings.partner_merchant_declined
  - typings.braintree.braintreeStrings.oauth_access_revoked
  - typings.braintree.braintreeStrings.recipient_updated_granted_payment_method
*/
type WebhookNotificationKind = typings.braintree.mod._WebhookNotificationKind | typings.braintree.mod.AccountUpdaterNotificationKind | typings.braintree.mod.SubMerchantAccountApprovedNotificationKind | typings.braintree.mod.SubMerchantAccountDeclinedNotificationKind | typings.braintree.mod.PaymentMethodNotificationKind
