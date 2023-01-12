package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customersetprice extends StObject {
  
  var customer_set_price: String
}
object Customersetprice {
  
  inline def apply(customer_set_price: String): Customersetprice = {
    val __obj = js.Dynamic.literal(customer_set_price = customer_set_price.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customersetprice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Customersetprice] (val x: Self) extends AnyVal {
    
    inline def setCustomer_set_price(value: String): Self = StObject.set(x, "customer_set_price", value.asInstanceOf[js.Any])
  }
}
