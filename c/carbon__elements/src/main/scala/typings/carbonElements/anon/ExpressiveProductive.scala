package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressiveProductive extends StObject {
  
  var expressive: String
  
  var productive: String
}
object ExpressiveProductive {
  
  inline def apply(): ExpressiveProductive = {
    val __obj = js.Dynamic.literal(expressive = "cubic-bezier(0.4, 0.14, 1, 1)", productive = "cubic-bezier(0.2, 0, 1, 0.9)")
    __obj.asInstanceOf[ExpressiveProductive]
  }
  
  extension [Self <: ExpressiveProductive](x: Self) {
    
    inline def setExpressive(value: String): Self = StObject.set(x, "expressive", value.asInstanceOf[js.Any])
    
    inline def setProductive(value: String): Self = StObject.set(x, "productive", value.asInstanceOf[js.Any])
  }
}
