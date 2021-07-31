package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitPrice extends StObject {
  
  /**
    * Amount as floating-point in a string
    */
  var amount: String
  
  /**
    * Currency e.g. "BTC" (see Client#getCurrencies() for available strings)
    */
  var currency: String
  
  /**
    * Type of price
    */
  var scale: Double
}
object UnitPrice {
  
  @scala.inline
  def apply(amount: String, currency: String, scale: Double): UnitPrice = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitPrice]
  }
  
  @scala.inline
  implicit class UnitPriceMutableBuilder[Self <: UnitPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
