package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TonalColorsInput extends StObject {
  
  var ambient: InputColor
  
  var spot: InputColor
}
object TonalColorsInput {
  
  inline def apply(ambient: InputColor, spot: InputColor): TonalColorsInput = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TonalColorsInput]
  }
  
  extension [Self <: TonalColorsInput](x: Self) {
    
    inline def setAmbient(value: InputColor): Self = StObject.set(x, "ambient", value.asInstanceOf[js.Any])
    
    inline def setAmbientVarargs(value: Double*): Self = StObject.set(x, "ambient", js.Array(value :_*))
    
    inline def setSpot(value: InputColor): Self = StObject.set(x, "spot", value.asInstanceOf[js.Any])
    
    inline def setSpotVarargs(value: Double*): Self = StObject.set(x, "spot", js.Array(value :_*))
  }
}
