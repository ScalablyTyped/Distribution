package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TonalColorsOutput extends StObject {
  
  var ambient: SkColor
  
  var spot: SkColor
}
object TonalColorsOutput {
  
  inline def apply(ambient: SkColor, spot: SkColor): TonalColorsOutput = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TonalColorsOutput]
  }
  
  extension [Self <: TonalColorsOutput](x: Self) {
    
    inline def setAmbient(value: SkColor): Self = StObject.set(x, "ambient", value.asInstanceOf[js.Any])
    
    inline def setSpot(value: SkColor): Self = StObject.set(x, "spot", value.asInstanceOf[js.Any])
  }
}
