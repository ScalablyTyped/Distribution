package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Intensity extends StObject {
  
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var intensity: js.UndefOr[Double] = js.undefined
}
object Intensity {
  
  inline def apply(): Intensity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Intensity]
  }
  
  extension [Self <: Intensity](x: Self) {
    
    inline def setColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
  }
}
