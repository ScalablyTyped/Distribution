package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationId extends js.Object {
  var authorizationId: String
  var captureId: String
  var customField: String
  var imageUrl: String
  var payerEmail: String
  var payerFirstName: String
  var payerId: String
  var payerLastName: String
  var payerStatus: String
  var paymentId: String
  var refundFromTransactionFeeAmount: String
  var refundFromTransactionFeeCurrencyIsoCode: String
  var refundId: String
  var sellerProtectionStatus: String
  var taxId: String
  var taxIdType: String
  var token: String
  var transactionFeeAmount: String
  var transactionFeeCurrencyIsoCode: String
}

object Anon_AuthorizationId {
  @scala.inline
  def apply(
    authorizationId: String,
    captureId: String,
    customField: String,
    imageUrl: String,
    payerEmail: String,
    payerFirstName: String,
    payerId: String,
    payerLastName: String,
    payerStatus: String,
    paymentId: String,
    refundFromTransactionFeeAmount: String,
    refundFromTransactionFeeCurrencyIsoCode: String,
    refundId: String,
    sellerProtectionStatus: String,
    taxId: String,
    taxIdType: String,
    token: String,
    transactionFeeAmount: String,
    transactionFeeCurrencyIsoCode: String
  ): Anon_AuthorizationId = {
    val __obj = js.Dynamic.literal(authorizationId = authorizationId, captureId = captureId, customField = customField, imageUrl = imageUrl, payerEmail = payerEmail, payerFirstName = payerFirstName, payerId = payerId, payerLastName = payerLastName, payerStatus = payerStatus, paymentId = paymentId, refundFromTransactionFeeAmount = refundFromTransactionFeeAmount, refundFromTransactionFeeCurrencyIsoCode = refundFromTransactionFeeCurrencyIsoCode, refundId = refundId, sellerProtectionStatus = sellerProtectionStatus, taxId = taxId, taxIdType = taxIdType, token = token, transactionFeeAmount = transactionFeeAmount, transactionFeeCurrencyIsoCode = transactionFeeCurrencyIsoCode)
  
    __obj.asInstanceOf[Anon_AuthorizationId]
  }
}

