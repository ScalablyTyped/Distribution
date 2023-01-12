package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collectsextrafields extends StObject {
  
  var collects_billing_address: Boolean
  
  var collects_extra_fields: Boolean
  
  var collects_fullname: Boolean
  
  var collects_shipping_address: Boolean
  
  var has_digital_delivery: Boolean
  
  var has_images: Boolean
  
  var has_physical_delivery: Boolean
  
  var has_video: Boolean
  
  var is_active: Boolean
  
  var is_free: Boolean
  
  var is_inventory_managed: Boolean
  
  var is_pay_what_you_want: Boolean
  
  var is_sold_out: Boolean
}
object Collectsextrafields {
  
  inline def apply(
    collects_billing_address: Boolean,
    collects_extra_fields: Boolean,
    collects_fullname: Boolean,
    collects_shipping_address: Boolean,
    has_digital_delivery: Boolean,
    has_images: Boolean,
    has_physical_delivery: Boolean,
    has_video: Boolean,
    is_active: Boolean,
    is_free: Boolean,
    is_inventory_managed: Boolean,
    is_pay_what_you_want: Boolean,
    is_sold_out: Boolean
  ): Collectsextrafields = {
    val __obj = js.Dynamic.literal(collects_billing_address = collects_billing_address.asInstanceOf[js.Any], collects_extra_fields = collects_extra_fields.asInstanceOf[js.Any], collects_fullname = collects_fullname.asInstanceOf[js.Any], collects_shipping_address = collects_shipping_address.asInstanceOf[js.Any], has_digital_delivery = has_digital_delivery.asInstanceOf[js.Any], has_images = has_images.asInstanceOf[js.Any], has_physical_delivery = has_physical_delivery.asInstanceOf[js.Any], has_video = has_video.asInstanceOf[js.Any], is_active = is_active.asInstanceOf[js.Any], is_free = is_free.asInstanceOf[js.Any], is_inventory_managed = is_inventory_managed.asInstanceOf[js.Any], is_pay_what_you_want = is_pay_what_you_want.asInstanceOf[js.Any], is_sold_out = is_sold_out.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collectsextrafields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collectsextrafields] (val x: Self) extends AnyVal {
    
    inline def setCollects_billing_address(value: Boolean): Self = StObject.set(x, "collects_billing_address", value.asInstanceOf[js.Any])
    
    inline def setCollects_extra_fields(value: Boolean): Self = StObject.set(x, "collects_extra_fields", value.asInstanceOf[js.Any])
    
    inline def setCollects_fullname(value: Boolean): Self = StObject.set(x, "collects_fullname", value.asInstanceOf[js.Any])
    
    inline def setCollects_shipping_address(value: Boolean): Self = StObject.set(x, "collects_shipping_address", value.asInstanceOf[js.Any])
    
    inline def setHas_digital_delivery(value: Boolean): Self = StObject.set(x, "has_digital_delivery", value.asInstanceOf[js.Any])
    
    inline def setHas_images(value: Boolean): Self = StObject.set(x, "has_images", value.asInstanceOf[js.Any])
    
    inline def setHas_physical_delivery(value: Boolean): Self = StObject.set(x, "has_physical_delivery", value.asInstanceOf[js.Any])
    
    inline def setHas_video(value: Boolean): Self = StObject.set(x, "has_video", value.asInstanceOf[js.Any])
    
    inline def setIs_active(value: Boolean): Self = StObject.set(x, "is_active", value.asInstanceOf[js.Any])
    
    inline def setIs_free(value: Boolean): Self = StObject.set(x, "is_free", value.asInstanceOf[js.Any])
    
    inline def setIs_inventory_managed(value: Boolean): Self = StObject.set(x, "is_inventory_managed", value.asInstanceOf[js.Any])
    
    inline def setIs_pay_what_you_want(value: Boolean): Self = StObject.set(x, "is_pay_what_you_want", value.asInstanceOf[js.Any])
    
    inline def setIs_sold_out(value: Boolean): Self = StObject.set(x, "is_sold_out", value.asInstanceOf[js.Any])
  }
}
