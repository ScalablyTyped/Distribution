package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaintStyleEnumValues
  extends StObject
     with EmbindEnum {
  
  var Fill: PaintStyle
  
  var Stroke: PaintStyle
}
object PaintStyleEnumValues {
  
  inline def apply(Fill: PaintStyle, Stroke: PaintStyle, values: js.Array[Double]): PaintStyleEnumValues = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Stroke = Stroke.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaintStyleEnumValues]
  }
  
  extension [Self <: PaintStyleEnumValues](x: Self) {
    
    inline def setFill(value: PaintStyle): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: PaintStyle): Self = StObject.set(x, "Stroke", value.asInstanceOf[js.Any])
  }
}
