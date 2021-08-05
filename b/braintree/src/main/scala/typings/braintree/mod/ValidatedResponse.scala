package typings.braintree.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatedResponse[T] extends StObject {
  
  var address: Address
  
  var clientToken: String
  
  var credentials: OAuthToken
  
  var creditCard: CreditCard
  
  var customer: Customer
  
  var dispute: Dispute
  
  var errors: ValidationErrorsCollection
  
  var merchantAccount: MerchantAccount
  
  var message: String
  
  var params: Record[String, js.Any]
  
  var paymentMethod: PaymentMethod
  
  var paymentMethodNonce: PaymentMethodNonce
  
  var settlementBatchSumary: SettlementBatchSummary
  
  var subscription: Subscription
  
  var success: Boolean
  
  var transaction: Transaction
}
object ValidatedResponse {
  
  inline def apply[T](
    address: Address,
    clientToken: String,
    credentials: OAuthToken,
    creditCard: CreditCard,
    customer: Customer,
    dispute: Dispute,
    errors: ValidationErrorsCollection,
    merchantAccount: MerchantAccount,
    message: String,
    params: Record[String, js.Any],
    paymentMethod: PaymentMethod,
    paymentMethodNonce: PaymentMethodNonce,
    settlementBatchSumary: SettlementBatchSummary,
    subscription: Subscription,
    success: Boolean,
    transaction: Transaction
  ): ValidatedResponse[T] = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], creditCard = creditCard.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], dispute = dispute.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any], settlementBatchSumary = settlementBatchSumary.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatedResponse[T]]
  }
  
  extension [Self <: ValidatedResponse[?], T](x: Self & ValidatedResponse[T]) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: OAuthToken): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCreditCard(value: CreditCard): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: Customer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setDispute(value: Dispute): Self = StObject.set(x, "dispute", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: ValidationErrorsCollection): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setMerchantAccount(value: MerchantAccount): Self = StObject.set(x, "merchantAccount", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Record[String, js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethod(value: PaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodNonce(value: PaymentMethodNonce): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
    
    inline def setSettlementBatchSumary(value: SettlementBatchSummary): Self = StObject.set(x, "settlementBatchSumary", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
