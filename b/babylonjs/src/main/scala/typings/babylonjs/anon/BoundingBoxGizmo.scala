package typings.babylonjs.anon

import typings.babylonjs.rotationGizmoMod.RotationGizmo
import typings.babylonjs.scaleGizmoMod.ScaleGizmo
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingBoxGizmo extends StObject {
  
  var boundingBoxGizmo: Nullable[typings.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo] = js.native
  
  var positionGizmo: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo] = js.native
  
  var rotationGizmo: Nullable[RotationGizmo] = js.native
  
  var scaleGizmo: Nullable[ScaleGizmo] = js.native
}
object BoundingBoxGizmo {
  
  @scala.inline
  def apply(): BoundingBoxGizmo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingBoxGizmo]
  }
  
  @scala.inline
  implicit class BoundingBoxGizmoMutableBuilder[Self <: BoundingBoxGizmo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBoxGizmo(value: Nullable[typings.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo]): Self = StObject.set(x, "boundingBoxGizmo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxGizmoNull: Self = StObject.set(x, "boundingBoxGizmo", null)
    
    @scala.inline
    def setPositionGizmo(value: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]): Self = StObject.set(x, "positionGizmo", value.asInstanceOf[js.Any])
    
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
