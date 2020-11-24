package typings.braintree

import typings.braintree.mod.Commercial
import typings.braintree.mod.CustomerLocation
import typings.braintree.mod.Debit
import typings.braintree.mod.DisputeNotificationKind
import typings.braintree.mod.DisputeStatus
import typings.braintree.mod.DurbinRegulated
import typings.braintree.mod.EscrowStatus
import typings.braintree.mod.GatewayRejectionReason
import typings.braintree.mod.HealthCare
import typings.braintree.mod.MerchantAccountStatus
import typings.braintree.mod.PaymentInstrumentType
import typings.braintree.mod.PaymentMethodType
import typings.braintree.mod.Payroll
import typings.braintree.mod.Prepaid
import typings.braintree.mod.SubscriptionNotificationKind
import typings.braintree.mod.SubscriptionSource
import typings.braintree.mod.SubscriptionStatus
import typings.braintree.mod.TransactionNotificationKind
import typings.braintree.mod.TransactionProcessorResponseType
import typings.braintree.mod.TransactionSource
import typings.braintree.mod.TransactionStatus
import typings.braintree.mod._WebhookNotificationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object braintreeStrings {
  
  @scala.inline
  def Accepted: Accepted = "Accepted".asInstanceOf[Accepted]
  
  @scala.inline
  def Active: Active = "Active".asInstanceOf[Active]
  
  @scala.inline
  def AndroidPayCard: AndroidPayCard = "AndroidPayCard".asInstanceOf[AndroidPayCard]
  
  @scala.inline
  def Api: Api = "Api".asInstanceOf[Api]
  
  @scala.inline
  def ApplePayCard: ApplePayCard = "ApplePayCard".asInstanceOf[ApplePayCard]
  
  @scala.inline
  def Canceled: Canceled = "Canceled".asInstanceOf[Canceled]
  
  @scala.inline
  def ControlPanel: ControlPanel = "ControlPanel".asInstanceOf[ControlPanel]
  
  @scala.inline
  def CreditCard: CreditCard = "CreditCard".asInstanceOf[CreditCard]
  
  @scala.inline
  def Disputed: Disputed = "Disputed".asInstanceOf[Disputed]
  
  @scala.inline
  def Expired: Expired = "Expired".asInstanceOf[Expired]
  
  @scala.inline
  def International: International = "International".asInstanceOf[International]
  
  @scala.inline
  def Lost: Lost = "Lost".asInstanceOf[Lost]
  
  @scala.inline
  def MasterpassCard: MasterpassCard = "MasterpassCard".asInstanceOf[MasterpassCard]
  
  @scala.inline
  def No: No = "No".asInstanceOf[No]
  
  @scala.inline
  def Open: Open = "Open".asInstanceOf[Open]
  
  @scala.inline
  def PastDue: PastDue = "PastDue".asInstanceOf[PastDue]
  
  @scala.inline
  def PayPalAccount: PayPalAccount = "PayPalAccount".asInstanceOf[PayPalAccount]
  
  @scala.inline
  def Pending: Pending = "Pending".asInstanceOf[Pending]
  
  @scala.inline
  def Recurring: Recurring = "Recurring".asInstanceOf[Recurring]
  
  @scala.inline
  def SamsungPayCard: SamsungPayCard = "SamsungPayCard".asInstanceOf[SamsungPayCard]
  
  @scala.inline
  def Suspended: Suspended = "Suspended".asInstanceOf[Suspended]
  
  @scala.inline
  def US: US = "US".asInstanceOf[US]
  
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @scala.inline
  def UsBankAccount: UsBankAccount = "UsBankAccount".asInstanceOf[UsBankAccount]
  
  @scala.inline
  def VenmoAccount: VenmoAccount = "VenmoAccount".asInstanceOf[VenmoAccount]
  
  @scala.inline
  def VisaCheckoutCard: VisaCheckoutCard = "VisaCheckoutCard".asInstanceOf[VisaCheckoutCard]
  
  @scala.inline
  def Won: Won = "Won".asInstanceOf[Won]
  
  @scala.inline
  def Yes: Yes = "Yes".asInstanceOf[Yes]
  
  @scala.inline
  def account_updater_daily_report: account_updater_daily_report = "account_updater_daily_report".asInstanceOf[account_updater_daily_report]
  
  @scala.inline
  def android_pay_card: android_pay_card = "android_pay_card".asInstanceOf[android_pay_card]
  
  @scala.inline
  def api_ : api_ = "api".asInstanceOf[api_]
  
  @scala.inline
  def apple_pay_card: apple_pay_card = "apple_pay_card".asInstanceOf[apple_pay_card]
  
  @scala.inline
  def application_incomplete: application_incomplete = "application_incomplete".asInstanceOf[application_incomplete]
  
  @scala.inline
  def approved: approved = "approved".asInstanceOf[approved]
  
  @scala.inline
  def authorization_expired: authorization_expired = "authorization_expired".asInstanceOf[authorization_expired]
  
  @scala.inline
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  
  @scala.inline
  def authorizing: authorizing = "authorizing".asInstanceOf[authorizing]
  
  @scala.inline
  def avs: avs = "avs".asInstanceOf[avs]
  
  @scala.inline
  def avs_and_cvv: avs_and_cvv = "avs_and_cvv".asInstanceOf[avs_and_cvv]
  
  @scala.inline
  def check: check = "check".asInstanceOf[check]
  
  @scala.inline
  def connected_merchant_paypal_status_changed: connected_merchant_paypal_status_changed = "connected_merchant_paypal_status_changed".asInstanceOf[connected_merchant_paypal_status_changed]
  
  @scala.inline
  def connected_merchant_status_transitioned: connected_merchant_status_transitioned = "connected_merchant_status_transitioned".asInstanceOf[connected_merchant_status_transitioned]
  
  @scala.inline
  def control_panel: control_panel = "control_panel".asInstanceOf[control_panel]
  
  @scala.inline
  def credit_card: credit_card = "credit_card".asInstanceOf[credit_card]
  
  @scala.inline
  def cvv: cvv = "cvv".asInstanceOf[cvv]
  
  @scala.inline
  def disbursement: disbursement = "disbursement".asInstanceOf[disbursement]
  
  @scala.inline
  def disbursement_exception: disbursement_exception = "disbursement_exception".asInstanceOf[disbursement_exception]
  
  @scala.inline
  def dispute_lost: dispute_lost = "dispute_lost".asInstanceOf[dispute_lost]
  
  @scala.inline
  def dispute_opened: dispute_opened = "dispute_opened".asInstanceOf[dispute_opened]
  
  @scala.inline
  def dispute_won: dispute_won = "dispute_won".asInstanceOf[dispute_won]
  
  @scala.inline
  def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @scala.inline
  def fraud: fraud = "fraud".asInstanceOf[fraud]
  
  @scala.inline
  def gateway_rejected: gateway_rejected = "gateway_rejected".asInstanceOf[gateway_rejected]
  
  @scala.inline
  def granted_payment_method_revoked: granted_payment_method_revoked = "granted_payment_method_revoked".asInstanceOf[granted_payment_method_revoked]
  
  @scala.inline
  def grantor_updated_granted_payment_method: grantor_updated_granted_payment_method = "grantor_updated_granted_payment_method".asInstanceOf[grantor_updated_granted_payment_method]
  
  @scala.inline
  def hard_declined: hard_declined = "hard_declined".asInstanceOf[hard_declined]
  
  @scala.inline
  def held: held = "held".asInstanceOf[held]
  
  @scala.inline
  def hold_pending: hold_pending = "hold_pending".asInstanceOf[hold_pending]
  
  @scala.inline
  def local_payment_completed: local_payment_completed = "local_payment_completed".asInstanceOf[local_payment_completed]
  
  @scala.inline
  def masterpass_card: masterpass_card = "masterpass_card".asInstanceOf[masterpass_card]
  
  @scala.inline
  def oauth_access_revoked: oauth_access_revoked = "oauth_access_revoked".asInstanceOf[oauth_access_revoked]
  
  @scala.inline
  def partner_merchant_connected: partner_merchant_connected = "partner_merchant_connected".asInstanceOf[partner_merchant_connected]
  
  @scala.inline
  def partner_merchant_declined: partner_merchant_declined = "partner_merchant_declined".asInstanceOf[partner_merchant_declined]
  
  @scala.inline
  def partner_merchant_disconnected: partner_merchant_disconnected = "partner_merchant_disconnected".asInstanceOf[partner_merchant_disconnected]
  
  @scala.inline
  def payment_method_revoked_by_customer: payment_method_revoked_by_customer = "payment_method_revoked_by_customer".asInstanceOf[payment_method_revoked_by_customer]
  
  @scala.inline
  def paypal_account: paypal_account = "paypal_account".asInstanceOf[paypal_account]
  
  @scala.inline
  def processor_declined: processor_declined = "processor_declined".asInstanceOf[processor_declined]
  
  @scala.inline
  def recipient_updated_granted_payment_method: recipient_updated_granted_payment_method = "recipient_updated_granted_payment_method".asInstanceOf[recipient_updated_granted_payment_method]
  
  @scala.inline
  def recurring_ : recurring_ = "recurring".asInstanceOf[recurring_]
  
  @scala.inline
  def refunded: refunded = "refunded".asInstanceOf[refunded]
  
  @scala.inline
  def release_pending: release_pending = "release_pending".asInstanceOf[release_pending]
  
  @scala.inline
  def released: released = "released".asInstanceOf[released]
  
  @scala.inline
  def risk_threshold: risk_threshold = "risk_threshold".asInstanceOf[risk_threshold]
  
  @scala.inline
  def samsung_pay_card: samsung_pay_card = "samsung_pay_card".asInstanceOf[samsung_pay_card]
  
  @scala.inline
  def settled: settled = "settled".asInstanceOf[settled]
  
  @scala.inline
  def settlement_declined: settlement_declined = "settlement_declined".asInstanceOf[settlement_declined]
  
  @scala.inline
  def settlement_pending: settlement_pending = "settlement_pending".asInstanceOf[settlement_pending]
  
  @scala.inline
  def settling: settling = "settling".asInstanceOf[settling]
  
  @scala.inline
  def soft_declined: soft_declined = "soft_declined".asInstanceOf[soft_declined]
  
  @scala.inline
  def sub_merchant_account_approved: sub_merchant_account_approved = "sub_merchant_account_approved".asInstanceOf[sub_merchant_account_approved]
  
  @scala.inline
  def sub_merchant_account_declined: sub_merchant_account_declined = "sub_merchant_account_declined".asInstanceOf[sub_merchant_account_declined]
  
  @scala.inline
  def submitted_for_settlement: submitted_for_settlement = "submitted_for_settlement".asInstanceOf[submitted_for_settlement]
  
  @scala.inline
  def subscription_canceled: subscription_canceled = "subscription_canceled".asInstanceOf[subscription_canceled]
  
  @scala.inline
  def subscription_charged_successfully: subscription_charged_successfully = "subscription_charged_successfully".asInstanceOf[subscription_charged_successfully]
  
  @scala.inline
  def subscription_charged_unsuccessfully: subscription_charged_unsuccessfully = "subscription_charged_unsuccessfully".asInstanceOf[subscription_charged_unsuccessfully]
  
  @scala.inline
  def subscription_expired: subscription_expired = "subscription_expired".asInstanceOf[subscription_expired]
  
  @scala.inline
  def subscription_trial_ended: subscription_trial_ended = "subscription_trial_ended".asInstanceOf[subscription_trial_ended]
  
  @scala.inline
  def subscription_went_active: subscription_went_active = "subscription_went_active".asInstanceOf[subscription_went_active]
  
  @scala.inline
  def subscription_went_past_due: subscription_went_past_due = "subscription_went_past_due".asInstanceOf[subscription_went_past_due]
  
  @scala.inline
  def three_d_secure: three_d_secure = "three_d_secure".asInstanceOf[three_d_secure]
  
  @scala.inline
  def token_issuance: token_issuance = "token_issuance".asInstanceOf[token_issuance]
  
  @scala.inline
  def transaction_disbursed: transaction_disbursed = "transaction_disbursed".asInstanceOf[transaction_disbursed]
  
  @scala.inline
  def transaction_settled: transaction_settled = "transaction_settled".asInstanceOf[transaction_settled]
  
  @scala.inline
  def transaction_settlement_declined: transaction_settlement_declined = "transaction_settlement_declined".asInstanceOf[transaction_settlement_declined]
  
  @scala.inline
  def venmo_account: venmo_account = "venmo_account".asInstanceOf[venmo_account]
  
  @scala.inline
  def visa_checkout_card: visa_checkout_card = "visa_checkout_card".asInstanceOf[visa_checkout_card]
  
  @scala.inline
  def voided: voided = "voided".asInstanceOf[voided]
  
  @js.native
  sealed trait Accepted extends DisputeStatus
  
  @js.native
  sealed trait Active
    extends MerchantAccountStatus
       with SubscriptionStatus
  
  @js.native
  sealed trait AndroidPayCard extends PaymentMethodType
  
  @js.native
  sealed trait Api extends TransactionSource
  
  @js.native
  sealed trait ApplePayCard extends PaymentMethodType
  
  @js.native
  sealed trait Canceled extends SubscriptionStatus
  
  @js.native
  sealed trait ControlPanel extends TransactionSource
  
  @js.native
  sealed trait CreditCard extends PaymentMethodType
  
  @js.native
  sealed trait Disputed extends DisputeStatus
  
  @js.native
  sealed trait Expired
    extends DisputeStatus
       with SubscriptionStatus
  
  @js.native
  sealed trait International extends CustomerLocation
  
  @js.native
  sealed trait Lost extends DisputeStatus
  
  @js.native
  sealed trait MasterpassCard extends PaymentMethodType
  
  @js.native
  sealed trait No
    extends Commercial
       with Debit
       with DurbinRegulated
       with HealthCare
       with Payroll
       with Prepaid
  
  @js.native
  sealed trait Open extends DisputeStatus
  
  @js.native
  sealed trait PastDue extends SubscriptionStatus
  
  @js.native
  sealed trait PayPalAccount extends PaymentMethodType
  
  @js.native
  sealed trait Pending
    extends MerchantAccountStatus
       with SubscriptionStatus
  
  @js.native
  sealed trait Recurring extends TransactionSource
  
  @js.native
  sealed trait SamsungPayCard extends PaymentMethodType
  
  @js.native
  sealed trait Suspended extends MerchantAccountStatus
  
  @js.native
  sealed trait US extends CustomerLocation
  
  @js.native
  sealed trait Unknown
    extends Commercial
       with Debit
       with DurbinRegulated
       with HealthCare
       with Payroll
       with Prepaid
  
  @js.native
  sealed trait UsBankAccount extends PaymentMethodType
  
  @js.native
  sealed trait VenmoAccount extends PaymentMethodType
  
  @js.native
  sealed trait VisaCheckoutCard extends PaymentMethodType
  
  @js.native
  sealed trait Won extends DisputeStatus
  
  @js.native
  sealed trait Yes
    extends Commercial
       with Debit
       with DurbinRegulated
       with HealthCare
       with Payroll
       with Prepaid
  
  @js.native
  sealed trait account_updater_daily_report extends js.Object
  
  @js.native
  sealed trait android_pay_card extends PaymentInstrumentType
  
  @js.native
  sealed trait api_ extends SubscriptionSource
  
  @js.native
  sealed trait apple_pay_card extends PaymentInstrumentType
  
  @js.native
  sealed trait application_incomplete extends GatewayRejectionReason
  
  @js.native
  sealed trait approved extends TransactionProcessorResponseType
  
  @js.native
  sealed trait authorization_expired extends TransactionStatus
  
  @js.native
  sealed trait authorized extends TransactionStatus
  
  @js.native
  sealed trait authorizing extends TransactionStatus
  
  @js.native
  sealed trait avs extends GatewayRejectionReason
  
  @js.native
  sealed trait avs_and_cvv extends GatewayRejectionReason
  
  @js.native
  sealed trait check extends _WebhookNotificationKind
  
  @js.native
  sealed trait connected_merchant_paypal_status_changed extends _WebhookNotificationKind
  
  @js.native
  sealed trait connected_merchant_status_transitioned extends _WebhookNotificationKind
  
  @js.native
  sealed trait control_panel extends SubscriptionSource
  
  @js.native
  sealed trait credit_card extends PaymentInstrumentType
  
  @js.native
  sealed trait cvv extends GatewayRejectionReason
  
  @js.native
  sealed trait disbursement extends _WebhookNotificationKind
  
  @js.native
  sealed trait disbursement_exception extends _WebhookNotificationKind
  
  @js.native
  sealed trait dispute_lost extends DisputeNotificationKind
  
  @js.native
  sealed trait dispute_opened extends DisputeNotificationKind
  
  @js.native
  sealed trait dispute_won extends DisputeNotificationKind
  
  @js.native
  sealed trait duplicate extends GatewayRejectionReason
  
  @js.native
  sealed trait failed extends TransactionStatus
  
  @js.native
  sealed trait fraud extends GatewayRejectionReason
  
  @js.native
  sealed trait gateway_rejected extends TransactionStatus
  
  @js.native
  sealed trait granted_payment_method_revoked extends _WebhookNotificationKind
  
  @js.native
  sealed trait grantor_updated_granted_payment_method extends _WebhookNotificationKind
  
  @js.native
  sealed trait hard_declined extends TransactionProcessorResponseType
  
  @js.native
  sealed trait held extends EscrowStatus
  
  @js.native
  sealed trait hold_pending extends EscrowStatus
  
  @js.native
  sealed trait local_payment_completed extends _WebhookNotificationKind
  
  @js.native
  sealed trait masterpass_card extends PaymentInstrumentType
  
  @js.native
  sealed trait oauth_access_revoked extends _WebhookNotificationKind
  
  @js.native
  sealed trait partner_merchant_connected extends _WebhookNotificationKind
  
  @js.native
  sealed trait partner_merchant_declined extends _WebhookNotificationKind
  
  @js.native
  sealed trait partner_merchant_disconnected extends _WebhookNotificationKind
  
  @js.native
  sealed trait payment_method_revoked_by_customer extends js.Object
  
  @js.native
  sealed trait paypal_account extends PaymentInstrumentType
  
  @js.native
  sealed trait processor_declined extends TransactionStatus
  
  @js.native
  sealed trait recipient_updated_granted_payment_method extends _WebhookNotificationKind
  
  @js.native
  sealed trait recurring_ extends SubscriptionSource
  
  @js.native
  sealed trait refunded extends EscrowStatus
  
  @js.native
  sealed trait release_pending extends EscrowStatus
  
  @js.native
  sealed trait released extends EscrowStatus
  
  @js.native
  sealed trait risk_threshold extends GatewayRejectionReason
  
  @js.native
  sealed trait samsung_pay_card extends PaymentInstrumentType
  
  @js.native
  sealed trait settled extends TransactionStatus
  
  @js.native
  sealed trait settlement_declined extends TransactionStatus
  
  @js.native
  sealed trait settlement_pending extends TransactionStatus
  
  @js.native
  sealed trait settling extends TransactionStatus
  
  @js.native
  sealed trait soft_declined extends TransactionProcessorResponseType
  
  @js.native
  sealed trait sub_merchant_account_approved extends js.Object
  
  @js.native
  sealed trait sub_merchant_account_declined extends js.Object
  
  @js.native
  sealed trait submitted_for_settlement extends TransactionStatus
  
  @js.native
  sealed trait subscription_canceled extends SubscriptionNotificationKind
  
  @js.native
  sealed trait subscription_charged_successfully extends SubscriptionNotificationKind
  
  @js.native
  sealed trait subscription_charged_unsuccessfully extends SubscriptionNotificationKind
  
  @js.native
  sealed trait subscription_expired extends SubscriptionNotificationKind
  
  @js.native
  sealed trait subscription_trial_ended extends SubscriptionNotificationKind
  
  @js.native
  sealed trait subscription_went_active extends SubscriptionNotificationKind
  
  @js.native
  sealed trait subscription_went_past_due extends SubscriptionNotificationKind
  
  @js.native
  sealed trait three_d_secure extends GatewayRejectionReason
  
  @js.native
  sealed trait token_issuance extends GatewayRejectionReason
  
  @js.native
  sealed trait transaction_disbursed extends TransactionNotificationKind
  
  @js.native
  sealed trait transaction_settled extends TransactionNotificationKind
  
  @js.native
  sealed trait transaction_settlement_declined extends TransactionNotificationKind
  
  @js.native
  sealed trait venmo_account extends PaymentInstrumentType
  
  @js.native
  sealed trait visa_checkout_card extends PaymentInstrumentType
  
  @js.native
  sealed trait voided extends TransactionStatus
}
