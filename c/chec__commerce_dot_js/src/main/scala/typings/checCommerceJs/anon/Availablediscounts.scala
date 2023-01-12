package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Availablediscounts extends StObject {
  
  var available_discounts: Boolean
  
  var digital_delivery: Boolean
  
  var pay_what_you_want: Boolean
  
  var physical_delivery: Boolean
}
object Availablediscounts {
  
  inline def apply(
    available_discounts: Boolean,
    digital_delivery: Boolean,
    pay_what_you_want: Boolean,
    physical_delivery: Boolean
  ): Availablediscounts = {
    val __obj = js.Dynamic.literal(available_discounts = available_discounts.asInstanceOf[js.Any], digital_delivery = digital_delivery.asInstanceOf[js.Any], pay_what_you_want = pay_what_you_want.asInstanceOf[js.Any], physical_delivery = physical_delivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Availablediscounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Availablediscounts] (val x: Self) extends AnyVal {
    
    inline def setAvailable_discounts(value: Boolean): Self = StObject.set(x, "available_discounts", value.asInstanceOf[js.Any])
    
    inline def setDigital_delivery(value: Boolean): Self = StObject.set(x, "digital_delivery", value.asInstanceOf[js.Any])
    
    inline def setPay_what_you_want(value: Boolean): Self = StObject.set(x, "pay_what_you_want", value.asInstanceOf[js.Any])
    
    inline def setPhysical_delivery(value: Boolean): Self = StObject.set(x, "physical_delivery", value.asInstanceOf[js.Any])
  }
}
