package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextValue extends StObject {
  
  /**
    * Font size.
    */
  var size: Double
  
  /**
    * The text string payload.
    */
  var text: String
}
object TextValue {
  
  inline def apply(size: Double, text: String): TextValue = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextValue]
  }
  
  extension [Self <: TextValue](x: Self) {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
