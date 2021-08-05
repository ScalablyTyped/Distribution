package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectWidthStyleEnumValues
  extends StObject
     with EmbindEnum {
  
  var Max: RectWidthStyle
  
  var Tight: RectWidthStyle
}
object RectWidthStyleEnumValues {
  
  inline def apply(Max: RectWidthStyle, Tight: RectWidthStyle, values: js.Array[Double]): RectWidthStyleEnumValues = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any], Tight = Tight.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectWidthStyleEnumValues]
  }
  
  extension [Self <: RectWidthStyleEnumValues](x: Self) {
    
    inline def setMax(value: RectWidthStyle): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setTight(value: RectWidthStyle): Self = StObject.set(x, "Tight", value.asInstanceOf[js.Any])
  }
}
