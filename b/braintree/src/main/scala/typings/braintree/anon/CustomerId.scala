package typings.braintree.anon

import typings.braintree.mod.PaymentMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerId extends StObject {
  
  var customerId: String
  
  var revokedPaymentMethod: PaymentMethod
  
  var token: String
}
object CustomerId {
  
  inline def apply(customerId: String, revokedPaymentMethod: PaymentMethod, token: String): CustomerId = {
    val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any], revokedPaymentMethod = revokedPaymentMethod.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerId] (val x: Self) extends AnyVal {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setRevokedPaymentMethod(value: PaymentMethod): Self = StObject.set(x, "revokedPaymentMethod", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
