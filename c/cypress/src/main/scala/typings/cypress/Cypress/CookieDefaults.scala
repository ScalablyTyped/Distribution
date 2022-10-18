package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieDefaults extends StObject {
  
  var preserve: String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ Cookie, Boolean])
}
object CookieDefaults {
  
  inline def apply(preserve: String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ Cookie, Boolean])): CookieDefaults = {
    val __obj = js.Dynamic.literal(preserve = preserve.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieDefaults]
  }
  
  extension [Self <: CookieDefaults](x: Self) {
    
    inline def setPreserve(value: String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ Cookie, Boolean])): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
    
    inline def setPreserveFunction1(value: /* cookie */ Cookie => Boolean): Self = StObject.set(x, "preserve", js.Any.fromFunction1(value))
    
    inline def setPreserveVarargs(value: String*): Self = StObject.set(x, "preserve", js.Array(value*))
  }
}
