package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GizmoAxisCache extends StObject {
  
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
  implicit class GizmoAxisCacheMutableBuilder[Self <: GizmoAxisCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColliderMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "colliderMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColliderMeshesVarargs(value: Mesh*): Self = StObject.set(x, "colliderMeshes", js.Array(value :_*))
    
    @scala.inline
    def setDisableMaterial(value: StandardMaterial): Self = StObject.set(x, "disableMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGizmoMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "gizmoMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGizmoMeshesVarargs(value: Mesh*): Self = StObject.set(x, "gizmoMeshes", js.Array(value :_*))
    
    @scala.inline
    def setHoverMaterial(value: StandardMaterial): Self = StObject.set(x, "hoverMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterial(value: StandardMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
  }
}
