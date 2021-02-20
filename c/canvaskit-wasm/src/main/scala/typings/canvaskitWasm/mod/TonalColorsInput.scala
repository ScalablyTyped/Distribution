package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TonalColorsInput extends StObject {
  
  var ambient: InputColor = js.native
  
  var spot: InputColor = js.native
}
object TonalColorsInput {
  
  @scala.inline
  def apply(ambient: InputColor, spot: InputColor): TonalColorsInput = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TonalColorsInput]
  }
  
  @scala.inline
  implicit class TonalColorsInputMutableBuilder[Self <: TonalColorsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmbient(value: InputColor): Self = StObject.set(x, "ambient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmbientVarargs(value: Double*): Self = StObject.set(x, "ambient", js.Array(value :_*))
    
    @scala.inline
    def setSpot(value: InputColor): Self = StObject.set(x, "spot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotVarargs(value: Double*): Self = StObject.set(x, "spot", js.Array(value :_*))
  }
}
