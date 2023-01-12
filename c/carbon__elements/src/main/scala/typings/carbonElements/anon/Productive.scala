package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Productive extends StObject {
  
  var expressive: /* cubic-bezier(0, 0, 0.3, 1) */ String
  
  var productive: /* cubic-bezier(0, 0, 0.38, 0.9) */ String
}
object Productive {
  
  inline def apply(): Productive = {
    val __obj = js.Dynamic.literal(expressive = "cubic-bezier(0, 0, 0.3, 1)", productive = "cubic-bezier(0, 0, 0.38, 0.9)")
    __obj.asInstanceOf[Productive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Productive] (val x: Self) extends AnyVal {
    
    inline def setExpressive(value: /* cubic-bezier(0, 0, 0.3, 1) */ String): Self = StObject.set(x, "expressive", value.asInstanceOf[js.Any])
    
    inline def setProductive(value: /* cubic-bezier(0, 0, 0.38, 0.9) */ String): Self = StObject.set(x, "productive", value.asInstanceOf[js.Any])
  }
}
