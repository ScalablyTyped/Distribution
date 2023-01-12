package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoNotInheritAddOnsOrDiscounts extends StObject {
  
  var doNotInheritAddOnsOrDiscounts: js.UndefOr[Boolean] = js.undefined
  
  var paypal: js.UndefOr[Description] = js.undefined
  
  var startImmediately: js.UndefOr[Boolean] = js.undefined
}
object DoNotInheritAddOnsOrDiscounts {
  
  inline def apply(): DoNotInheritAddOnsOrDiscounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoNotInheritAddOnsOrDiscounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoNotInheritAddOnsOrDiscounts] (val x: Self) extends AnyVal {
    
    inline def setDoNotInheritAddOnsOrDiscounts(value: Boolean): Self = StObject.set(x, "doNotInheritAddOnsOrDiscounts", value.asInstanceOf[js.Any])
    
    inline def setDoNotInheritAddOnsOrDiscountsUndefined: Self = StObject.set(x, "doNotInheritAddOnsOrDiscounts", js.undefined)
    
    inline def setPaypal(value: Description): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    inline def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
    
    inline def setStartImmediately(value: Boolean): Self = StObject.set(x, "startImmediately", value.asInstanceOf[js.Any])
    
    inline def setStartImmediatelyUndefined: Self = StObject.set(x, "startImmediately", js.undefined)
  }
}
