package typings.babylonjs.anon

import typings.babylonjs.rotationGizmoMod.RotationGizmo
import typings.babylonjs.scaleGizmoMod.ScaleGizmo
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingBoxGizmo extends js.Object {
  
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
  implicit class BoundingBoxGizmoOps[Self <: BoundingBoxGizmo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoundingBoxGizmo(value: Nullable[typings.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo]): Self = this.set("boundingBoxGizmo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxGizmoNull: Self = this.set("boundingBoxGizmo", null)
    
    @scala.inline
    def setPositionGizmo(value: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]): Self = this.set("positionGizmo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionGizmoNull: Self = this.set("positionGizmo", null)
    
    @scala.inline
    def setRotationGizmo(value: Nullable[RotationGizmo]): Self = this.set("rotationGizmo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationGizmoNull: Self = this.set("rotationGizmo", null)
    
    @scala.inline
    def setScaleGizmo(value: Nullable[ScaleGizmo]): Self = this.set("scaleGizmo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleGizmoNull: Self = this.set("scaleGizmo", null)
  }
}
