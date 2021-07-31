package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.fixed_price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fixed price resource.
  */
trait FixedPrice extends StObject {
  
  /**
    * Local price in fiat currency.
    */
  var local_price: Price[FiatCurrency]
  
  /**
    * Pricing type
    */
  var pricing_type: fixed_price
}
object FixedPrice {
  
  @scala.inline
  def apply(local_price: Price[FiatCurrency]): FixedPrice = {
    val __obj = js.Dynamic.literal(local_price = local_price.asInstanceOf[js.Any], pricing_type = "fixed_price")
    __obj.asInstanceOf[FixedPrice]
  }
  
  @scala.inline
  implicit class FixedPriceMutableBuilder[Self <: FixedPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal_price(value: Price[FiatCurrency]): Self = StObject.set(x, "local_price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricing_type(value: fixed_price): Self = StObject.set(x, "pricing_type", value.asInstanceOf[js.Any])
  }
}
