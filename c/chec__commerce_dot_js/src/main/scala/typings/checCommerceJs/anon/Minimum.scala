package typings.checCommerceJs.anon

import typings.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Minimum extends StObject {
  
  var customer_set_price: Price | Null
  
  var enabled: Boolean
  
  var minimum: Price | Null
}
object Minimum {
  
  inline def apply(enabled: Boolean): Minimum = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], customer_set_price = null, minimum = null)
    __obj.asInstanceOf[Minimum]
  }
  
  extension [Self <: Minimum](x: Self) {
    
    inline def setCustomer_set_price(value: Price): Self = StObject.set(x, "customer_set_price", value.asInstanceOf[js.Any])
    
    inline def setCustomer_set_priceNull: Self = StObject.set(x, "customer_set_price", null)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: Price): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumNull: Self = StObject.set(x, "minimum", null)
  }
}
