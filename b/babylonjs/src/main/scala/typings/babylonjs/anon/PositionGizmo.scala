package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.RotationGizmo
import typings.babylonjs.BABYLON.ScaleGizmo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionGizmo extends StObject {
  
  var boundingBoxGizmo: Nullable[typings.babylonjs.BABYLON.BoundingBoxGizmo] = js.native
  
  var positionGizmo: Nullable[typings.babylonjs.BABYLON.PositionGizmo] = js.native
  
  var rotationGizmo: Nullable[RotationGizmo] = js.native
  
  var scaleGizmo: Nullable[ScaleGizmo] = js.native
}
object PositionGizmo {
  
  @scala.inline
  def apply(): PositionGizmo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionGizmo]
  }
  
  @scala.inline
  implicit class PositionGizmoMutableBuilder[Self <: PositionGizmo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBoxGizmo(value: Nullable[typings.babylonjs.BABYLON.BoundingBoxGizmo]): Self = StObject.set(x, "boundingBoxGizmo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxGizmoNull: Self = StObject.set(x, "boundingBoxGizmo", null)
    
    @scala.inline
    def setPositionGizmo(value: Nullable[typings.babylonjs.BABYLON.PositionGizmo]): Self = StObject.set(x, "positionGizmo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionGizmoNull: Self = StObject.set(x, "positionGizmo", null)
    
    @scala.inline
    def setRotationGizmo(value: Nullable[RotationGizmo]): Self = StObject.set(x, "rotationGizmo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationGizmoNull: Self = StObject.set(x, "rotationGizmo", null)
    
    @scala.inline
    def setScaleGizmo(value: Nullable[ScaleGizmo]): Self = StObject.set(x, "scaleGizmo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleGizmoNull: Self = StObject.set(x, "scaleGizmo", null)
  }
}
