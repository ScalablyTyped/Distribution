package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path1DEffectStyleEnumValues
  extends StObject
     with EmbindEnum {
  
  // Transform each point and turn lines into curves
  var Morph: Path1DEffectStyle
  
  // Rotate the shape about its center
  var Rotate: Path1DEffectStyle
  
  // Translate the shape to each position
  var Translate: Path1DEffectStyle
}
object Path1DEffectStyleEnumValues {
  
  inline def apply(
    Morph: Path1DEffectStyle,
    Rotate: Path1DEffectStyle,
    Translate: Path1DEffectStyle,
    values: js.Array[Double]
  ): Path1DEffectStyleEnumValues = {
    val __obj = js.Dynamic.literal(Morph = Morph.asInstanceOf[js.Any], Rotate = Rotate.asInstanceOf[js.Any], Translate = Translate.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path1DEffectStyleEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path1DEffectStyleEnumValues] (val x: Self) extends AnyVal {
    
    inline def setMorph(value: Path1DEffectStyle): Self = StObject.set(x, "Morph", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: Path1DEffectStyle): Self = StObject.set(x, "Rotate", value.asInstanceOf[js.Any])
    
    inline def setTranslate(value: Path1DEffectStyle): Self = StObject.set(x, "Translate", value.asInstanceOf[js.Any])
  }
}
