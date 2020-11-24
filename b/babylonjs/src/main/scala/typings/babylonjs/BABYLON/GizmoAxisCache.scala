package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GizmoAxisCache extends js.Object {
  
  /** Used to indicate Active state of the Gizmo */
  var active: Boolean = js.native
  
  /** Mesh used to detect user interaction with Gizmo */
  var colliderMeshes: js.Array[Mesh] = js.native
  
  /** Material used to inicate disabled state of the Gizmo */
  var disableMaterial: StandardMaterial = js.native
  
  /** Mesh used to runder the Gizmo */
  var gizmoMeshes: js.Array[Mesh] = js.native
  
  /** Material used to inicate hover state of the Gizmo */
  var hoverMaterial: StandardMaterial = js.native
  
  /** Material used to inicate color of gizmo mesh */
  var material: StandardMaterial = js.native
}
object GizmoAxisCache {
  
  @scala.inline
  def apply(
    active: Boolean,
    colliderMeshes: js.Array[Mesh],
    disableMaterial: StandardMaterial,
    gizmoMeshes: js.Array[Mesh],
    hoverMaterial: StandardMaterial,
    material: StandardMaterial
  ): GizmoAxisCache = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], colliderMeshes = colliderMeshes.asInstanceOf[js.Any], disableMaterial = disableMaterial.asInstanceOf[js.Any], gizmoMeshes = gizmoMeshes.asInstanceOf[js.Any], hoverMaterial = hoverMaterial.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any])
    __obj.asInstanceOf[GizmoAxisCache]
  }
  
  @scala.inline
  implicit class GizmoAxisCacheOps[Self <: GizmoAxisCache] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColliderMeshesVarargs(value: Mesh*): Self = this.set("colliderMeshes", js.Array(value :_*))
    
    @scala.inline
    def setColliderMeshes(value: js.Array[Mesh]): Self = this.set("colliderMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMaterial(value: StandardMaterial): Self = this.set("disableMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGizmoMeshesVarargs(value: Mesh*): Self = this.set("gizmoMeshes", js.Array(value :_*))
    
    @scala.inline
    def setGizmoMeshes(value: js.Array[Mesh]): Self = this.set("gizmoMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverMaterial(value: StandardMaterial): Self = this.set("hoverMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterial(value: StandardMaterial): Self = this.set("material", value.asInstanceOf[js.Any])
  }
}
