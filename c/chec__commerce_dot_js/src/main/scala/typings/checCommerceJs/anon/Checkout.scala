package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkout extends StObject {
  
  var checkout: String
  
  var display: String
}
object Checkout {
  
  inline def apply(checkout: String, display: String): Checkout = {
    val __obj = js.Dynamic.literal(checkout = checkout.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkout]
  }
  
  extension [Self <: Checkout](x: Self) {
    
    inline def setCheckout(value: String): Self = StObject.set(x, "checkout", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
  }
}
