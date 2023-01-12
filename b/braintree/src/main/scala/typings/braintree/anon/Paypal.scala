package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paypal extends StObject {
  
  var paypal: js.UndefOr[Description] = js.undefined
  
  var prorateCharges: js.UndefOr[Boolean] = js.undefined
  
  var replaceAllAddOnsAndDiscounts: js.UndefOr[Boolean] = js.undefined
  
  var revertSubscriptionOnProrationFailure: js.UndefOr[Boolean] = js.undefined
}
object Paypal {
  
  inline def apply(): Paypal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paypal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paypal] (val x: Self) extends AnyVal {
    
    inline def setPaypal(value: Description): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    inline def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
    
    inline def setProrateCharges(value: Boolean): Self = StObject.set(x, "prorateCharges", value.asInstanceOf[js.Any])
    
    inline def setProrateChargesUndefined: Self = StObject.set(x, "prorateCharges", js.undefined)
    
    inline def setReplaceAllAddOnsAndDiscounts(value: Boolean): Self = StObject.set(x, "replaceAllAddOnsAndDiscounts", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllAddOnsAndDiscountsUndefined: Self = StObject.set(x, "replaceAllAddOnsAndDiscounts", js.undefined)
    
    inline def setRevertSubscriptionOnProrationFailure(value: Boolean): Self = StObject.set(x, "revertSubscriptionOnProrationFailure", value.asInstanceOf[js.Any])
    
    inline def setRevertSubscriptionOnProrationFailureUndefined: Self = StObject.set(x, "revertSubscriptionOnProrationFailure", js.undefined)
  }
}
