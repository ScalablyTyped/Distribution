package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Digitalfulfillment extends StObject {
  
  var digital_fulfillment: Boolean
  
  var discounts: Boolean
  
  var pay_what_you_want: Boolean
  
  var physical_fulfillment: Boolean
}
object Digitalfulfillment {
  
  inline def apply(
    digital_fulfillment: Boolean,
    discounts: Boolean,
    pay_what_you_want: Boolean,
    physical_fulfillment: Boolean
  ): Digitalfulfillment = {
    val __obj = js.Dynamic.literal(digital_fulfillment = digital_fulfillment.asInstanceOf[js.Any], discounts = discounts.asInstanceOf[js.Any], pay_what_you_want = pay_what_you_want.asInstanceOf[js.Any], physical_fulfillment = physical_fulfillment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digitalfulfillment]
  }
  
  extension [Self <: Digitalfulfillment](x: Self) {
    
    inline def setDigital_fulfillment(value: Boolean): Self = StObject.set(x, "digital_fulfillment", value.asInstanceOf[js.Any])
    
    inline def setDiscounts(value: Boolean): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setPay_what_you_want(value: Boolean): Self = StObject.set(x, "pay_what_you_want", value.asInstanceOf[js.Any])
    
    inline def setPhysical_fulfillment(value: Boolean): Self = StObject.set(x, "physical_fulfillment", value.asInstanceOf[js.Any])
  }
}
