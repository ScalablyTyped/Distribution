package typings.braintree.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatedResponse[T] extends StObject {
  
  var address: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Address ? braintree.braintree.Address : never */ js.Any
  
  var clientToken: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.ClientToken ? string : never */ js.Any
  
  var credentials: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.OAuthToken ? braintree.braintree.OAuthToken : never */ js.Any
  
  var creditCard: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.CreditCard ? braintree.braintree.CreditCard : never */ js.Any
  
  var customer: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Customer ? braintree.braintree.Customer : never */ js.Any
  
  var dispute: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Dispute ? braintree.braintree.Dispute : never */ js.Any
  
  var errors: ValidationErrorsCollection
  
  var merchantAccount: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.MerchantAccount ? braintree.braintree.MerchantAccount : never */ js.Any
  
  var message: String
  
  var params: Record[String, Any]
  
  var paymentMethod: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.PaymentMethod ? braintree.braintree.PaymentMethod : never */ js.Any
  
  var paymentMethodNonce: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.PaymentMethodNonce ? braintree.braintree.PaymentMethodNonce : never */ js.Any
  
  var settlementBatchSumary: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.SettlementBatchSummary ? braintree.braintree.SettlementBatchSummary : never */ js.Any
  
  var subscription: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Subscription ? braintree.braintree.Subscription : never */ js.Any
  
  var success: Boolean
  
  var transaction: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Transaction ? braintree.braintree.Transaction : never */ js.Any
}
object ValidatedResponse {
  
  inline def apply[T](
    address: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Address ? braintree.braintree.Address : never */ js.Any,
    clientToken: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.ClientToken ? string : never */ js.Any,
    credentials: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.OAuthToken ? braintree.braintree.OAuthToken : never */ js.Any,
    creditCard: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.CreditCard ? braintree.braintree.CreditCard : never */ js.Any,
    customer: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Customer ? braintree.braintree.Customer : never */ js.Any,
    dispute: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Dispute ? braintree.braintree.Dispute : never */ js.Any,
    errors: ValidationErrorsCollection,
    merchantAccount: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.MerchantAccount ? braintree.braintree.MerchantAccount : never */ js.Any,
    message: String,
    params: Record[String, Any],
    paymentMethod: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.PaymentMethod ? braintree.braintree.PaymentMethod : never */ js.Any,
    paymentMethodNonce: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.PaymentMethodNonce ? braintree.braintree.PaymentMethodNonce : never */ js.Any,
    settlementBatchSumary: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.SettlementBatchSummary ? braintree.braintree.SettlementBatchSummary : never */ js.Any,
    subscription: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Subscription ? braintree.braintree.Subscription : never */ js.Any,
    success: Boolean,
    transaction: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Transaction ? braintree.braintree.Transaction : never */ js.Any
  ): ValidatedResponse[T] = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], creditCard = creditCard.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], dispute = dispute.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any], settlementBatchSumary = settlementBatchSumary.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatedResponse[T]]
  }
  
  extension [Self <: ValidatedResponse[?], T](x: Self & ValidatedResponse[T]) {
    
    inline def setAddress(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Address ? braintree.braintree.Address : never */ js.Any
    ): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setClientToken(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.ClientToken ? string : never */ js.Any
    ): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setCredentials(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.OAuthToken ? braintree.braintree.OAuthToken : never */ js.Any
    ): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCreditCard(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.CreditCard ? braintree.braintree.CreditCard : never */ js.Any
    ): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    inline def setCustomer(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Customer ? braintree.braintree.Customer : never */ js.Any
    ): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setDispute(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Dispute ? braintree.braintree.Dispute : never */ js.Any
    ): Self = StObject.set(x, "dispute", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: ValidationErrorsCollection): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setMerchantAccount(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.MerchantAccount ? braintree.braintree.MerchantAccount : never */ js.Any
    ): Self = StObject.set(x, "merchantAccount", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethod(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.PaymentMethod ? braintree.braintree.PaymentMethod : never */ js.Any
    ): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodNonce(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.PaymentMethodNonce ? braintree.braintree.PaymentMethodNonce : never */ js.Any
    ): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
    
    inline def setSettlementBatchSumary(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.SettlementBatchSummary ? braintree.braintree.SettlementBatchSummary : never */ js.Any
    ): Self = StObject.set(x, "settlementBatchSumary", value.asInstanceOf[js.Any])
    
    inline def setSubscription(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Subscription ? braintree.braintree.Subscription : never */ js.Any
    ): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setTransaction(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends braintree.braintree.Transaction ? braintree.braintree.Transaction : never */ js.Any
    ): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
