package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shippingmethod extends StObject {
  
  var shipping_method: String
}
object Shippingmethod {
  
  inline def apply(shipping_method: String): Shippingmethod = {
    val __obj = js.Dynamic.literal(shipping_method = shipping_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shippingmethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shippingmethod] (val x: Self) extends AnyVal {
    
    inline def setShipping_method(value: String): Self = StObject.set(x, "shipping_method", value.asInstanceOf[js.Any])
  }
}
