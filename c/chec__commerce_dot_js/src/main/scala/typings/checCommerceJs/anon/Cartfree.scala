package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cartfree extends StObject {
  
  var cart_free: Boolean
}
object Cartfree {
  
  inline def apply(cart_free: Boolean): Cartfree = {
    val __obj = js.Dynamic.literal(cart_free = cart_free.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cartfree]
  }
  
  extension [Self <: Cartfree](x: Self) {
    
    inline def setCart_free(value: Boolean): Self = StObject.set(x, "cart_free", value.asInstanceOf[js.Any])
  }
}
