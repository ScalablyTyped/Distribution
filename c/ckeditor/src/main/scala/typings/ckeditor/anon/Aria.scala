package typings.ckeditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aria extends StObject {
  
  var aria: js.Array[String]
  
  var display: js.Array[String]
}
object Aria {
  
  inline def apply(aria: js.Array[String], display: js.Array[String]): Aria = {
    val __obj = js.Dynamic.literal(aria = aria.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aria]
  }
  
  extension [Self <: Aria](x: Self) {
    
    inline def setAria(value: js.Array[String]): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    inline def setAriaVarargs(value: String*): Self = StObject.set(x, "aria", js.Array(value :_*))
    
    inline def setDisplay(value: js.Array[String]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayVarargs(value: String*): Self = StObject.set(x, "display", js.Array(value :_*))
  }
}
