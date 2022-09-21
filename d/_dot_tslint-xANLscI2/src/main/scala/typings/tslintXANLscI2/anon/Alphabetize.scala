package typings.tslintXANLscI2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alphabetize extends StObject {
  
  var alphabetize: Boolean
  
  var order: String
}
object Alphabetize {
  
  inline def apply(alphabetize: Boolean, order: String): Alphabetize = {
    val __obj = js.Dynamic.literal(alphabetize = alphabetize.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alphabetize]
  }
  
  extension [Self <: Alphabetize](x: Self) {
    
    inline def setAlphabetize(value: Boolean): Self = StObject.set(x, "alphabetize", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
