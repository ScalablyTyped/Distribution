package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.undefined
  
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  
  var p: js.UndefOr[Double] = js.undefined
  
  var q: js.UndefOr[Double] = js.undefined
  
  var radialSegments: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var tube: js.UndefOr[Double] = js.undefined
  
  var tubularSegments: js.UndefOr[Double] = js.undefined
}
object P {
  
  inline def apply(): P = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[P]
  }
  
  extension [Self <: P](x: Self) {
    
    inline def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    inline def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    inline def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    inline def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setRadialSegments(value: Double): Self = StObject.set(x, "radialSegments", value.asInstanceOf[js.Any])
    
    inline def setRadialSegmentsUndefined: Self = StObject.set(x, "radialSegments", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setTube(value: Double): Self = StObject.set(x, "tube", value.asInstanceOf[js.Any])
    
    inline def setTubeUndefined: Self = StObject.set(x, "tube", js.undefined)
    
    inline def setTubularSegments(value: Double): Self = StObject.set(x, "tubularSegments", value.asInstanceOf[js.Any])
    
    inline def setTubularSegmentsUndefined: Self = StObject.set(x, "tubularSegments", js.undefined)
  }
}
