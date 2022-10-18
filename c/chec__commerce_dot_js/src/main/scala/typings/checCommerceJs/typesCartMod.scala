package typings.checCommerceJs

import typings.checCommerceJs.typesCurrencyMod.Currency
import typings.checCommerceJs.typesLineItemMod.LineItem
import typings.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCartMod {
  
  trait Cart extends StObject {
    
    var created: Double
    
    var currency: Currency
    
    var discount_code: Any
    
    var expires: Double
    
    // todo
    var hosted_checkout_url: String
    
    var id: String
    
    var line_items: js.Array[LineItem]
    
    var subtotal: Price
    
    var total_items: Double
    
    var total_unique_items: Double
    
    var updated: Double
  }
  object Cart {
    
    inline def apply(
      created: Double,
      currency: Currency,
      discount_code: Any,
      expires: Double,
      hosted_checkout_url: String,
      id: String,
      line_items: js.Array[LineItem],
      subtotal: Price,
      total_items: Double,
      total_unique_items: Double,
      updated: Double
    ): Cart = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], discount_code = discount_code.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], hosted_checkout_url = hosted_checkout_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], line_items = line_items.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], total_items = total_items.asInstanceOf[js.Any], total_unique_items = total_unique_items.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cart]
    }
    
    extension [Self <: Cart](x: Self) {
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDiscount_code(value: Any): Self = StObject.set(x, "discount_code", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setHosted_checkout_url(value: String): Self = StObject.set(x, "hosted_checkout_url", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLine_items(value: js.Array[LineItem]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
      
      inline def setLine_itemsVarargs(value: LineItem*): Self = StObject.set(x, "line_items", js.Array(value*))
      
      inline def setSubtotal(value: Price): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
      
      inline def setTotal_items(value: Double): Self = StObject.set(x, "total_items", value.asInstanceOf[js.Any])
      
      inline def setTotal_unique_items(value: Double): Self = StObject.set(x, "total_unique_items", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
}
