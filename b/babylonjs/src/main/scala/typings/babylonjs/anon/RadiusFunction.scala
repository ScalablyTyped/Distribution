package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import typings.babylonjs.BABYLON.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadiusFunction extends StObject {
  
  var arc: js.UndefOr[Double] = js.undefined
  
  var backUVs: js.UndefOr[Vector4] = js.undefined
  
  var cap: js.UndefOr[Double] = js.undefined
  
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  
  var instance: js.UndefOr[typings.babylonjs.BABYLON.Mesh] = js.undefined
  
  var invertUV: js.UndefOr[Boolean] = js.undefined
  
  var path: js.Array[Vector3]
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var radiusFunction: js.UndefOr[js.Function2[/* i */ Double, /* distance */ Double, Double]] = js.undefined
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var tessellation: js.UndefOr[Double] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
}
object RadiusFunction {
  
  inline def apply(path: js.Array[Vector3]): RadiusFunction = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiusFunction]
  }
  
  extension [Self <: RadiusFunction](x: Self) {
    
    inline def setArc(value: Double): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    inline def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    inline def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    inline def setCap(value: Double): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    inline def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    inline def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    inline def setInstance(value: typings.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setInvertUV(value: Boolean): Self = StObject.set(x, "invertUV", value.asInstanceOf[js.Any])
    
    inline def setInvertUVUndefined: Self = StObject.set(x, "invertUV", js.undefined)
    
    inline def setPath(value: js.Array[Vector3]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Vector3*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusFunction(value: (/* i */ Double, /* distance */ Double) => Double): Self = StObject.set(x, "radiusFunction", js.Any.fromFunction2(value))
    
    inline def setRadiusFunctionUndefined: Self = StObject.set(x, "radiusFunction", js.undefined)
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
    
    inline def setTessellationUndefined: Self = StObject.set(x, "tessellation", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
