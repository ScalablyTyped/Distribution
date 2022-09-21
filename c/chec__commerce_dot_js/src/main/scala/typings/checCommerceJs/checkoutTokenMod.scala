package typings.checCommerceJs

import typings.checCommerceJs.anon.Active
import typings.checCommerceJs.anon.Availablediscounts
import typings.checCommerceJs.anon.Billingaddress
import typings.checCommerceJs.anon.Cartfree
import typings.checCommerceJs.anon.Collectsbillingaddress
import typings.checCommerceJs.anon.Collectsextrafields
import typings.checCommerceJs.anon.Digitaldelivery
import typings.checCommerceJs.extrafieldMod.Extrafield
import typings.checCommerceJs.gatewayMod.Gateway
import typings.checCommerceJs.liveMod.Live
import typings.checCommerceJs.merchantMod.Merchant
import typings.checCommerceJs.priceMod.Price
import typings.checCommerceJs.selectedVariantMod.SelectedVariant
import typings.checCommerceJs.shippingMethodMod.ShippingMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkoutTokenMod {
  
  trait CheckoutToken extends StObject {
    
    var analytics: Any
    
    var cart_id: String | Null
    
    var collects: Billingaddress
    
    var conditionals: Collectsbillingaddress
    
    var created: Double
    
    var expires: Double
    
    var extra_fields: js.Array[Extrafield]
    
    var gateways: js.Array[Gateway]
    
    var has: Availablediscounts
    
    var id: String
    
    var is: Cartfree
    
    var line_items: js.Array[CheckoutTokenLineItem]
    
    var live: Live
    
    var merchant: Merchant
    
    var shipping_methods: js.Array[ShippingMethod]
  }
  object CheckoutToken {
    
    inline def apply(
      analytics: Any,
      collects: Billingaddress,
      conditionals: Collectsbillingaddress,
      created: Double,
      expires: Double,
      extra_fields: js.Array[Extrafield],
      gateways: js.Array[Gateway],
      has: Availablediscounts,
      id: String,
      is: Cartfree,
      line_items: js.Array[CheckoutTokenLineItem],
      live: Live,
      merchant: Merchant,
      shipping_methods: js.Array[ShippingMethod]
    ): CheckoutToken = {
      val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any], collects = collects.asInstanceOf[js.Any], conditionals = conditionals.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], extra_fields = extra_fields.asInstanceOf[js.Any], gateways = gateways.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], line_items = line_items.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], shipping_methods = shipping_methods.asInstanceOf[js.Any], cart_id = null)
      __obj.asInstanceOf[CheckoutToken]
    }
    
    extension [Self <: CheckoutToken](x: Self) {
      
      inline def setAnalytics(value: Any): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      
      inline def setCart_id(value: String): Self = StObject.set(x, "cart_id", value.asInstanceOf[js.Any])
      
      inline def setCart_idNull: Self = StObject.set(x, "cart_id", null)
      
      inline def setCollects(value: Billingaddress): Self = StObject.set(x, "collects", value.asInstanceOf[js.Any])
      
      inline def setConditionals(value: Collectsbillingaddress): Self = StObject.set(x, "conditionals", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExtra_fields(value: js.Array[Extrafield]): Self = StObject.set(x, "extra_fields", value.asInstanceOf[js.Any])
      
      inline def setExtra_fieldsVarargs(value: Extrafield*): Self = StObject.set(x, "extra_fields", js.Array(value*))
      
      inline def setGateways(value: js.Array[Gateway]): Self = StObject.set(x, "gateways", value.asInstanceOf[js.Any])
      
      inline def setGatewaysVarargs(value: Gateway*): Self = StObject.set(x, "gateways", js.Array(value*))
      
      inline def setHas(value: Availablediscounts): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIs(value: Cartfree): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setLine_items(value: js.Array[CheckoutTokenLineItem]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
      
      inline def setLine_itemsVarargs(value: CheckoutTokenLineItem*): Self = StObject.set(x, "line_items", js.Array(value*))
      
      inline def setLive(value: Live): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setMerchant(value: Merchant): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
      
      inline def setShipping_methods(value: js.Array[ShippingMethod]): Self = StObject.set(x, "shipping_methods", value.asInstanceOf[js.Any])
      
      inline def setShipping_methodsVarargs(value: ShippingMethod*): Self = StObject.set(x, "shipping_methods", js.Array(value*))
    }
  }
  
  trait CheckoutTokenLineItem extends StObject {
    
    var collects: Billingaddress
    
    var conditionals: Collectsextrafields
    
    var description: String | Null
    
    var has: Digitaldelivery
    
    var id: String
    
    var image: String | Null
    
    var is: Active
    
    var name: String
    
    var price: Price
    
    var product_id: String
    
    var quantity: Double
    
    var subtotal: Price
    
    var variants: js.Array[SelectedVariant]
  }
  object CheckoutTokenLineItem {
    
    inline def apply(
      collects: Billingaddress,
      conditionals: Collectsextrafields,
      has: Digitaldelivery,
      id: String,
      is: Active,
      name: String,
      price: Price,
      product_id: String,
      quantity: Double,
      subtotal: Price,
      variants: js.Array[SelectedVariant]
    ): CheckoutTokenLineItem = {
      val __obj = js.Dynamic.literal(collects = collects.asInstanceOf[js.Any], conditionals = conditionals.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any], description = null, image = null)
      __obj.asInstanceOf[CheckoutTokenLineItem]
    }
    
    extension [Self <: CheckoutTokenLineItem](x: Self) {
      
      inline def setCollects(value: Billingaddress): Self = StObject.set(x, "collects", value.asInstanceOf[js.Any])
      
      inline def setConditionals(value: Collectsextrafields): Self = StObject.set(x, "conditionals", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setHas(value: Digitaldelivery): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setIs(value: Active): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setSubtotal(value: Price): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
      
      inline def setVariants(value: js.Array[SelectedVariant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsVarargs(value: SelectedVariant*): Self = StObject.set(x, "variants", js.Array(value*))
    }
  }
}
