package typings.braintree.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatedResponse[T] extends StObject {
  
  var address: Address = js.native
  
  var clientToken: String = js.native
  
  var credentials: OAuthToken = js.native
  
  var creditCard: CreditCard = js.native
  
  var customer: Customer = js.native
  
  var dispute: Dispute = js.native
  
  var errors: ValidationErrorsCollection = js.native
  
  var merchantAccount: MerchantAccount = js.native
  
  var message: String = js.native
  
  var params: Record[String, _] = js.native
  
  var paymentMethod: PaymentMethod = js.native
  
  var paymentMethodNonce: PaymentMethodNonce = js.native
  
  var settlementBatchSumary: SettlementBatchSummary = js.native
  
  var subscription: Subscription = js.native
  
  var success: Boolean = js.native
  
  var transaction: Transaction = js.native
}
object ValidatedResponse {
  
  @scala.inline
  def apply[T](
    address: Address,
    clientToken: String,
    credentials: OAuthToken,
    creditCard: CreditCard,
    customer: Customer,
    dispute: Dispute,
    errors: ValidationErrorsCollection,
    merchantAccount: MerchantAccount,
    message: String,
    params: Record[String, _],
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
  
  @scala.inline
  implicit class ValidatedResponseMutableBuilder[Self <: ValidatedResponse[_], T] (val x: Self with ValidatedResponse[T]) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentials(value: OAuthToken): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditCard(value: CreditCard): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: Customer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispute(value: Dispute): Self = StObject.set(x, "dispute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: ValidationErrorsCollection): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantAccount(value: MerchantAccount): Self = StObject.set(x, "merchantAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: Record[String, _]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethod(value: PaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodNonce(value: PaymentMethodNonce): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettlementBatchSumary(value: SettlementBatchSummary): Self = StObject.set(x, "settlementBatchSumary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
