package typings.checCommerceJs.anon

import typings.checCommerceJs.typesOrderLineItemMod.OrderLineItem
import typings.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discount extends StObject {
  
  var discount: OmitDiscountvalid | js.Array[Any]
  
  var giftcard: Any
  
  var line_items: js.Array[OrderLineItem]
  
  var pay_what_you_want: Minimum
  
  var shipping: Any
  
  var subtotal: Price
  
  var total: Price
  
  var total_paid: Price
  
  var total_with_tax: Price
}
object Discount {
  
  inline def apply(
    discount: OmitDiscountvalid | js.Array[Any],
    giftcard: Any,
    line_items: js.Array[OrderLineItem],
    pay_what_you_want: Minimum,
    shipping: Any,
    subtotal: Price,
    total: Price,
    total_paid: Price,
    total_with_tax: Price
  ): Discount = {
    val __obj = js.Dynamic.literal(discount = discount.asInstanceOf[js.Any], giftcard = giftcard.asInstanceOf[js.Any], line_items = line_items.asInstanceOf[js.Any], pay_what_you_want = pay_what_you_want.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], total_paid = total_paid.asInstanceOf[js.Any], total_with_tax = total_with_tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discount]
  }
  
  extension [Self <: Discount](x: Self) {
    
    inline def setDiscount(value: OmitDiscountvalid | js.Array[Any]): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountVarargs(value: Any*): Self = StObject.set(x, "discount", js.Array(value*))
    
    inline def setGiftcard(value: Any): Self = StObject.set(x, "giftcard", value.asInstanceOf[js.Any])
    
    inline def setLine_items(value: js.Array[OrderLineItem]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
    
    inline def setLine_itemsVarargs(value: OrderLineItem*): Self = StObject.set(x, "line_items", js.Array(value*))
    
    inline def setPay_what_you_want(value: Minimum): Self = StObject.set(x, "pay_what_you_want", value.asInstanceOf[js.Any])
    
    inline def setShipping(value: Any): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setSubtotal(value: Price): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Price): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_paid(value: Price): Self = StObject.set(x, "total_paid", value.asInstanceOf[js.Any])
    
    inline def setTotal_with_tax(value: Price): Self = StObject.set(x, "total_with_tax", value.asInstanceOf[js.Any])
  }
}
