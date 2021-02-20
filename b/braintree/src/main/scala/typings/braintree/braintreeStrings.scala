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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object braintreeStrings {
  
  @js.native
  sealed trait Accepted extends DisputeStatus
  @scala.inline
  def Accepted: Accepted = "Accepted".asInstanceOf[Accepted]
  
  @js.native
  sealed trait Active
    extends MerchantAccountStatus
       with SubscriptionStatus
  @scala.inline
  def Active: Active = "Active".asInstanceOf[Active]
  
  @js.native
  sealed trait AndroidPayCard extends PaymentMethodType
  @scala.inline
  def AndroidPayCard: AndroidPayCard = "AndroidPayCard".asInstanceOf[AndroidPayCard]
  
  @js.native
  sealed trait Api extends TransactionSource
  @scala.inline
  def Api: Api = "Api".asInstanceOf[Api]
  
  @js.native
  sealed trait ApplePayCard extends PaymentMethodType
  @scala.inline
  def ApplePayCard: ApplePayCard = "ApplePayCard".asInstanceOf[ApplePayCard]
  
  @js.native
  sealed trait Canceled extends SubscriptionStatus
  @scala.inline
  def Canceled: Canceled = "Canceled".asInstanceOf[Canceled]
  
  @js.native
  sealed trait ControlPanel extends TransactionSource
  @scala.inline
  def ControlPanel: ControlPanel = "ControlPanel".asInstanceOf[ControlPanel]
  
  @js.native
  sealed trait CreditCard extends PaymentMethodType
  @scala.inline
  def CreditCard: CreditCard = "CreditCard".asInstanceOf[CreditCard]
  
  @js.native
  sealed trait Disputed extends DisputeStatus
  @scala.inline
  def Disputed: Disputed = "Disputed".asInstanceOf[Disputed]
  
  @js.native
  sealed trait Expired
    extends DisputeStatus
       with SubscriptionStatus
  @scala.inline
  def Expired: Expired = "Expired".asInstanceOf[Expired]
  
  @js.native
  sealed trait International extends CustomerLocation
  @scala.inline
  def International: International = "International".asInstanceOf[International]
  
  @js.native
  sealed trait Lost extends DisputeStatus
  @scala.inline
  def Lost: Lost = "Lost".asInstanceOf[Lost]
  
  @js.native
  sealed trait MasterpassCard extends PaymentMethodType
  @scala.inline
  def MasterpassCard: MasterpassCard = "MasterpassCard".asInstanceOf[MasterpassCard]
  
  @js.native
  sealed trait No
    extends Commercial
       with Debit
       with DurbinRegulated
       with HealthCare
       with Payroll
       with Prepaid
  @scala.inline
  def No: No = "No".asInstanceOf[No]
  
  @js.native
  sealed trait Open extends DisputeStatus
  @scala.inline
  def Open: Open = "Open".asInstanceOf[Open]
  
  @js.native
  sealed trait PastDue extends SubscriptionStatus
  @scala.inline
  def PastDue: PastDue = "PastDue".asInstanceOf[PastDue]
  
  @js.native
  sealed trait PayPalAccount extends PaymentMethodType
  @scala.inline
  def PayPalAccount: PayPalAccount = "PayPalAccount".asInstanceOf[PayPalAccount]
  
  @js.native
  sealed trait Pending
    extends MerchantAccountStatus
       with SubscriptionStatus
  @scala.inline
  def Pending: Pending = "Pending".asInstanceOf[Pending]
  
  @js.native
  sealed trait Recurring extends TransactionSource
  @scala.inline
  def Recurring: Recurring = "Recurring".asInstanceOf[Recurring]
  
  @js.native
  sealed trait SamsungPayCard extends PaymentMethodType
  @scala.inline
  def SamsungPayCard: SamsungPayCard = "SamsungPayCard".asInstanceOf[SamsungPayCard]
  
  @js.native
  sealed trait Suspended extends MerchantAccountStatus
  @scala.inline
  def Suspended: Suspended = "Suspended".asInstanceOf[Suspended]
  
  @js.native
  sealed trait US extends CustomerLocation
  @scala.inline
  def US: US = "US".asInstanceOf[US]
  
  @js.native
  sealed trait Unknown
    extends Commercial
       with Debit
       with DurbinRegulated
       with HealthCare
       with Payroll
       with Prepaid
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait UsBankAccount extends PaymentMethodType
  @scala.inline
  def UsBankAccount: UsBankAccount = "UsBankAccount".asInstanceOf[UsBankAccount]
  
  @js.native
  sealed trait VenmoAccount extends PaymentMethodType
  @scala.inline
  def VenmoAccount: VenmoAccount = "VenmoAccount".asInstanceOf[VenmoAccount]
  
  @js.native
  sealed trait VisaCheckoutCard extends PaymentMethodType
  @scala.inline
  def VisaCheckoutCard: VisaCheckoutCard = "VisaCheckoutCard".asInstanceOf[VisaCheckoutCard]
  
  @js.native
  sealed trait Won extends DisputeStatus
  @scala.inline
  def Won: Won = "Won".asInstanceOf[Won]
  
  @js.native
  sealed trait Yes
    extends Commercial
       with Debit
       with DurbinRegulated
       with HealthCare
       with Payroll
       with Prepaid
  @scala.inline
  def Yes: Yes = "Yes".asInstanceOf[Yes]
  
  @js.native
  sealed trait account_updater_daily_report extends StObject
  @scala.inline
  def account_updater_daily_report: account_updater_daily_report = "account_updater_daily_report".asInstanceOf[account_updater_daily_report]
  
  @js.native
  sealed trait android_pay_card extends PaymentInstrumentType
  @scala.inline
  def android_pay_card: android_pay_card = "android_pay_card".asInstanceOf[android_pay_card]
  
  @js.native
  sealed trait api_ extends SubscriptionSource
  @scala.inline
  def api_ : api_ = "api".asInstanceOf[api_]
  
  @js.native
  sealed trait apple_pay_card extends PaymentInstrumentType
  @scala.inline
  def apple_pay_card: apple_pay_card = "apple_pay_card".asInstanceOf[apple_pay_card]
  
  @js.native
  sealed trait application_incomplete extends GatewayRejectionReason
  @scala.inline
  def application_incomplete: application_incomplete = "application_incomplete".asInstanceOf[application_incomplete]
  
  @js.native
  sealed trait approved extends TransactionProcessorResponseType
  @scala.inline
  def approved: approved = "approved".asInstanceOf[approved]
  
  @js.native
  sealed trait authorization_expired extends TransactionStatus
  @scala.inline
  def authorization_expired: authorization_expired = "authorization_expired".asInstanceOf[authorization_expired]
  
  @js.native
  sealed trait authorized extends TransactionStatus
  @scala.inline
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  
  @js.native
  sealed trait authorizing extends TransactionStatus
  @scala.inline
  def authorizing: authorizing = "authorizing".asInstanceOf[authorizing]
  
  @js.native
  sealed trait avs extends GatewayRejectionReason
  @scala.inline
  def avs: avs = "avs".asInstanceOf[avs]
  
  @js.native
  sealed trait avs_and_cvv extends GatewayRejectionReason
  @scala.inline
  def avs_and_cvv: avs_and_cvv = "avs_and_cvv".asInstanceOf[avs_and_cvv]
  
  @js.native
  sealed trait check extends _WebhookNotificationKind
  @scala.inline
  def check: check = "check".asInstanceOf[check]
  
  @js.native
  sealed trait connected_merchant_paypal_status_changed extends _WebhookNotificationKind
  @scala.inline
  def connected_merchant_paypal_status_changed: connected_merchant_paypal_status_changed = "connected_merchant_paypal_status_changed".asInstanceOf[connected_merchant_paypal_status_changed]
  
  @js.native
  sealed trait connected_merchant_status_transitioned extends _WebhookNotificationKind
  @scala.inline
  def connected_merchant_status_transitioned: connected_merchant_status_transitioned = "connected_merchant_status_transitioned".asInstanceOf[connected_merchant_status_transitioned]
  
  @js.native
  sealed trait control_panel extends SubscriptionSource
  @scala.inline
  def control_panel: control_panel = "control_panel".asInstanceOf[control_panel]
  
  @js.native
  sealed trait credit_card extends PaymentInstrumentType
  @scala.inline
  def credit_card: credit_card = "credit_card".asInstanceOf[credit_card]
  
  @js.native
  sealed trait cvv extends GatewayRejectionReason
  @scala.inline
  def cvv: cvv = "cvv".asInstanceOf[cvv]
  
  @js.native
  sealed trait disbursement extends _WebhookNotificationKind
  @scala.inline
  def disbursement: disbursement = "disbursement".asInstanceOf[disbursement]
  
  @js.native
  sealed trait disbursement_exception extends _WebhookNotificationKind
  @scala.inline
  def disbursement_exception: disbursement_exception = "disbursement_exception".asInstanceOf[disbursement_exception]
  
  @js.native
  sealed trait dispute_lost extends DisputeNotificationKind
  @scala.inline
  def dispute_lost: dispute_lost = "dispute_lost".asInstanceOf[dispute_lost]
  
  @js.native
  sealed trait dispute_opened extends DisputeNotificationKind
  @scala.inline
  def dispute_opened: dispute_opened = "dispute_opened".asInstanceOf[dispute_opened]
  
  @js.native
  sealed trait dispute_won extends DisputeNotificationKind
  @scala.inline
  def dispute_won: dispute_won = "dispute_won".asInstanceOf[dispute_won]
  
  @js.native
  sealed trait duplicate extends GatewayRejectionReason
  @scala.inline
  def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  
  @js.native
  sealed trait failed extends TransactionStatus
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fraud extends GatewayRejectionReason
  @scala.inline
  def fraud: fraud = "fraud".asInstanceOf[fraud]
  
  @js.native
  sealed trait gateway_rejected extends TransactionStatus
  @scala.inline
  def gateway_rejected: gateway_rejected = "gateway_rejected".asInstanceOf[gateway_rejected]
  
  @js.native
  sealed trait granted_payment_method_revoked extends _WebhookNotificationKind
  @scala.inline
  def granted_payment_method_revoked: granted_payment_method_revoked = "granted_payment_method_revoked".asInstanceOf[granted_payment_method_revoked]
  
  @js.native
  sealed trait grantor_updated_granted_payment_method extends _WebhookNotificationKind
  @scala.inline
  def grantor_updated_granted_payment_method: grantor_updated_granted_payment_method = "grantor_updated_granted_payment_method".asInstanceOf[grantor_updated_granted_payment_method]
  
  @js.native
  sealed trait hard_declined extends TransactionProcessorResponseType
  @scala.inline
  def hard_declined: hard_declined = "hard_declined".asInstanceOf[hard_declined]
  
  @js.native
  sealed trait held extends EscrowStatus
  @scala.inline
  def held: held = "held".asInstanceOf[held]
  
  @js.native
  sealed trait hold_pending extends EscrowStatus
  @scala.inline
  def hold_pending: hold_pending = "hold_pending".asInstanceOf[hold_pending]
  
  @js.native
  sealed trait local_payment_completed extends _WebhookNotificationKind
  @scala.inline
  def local_payment_completed: local_payment_completed = "local_payment_completed".asInstanceOf[local_payment_completed]
  
  @js.native
  sealed trait masterpass_card extends PaymentInstrumentType
  @scala.inline
  def masterpass_card: masterpass_card = "masterpass_card".asInstanceOf[masterpass_card]
  
  @js.native
  sealed trait oauth_access_revoked extends _WebhookNotificationKind
  @scala.inline
  def oauth_access_revoked: oauth_access_revoked = "oauth_access_revoked".asInstanceOf[oauth_access_revoked]
  
  @js.native
  sealed trait partner_merchant_connected extends _WebhookNotificationKind
  @scala.inline
  def partner_merchant_connected: partner_merchant_connected = "partner_merchant_connected".asInstanceOf[partner_merchant_connected]
  
  @js.native
  sealed trait partner_merchant_declined extends _WebhookNotificationKind
  @scala.inline
  def partner_merchant_declined: partner_merchant_declined = "partner_merchant_declined".asInstanceOf[partner_merchant_declined]
  
  @js.native
  sealed trait partner_merchant_disconnected extends _WebhookNotificationKind
  @scala.inline
  def partner_merchant_disconnected: partner_merchant_disconnected = "partner_merchant_disconnected".asInstanceOf[partner_merchant_disconnected]
  
  @js.native
  sealed trait payment_method_revoked_by_customer extends StObject
  @scala.inline
  def payment_method_revoked_by_customer: payment_method_revoked_by_customer = "payment_method_revoked_by_customer".asInstanceOf[payment_method_revoked_by_customer]
  
  @js.native
  sealed trait paypal_account extends PaymentInstrumentType
  @scala.inline
  def paypal_account: paypal_account = "paypal_account".asInstanceOf[paypal_account]
  
  @js.native
  sealed trait processor_declined extends TransactionStatus
  @scala.inline
  def processor_declined: processor_declined = "processor_declined".asInstanceOf[processor_declined]
  
  @js.native
  sealed trait recipient_updated_granted_payment_method extends _WebhookNotificationKind
  @scala.inline
  def recipient_updated_granted_payment_method: recipient_updated_granted_payment_method = "recipient_updated_granted_payment_method".asInstanceOf[recipient_updated_granted_payment_method]
  
  @js.native
  sealed trait recurring_ extends SubscriptionSource
  @scala.inline
  def recurring_ : recurring_ = "recurring".asInstanceOf[recurring_]
  
  @js.native
  sealed trait refunded extends EscrowStatus
  @scala.inline
  def refunded: refunded = "refunded".asInstanceOf[refunded]
  
  @js.native
  sealed trait release_pending extends EscrowStatus
  @scala.inline
  def release_pending: release_pending = "release_pending".asInstanceOf[release_pending]
  
  @js.native
  sealed trait released extends EscrowStatus
  @scala.inline
  def released: released = "released".asInstanceOf[released]
  
  @js.native
  sealed trait risk_threshold extends GatewayRejectionReason
  @scala.inline
  def risk_threshold: risk_threshold = "risk_threshold".asInstanceOf[risk_threshold]
  
  @js.native
  sealed trait samsung_pay_card extends PaymentInstrumentType
  @scala.inline
  def samsung_pay_card: samsung_pay_card = "samsung_pay_card".asInstanceOf[samsung_pay_card]
  
  @js.native
  sealed trait settled extends TransactionStatus
  @scala.inline
  def settled: settled = "settled".asInstanceOf[settled]
  
  @js.native
  sealed trait settlement_declined extends TransactionStatus
  @scala.inline
  def settlement_declined: settlement_declined = "settlement_declined".asInstanceOf[settlement_declined]
  
  @js.native
  sealed trait settlement_pending extends TransactionStatus
  @scala.inline
  def settlement_pending: settlement_pending = "settlement_pending".asInstanceOf[settlement_pending]
  
  @js.native
  sealed trait settling extends TransactionStatus
  @scala.inline
  def settling: settling = "settling".asInstanceOf[settling]
  
  @js.native
  sealed trait soft_declined extends TransactionProcessorResponseType
  @scala.inline
  def soft_declined: soft_declined = "soft_declined".asInstanceOf[soft_declined]
  
  @js.native
  sealed trait sub_merchant_account_approved extends StObject
  @scala.inline
  def sub_merchant_account_approved: sub_merchant_account_approved = "sub_merchant_account_approved".asInstanceOf[sub_merchant_account_approved]
  
  @js.native
  sealed trait sub_merchant_account_declined extends StObject
  @scala.inline
  def sub_merchant_account_declined: sub_merchant_account_declined = "sub_merchant_account_declined".asInstanceOf[sub_merchant_account_declined]
  
  @js.native
  sealed trait submitted_for_settlement extends TransactionStatus
  @scala.inline
  def submitted_for_settlement: submitted_for_settlement = "submitted_for_settlement".asInstanceOf[submitted_for_settlement]
  
  @js.native
  sealed trait subscription_canceled extends SubscriptionNotificationKind
  @scala.inline
  def subscription_canceled: subscription_canceled = "subscription_canceled".asInstanceOf[subscription_canceled]
  
  @js.native
  sealed trait subscription_charged_successfully extends SubscriptionNotificationKind
  @scala.inline
  def subscription_charged_successfully: subscription_charged_successfully = "subscription_charged_successfully".asInstanceOf[subscription_charged_successfully]
  
  @js.native
  sealed trait subscription_charged_unsuccessfully extends SubscriptionNotificationKind
  @scala.inline
  def subscription_charged_unsuccessfully: subscription_charged_unsuccessfully = "subscription_charged_unsuccessfully".asInstanceOf[subscription_charged_unsuccessfully]
  
  @js.native
  sealed trait subscription_expired extends SubscriptionNotificationKind
  @scala.inline
  def subscription_expired: subscription_expired = "subscription_expired".asInstanceOf[subscription_expired]
  
  @js.native
  sealed trait subscription_trial_ended extends SubscriptionNotificationKind
  @scala.inline
  def subscription_trial_ended: subscription_trial_ended = "subscription_trial_ended".asInstanceOf[subscription_trial_ended]
  
  @js.native
  sealed trait subscription_went_active extends SubscriptionNotificationKind
  @scala.inline
  def subscription_went_active: subscription_went_active = "subscription_went_active".asInstanceOf[subscription_went_active]
  
  @js.native
  sealed trait subscription_went_past_due extends SubscriptionNotificationKind
  @scala.inline
  def subscription_went_past_due: subscription_went_past_due = "subscription_went_past_due".asInstanceOf[subscription_went_past_due]
  
  @js.native
  sealed trait three_d_secure extends GatewayRejectionReason
  @scala.inline
  def three_d_secure: three_d_secure = "three_d_secure".asInstanceOf[three_d_secure]
  
  @js.native
  sealed trait token_issuance extends GatewayRejectionReason
  @scala.inline
  def token_issuance: token_issuance = "token_issuance".asInstanceOf[token_issuance]
  
  @js.native
  sealed trait transaction_disbursed extends TransactionNotificationKind
  @scala.inline
  def transaction_disbursed: transaction_disbursed = "transaction_disbursed".asInstanceOf[transaction_disbursed]
  
  @js.native
  sealed trait transaction_settled extends TransactionNotificationKind
  @scala.inline
  def transaction_settled: transaction_settled = "transaction_settled".asInstanceOf[transaction_settled]
  
  @js.native
  sealed trait transaction_settlement_declined extends TransactionNotificationKind
  @scala.inline
  def transaction_settlement_declined: transaction_settlement_declined = "transaction_settlement_declined".asInstanceOf[transaction_settlement_declined]
  
  @js.native
  sealed trait venmo_account extends PaymentInstrumentType
  @scala.inline
  def venmo_account: venmo_account = "venmo_account".asInstanceOf[venmo_account]
  
  @js.native
  sealed trait visa_checkout_card extends PaymentInstrumentType
  @scala.inline
  def visa_checkout_card: visa_checkout_card = "visa_checkout_card".asInstanceOf[visa_checkout_card]
  
  @js.native
  sealed trait voided extends TransactionStatus
  @scala.inline
  def voided: voided = "voided".asInstanceOf[voided]
}
