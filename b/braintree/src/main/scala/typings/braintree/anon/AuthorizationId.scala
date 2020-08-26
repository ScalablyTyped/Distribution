package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationId extends js.Object {
  var authorizationId: String = js.native
  var captureId: String = js.native
  var customField: String = js.native
  var imageUrl: String = js.native
  var payerEmail: String = js.native
  var payerFirstName: String = js.native
  var payerId: String = js.native
  var payerLastName: String = js.native
  var payerStatus: String = js.native
  var paymentId: String = js.native
  var refundFromTransactionFeeAmount: String = js.native
  var refundFromTransactionFeeCurrencyIsoCode: String = js.native
  var refundId: String = js.native
  var sellerProtectionStatus: String = js.native
  var taxId: String = js.native
  var taxIdType: String = js.native
  var token: String = js.native
  var transactionFeeAmount: String = js.native
  var transactionFeeCurrencyIsoCode: String = js.native
}

object AuthorizationId {
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
  ): AuthorizationId = {
    val __obj = js.Dynamic.literal(authorizationId = authorizationId.asInstanceOf[js.Any], captureId = captureId.asInstanceOf[js.Any], customField = customField.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], payerEmail = payerEmail.asInstanceOf[js.Any], payerFirstName = payerFirstName.asInstanceOf[js.Any], payerId = payerId.asInstanceOf[js.Any], payerLastName = payerLastName.asInstanceOf[js.Any], payerStatus = payerStatus.asInstanceOf[js.Any], paymentId = paymentId.asInstanceOf[js.Any], refundFromTransactionFeeAmount = refundFromTransactionFeeAmount.asInstanceOf[js.Any], refundFromTransactionFeeCurrencyIsoCode = refundFromTransactionFeeCurrencyIsoCode.asInstanceOf[js.Any], refundId = refundId.asInstanceOf[js.Any], sellerProtectionStatus = sellerProtectionStatus.asInstanceOf[js.Any], taxId = taxId.asInstanceOf[js.Any], taxIdType = taxIdType.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], transactionFeeAmount = transactionFeeAmount.asInstanceOf[js.Any], transactionFeeCurrencyIsoCode = transactionFeeCurrencyIsoCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationId]
  }
  @scala.inline
  implicit class AuthorizationIdOps[Self <: AuthorizationId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorizationId(value: String): Self = this.set("authorizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptureId(value: String): Self = this.set("captureId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomField(value: String): Self = this.set("customField", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayerEmail(value: String): Self = this.set("payerEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayerFirstName(value: String): Self = this.set("payerFirstName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayerId(value: String): Self = this.set("payerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayerLastName(value: String): Self = this.set("payerLastName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayerStatus(value: String): Self = this.set("payerStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentId(value: String): Self = this.set("paymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefundFromTransactionFeeAmount(value: String): Self = this.set("refundFromTransactionFeeAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefundFromTransactionFeeCurrencyIsoCode(value: String): Self = this.set("refundFromTransactionFeeCurrencyIsoCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefundId(value: String): Self = this.set("refundId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSellerProtectionStatus(value: String): Self = this.set("sellerProtectionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaxId(value: String): Self = this.set("taxId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaxIdType(value: String): Self = this.set("taxIdType", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionFeeAmount(value: String): Self = this.set("transactionFeeAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionFeeCurrencyIsoCode(value: String): Self = this.set("transactionFeeCurrencyIsoCode", value.asInstanceOf[js.Any])
  }
  
}

