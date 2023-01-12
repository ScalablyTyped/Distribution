package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectHeightStyleEnumValues
  extends StObject
     with EmbindEnum {
  
  var IncludeLineSpacingBottom: RectHeightStyle
  
  var IncludeLineSpacingMiddle: RectHeightStyle
  
  var IncludeLineSpacingTop: RectHeightStyle
  
  var Max: RectHeightStyle
  
  var Strut: RectHeightStyle
  
  var Tight: RectHeightStyle
}
object RectHeightStyleEnumValues {
  
  inline def apply(
    IncludeLineSpacingBottom: RectHeightStyle,
    IncludeLineSpacingMiddle: RectHeightStyle,
    IncludeLineSpacingTop: RectHeightStyle,
    Max: RectHeightStyle,
    Strut: RectHeightStyle,
    Tight: RectHeightStyle,
    values: js.Array[Double]
  ): RectHeightStyleEnumValues = {
    val __obj = js.Dynamic.literal(IncludeLineSpacingBottom = IncludeLineSpacingBottom.asInstanceOf[js.Any], IncludeLineSpacingMiddle = IncludeLineSpacingMiddle.asInstanceOf[js.Any], IncludeLineSpacingTop = IncludeLineSpacingTop.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Strut = Strut.asInstanceOf[js.Any], Tight = Tight.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectHeightStyleEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RectHeightStyleEnumValues] (val x: Self) extends AnyVal {
    
    inline def setIncludeLineSpacingBottom(value: RectHeightStyle): Self = StObject.set(x, "IncludeLineSpacingBottom", value.asInstanceOf[js.Any])
    
    inline def setIncludeLineSpacingMiddle(value: RectHeightStyle): Self = StObject.set(x, "IncludeLineSpacingMiddle", value.asInstanceOf[js.Any])
    
    inline def setIncludeLineSpacingTop(value: RectHeightStyle): Self = StObject.set(x, "IncludeLineSpacingTop", value.asInstanceOf[js.Any])
    
    inline def setMax(value: RectHeightStyle): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setStrut(value: RectHeightStyle): Self = StObject.set(x, "Strut", value.asInstanceOf[js.Any])
    
    inline def setTight(value: RectHeightStyle): Self = StObject.set(x, "Tight", value.asInstanceOf[js.Any])
  }
}
