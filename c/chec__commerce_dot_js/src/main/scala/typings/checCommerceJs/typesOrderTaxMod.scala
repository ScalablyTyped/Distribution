package typings.checCommerceJs

import typings.checCommerceJs.anon.Postalzipcode
import typings.checCommerceJs.typesOrderTaxLineMod.OrderTaxLine
import typings.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOrderTaxMod {
  
  trait OrderTax extends StObject {
    
    var amount: Price
    
    var breakdown: js.Array[OrderTaxLine]
    
    var included_in_price: Boolean
    
    var provider: String
    
    var provider_type: js.UndefOr[String] = js.undefined
    
    var zone: Postalzipcode
  }
  object OrderTax {
    
    inline def apply(
      amount: Price,
      breakdown: js.Array[OrderTaxLine],
      included_in_price: Boolean,
      provider: String,
      zone: Postalzipcode
    ): OrderTax = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], breakdown = breakdown.asInstanceOf[js.Any], included_in_price = included_in_price.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrderTax]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OrderTax] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Price): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setBreakdown(value: js.Array[OrderTaxLine]): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
      
      inline def setBreakdownVarargs(value: OrderTaxLine*): Self = StObject.set(x, "breakdown", js.Array(value*))
      
      inline def setIncluded_in_price(value: Boolean): Self = StObject.set(x, "included_in_price", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProvider_type(value: String): Self = StObject.set(x, "provider_type", value.asInstanceOf[js.Any])
      
      inline def setProvider_typeUndefined: Self = StObject.set(x, "provider_type", js.undefined)
      
      inline def setZone(value: Postalzipcode): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    }
  }
}
