package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorIntensity extends StObject {
  
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var intensity: js.UndefOr[Double] = js.undefined
}
object ColorIntensity {
  
  inline def apply(): ColorIntensity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorIntensity]
  }
  
  extension [Self <: ColorIntensity](x: Self) {
    
    inline def setColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
  }
}
