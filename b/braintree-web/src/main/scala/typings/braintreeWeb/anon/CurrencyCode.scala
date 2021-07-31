package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrencyCode extends StObject {
  
  var currencyCode: String
  
  var totalPrice: String
  
  var totalPriceStatus: String
}
object CurrencyCode {
  
  @scala.inline
  def apply(currencyCode: String, totalPrice: String, totalPriceStatus: String): CurrencyCode = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], totalPrice = totalPrice.asInstanceOf[js.Any], totalPriceStatus = totalPriceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyCode]
  }
  
  @scala.inline
  implicit class CurrencyCodeMutableBuilder[Self <: CurrencyCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPrice(value: String): Self = StObject.set(x, "totalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPriceStatus(value: String): Self = StObject.set(x, "totalPriceStatus", value.asInstanceOf[js.Any])
  }
}
