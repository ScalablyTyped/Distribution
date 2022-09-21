package typings.braintree.anon

import typings.braintree.braintreeStrings.international_
import typings.braintree.braintreeStrings.us_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait International extends StObject {
  
  var International: international_
  
  var US: us_
}
object International {
  
  inline def apply(): International = {
    val __obj = js.Dynamic.literal(International = "international", US = "us")
    __obj.asInstanceOf[International]
  }
  
  extension [Self <: International](x: Self) {
    
    inline def setInternational(value: international_): Self = StObject.set(x, "International", value.asInstanceOf[js.Any])
    
    inline def setUS(value: us_): Self = StObject.set(x, "US", value.asInstanceOf[js.Any])
  }
}
