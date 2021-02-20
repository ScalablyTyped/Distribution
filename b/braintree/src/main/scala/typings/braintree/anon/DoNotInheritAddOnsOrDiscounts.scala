package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoNotInheritAddOnsOrDiscounts extends StObject {
  
  var doNotInheritAddOnsOrDiscounts: js.UndefOr[Boolean] = js.native
  
  var paypal: js.UndefOr[Description] = js.native
  
  var startImmediately: js.UndefOr[Boolean] = js.native
}
object DoNotInheritAddOnsOrDiscounts {
  
  @scala.inline
  def apply(): DoNotInheritAddOnsOrDiscounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoNotInheritAddOnsOrDiscounts]
  }
  
  @scala.inline
  implicit class DoNotInheritAddOnsOrDiscountsMutableBuilder[Self <: DoNotInheritAddOnsOrDiscounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoNotInheritAddOnsOrDiscounts(value: Boolean): Self = StObject.set(x, "doNotInheritAddOnsOrDiscounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotInheritAddOnsOrDiscountsUndefined: Self = StObject.set(x, "doNotInheritAddOnsOrDiscounts", js.undefined)
    
    @scala.inline
    def setPaypal(value: Description): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
    
    @scala.inline
    def setStartImmediately(value: Boolean): Self = StObject.set(x, "startImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartImmediatelyUndefined: Self = StObject.set(x, "startImmediately", js.undefined)
  }
}
