package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationId extends StObject {
  
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
object AuthorizationId {
  
  inline def apply(
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
  
  extension [Self <: AuthorizationId](x: Self) {
    
    inline def setAuthorizationId(value: String): Self = StObject.set(x, "authorizationId", value.asInstanceOf[js.Any])
    
    inline def setCaptureId(value: String): Self = StObject.set(x, "captureId", value.asInstanceOf[js.Any])
    
    inline def setCustomField(value: String): Self = StObject.set(x, "customField", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setPayerEmail(value: String): Self = StObject.set(x, "payerEmail", value.asInstanceOf[js.Any])
    
    inline def setPayerFirstName(value: String): Self = StObject.set(x, "payerFirstName", value.asInstanceOf[js.Any])
    
    inline def setPayerId(value: String): Self = StObject.set(x, "payerId", value.asInstanceOf[js.Any])
    
    inline def setPayerLastName(value: String): Self = StObject.set(x, "payerLastName", value.asInstanceOf[js.Any])
    
    inline def setPayerStatus(value: String): Self = StObject.set(x, "payerStatus", value.asInstanceOf[js.Any])
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    inline def setRefundFromTransactionFeeAmount(value: String): Self = StObject.set(x, "refundFromTransactionFeeAmount", value.asInstanceOf[js.Any])
    
    inline def setRefundFromTransactionFeeCurrencyIsoCode(value: String): Self = StObject.set(x, "refundFromTransactionFeeCurrencyIsoCode", value.asInstanceOf[js.Any])
    
    inline def setRefundId(value: String): Self = StObject.set(x, "refundId", value.asInstanceOf[js.Any])
    
    inline def setSellerProtectionStatus(value: String): Self = StObject.set(x, "sellerProtectionStatus", value.asInstanceOf[js.Any])
    
    inline def setTaxId(value: String): Self = StObject.set(x, "taxId", value.asInstanceOf[js.Any])
    
    inline def setTaxIdType(value: String): Self = StObject.set(x, "taxIdType", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTransactionFeeAmount(value: String): Self = StObject.set(x, "transactionFeeAmount", value.asInstanceOf[js.Any])
    
    inline def setTransactionFeeCurrencyIsoCode(value: String): Self = StObject.set(x, "transactionFeeCurrencyIsoCode", value.asInstanceOf[js.Any])
  }
}
