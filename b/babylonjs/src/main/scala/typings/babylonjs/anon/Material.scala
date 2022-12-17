package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesLinesMeshMod.LinesMesh
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Material extends StObject {
  
  var colors: js.UndefOr[js.Array[Color4]] = js.undefined
  
  var instance: js.UndefOr[Nullable[LinesMesh]] = js.undefined
  
  var material: js.UndefOr[typings.babylonjs.materialsMaterialMod.Material] = js.undefined
  
  var points: js.Array[Vector3]
  
  var updatable: js.UndefOr[Boolean] = js.undefined
  
  var useVertexAlpha: js.UndefOr[Boolean] = js.undefined
}
object Material {
  
  inline def apply(points: js.Array[Vector3]): Material = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Material]
  }
  
  extension [Self <: Material](x: Self) {
    
    inline def setColors(value: js.Array[Color4]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: Color4*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setInstance(value: Nullable[LinesMesh]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setMaterial(value: typings.babylonjs.materialsMaterialMod.Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setPoints(value: js.Array[Vector3]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Vector3*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    inline def setUseVertexAlpha(value: Boolean): Self = StObject.set(x, "useVertexAlpha", value.asInstanceOf[js.Any])
    
    inline def setUseVertexAlphaUndefined: Self = StObject.set(x, "useVertexAlpha", js.undefined)
  }
}
