package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collectsbillingaddress extends StObject {
  
  var collects_billing_address: Boolean
  
  var collects_extra_fields: Boolean
  
  var collects_fullname: Boolean
  
  var collects_shipping_address: Boolean
  
  var has_available_discounts: Boolean
  
  var has_digital_delivery: Boolean
  
  var has_pay_what_you_want: Boolean
  
  var has_physical_delivery: Boolean
  
  var is_cart_free: Boolean
}
object Collectsbillingaddress {
  
  inline def apply(
    collects_billing_address: Boolean,
    collects_extra_fields: Boolean,
    collects_fullname: Boolean,
    collects_shipping_address: Boolean,
    has_available_discounts: Boolean,
    has_digital_delivery: Boolean,
    has_pay_what_you_want: Boolean,
    has_physical_delivery: Boolean,
    is_cart_free: Boolean
  ): Collectsbillingaddress = {
    val __obj = js.Dynamic.literal(collects_billing_address = collects_billing_address.asInstanceOf[js.Any], collects_extra_fields = collects_extra_fields.asInstanceOf[js.Any], collects_fullname = collects_fullname.asInstanceOf[js.Any], collects_shipping_address = collects_shipping_address.asInstanceOf[js.Any], has_available_discounts = has_available_discounts.asInstanceOf[js.Any], has_digital_delivery = has_digital_delivery.asInstanceOf[js.Any], has_pay_what_you_want = has_pay_what_you_want.asInstanceOf[js.Any], has_physical_delivery = has_physical_delivery.asInstanceOf[js.Any], is_cart_free = is_cart_free.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collectsbillingaddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collectsbillingaddress] (val x: Self) extends AnyVal {
    
    inline def setCollects_billing_address(value: Boolean): Self = StObject.set(x, "collects_billing_address", value.asInstanceOf[js.Any])
    
    inline def setCollects_extra_fields(value: Boolean): Self = StObject.set(x, "collects_extra_fields", value.asInstanceOf[js.Any])
    
    inline def setCollects_fullname(value: Boolean): Self = StObject.set(x, "collects_fullname", value.asInstanceOf[js.Any])
    
    inline def setCollects_shipping_address(value: Boolean): Self = StObject.set(x, "collects_shipping_address", value.asInstanceOf[js.Any])
    
    inline def setHas_available_discounts(value: Boolean): Self = StObject.set(x, "has_available_discounts", value.asInstanceOf[js.Any])
    
    inline def setHas_digital_delivery(value: Boolean): Self = StObject.set(x, "has_digital_delivery", value.asInstanceOf[js.Any])
    
    inline def setHas_pay_what_you_want(value: Boolean): Self = StObject.set(x, "has_pay_what_you_want", value.asInstanceOf[js.Any])
    
    inline def setHas_physical_delivery(value: Boolean): Self = StObject.set(x, "has_physical_delivery", value.asInstanceOf[js.Any])
    
    inline def setIs_cart_free(value: Boolean): Self = StObject.set(x, "is_cart_free", value.asInstanceOf[js.Any])
  }
}
