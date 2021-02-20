package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOnAddRequest extends StObject {
  
  var amount: js.UndefOr[String] = js.native
  
  var inheritedFromId: String = js.native
  
  var neverExpires: js.UndefOr[Boolean] = js.native
  
  var numberOfBillingCycles: js.UndefOr[Double] = js.native
  
  var quantity: js.UndefOr[Double] = js.native
}
object AddOnAddRequest {
  
  @scala.inline
  def apply(inheritedFromId: String): AddOnAddRequest = {
    val __obj = js.Dynamic.literal(inheritedFromId = inheritedFromId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOnAddRequest]
  }
  
  @scala.inline
  implicit class AddOnAddRequestMutableBuilder[Self <: AddOnAddRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setInheritedFromId(value: String): Self = StObject.set(x, "inheritedFromId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeverExpires(value: Boolean): Self = StObject.set(x, "neverExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeverExpiresUndefined: Self = StObject.set(x, "neverExpires", js.undefined)
    
    @scala.inline
    def setNumberOfBillingCycles(value: Double): Self = StObject.set(x, "numberOfBillingCycles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfBillingCyclesUndefined: Self = StObject.set(x, "numberOfBillingCycles", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
