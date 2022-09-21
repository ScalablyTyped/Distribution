package typings.checCommerceJs

import typings.checCommerceJs.anon.Availableoptions
import typings.checCommerceJs.anon.Minimum
import typings.checCommerceJs.currencyMod.Currency
import typings.checCommerceJs.discountMod.Discount
import typings.checCommerceJs.orderTaxMod.OrderTax
import typings.checCommerceJs.priceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveMod {
  
  trait Live extends StObject {
    
    var currency: Currency
    
    var discount: Discount | js.Array[Any]
    
    var giftcard: Any
    
    var line_items: js.Array[Any]
    
    var merchant_id: Double
    
    var pay_what_you_want: Minimum
    
    var shipping: Availableoptions
    
    var subtotal: Price
    
    var tax: OrderTax
    
    var total: Price
    
    var total_with_tax: Price
  }
  object Live {
    
    inline def apply(
      currency: Currency,
      discount: Discount | js.Array[Any],
      giftcard: Any,
      line_items: js.Array[Any],
      merchant_id: Double,
      pay_what_you_want: Minimum,
      shipping: Availableoptions,
      subtotal: Price,
      tax: OrderTax,
      total: Price,
      total_with_tax: Price
    ): Live = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], giftcard = giftcard.asInstanceOf[js.Any], line_items = line_items.asInstanceOf[js.Any], merchant_id = merchant_id.asInstanceOf[js.Any], pay_what_you_want = pay_what_you_want.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], tax = tax.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], total_with_tax = total_with_tax.asInstanceOf[js.Any])
      __obj.asInstanceOf[Live]
    }
    
    extension [Self <: Live](x: Self) {
      
      inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDiscount(value: Discount | js.Array[Any]): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
      
      inline def setDiscountVarargs(value: Any*): Self = StObject.set(x, "discount", js.Array(value*))
      
      inline def setGiftcard(value: Any): Self = StObject.set(x, "giftcard", value.asInstanceOf[js.Any])
      
      inline def setLine_items(value: js.Array[Any]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
      
      inline def setLine_itemsVarargs(value: Any*): Self = StObject.set(x, "line_items", js.Array(value*))
      
      inline def setMerchant_id(value: Double): Self = StObject.set(x, "merchant_id", value.asInstanceOf[js.Any])
      
      inline def setPay_what_you_want(value: Minimum): Self = StObject.set(x, "pay_what_you_want", value.asInstanceOf[js.Any])
      
      inline def setShipping(value: Availableoptions): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      inline def setSubtotal(value: Price): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
      
      inline def setTax(value: OrderTax): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Price): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotal_with_tax(value: Price): Self = StObject.set(x, "total_with_tax", value.asInstanceOf[js.Any])
    }
  }
}
