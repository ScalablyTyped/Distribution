package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecorationStyleEnumValues
  extends StObject
     with EmbindEnum {
  
  var Dashed: DecorationStyle
  
  var Dotted: DecorationStyle
  
  var Double: DecorationStyle
  
  var Solid: DecorationStyle
  
  var Wavy: DecorationStyle
}
object DecorationStyleEnumValues {
  
  inline def apply(
    Dashed: DecorationStyle,
    Dotted: DecorationStyle,
    Double: DecorationStyle,
    Solid: DecorationStyle,
    Wavy: DecorationStyle,
    values: js.Array[Double]
  ): DecorationStyleEnumValues = {
    val __obj = js.Dynamic.literal(Dashed = Dashed.asInstanceOf[js.Any], Dotted = Dotted.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], Solid = Solid.asInstanceOf[js.Any], Wavy = Wavy.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationStyleEnumValues]
  }
  
  extension [Self <: DecorationStyleEnumValues](x: Self) {
    
    inline def setDashed(value: DecorationStyle): Self = StObject.set(x, "Dashed", value.asInstanceOf[js.Any])
    
    inline def setDotted(value: DecorationStyle): Self = StObject.set(x, "Dotted", value.asInstanceOf[js.Any])
    
    inline def setDouble(value: DecorationStyle): Self = StObject.set(x, "Double", value.asInstanceOf[js.Any])
    
    inline def setSolid(value: DecorationStyle): Self = StObject.set(x, "Solid", value.asInstanceOf[js.Any])
    
    inline def setWavy(value: DecorationStyle): Self = StObject.set(x, "Wavy", value.asInstanceOf[js.Any])
  }
}
