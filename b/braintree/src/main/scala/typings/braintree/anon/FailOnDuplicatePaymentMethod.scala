package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailOnDuplicatePaymentMethod extends StObject {
  
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.native
  
  var makeDefault: js.UndefOr[Boolean] = js.native
  
  var verifyCard: js.UndefOr[Boolean] = js.native
}
object FailOnDuplicatePaymentMethod {
  
  @scala.inline
  def apply(): FailOnDuplicatePaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailOnDuplicatePaymentMethod]
  }
  
  @scala.inline
  implicit class FailOnDuplicatePaymentMethodMutableBuilder[Self <: FailOnDuplicatePaymentMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailOnDuplicatePaymentMethod(value: Boolean): Self = StObject.set(x, "failOnDuplicatePaymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnDuplicatePaymentMethodUndefined: Self = StObject.set(x, "failOnDuplicatePaymentMethod", js.undefined)
    
    @scala.inline
    def setMakeDefault(value: Boolean): Self = StObject.set(x, "makeDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeDefaultUndefined: Self = StObject.set(x, "makeDefault", js.undefined)
    
    @scala.inline
    def setVerifyCard(value: Boolean): Self = StObject.set(x, "verifyCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyCardUndefined: Self = StObject.set(x, "verifyCard", js.undefined)
  }
}
