package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailOnDuplicatePaymentMethod extends StObject {
  
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined
  
  var makeDefault: js.UndefOr[Boolean] = js.undefined
  
  var verifyCard: js.UndefOr[Boolean] = js.undefined
}
object FailOnDuplicatePaymentMethod {
  
  inline def apply(): FailOnDuplicatePaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailOnDuplicatePaymentMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailOnDuplicatePaymentMethod] (val x: Self) extends AnyVal {
    
    inline def setFailOnDuplicatePaymentMethod(value: Boolean): Self = StObject.set(x, "failOnDuplicatePaymentMethod", value.asInstanceOf[js.Any])
    
    inline def setFailOnDuplicatePaymentMethodUndefined: Self = StObject.set(x, "failOnDuplicatePaymentMethod", js.undefined)
    
    inline def setMakeDefault(value: Boolean): Self = StObject.set(x, "makeDefault", value.asInstanceOf[js.Any])
    
    inline def setMakeDefaultUndefined: Self = StObject.set(x, "makeDefault", js.undefined)
    
    inline def setVerifyCard(value: Boolean): Self = StObject.set(x, "verifyCard", value.asInstanceOf[js.Any])
    
    inline def setVerifyCardUndefined: Self = StObject.set(x, "verifyCard", js.undefined)
  }
}
