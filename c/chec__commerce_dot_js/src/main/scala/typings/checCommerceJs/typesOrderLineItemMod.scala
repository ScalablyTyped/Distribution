package typings.checCommerceJs

import typings.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOrderLineItemMod {
  
  trait OrderLineItem extends StObject {
    
    var id: String
    
    var line_total: Price
    
    var line_total_with_tax: Price
    
    var price: Price
    
    var product_id: String
    
    var product_name: String
    
    var product_sku: String | Null
    
    var quantity: Double
    
    var selected_options: Any
    
    var tax: Any
    
    var variant: Any
  }
  object OrderLineItem {
    
    inline def apply(
      id: String,
      line_total: Price,
      line_total_with_tax: Price,
      price: Price,
      product_id: String,
      product_name: String,
      quantity: Double,
      selected_options: Any,
      tax: Any,
      variant: Any
    ): OrderLineItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], line_total = line_total.asInstanceOf[js.Any], line_total_with_tax = line_total_with_tax.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], selected_options = selected_options.asInstanceOf[js.Any], tax = tax.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], product_sku = null)
      __obj.asInstanceOf[OrderLineItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OrderLineItem] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLine_total(value: Price): Self = StObject.set(x, "line_total", value.asInstanceOf[js.Any])
      
      inline def setLine_total_with_tax(value: Price): Self = StObject.set(x, "line_total_with_tax", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
      
      inline def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
      
      inline def setProduct_sku(value: String): Self = StObject.set(x, "product_sku", value.asInstanceOf[js.Any])
      
      inline def setProduct_skuNull: Self = StObject.set(x, "product_sku", null)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setSelected_options(value: Any): Self = StObject.set(x, "selected_options", value.asInstanceOf[js.Any])
      
      inline def setTax(value: Any): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: Any): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
}
