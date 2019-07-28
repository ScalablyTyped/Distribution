package typings.braintree

import typings.braintree.braintreeMod.Commercial
import typings.braintree.braintreeMod.CustomerLocation
import typings.braintree.braintreeMod.Debit
import typings.braintree.braintreeMod.DisputeStatus
import typings.braintree.braintreeMod.DurbinRegulated
import typings.braintree.braintreeMod.EscrowStatus
import typings.braintree.braintreeMod.GatewayRejectionReason
import typings.braintree.braintreeMod.HealthCare
import typings.braintree.braintreeMod.MerchantAccountStatus
import typings.braintree.braintreeMod.PaymentInstrumentType
import typings.braintree.braintreeMod.PaymentMethodType
import typings.braintree.braintreeMod.Payroll
import typings.braintree.braintreeMod.Prepaid
import typings.braintree.braintreeMod.SubscriptionSource
import typings.braintree.braintreeMod.SubscriptionStatus
import typings.braintree.braintreeMod.TransactionProcessorResponseType
import typings.braintree.braintreeMod.TransactionSource
import typings.braintree.braintreeMod.TransactionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object braintreeStrings {
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
  sealed trait android_pay_card extends PaymentInstrumentType
  
  @js.native
  sealed trait api extends SubscriptionSource
  
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
  sealed trait control_panel extends SubscriptionSource
  
  @js.native
  sealed trait credit_card extends PaymentInstrumentType
  
  @js.native
  sealed trait cvv extends GatewayRejectionReason
  
  @js.native
  sealed trait duplicate extends GatewayRejectionReason
  
  @js.native
  sealed trait failed extends TransactionStatus
  
  @js.native
  sealed trait fraud extends GatewayRejectionReason
  
  @js.native
  sealed trait gateway_rejected extends TransactionStatus
  
  @js.native
  sealed trait hard_declined extends TransactionProcessorResponseType
  
  @js.native
  sealed trait held extends EscrowStatus
  
  @js.native
  sealed trait hold_pending extends EscrowStatus
  
  @js.native
  sealed trait masterpass_card extends PaymentInstrumentType
  
  @js.native
  sealed trait paypal_account extends PaymentInstrumentType
  
  @js.native
  sealed trait processor_declined extends TransactionStatus
  
  @js.native
  sealed trait recurring extends SubscriptionSource
  
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
  sealed trait submitted_for_settlement extends TransactionStatus
  
  @js.native
  sealed trait three_d_secure extends GatewayRejectionReason
  
  @js.native
  sealed trait token_issuance extends GatewayRejectionReason
  
  @js.native
  sealed trait venmo_account extends PaymentInstrumentType
  
  @js.native
  sealed trait visa_checkout_card extends PaymentInstrumentType
  
  @js.native
  sealed trait voided extends TransactionStatus
  
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
  def control_panel: control_panel = "control_panel".asInstanceOf[control_panel]
  @scala.inline
  def credit_card: credit_card = "credit_card".asInstanceOf[credit_card]
  @scala.inline
  def cvv: cvv = "cvv".asInstanceOf[cvv]
  @scala.inline
  def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def fraud: fraud = "fraud".asInstanceOf[fraud]
  @scala.inline
  def gateway_rejected: gateway_rejected = "gateway_rejected".asInstanceOf[gateway_rejected]
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
  def processor_declined: processor_declined = "processor_declined".asInstanceOf[processor_declined]
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
  def submitted_for_settlement: submitted_for_settlement = "submitted_for_settlement".asInstanceOf[submitted_for_settlement]
  @scala.inline
  def three_d_secure: three_d_secure = "three_d_secure".asInstanceOf[three_d_secure]
  @scala.inline
  def token_issuance: token_issuance = "token_issuance".asInstanceOf[token_issuance]
  @scala.inline
  def venmo_account: venmo_account = "venmo_account".asInstanceOf[venmo_account]
  @scala.inline
  def visa_checkout_card: visa_checkout_card = "visa_checkout_card".asInstanceOf[visa_checkout_card]
  @scala.inline
  def voided: voided = "voided".asInstanceOf[voided]
}

