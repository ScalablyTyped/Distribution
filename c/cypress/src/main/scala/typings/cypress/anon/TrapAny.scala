package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrapAny extends StObject {
  
  var __trapAny: Any
}
object TrapAny {
  
  inline def apply(__trapAny: Any): TrapAny = {
    val __obj = js.Dynamic.literal(__trapAny = __trapAny.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrapAny]
  }
  
  extension [Self <: TrapAny](x: Self) {
    
    inline def set__trapAny(value: Any): Self = StObject.set(x, "__trapAny", value.asInstanceOf[js.Any])
  }
}
