package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TonalColorsOutput extends StObject {
  
  var ambient: js.typedarray.Float32Array
  
  var spot: js.typedarray.Float32Array
}
object TonalColorsOutput {
  
  inline def apply(ambient: js.typedarray.Float32Array, spot: js.typedarray.Float32Array): TonalColorsOutput = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TonalColorsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TonalColorsOutput] (val x: Self) extends AnyVal {
    
    inline def setAmbient(value: js.typedarray.Float32Array): Self = StObject.set(x, "ambient", value.asInstanceOf[js.Any])
    
    inline def setSpot(value: js.typedarray.Float32Array): Self = StObject.set(x, "spot", value.asInstanceOf[js.Any])
  }
}
