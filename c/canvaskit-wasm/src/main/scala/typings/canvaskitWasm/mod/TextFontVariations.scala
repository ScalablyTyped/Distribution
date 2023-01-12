package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFontVariations extends StObject {
  
  var axis: String
  
  var value: Double
}
object TextFontVariations {
  
  inline def apply(axis: String, value: Double): TextFontVariations = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFontVariations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextFontVariations] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
