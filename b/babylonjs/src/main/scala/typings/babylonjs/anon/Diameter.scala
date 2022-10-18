package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diameter extends StObject {
  
  var diameter: js.UndefOr[Double] = js.undefined
  
  var segments: js.UndefOr[Double] = js.undefined
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
}
object Diameter {
  
  inline def apply(): Diameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diameter]
  }
  
  extension [Self <: Diameter](x: Self) {
    
    inline def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    inline def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    inline def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
  }
}
