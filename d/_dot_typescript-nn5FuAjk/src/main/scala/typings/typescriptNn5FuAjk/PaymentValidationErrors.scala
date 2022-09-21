package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentValidationErrors extends StObject {
  
  var error: js.UndefOr[java.lang.String] = js.undefined
  
  var paymentMethod: js.UndefOr[Any] = js.undefined
}
object PaymentValidationErrors {
  
  inline def apply(): PaymentValidationErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentValidationErrors]
  }
  
  extension [Self <: PaymentValidationErrors](x: Self) {
    
    inline def setError(value: java.lang.String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPaymentMethod(value: Any): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
  }
}
