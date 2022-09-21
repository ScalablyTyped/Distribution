package typings.checCommerceJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderConditionalsMod {
  
  trait OrderConditionals extends StObject {
    
    var collected_billing_address: Boolean
    
    var collected_eu_vat_moss_evidence: Boolean
    
    var collected_extra_fields: Boolean
    
    var collected_fullname: Boolean
    
    var collected_shipping_address: Boolean
    
    var collected_tax: Boolean
    
    var has_digital_fulfillment: Boolean
    
    var has_discounts: Boolean
    
    var has_extend_apps: Boolean
    
    var has_extend_fulfillment: Boolean
    
    var has_pay_what_you_want: Boolean
    
    var has_physical_fulfillment: Boolean
    
    var has_subscription_items: Boolean
    
    var has_webhook_fulfillment: Boolean
    
    var is_free: Boolean
    
    var is_fulfilled: Boolean
  }
  object OrderConditionals {
    
    inline def apply(
      collected_billing_address: Boolean,
      collected_eu_vat_moss_evidence: Boolean,
      collected_extra_fields: Boolean,
      collected_fullname: Boolean,
      collected_shipping_address: Boolean,
      collected_tax: Boolean,
      has_digital_fulfillment: Boolean,
      has_discounts: Boolean,
      has_extend_apps: Boolean,
      has_extend_fulfillment: Boolean,
      has_pay_what_you_want: Boolean,
      has_physical_fulfillment: Boolean,
      has_subscription_items: Boolean,
      has_webhook_fulfillment: Boolean,
      is_free: Boolean,
      is_fulfilled: Boolean
    ): OrderConditionals = {
      val __obj = js.Dynamic.literal(collected_billing_address = collected_billing_address.asInstanceOf[js.Any], collected_eu_vat_moss_evidence = collected_eu_vat_moss_evidence.asInstanceOf[js.Any], collected_extra_fields = collected_extra_fields.asInstanceOf[js.Any], collected_fullname = collected_fullname.asInstanceOf[js.Any], collected_shipping_address = collected_shipping_address.asInstanceOf[js.Any], collected_tax = collected_tax.asInstanceOf[js.Any], has_digital_fulfillment = has_digital_fulfillment.asInstanceOf[js.Any], has_discounts = has_discounts.asInstanceOf[js.Any], has_extend_apps = has_extend_apps.asInstanceOf[js.Any], has_extend_fulfillment = has_extend_fulfillment.asInstanceOf[js.Any], has_pay_what_you_want = has_pay_what_you_want.asInstanceOf[js.Any], has_physical_fulfillment = has_physical_fulfillment.asInstanceOf[js.Any], has_subscription_items = has_subscription_items.asInstanceOf[js.Any], has_webhook_fulfillment = has_webhook_fulfillment.asInstanceOf[js.Any], is_free = is_free.asInstanceOf[js.Any], is_fulfilled = is_fulfilled.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrderConditionals]
    }
    
    extension [Self <: OrderConditionals](x: Self) {
      
      inline def setCollected_billing_address(value: Boolean): Self = StObject.set(x, "collected_billing_address", value.asInstanceOf[js.Any])
      
      inline def setCollected_eu_vat_moss_evidence(value: Boolean): Self = StObject.set(x, "collected_eu_vat_moss_evidence", value.asInstanceOf[js.Any])
      
      inline def setCollected_extra_fields(value: Boolean): Self = StObject.set(x, "collected_extra_fields", value.asInstanceOf[js.Any])
      
      inline def setCollected_fullname(value: Boolean): Self = StObject.set(x, "collected_fullname", value.asInstanceOf[js.Any])
      
      inline def setCollected_shipping_address(value: Boolean): Self = StObject.set(x, "collected_shipping_address", value.asInstanceOf[js.Any])
      
      inline def setCollected_tax(value: Boolean): Self = StObject.set(x, "collected_tax", value.asInstanceOf[js.Any])
      
      inline def setHas_digital_fulfillment(value: Boolean): Self = StObject.set(x, "has_digital_fulfillment", value.asInstanceOf[js.Any])
      
      inline def setHas_discounts(value: Boolean): Self = StObject.set(x, "has_discounts", value.asInstanceOf[js.Any])
      
      inline def setHas_extend_apps(value: Boolean): Self = StObject.set(x, "has_extend_apps", value.asInstanceOf[js.Any])
      
      inline def setHas_extend_fulfillment(value: Boolean): Self = StObject.set(x, "has_extend_fulfillment", value.asInstanceOf[js.Any])
      
      inline def setHas_pay_what_you_want(value: Boolean): Self = StObject.set(x, "has_pay_what_you_want", value.asInstanceOf[js.Any])
      
      inline def setHas_physical_fulfillment(value: Boolean): Self = StObject.set(x, "has_physical_fulfillment", value.asInstanceOf[js.Any])
      
      inline def setHas_subscription_items(value: Boolean): Self = StObject.set(x, "has_subscription_items", value.asInstanceOf[js.Any])
      
      inline def setHas_webhook_fulfillment(value: Boolean): Self = StObject.set(x, "has_webhook_fulfillment", value.asInstanceOf[js.Any])
      
      inline def setIs_free(value: Boolean): Self = StObject.set(x, "is_free", value.asInstanceOf[js.Any])
      
      inline def setIs_fulfilled(value: Boolean): Self = StObject.set(x, "is_fulfilled", value.asInstanceOf[js.Any])
    }
  }
}
