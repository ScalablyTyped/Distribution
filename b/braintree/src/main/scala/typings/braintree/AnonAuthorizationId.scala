package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorizationId extends js.Object {
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

object AnonAuthorizationId {
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
  ): AnonAuthorizationId = {
    val __obj = js.Dynamic.literal(authorizationId = authorizationId.asInstanceOf[js.Any], captureId = captureId.asInstanceOf[js.Any], customField = customField.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], payerEmail = payerEmail.asInstanceOf[js.Any], payerFirstName = payerFirstName.asInstanceOf[js.Any], payerId = payerId.asInstanceOf[js.Any], payerLastName = payerLastName.asInstanceOf[js.Any], payerStatus = payerStatus.asInstanceOf[js.Any], paymentId = paymentId.asInstanceOf[js.Any], refundFromTransactionFeeAmount = refundFromTransactionFeeAmount.asInstanceOf[js.Any], refundFromTransactionFeeCurrencyIsoCode = refundFromTransactionFeeCurrencyIsoCode.asInstanceOf[js.Any], refundId = refundId.asInstanceOf[js.Any], sellerProtectionStatus = sellerProtectionStatus.asInstanceOf[js.Any], taxId = taxId.asInstanceOf[js.Any], taxIdType = taxIdType.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], transactionFeeAmount = transactionFeeAmount.asInstanceOf[js.Any], transactionFeeCurrencyIsoCode = transactionFeeCurrencyIsoCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuthorizationId]
  }
}

