package typings.braintreeWebDropIn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait threeDSecureOptions extends StObject {
  
  var amount: String
}
object threeDSecureOptions {
  
  inline def apply(amount: String): threeDSecureOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[threeDSecureOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: threeDSecureOptions] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
  }
}
