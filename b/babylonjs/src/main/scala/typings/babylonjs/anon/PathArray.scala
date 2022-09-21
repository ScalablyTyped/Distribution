package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Vector2
import typings.babylonjs.BABYLON.Vector3
import typings.babylonjs.BABYLON.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathArray extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.undefined
  
  var closeArray: js.UndefOr[Boolean] = js.undefined
  
  var closePath: js.UndefOr[Boolean] = js.undefined
  
  var colors: js.UndefOr[js.Array[Color4]] = js.undefined
  
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  
  var instance: js.UndefOr[typings.babylonjs.BABYLON.Mesh] = js.undefined
  
  var invertUV: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var pathArray: js.Array[js.Array[Vector3]]
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
  
  var uvs: js.UndefOr[js.Array[Vector2]] = js.undefined
}
object PathArray {
  
  inline def apply(pathArray: js.Array[js.Array[Vector3]]): PathArray = {
    val __obj = js.Dynamic.literal(pathArray = pathArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathArray]
  }
  
  extension [Self <: PathArray](x: Self) {
    
    inline def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    inline def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    inline def setCloseArray(value: Boolean): Self = StObject.set(x, "closeArray", value.asInstanceOf[js.Any])
    
    inline def setCloseArrayUndefined: Self = StObject.set(x, "closeArray", js.undefined)
    
    inline def setClosePath(value: Boolean): Self = StObject.set(x, "closePath", value.asInstanceOf[js.Any])
    
    inline def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
    
    inline def setColors(value: js.Array[Color4]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: Color4*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    inline def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    inline def setInstance(value: typings.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setInvertUV(value: Boolean): Self = StObject.set(x, "invertUV", value.asInstanceOf[js.Any])
    
    inline def setInvertUVUndefined: Self = StObject.set(x, "invertUV", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPathArray(value: js.Array[js.Array[Vector3]]): Self = StObject.set(x, "pathArray", value.asInstanceOf[js.Any])
    
    inline def setPathArrayVarargs(value: js.Array[Vector3]*): Self = StObject.set(x, "pathArray", js.Array(value*))
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    inline def setUvs(value: js.Array[Vector2]): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    inline def setUvsUndefined: Self = StObject.set(x, "uvs", js.undefined)
    
    inline def setUvsVarargs(value: Vector2*): Self = StObject.set(x, "uvs", js.Array(value*))
  }
}
