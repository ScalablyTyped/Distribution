package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressiveProductive extends StObject {
  
  var expressive: /* cubic-bezier(0.4, 0.14, 1, 1) */ String
  
  var productive: /* cubic-bezier(0.2, 0, 1, 0.9) */ String
}
object ExpressiveProductive {
  
  inline def apply(): ExpressiveProductive = {
    val __obj = js.Dynamic.literal(expressive = "cubic-bezier(0.4, 0.14, 1, 1)", productive = "cubic-bezier(0.2, 0, 1, 0.9)")
    __obj.asInstanceOf[ExpressiveProductive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpressiveProductive] (val x: Self) extends AnyVal {
    
    inline def setExpressive(value: /* cubic-bezier(0.4, 0.14, 1, 1) */ String): Self = StObject.set(x, "expressive", value.asInstanceOf[js.Any])
    
    inline def setProductive(value: /* cubic-bezier(0.2, 0, 1, 0.9) */ String): Self = StObject.set(x, "productive", value.asInstanceOf[js.Any])
  }
}
