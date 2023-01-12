package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSlantEnumValues
  extends StObject
     with EmbindEnum {
  
  var Italic: FontSlant
  
  var Oblique: FontSlant
  
  var Upright: FontSlant
}
object FontSlantEnumValues {
  
  inline def apply(Italic: FontSlant, Oblique: FontSlant, Upright: FontSlant, values: js.Array[Double]): FontSlantEnumValues = {
    val __obj = js.Dynamic.literal(Italic = Italic.asInstanceOf[js.Any], Oblique = Oblique.asInstanceOf[js.Any], Upright = Upright.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSlantEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontSlantEnumValues] (val x: Self) extends AnyVal {
    
    inline def setItalic(value: FontSlant): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    inline def setOblique(value: FontSlant): Self = StObject.set(x, "Oblique", value.asInstanceOf[js.Any])
    
    inline def setUpright(value: FontSlant): Self = StObject.set(x, "Upright", value.asInstanceOf[js.Any])
  }
}
