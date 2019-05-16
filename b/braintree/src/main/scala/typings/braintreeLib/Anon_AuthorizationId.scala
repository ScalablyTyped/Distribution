package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationId extends js.Object {
  var authorizationId: java.lang.String
  var captureId: java.lang.String
  var customField: java.lang.String
  var imageUrl: java.lang.String
  var payerEmail: java.lang.String
  var payerFirstName: java.lang.String
  var payerId: java.lang.String
  var payerLastName: java.lang.String
  var payerStatus: java.lang.String
  var paymentId: java.lang.String
  var refundFromTransactionFeeAmount: java.lang.String
  var refundFromTransactionFeeCurrencyIsoCode: java.lang.String
  var refundId: java.lang.String
  var sellerProtectionStatus: java.lang.String
  var taxId: java.lang.String
  var taxIdType: java.lang.String
  var token: java.lang.String
  var transactionFeeAmount: java.lang.String
  var transactionFeeCurrencyIsoCode: java.lang.String
}

object Anon_AuthorizationId {
  @scala.inline
  def apply(
    authorizationId: java.lang.String,
    captureId: java.lang.String,
    customField: java.lang.String,
    imageUrl: java.lang.String,
    payerEmail: java.lang.String,
    payerFirstName: java.lang.String,
    payerId: java.lang.String,
    payerLastName: java.lang.String,
    payerStatus: java.lang.String,
    paymentId: java.lang.String,
    refundFromTransactionFeeAmount: java.lang.String,
    refundFromTransactionFeeCurrencyIsoCode: java.lang.String,
    refundId: java.lang.String,
    sellerProtectionStatus: java.lang.String,
    taxId: java.lang.String,
    taxIdType: java.lang.String,
    token: java.lang.String,
    transactionFeeAmount: java.lang.String,
    transactionFeeCurrencyIsoCode: java.lang.String
  ): Anon_AuthorizationId = {
    val __obj = js.Dynamic.literal(authorizationId = authorizationId, captureId = captureId, customField = customField, imageUrl = imageUrl, payerEmail = payerEmail, payerFirstName = payerFirstName, payerId = payerId, payerLastName = payerLastName, payerStatus = payerStatus, paymentId = paymentId, refundFromTransactionFeeAmount = refundFromTransactionFeeAmount, refundFromTransactionFeeCurrencyIsoCode = refundFromTransactionFeeCurrencyIsoCode, refundId = refundId, sellerProtectionStatus = sellerProtectionStatus, taxId = taxId, taxIdType = taxIdType, token = token, transactionFeeAmount = transactionFeeAmount, transactionFeeCurrencyIsoCode = transactionFeeCurrencyIsoCode)
  
    __obj.asInstanceOf[Anon_AuthorizationId]
  }
}

