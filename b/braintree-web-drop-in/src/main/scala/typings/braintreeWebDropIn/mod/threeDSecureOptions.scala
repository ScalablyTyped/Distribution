package typings.braintreeWebDropIn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait threeDSecureOptions extends StObject {
  
  var amount: String = js.native
}
object threeDSecureOptions {
  
  @scala.inline
  def apply(amount: String): threeDSecureOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[threeDSecureOptions]
  }
  
  @scala.inline
  implicit class threeDSecureOptionsMutableBuilder[Self <: threeDSecureOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
  }
}
