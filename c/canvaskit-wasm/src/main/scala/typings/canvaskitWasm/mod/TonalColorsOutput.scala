package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TonalColorsOutput extends StObject {
  
  var ambient: SkColor = js.native
  
  var spot: SkColor = js.native
}
object TonalColorsOutput {
  
  @scala.inline
  def apply(ambient: SkColor, spot: SkColor): TonalColorsOutput = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TonalColorsOutput]
  }
  
  @scala.inline
  implicit class TonalColorsOutputMutableBuilder[Self <: TonalColorsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmbient(value: SkColor): Self = StObject.set(x, "ambient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpot(value: SkColor): Self = StObject.set(x, "spot", value.asInstanceOf[js.Any])
  }
}
