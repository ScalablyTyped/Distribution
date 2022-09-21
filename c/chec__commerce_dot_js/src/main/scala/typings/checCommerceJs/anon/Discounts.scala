package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discounts extends StObject {
  
  var digital_fulfillment: Boolean
  
  var discounts: Boolean
  
  var extend_apps: Boolean
  
  var extend_fulfillment: Boolean
  
  var pay_what_you_want: Boolean
  
  var physical_fulfillment: Boolean
  
  var subscription_items: Boolean
  
  var webhook_fulfillment: Boolean
}
object Discounts {
  
  inline def apply(
    digital_fulfillment: Boolean,
    discounts: Boolean,
    extend_apps: Boolean,
    extend_fulfillment: Boolean,
    pay_what_you_want: Boolean,
    physical_fulfillment: Boolean,
    subscription_items: Boolean,
    webhook_fulfillment: Boolean
  ): Discounts = {
    val __obj = js.Dynamic.literal(digital_fulfillment = digital_fulfillment.asInstanceOf[js.Any], discounts = discounts.asInstanceOf[js.Any], extend_apps = extend_apps.asInstanceOf[js.Any], extend_fulfillment = extend_fulfillment.asInstanceOf[js.Any], pay_what_you_want = pay_what_you_want.asInstanceOf[js.Any], physical_fulfillment = physical_fulfillment.asInstanceOf[js.Any], subscription_items = subscription_items.asInstanceOf[js.Any], webhook_fulfillment = webhook_fulfillment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discounts]
  }
  
  extension [Self <: Discounts](x: Self) {
    
    inline def setDigital_fulfillment(value: Boolean): Self = StObject.set(x, "digital_fulfillment", value.asInstanceOf[js.Any])
    
    inline def setDiscounts(value: Boolean): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setExtend_apps(value: Boolean): Self = StObject.set(x, "extend_apps", value.asInstanceOf[js.Any])
    
    inline def setExtend_fulfillment(value: Boolean): Self = StObject.set(x, "extend_fulfillment", value.asInstanceOf[js.Any])
    
    inline def setPay_what_you_want(value: Boolean): Self = StObject.set(x, "pay_what_you_want", value.asInstanceOf[js.Any])
    
    inline def setPhysical_fulfillment(value: Boolean): Self = StObject.set(x, "physical_fulfillment", value.asInstanceOf[js.Any])
    
    inline def setSubscription_items(value: Boolean): Self = StObject.set(x, "subscription_items", value.asInstanceOf[js.Any])
    
    inline def setWebhook_fulfillment(value: Boolean): Self = StObject.set(x, "webhook_fulfillment", value.asInstanceOf[js.Any])
  }
}
