package typings.babylonjs.anon

import typings.babylonjs.linesMeshMod.LinesMesh
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Points extends StObject {
  
  var colors: js.UndefOr[js.Array[Color4]] = js.native
  
  var instance: js.UndefOr[Nullable[LinesMesh]] = js.native
  
  var points: js.Array[Vector3] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var useVertexAlpha: js.UndefOr[Boolean] = js.native
}
object Points {
  
  @scala.inline
  def apply(points: js.Array[Vector3]): Points = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
  
  @scala.inline
  implicit class PointsMutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[Color4]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: Color4*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setInstance(value: Nullable[LinesMesh]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[Vector3]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Vector3*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    @scala.inline
    def setUseVertexAlpha(value: Boolean): Self = StObject.set(x, "useVertexAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseVertexAlphaUndefined: Self = StObject.set(x, "useVertexAlpha", js.undefined)
  }
}
