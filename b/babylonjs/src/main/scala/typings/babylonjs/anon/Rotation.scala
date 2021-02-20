package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import typings.babylonjs.BABYLON.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rotation extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var cap: js.UndefOr[Double] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var instance: js.UndefOr[typings.babylonjs.BABYLON.Mesh] = js.native
  
  var invertUV: js.UndefOr[Boolean] = js.native
  
  var path: js.Array[Vector3] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var shape: js.Array[Vector3] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
}
object Rotation {
  
  @scala.inline
  def apply(path: js.Array[Vector3], shape: js.Array[Vector3]): Rotation = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
  
  @scala.inline
  implicit class RotationMutableBuilder[Self <: Rotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    @scala.inline
    def setCap(value: Double): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    @scala.inline
    def setInstance(value: typings.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setInvertUV(value: Boolean): Self = StObject.set(x, "invertUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUVUndefined: Self = StObject.set(x, "invertUV", js.undefined)
    
    @scala.inline
    def setPath(value: js.Array[Vector3]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Vector3*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setShape(value: js.Array[Vector3]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: Vector3*): Self = StObject.set(x, "shape", js.Array(value :_*))
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
