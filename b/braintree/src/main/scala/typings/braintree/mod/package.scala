package typings.braintree.mod

import typings.braintree.anon.AuthorizationExpiredAt
import typings.braintree.anon.Between
import typings.braintree.anon.Contains
import typings.braintree.anon.EndsWith
import typings.braintree.anon.In
import typings.braintree.anon.Is
import typings.braintree.anon.`0`
import typings.braintree.braintreeStrings.account_updater_daily_report
import typings.braintree.braintreeStrings.payment_method_revoked_by_customer
import typings.braintree.braintreeStrings.sub_merchant_account_approved
import typings.braintree.braintreeStrings.sub_merchant_account_declined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountUpdaterNotificationKind = account_updater_daily_report

type AuthenticationError = js.Error

type AuthorizationError = js.Error

type EqualitySearchFn[T] = js.Function0[Is[T]]

type GatewayTimeoutError = js.Error

type InvalidChallengeError = js.Error

type InvalidKeysError = js.Error

type InvalidSignatureError = js.Error

type KeyValueSearchFn[T] = js.Function0[`0`[T]]

type MultiValueSearchFn[T] = js.Function0[In[T]]

type NotFoundError = js.Error

type PartialMatchSearchFn[T] = js.Function0[EndsWith[T]]

type PaymentMethodNotificationKind = payment_method_revoked_by_customer

type RangeFieldSearchFn[T] = js.Function0[Between[T]]

type RequestTimeoutError = js.Error

type ServerError = js.Error

type ServiceUnavailableError = js.Error

type SubMerchantAccountApprovedNotificationKind = sub_merchant_account_approved

type SubMerchantAccountDeclinedNotificationKind = sub_merchant_account_declined

type TestOperationPerformedInProductionError = js.Error

type TextFieldSearchFn = js.Function0[Contains]

type TooManyRequestsError = js.Error

type TransactionSearchFn = js.Function1[/* search */ AuthorizationExpiredAt, Unit]

type UnexpectedError = js.Error

type UpgradeRequired = js.Error

/* Rewritten from type alias, can be one of: 
  - typings.braintree.mod.AccountUpdaterNotificationKind
  - typings.braintree.mod.DisputeNotificationKind
  - typings.braintree.mod.SubscriptionNotificationKind
  - typings.braintree.mod.SubMerchantAccountApprovedNotificationKind
  - typings.braintree.mod.SubMerchantAccountDeclinedNotificationKind
  - typings.braintree.mod.TransactionNotificationKind
  - typings.braintree.mod.PaymentMethodNotificationKind
  - typings.braintree.mod.DisbursementNotificationKind
  - typings.braintree.braintreeStrings.check
  - typings.braintree.braintreeStrings.connected_merchant_paypal_status_changed
  - typings.braintree.braintreeStrings.connected_merchant_status_transitioned
  - typings.braintree.braintreeStrings.grantor_updated_granted_payment_method
  - typings.braintree.braintreeStrings.granted_payment_method_revoked
  - typings.braintree.braintreeStrings.local_payment_completed
  - typings.braintree.braintreeStrings.partner_merchant_connected
  - typings.braintree.braintreeStrings.partner_merchant_disconnected
  - typings.braintree.braintreeStrings.partner_merchant_declined
  - typings.braintree.braintreeStrings.oauth_access_revoked
  - typings.braintree.braintreeStrings.recipient_updated_granted_payment_method
*/
type WebhookNotificationKind = _WebhookNotificationKind | AccountUpdaterNotificationKind | SubMerchantAccountApprovedNotificationKind | SubMerchantAccountDeclinedNotificationKind | PaymentMethodNotificationKind
