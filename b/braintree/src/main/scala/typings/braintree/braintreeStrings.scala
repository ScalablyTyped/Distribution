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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object braintreeStrings {
  
  @js.native
  sealed trait Accepted
    extends StObject
       with DisputeStatus
  inline def Accepted: Accepted = "Accepted".asInstanceOf[Accepted]
  
  @js.native
  sealed trait Active
    extends StObject
       with MerchantAccountStatus
       with SubscriptionStatus
  inline def Active: Active = "Active".asInstanceOf[Active]
  
  @js.native
  sealed trait AndroidPayCard
    extends StObject
       with PaymentMethodType
  inline def AndroidPayCard: AndroidPayCard = "AndroidPayCard".asInstanceOf[AndroidPayCard]
  
  @js.native
  sealed trait Api
    extends StObject
       with TransactionSource
  inline def Api: Api = "Api".asInstanceOf[Api]
  
  @js.native
  sealed trait ApplePayCard
    extends StObject
       with PaymentMethodType
  inline def ApplePayCard: ApplePayCard = "ApplePayCard".asInstanceOf[ApplePayCard]
  
  @js.native
  sealed trait Canceled
    extends StObject
       with SubscriptionStatus
  inline def Canceled: Canceled = "Canceled".asInstanceOf[Canceled]
  
  @js.native
  sealed trait ControlPanel
    extends StObject
       with TransactionSource
  inline def ControlPanel: ControlPanel = "ControlPanel".asInstanceOf[ControlPanel]
  
  @js.native
  sealed trait CreditCard
    extends StObject
       with PaymentMethodType
  inline def CreditCard: CreditCard = "CreditCard".asInstanceOf[CreditCard]
  
  @js.native
  sealed trait Disputed
    extends StObject
       with DisputeStatus
  inline def Disputed: Disputed = "Disputed".asInstanceOf[Disputed]
  
  @js.native
  sealed trait Expired
    extends StObject
       with DisputeStatus
       with SubscriptionStatus
  inline def Expired: Expired = "Expired".asInstanceOf[Expired]
  
  @js.native
  sealed trait International
    extends StObject
       with CustomerLocation
  inline def International: International = "International".asInstanceOf[International]
  
  @js.native
  sealed trait Lost
    extends StObject
       with DisputeStatus
  inline def Lost: Lost = "Lost".asInstanceOf[Lost]
  
  @js.native
  sealed trait MasterpassCard
    extends StObject
       with PaymentMethodType
  inline def MasterpassCard: MasterpassCard = "MasterpassCard".asInstanceOf[MasterpassCard]
  
  @js.native
  sealed trait No
    extends StObject
       with Commercial
       with Debit
       with DurbinRegulated
       with HealthCare
       with Payroll
       with Prepaid
  inline def No: No = "No".asInstanceOf[No]
  
  @js.native
  sealed trait Open
    extends StObject
       with DisputeStatus
  inline def Open: Open = "Open".asInstanceOf[Open]
  
  @js.native
  sealed trait PastDue
    extends StObject
       with SubscriptionStatus
  inline def PastDue: PastDue = "PastDue".asInstanceOf[PastDue]
  
  @js.native
  sealed trait PayPalAccount
    extends StObject
       with PaymentMethodType
  inline def PayPalAccount: PayPalAccount = "PayPalAccount".asInstanceOf[PayPalAccount]
  
  @js.native
  sealed trait Pending
    extends StObject
       with MerchantAccountStatus
       with SubscriptionStatus
  inline def Pending: Pending = "Pending".asInstanceOf[Pending]
  
  @js.native
  sealed trait Recurring
    extends StObject
       with TransactionSource
  inline def Recurring: Recurring = "Recurring".asInstanceOf[Recurring]
  
  @js.native
  sealed trait SamsungPayCard
    extends StObject
       with PaymentMethodType
  inline def SamsungPayCard: SamsungPayCard = "SamsungPayCard".asInstanceOf[SamsungPayCard]
  
  @js.native
  sealed trait Suspended
    extends StObject
       with MerchantAccountStatus
  inline def Suspended: Suspended = "Suspended".asInstanceOf[Suspended]
  
  @js.native
  sealed trait US
    extends StObject
       with CustomerLocation
  inline def US: US = "US".asInstanceOf[US]
  
  @js.native
  sealed trait Unknown
    extends StObject
       with Commercial
       with Debit
       with DurbinRegulated
       with HealthCare
       with Payroll
       with Prepaid
  inline def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait UsBankAccount
    extends StObject
       with PaymentMethodType
  inline def UsBankAccount: UsBankAccount = "UsBankAccount".asInstanceOf[UsBankAccount]
  
  @js.native
  sealed trait VenmoAccount
    extends StObject
       with PaymentMethodType
  inline def VenmoAccount: VenmoAccount = "VenmoAccount".asInstanceOf[VenmoAccount]
  
  @js.native
  sealed trait VisaCheckoutCard
    extends StObject
       with PaymentMethodType
  inline def VisaCheckoutCard: VisaCheckoutCard = "VisaCheckoutCard".asInstanceOf[VisaCheckoutCard]
  
  @js.native
  sealed trait Won
    extends StObject
       with DisputeStatus
  inline def Won: Won = "Won".asInstanceOf[Won]
  
  @js.native
  sealed trait Yes
    extends StObject
       with Commercial
       with Debit
       with DurbinRegulated
       with HealthCare
       with Payroll
       with Prepaid
  inline def Yes: Yes = "Yes".asInstanceOf[Yes]
  
  @js.native
  sealed trait account_updater_daily_report extends StObject
  inline def account_updater_daily_report: account_updater_daily_report = "account_updater_daily_report".asInstanceOf[account_updater_daily_report]
  
  @js.native
  sealed trait android_pay_card
    extends StObject
       with PaymentInstrumentType
  inline def android_pay_card: android_pay_card = "android_pay_card".asInstanceOf[android_pay_card]
  
  @js.native
  sealed trait api_
    extends StObject
       with SubscriptionSource
  inline def api_ : api_ = "api".asInstanceOf[api_]
  
  @js.native
  sealed trait apple_pay_card
    extends StObject
       with PaymentInstrumentType
  inline def apple_pay_card: apple_pay_card = "apple_pay_card".asInstanceOf[apple_pay_card]
  
  @js.native
  sealed trait application_incomplete
    extends StObject
       with GatewayRejectionReason
  inline def application_incomplete: application_incomplete = "application_incomplete".asInstanceOf[application_incomplete]
  
  @js.native
  sealed trait approved
    extends StObject
       with TransactionProcessorResponseType
  inline def approved: approved = "approved".asInstanceOf[approved]
  
  @js.native
  sealed trait authorization_expired
    extends StObject
       with TransactionStatus
  inline def authorization_expired: authorization_expired = "authorization_expired".asInstanceOf[authorization_expired]
  
  @js.native
  sealed trait authorized
    extends StObject
       with TransactionStatus
  inline def authorized: authorized = "authorized".asInstanceOf[authorized]
  
  @js.native
  sealed trait authorizing
    extends StObject
       with TransactionStatus
  inline def authorizing: authorizing = "authorizing".asInstanceOf[authorizing]
  
  @js.native
  sealed trait avs
    extends StObject
       with GatewayRejectionReason
  inline def avs: avs = "avs".asInstanceOf[avs]
  
  @js.native
  sealed trait avs_and_cvv
    extends StObject
       with GatewayRejectionReason
  inline def avs_and_cvv: avs_and_cvv = "avs_and_cvv".asInstanceOf[avs_and_cvv]
  
  @js.native
  sealed trait check
    extends StObject
       with _WebhookNotificationKind
  inline def check: check = "check".asInstanceOf[check]
  
  @js.native
  sealed trait connected_merchant_paypal_status_changed
    extends StObject
       with _WebhookNotificationKind
  inline def connected_merchant_paypal_status_changed: connected_merchant_paypal_status_changed = "connected_merchant_paypal_status_changed".asInstanceOf[connected_merchant_paypal_status_changed]
  
  @js.native
  sealed trait connected_merchant_status_transitioned
    extends StObject
       with _WebhookNotificationKind
  inline def connected_merchant_status_transitioned: connected_merchant_status_transitioned = "connected_merchant_status_transitioned".asInstanceOf[connected_merchant_status_transitioned]
  
  @js.native
  sealed trait control_panel
    extends StObject
       with SubscriptionSource
  inline def control_panel: control_panel = "control_panel".asInstanceOf[control_panel]
  
  @js.native
  sealed trait credit_card
    extends StObject
       with PaymentInstrumentType
  inline def credit_card: credit_card = "credit_card".asInstanceOf[credit_card]
  
  @js.native
  sealed trait cvv
    extends StObject
       with GatewayRejectionReason
  inline def cvv: cvv = "cvv".asInstanceOf[cvv]
  
  @js.native
  sealed trait disbursement
    extends StObject
       with _WebhookNotificationKind
  inline def disbursement: disbursement = "disbursement".asInstanceOf[disbursement]
  
  @js.native
  sealed trait disbursement_exception
    extends StObject
       with _WebhookNotificationKind
  inline def disbursement_exception: disbursement_exception = "disbursement_exception".asInstanceOf[disbursement_exception]
  
  @js.native
  sealed trait dispute_lost
    extends StObject
       with DisputeNotificationKind
  inline def dispute_lost: dispute_lost = "dispute_lost".asInstanceOf[dispute_lost]
  
  @js.native
  sealed trait dispute_opened
    extends StObject
       with DisputeNotificationKind
  inline def dispute_opened: dispute_opened = "dispute_opened".asInstanceOf[dispute_opened]
  
  @js.native
  sealed trait dispute_won
    extends StObject
       with DisputeNotificationKind
  inline def dispute_won: dispute_won = "dispute_won".asInstanceOf[dispute_won]
  
  @js.native
  sealed trait duplicate
    extends StObject
       with GatewayRejectionReason
  inline def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  
  @js.native
  sealed trait failed
    extends StObject
       with TransactionStatus
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fraud
    extends StObject
       with GatewayRejectionReason
  inline def fraud: fraud = "fraud".asInstanceOf[fraud]
  
  @js.native
  sealed trait gateway_rejected
    extends StObject
       with TransactionStatus
  inline def gateway_rejected: gateway_rejected = "gateway_rejected".asInstanceOf[gateway_rejected]
  
  @js.native
  sealed trait granted_payment_method_revoked
    extends StObject
       with _WebhookNotificationKind
  inline def granted_payment_method_revoked: granted_payment_method_revoked = "granted_payment_method_revoked".asInstanceOf[granted_payment_method_revoked]
  
  @js.native
  sealed trait grantor_updated_granted_payment_method
    extends StObject
       with _WebhookNotificationKind
  inline def grantor_updated_granted_payment_method: grantor_updated_granted_payment_method = "grantor_updated_granted_payment_method".asInstanceOf[grantor_updated_granted_payment_method]
  
  @js.native
  sealed trait hard_declined
    extends StObject
       with TransactionProcessorResponseType
  inline def hard_declined: hard_declined = "hard_declined".asInstanceOf[hard_declined]
  
  @js.native
  sealed trait held
    extends StObject
       with EscrowStatus
  inline def held: held = "held".asInstanceOf[held]
  
  @js.native
  sealed trait hold_pending
    extends StObject
       with EscrowStatus
  inline def hold_pending: hold_pending = "hold_pending".asInstanceOf[hold_pending]
  
  @js.native
  sealed trait local_payment_completed
    extends StObject
       with _WebhookNotificationKind
  inline def local_payment_completed: local_payment_completed = "local_payment_completed".asInstanceOf[local_payment_completed]
  
  @js.native
  sealed trait masterpass_card
    extends StObject
       with PaymentInstrumentType
  inline def masterpass_card: masterpass_card = "masterpass_card".asInstanceOf[masterpass_card]
  
  @js.native
  sealed trait oauth_access_revoked
    extends StObject
       with _WebhookNotificationKind
  inline def oauth_access_revoked: oauth_access_revoked = "oauth_access_revoked".asInstanceOf[oauth_access_revoked]
  
  @js.native
  sealed trait partner_merchant_connected
    extends StObject
       with _WebhookNotificationKind
  inline def partner_merchant_connected: partner_merchant_connected = "partner_merchant_connected".asInstanceOf[partner_merchant_connected]
  
  @js.native
  sealed trait partner_merchant_declined
    extends StObject
       with _WebhookNotificationKind
  inline def partner_merchant_declined: partner_merchant_declined = "partner_merchant_declined".asInstanceOf[partner_merchant_declined]
  
  @js.native
  sealed trait partner_merchant_disconnected
    extends StObject
       with _WebhookNotificationKind
  inline def partner_merchant_disconnected: partner_merchant_disconnected = "partner_merchant_disconnected".asInstanceOf[partner_merchant_disconnected]
  
  @js.native
  sealed trait payment_method_revoked_by_customer extends StObject
  inline def payment_method_revoked_by_customer: payment_method_revoked_by_customer = "payment_method_revoked_by_customer".asInstanceOf[payment_method_revoked_by_customer]
  
  @js.native
  sealed trait paypal_account
    extends StObject
       with PaymentInstrumentType
  inline def paypal_account: paypal_account = "paypal_account".asInstanceOf[paypal_account]
  
  @js.native
  sealed trait processor_declined
    extends StObject
       with TransactionStatus
  inline def processor_declined: processor_declined = "processor_declined".asInstanceOf[processor_declined]
  
  @js.native
  sealed trait recipient_updated_granted_payment_method
    extends StObject
       with _WebhookNotificationKind
  inline def recipient_updated_granted_payment_method: recipient_updated_granted_payment_method = "recipient_updated_granted_payment_method".asInstanceOf[recipient_updated_granted_payment_method]
  
  @js.native
  sealed trait recurring_
    extends StObject
       with SubscriptionSource
  inline def recurring_ : recurring_ = "recurring".asInstanceOf[recurring_]
  
  @js.native
  sealed trait refunded
    extends StObject
       with EscrowStatus
  inline def refunded: refunded = "refunded".asInstanceOf[refunded]
  
  @js.native
  sealed trait release_pending
    extends StObject
       with EscrowStatus
  inline def release_pending: release_pending = "release_pending".asInstanceOf[release_pending]
  
  @js.native
  sealed trait released
    extends StObject
       with EscrowStatus
  inline def released: released = "released".asInstanceOf[released]
  
  @js.native
  sealed trait risk_threshold
    extends StObject
       with GatewayRejectionReason
  inline def risk_threshold: risk_threshold = "risk_threshold".asInstanceOf[risk_threshold]
  
  @js.native
  sealed trait samsung_pay_card
    extends StObject
       with PaymentInstrumentType
  inline def samsung_pay_card: samsung_pay_card = "samsung_pay_card".asInstanceOf[samsung_pay_card]
  
  @js.native
  sealed trait settled
    extends StObject
       with TransactionStatus
  inline def settled: settled = "settled".asInstanceOf[settled]
  
  @js.native
  sealed trait settlement_declined
    extends StObject
       with TransactionStatus
  inline def settlement_declined: settlement_declined = "settlement_declined".asInstanceOf[settlement_declined]
  
  @js.native
  sealed trait settlement_pending
    extends StObject
       with TransactionStatus
  inline def settlement_pending: settlement_pending = "settlement_pending".asInstanceOf[settlement_pending]
  
  @js.native
  sealed trait settling
    extends StObject
       with TransactionStatus
  inline def settling: settling = "settling".asInstanceOf[settling]
  
  @js.native
  sealed trait soft_declined
    extends StObject
       with TransactionProcessorResponseType
  inline def soft_declined: soft_declined = "soft_declined".asInstanceOf[soft_declined]
  
  @js.native
  sealed trait sub_merchant_account_approved extends StObject
  inline def sub_merchant_account_approved: sub_merchant_account_approved = "sub_merchant_account_approved".asInstanceOf[sub_merchant_account_approved]
  
  @js.native
  sealed trait sub_merchant_account_declined extends StObject
  inline def sub_merchant_account_declined: sub_merchant_account_declined = "sub_merchant_account_declined".asInstanceOf[sub_merchant_account_declined]
  
  @js.native
  sealed trait submitted_for_settlement
    extends StObject
       with TransactionStatus
  inline def submitted_for_settlement: submitted_for_settlement = "submitted_for_settlement".asInstanceOf[submitted_for_settlement]
  
  @js.native
  sealed trait subscription_canceled
    extends StObject
       with SubscriptionNotificationKind
  inline def subscription_canceled: subscription_canceled = "subscription_canceled".asInstanceOf[subscription_canceled]
  
  @js.native
  sealed trait subscription_charged_successfully
    extends StObject
       with SubscriptionNotificationKind
  inline def subscription_charged_successfully: subscription_charged_successfully = "subscription_charged_successfully".asInstanceOf[subscription_charged_successfully]
  
  @js.native
  sealed trait subscription_charged_unsuccessfully
    extends StObject
       with SubscriptionNotificationKind
  inline def subscription_charged_unsuccessfully: subscription_charged_unsuccessfully = "subscription_charged_unsuccessfully".asInstanceOf[subscription_charged_unsuccessfully]
  
  @js.native
  sealed trait subscription_expired
    extends StObject
       with SubscriptionNotificationKind
  inline def subscription_expired: subscription_expired = "subscription_expired".asInstanceOf[subscription_expired]
  
  @js.native
  sealed trait subscription_trial_ended
    extends StObject
       with SubscriptionNotificationKind
  inline def subscription_trial_ended: subscription_trial_ended = "subscription_trial_ended".asInstanceOf[subscription_trial_ended]
  
  @js.native
  sealed trait subscription_went_active
    extends StObject
       with SubscriptionNotificationKind
  inline def subscription_went_active: subscription_went_active = "subscription_went_active".asInstanceOf[subscription_went_active]
  
  @js.native
  sealed trait subscription_went_past_due
    extends StObject
       with SubscriptionNotificationKind
  inline def subscription_went_past_due: subscription_went_past_due = "subscription_went_past_due".asInstanceOf[subscription_went_past_due]
  
  @js.native
  sealed trait three_d_secure
    extends StObject
       with GatewayRejectionReason
  inline def three_d_secure: three_d_secure = "three_d_secure".asInstanceOf[three_d_secure]
  
  @js.native
  sealed trait token_issuance
    extends StObject
       with GatewayRejectionReason
  inline def token_issuance: token_issuance = "token_issuance".asInstanceOf[token_issuance]
  
  @js.native
  sealed trait transaction_disbursed
    extends StObject
       with TransactionNotificationKind
  inline def transaction_disbursed: transaction_disbursed = "transaction_disbursed".asInstanceOf[transaction_disbursed]
  
  @js.native
  sealed trait transaction_settled
    extends StObject
       with TransactionNotificationKind
  inline def transaction_settled: transaction_settled = "transaction_settled".asInstanceOf[transaction_settled]
  
  @js.native
  sealed trait transaction_settlement_declined
    extends StObject
       with TransactionNotificationKind
  inline def transaction_settlement_declined: transaction_settlement_declined = "transaction_settlement_declined".asInstanceOf[transaction_settlement_declined]
  
  @js.native
  sealed trait venmo_account
    extends StObject
       with PaymentInstrumentType
  inline def venmo_account: venmo_account = "venmo_account".asInstanceOf[venmo_account]
  
  @js.native
  sealed trait visa_checkout_card
    extends StObject
       with PaymentInstrumentType
  inline def visa_checkout_card: visa_checkout_card = "visa_checkout_card".asInstanceOf[visa_checkout_card]
  
  @js.native
  sealed trait voided
    extends StObject
       with TransactionStatus
  inline def voided: voided = "voided".asInstanceOf[voided]
}
