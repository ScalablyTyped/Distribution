package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Intensity extends StObject {
  
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var direction: Cartesian3
  
  var intensity: js.UndefOr[Double] = js.undefined
}
object Intensity {
  
  inline def apply(direction: Cartesian3): Intensity = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intensity]
  }
  
  extension [Self <: Intensity](x: Self) {
    
    inline def setColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDirection(value: Cartesian3): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
  }
}
