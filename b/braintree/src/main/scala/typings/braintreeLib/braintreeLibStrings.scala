package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object braintreeLibStrings {
  @js.native
  sealed trait Accepted
    extends braintreeLib.braintreeMod.DisputeStatus
  
  @js.native
  sealed trait Active
    extends braintreeLib.braintreeMod.MerchantAccountStatus
       with braintreeLib.braintreeMod.SubscriptionStatus
  
  @js.native
  sealed trait AndroidPayCard
    extends braintreeLib.braintreeMod.PaymentMethodType
  
  @js.native
  sealed trait Api
    extends braintreeLib.braintreeMod.TransactionSource
  
  @js.native
  sealed trait ApplePayCard
    extends braintreeLib.braintreeMod.PaymentMethodType
  
  @js.native
  sealed trait AuthorizationExpired
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait Authorized
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait Authorizing
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait Canceled
    extends braintreeLib.braintreeMod.SubscriptionStatus
  
  @js.native
  sealed trait ControlPanel
    extends braintreeLib.braintreeMod.TransactionSource
  
  @js.native
  sealed trait CreditCard
    extends braintreeLib.braintreeMod.PaymentMethodType
  
  @js.native
  sealed trait Disputed
    extends braintreeLib.braintreeMod.DisputeStatus
  
  @js.native
  sealed trait Expired
    extends braintreeLib.braintreeMod.DisputeStatus
       with braintreeLib.braintreeMod.SubscriptionStatus
  
  @js.native
  sealed trait Failed
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait GatewayRejected
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait International
    extends braintreeLib.braintreeMod.CustomerLocation
  
  @js.native
  sealed trait Lost
    extends braintreeLib.braintreeMod.DisputeStatus
  
  @js.native
  sealed trait MasterpassCard
    extends braintreeLib.braintreeMod.PaymentMethodType
  
  @js.native
  sealed trait No
    extends braintreeLib.braintreeMod.Commercial
       with braintreeLib.braintreeMod.Debit
       with braintreeLib.braintreeMod.DurbinRegulated
       with braintreeLib.braintreeMod.HealthCare
       with braintreeLib.braintreeMod.Payroll
       with braintreeLib.braintreeMod.Prepaid
  
  @js.native
  sealed trait Open
    extends braintreeLib.braintreeMod.DisputeStatus
  
  @js.native
  sealed trait PastDue
    extends braintreeLib.braintreeMod.SubscriptionStatus
  
  @js.native
  sealed trait PayPalAccount
    extends braintreeLib.braintreeMod.PaymentMethodType
  
  @js.native
  sealed trait Pending
    extends braintreeLib.braintreeMod.MerchantAccountStatus
       with braintreeLib.braintreeMod.SubscriptionStatus
  
  @js.native
  sealed trait ProcessorDeclined
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait Recurring
    extends braintreeLib.braintreeMod.TransactionSource
  
  @js.native
  sealed trait SamsungPayCard
    extends braintreeLib.braintreeMod.PaymentMethodType
  
  @js.native
  sealed trait Settled
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait SettlementPending
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait SettlemnetDeclined
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait Settling
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait SubmittedForSettlement
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait Suspended
    extends braintreeLib.braintreeMod.MerchantAccountStatus
  
  @js.native
  sealed trait US
    extends braintreeLib.braintreeMod.CustomerLocation
  
  @js.native
  sealed trait Unknown
    extends braintreeLib.braintreeMod.Commercial
       with braintreeLib.braintreeMod.Debit
       with braintreeLib.braintreeMod.DurbinRegulated
       with braintreeLib.braintreeMod.HealthCare
       with braintreeLib.braintreeMod.Payroll
       with braintreeLib.braintreeMod.Prepaid
  
  @js.native
  sealed trait UsBankAccount
    extends braintreeLib.braintreeMod.PaymentMethodType
  
  @js.native
  sealed trait VenmoAccount
    extends braintreeLib.braintreeMod.PaymentMethodType
  
  @js.native
  sealed trait VisaCheckoutCard
    extends braintreeLib.braintreeMod.PaymentMethodType
  
  @js.native
  sealed trait Voided
    extends braintreeLib.braintreeMod.TransactionStatus
  
  @js.native
  sealed trait Won
    extends braintreeLib.braintreeMod.DisputeStatus
  
  @js.native
  sealed trait Yes
    extends braintreeLib.braintreeMod.Commercial
       with braintreeLib.braintreeMod.Debit
       with braintreeLib.braintreeMod.DurbinRegulated
       with braintreeLib.braintreeMod.HealthCare
       with braintreeLib.braintreeMod.Payroll
       with braintreeLib.braintreeMod.Prepaid
  
  @js.native
  sealed trait android_pay_card
    extends braintreeLib.braintreeMod.PaymentInstrumentType
  
  @js.native
  sealed trait api
    extends braintreeLib.braintreeMod.SubscriptionSource
  
  @js.native
  sealed trait apple_pay_card
    extends braintreeLib.braintreeMod.PaymentInstrumentType
  
  @js.native
  sealed trait application_incomplete
    extends braintreeLib.braintreeMod.GatewayRejectionReason
  
  @js.native
  sealed trait approved
    extends braintreeLib.braintreeMod.TransactionProcessorResponseType
  
  @js.native
  sealed trait avs
    extends braintreeLib.braintreeMod.GatewayRejectionReason
  
  @js.native
  sealed trait avs_and_cvv
    extends braintreeLib.braintreeMod.GatewayRejectionReason
  
  @js.native
  sealed trait control_panel
    extends braintreeLib.braintreeMod.SubscriptionSource
  
  @js.native
  sealed trait credit_card
    extends braintreeLib.braintreeMod.PaymentInstrumentType
  
  @js.native
  sealed trait cvv
    extends braintreeLib.braintreeMod.GatewayRejectionReason
  
  @js.native
  sealed trait duplicate
    extends braintreeLib.braintreeMod.GatewayRejectionReason
  
  @js.native
  sealed trait fraud
    extends braintreeLib.braintreeMod.GatewayRejectionReason
  
  @js.native
  sealed trait hard_declined
    extends braintreeLib.braintreeMod.TransactionProcessorResponseType
  
  @js.native
  sealed trait held
    extends braintreeLib.braintreeMod.EscrowStatus
  
  @js.native
  sealed trait hold_pending
    extends braintreeLib.braintreeMod.EscrowStatus
  
  @js.native
  sealed trait masterpass_card
    extends braintreeLib.braintreeMod.PaymentInstrumentType
  
  @js.native
  sealed trait paypal_account
    extends braintreeLib.braintreeMod.PaymentInstrumentType
  
  @js.native
  sealed trait recurring
    extends braintreeLib.braintreeMod.SubscriptionSource
  
  @js.native
  sealed trait refunded
    extends braintreeLib.braintreeMod.EscrowStatus
  
  @js.native
  sealed trait release_pending
    extends braintreeLib.braintreeMod.EscrowStatus
  
  @js.native
  sealed trait released
    extends braintreeLib.braintreeMod.EscrowStatus
  
  @js.native
  sealed trait risk_threshold
    extends braintreeLib.braintreeMod.GatewayRejectionReason
  
  @js.native
  sealed trait samsung_pay_card
    extends braintreeLib.braintreeMod.PaymentInstrumentType
  
  @js.native
  sealed trait soft_declined
    extends braintreeLib.braintreeMod.TransactionProcessorResponseType
  
  @js.native
  sealed trait three_d_secure
    extends braintreeLib.braintreeMod.GatewayRejectionReason
  
  @js.native
  sealed trait token_issuance
    extends braintreeLib.braintreeMod.GatewayRejectionReason
  
  @js.native
  sealed trait venmo_account
    extends braintreeLib.braintreeMod.PaymentInstrumentType
  
  @js.native
  sealed trait visa_checkout_card
    extends braintreeLib.braintreeMod.PaymentInstrumentType
  
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
  def AuthorizationExpired: AuthorizationExpired = "AuthorizationExpired".asInstanceOf[AuthorizationExpired]
  @scala.inline
  def Authorized: Authorized = "Authorized".asInstanceOf[Authorized]
  @scala.inline
  def Authorizing: Authorizing = "Authorizing".asInstanceOf[Authorizing]
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
  def Failed: Failed = "Failed".asInstanceOf[Failed]
  @scala.inline
  def GatewayRejected: GatewayRejected = "GatewayRejected".asInstanceOf[GatewayRejected]
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
  def ProcessorDeclined: ProcessorDeclined = "ProcessorDeclined".asInstanceOf[ProcessorDeclined]
  @scala.inline
  def Recurring: Recurring = "Recurring".asInstanceOf[Recurring]
  @scala.inline
  def SamsungPayCard: SamsungPayCard = "SamsungPayCard".asInstanceOf[SamsungPayCard]
  @scala.inline
  def Settled: Settled = "Settled".asInstanceOf[Settled]
  @scala.inline
  def SettlementPending: SettlementPending = "SettlementPending".asInstanceOf[SettlementPending]
  @scala.inline
  def SettlemnetDeclined: SettlemnetDeclined = "SettlemnetDeclined".asInstanceOf[SettlemnetDeclined]
  @scala.inline
  def Settling: Settling = "Settling".asInstanceOf[Settling]
  @scala.inline
  def SubmittedForSettlement: SubmittedForSettlement = "SubmittedForSettlement".asInstanceOf[SubmittedForSettlement]
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
  def Voided: Voided = "Voided".asInstanceOf[Voided]
  @scala.inline
  def Won: Won = "Won".asInstanceOf[Won]
  @scala.inline
  def Yes: Yes = "Yes".asInstanceOf[Yes]
  @scala.inline
  def android_pay_card: android_pay_card = "android_pay_card".asInstanceOf[android_pay_card]
  @scala.inline
  def api: api = "api".asInstanceOf[api]
  @scala.inline
  def apple_pay_card: apple_pay_card = "apple_pay_card".asInstanceOf[apple_pay_card]
  @scala.inline
  def application_incomplete: application_incomplete = "application_incomplete".asInstanceOf[application_incomplete]
  @scala.inline
  def approved: approved = "approved".asInstanceOf[approved]
  @scala.inline
  def avs: avs = "avs".asInstanceOf[avs]
  @scala.inline
  def avs_and_cvv: avs_and_cvv = "avs_and_cvv".asInstanceOf[avs_and_cvv]
  @scala.inline
  def control_panel: control_panel = "control_panel".asInstanceOf[control_panel]
  @scala.inline
  def credit_card: credit_card = "credit_card".asInstanceOf[credit_card]
  @scala.inline
  def cvv: cvv = "cvv".asInstanceOf[cvv]
  @scala.inline
  def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  @scala.inline
  def fraud: fraud = "fraud".asInstanceOf[fraud]
  @scala.inline
  def hard_declined: hard_declined = "hard_declined".asInstanceOf[hard_declined]
  @scala.inline
  def held: held = "held".asInstanceOf[held]
  @scala.inline
  def hold_pending: hold_pending = "hold_pending".asInstanceOf[hold_pending]
  @scala.inline
  def masterpass_card: masterpass_card = "masterpass_card".asInstanceOf[masterpass_card]
  @scala.inline
  def paypal_account: paypal_account = "paypal_account".asInstanceOf[paypal_account]
  @scala.inline
  def recurring: recurring = "recurring".asInstanceOf[recurring]
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
  def soft_declined: soft_declined = "soft_declined".asInstanceOf[soft_declined]
  @scala.inline
  def three_d_secure: three_d_secure = "three_d_secure".asInstanceOf[three_d_secure]
  @scala.inline
  def token_issuance: token_issuance = "token_issuance".asInstanceOf[token_issuance]
  @scala.inline
  def venmo_account: venmo_account = "venmo_account".asInstanceOf[venmo_account]
  @scala.inline
  def visa_checkout_card: visa_checkout_card = "visa_checkout_card".asInstanceOf[visa_checkout_card]
}

