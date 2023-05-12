package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAlign extends StObject {
  
  var textAlign: String
  
  var x: Any
}
object TextAlign {
  
  inline def apply(textAlign: String, x: Any): TextAlign = {
    val __obj = js.Dynamic.literal(textAlign = textAlign.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextAlign] (val x: Self) extends AnyVal {
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
