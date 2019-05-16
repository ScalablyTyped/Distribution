package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "Transaction")
@js.native
class Transaction () extends js.Object {
  var addOns: js.UndefOr[js.Array[AddOn]] = js.native
  var additionalProccessorResponse: java.lang.String = js.native
  var amount: java.lang.String = js.native
  var androidPayCard: js.UndefOr[braintreeLib.Anon_BinCommercial] = js.native
  var applePayCard: js.UndefOr[braintreeLib.Anon_BinCardType] = js.native
  var authorizationAdjustments: js.UndefOr[js.Array[AuthorizationAdjustment]] = js.native
  var authorizationExpiresAt: js.UndefOr[stdLib.Date] = js.native
  var avsErrorResponseCode: java.lang.String = js.native
  var avsPostalCodeResponseCode: java.lang.String = js.native
  var avsStreetAddressResponseCode: java.lang.String = js.native
  var billing: js.UndefOr[braintreeLib.Anon_CompanyCountryCodeAlpha2CountryCodeAlpha3] = js.native
  var channel: js.UndefOr[java.lang.String] = js.native
  var createdAt: stdLib.Date = js.native
  var creditCard: js.UndefOr[braintreeLib.Anon_BinCardTypeCardholderName] = js.native
  var currencyIsoCode: java.lang.String = js.native
  var customFields: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.native
  var customer: braintreeLib.Anon_CompanyCustomFields = js.native
  var cvvResponseCode: java.lang.String = js.native
  var descriptor: js.UndefOr[Descriptor] = js.native
  var disbursementDetails: js.UndefOr[DisbursementDetails] = js.native
  var discountAmount: js.UndefOr[java.lang.String] = js.native
  var discounts: js.UndefOr[js.Array[Discount]] = js.native
  var disputes: js.UndefOr[js.Array[Dispute]] = js.native
  var escrowStatus: js.UndefOr[EscrowStatus] = js.native
  var facilitatedDetails: js.UndefOr[FacilitatedDetails] = js.native
  var facilitatorDetails: js.UndefOr[FacilitatorDetails] = js.native
  var gatewayRejectionReason: js.UndefOr[GatewayRejectionReason] = js.native
  var id: java.lang.String = js.native
  var lineItems: js.UndefOr[js.Array[TransactionLineItem]] = js.native
  var masterpassCardDetails: js.UndefOr[braintreeLib.Anon_BinCardTypeCardholderNameCommercial] = js.native
  var merchantAccountId: js.UndefOr[java.lang.String] = js.native
  var networkTransactionId: js.UndefOr[java.lang.String] = js.native
  var orderId: js.UndefOr[java.lang.String] = js.native
  var paymentInstrumentType: PaymentInstrumentType = js.native
  var paypalAccount: js.UndefOr[braintreeLib.Anon_AuthorizationId] = js.native
  var planId: js.UndefOr[java.lang.String] = js.native
  var processorAuthorizationCode: java.lang.String = js.native
  var processorResponseCode: java.lang.String = js.native
  var processorResponseText: java.lang.String = js.native
  var processorResponseType: TransactionProcessorResponseType = js.native
  var processorSettlementResponseCode: java.lang.String = js.native
  var processorSettlementResponseText: java.lang.String = js.native
  var purchaseOrderNumber: js.UndefOr[java.lang.String] = js.native
  var recurring: js.UndefOr[scala.Boolean] = js.native
   // Deprecated
  var refundIds: js.UndefOr[js.Array[java.lang.String]] = js.native
  var refundedTransactionId: js.UndefOr[java.lang.String] = js.native
  var riskData: js.UndefOr[TransactionRiskData] = js.native
  var samsungPayCardDetails: js.UndefOr[braintreeLib.Anon_BinCardTypeCardholderNameCommercialCountryOfIssuance] = js.native
  var serviceFeeAmount: js.UndefOr[java.lang.String] = js.native
  var settlementBatchId: js.UndefOr[java.lang.String] = js.native
  var shipping: js.UndefOr[braintreeLib.Anon_CompanyCountryCodeAlpha2CountryCodeAlpha3] = js.native
  var shippingAmount: js.UndefOr[java.lang.String] = js.native
  var shipsFromPostalCode: js.UndefOr[java.lang.String] = js.native
  var status: TransactionStatus = js.native
  var statusHistory: js.UndefOr[TransactionStatusHistory] = js.native
  var subscription: js.UndefOr[braintreeLib.Anon_BillingPeriodEndDate] = js.native
  var subscriptionId: js.UndefOr[java.lang.String] = js.native
  var taxAmount: js.UndefOr[java.lang.String] = js.native
  var taxExempt: js.UndefOr[scala.Boolean] = js.native
  var threeDSecureInfo: js.UndefOr[TransactionThreeDSecureInfo] = js.native
  var `type`: java.lang.String = js.native
  var updatedAt: stdLib.Date = js.native
  var venmoAccount: js.UndefOr[braintreeLib.Anon_ImageUrl] = js.native
  var visaCheckoutCardDetails: js.UndefOr[braintreeLib.Anon_BinCallId] = js.native
  var voiceReferralNumber: js.UndefOr[java.lang.String] = js.native
}

