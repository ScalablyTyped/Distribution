package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationId extends StObject {
  
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
  implicit class AuthorizationIdMutableBuilder[Self <: AuthorizationId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationId(value: String): Self = StObject.set(x, "authorizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureId(value: String): Self = StObject.set(x, "captureId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomField(value: String): Self = StObject.set(x, "customField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayerEmail(value: String): Self = StObject.set(x, "payerEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayerFirstName(value: String): Self = StObject.set(x, "payerFirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayerId(value: String): Self = StObject.set(x, "payerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayerLastName(value: String): Self = StObject.set(x, "payerLastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayerStatus(value: String): Self = StObject.set(x, "payerStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundFromTransactionFeeAmount(value: String): Self = StObject.set(x, "refundFromTransactionFeeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundFromTransactionFeeCurrencyIsoCode(value: String): Self = StObject.set(x, "refundFromTransactionFeeCurrencyIsoCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundId(value: String): Self = StObject.set(x, "refundId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerProtectionStatus(value: String): Self = StObject.set(x, "sellerProtectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxId(value: String): Self = StObject.set(x, "taxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxIdType(value: String): Self = StObject.set(x, "taxIdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionFeeAmount(value: String): Self = StObject.set(x, "transactionFeeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionFeeCurrencyIsoCode(value: String): Self = StObject.set(x, "transactionFeeCurrencyIsoCode", value.asInstanceOf[js.Any])
  }
}
