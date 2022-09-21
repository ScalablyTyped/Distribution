package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GizmoAxisCache extends StObject {
  
  /** Used to indicate Active state of the Gizmo */
  var active: Boolean
  
  /** Mesh used to detect user interaction with Gizmo */
  var colliderMeshes: js.Array[Mesh]
  
  /** Material used to indicate disabled state of the Gizmo */
  var disableMaterial: StandardMaterial
  
  /** DragBehavior */
  var dragBehavior: PointerDragBehavior
  
  /** Mesh used to render the Gizmo */
  var gizmoMeshes: js.Array[Mesh]
  
  /** Material used to indicate hover state of the Gizmo */
  var hoverMaterial: StandardMaterial
  
  /** Material used to indicate color of gizmo mesh */
  var material: StandardMaterial
}
object GizmoAxisCache {
  
  inline def apply(
    active: Boolean,
    colliderMeshes: js.Array[Mesh],
    disableMaterial: StandardMaterial,
    dragBehavior: PointerDragBehavior,
    gizmoMeshes: js.Array[Mesh],
    hoverMaterial: StandardMaterial,
    material: StandardMaterial
  ): GizmoAxisCache = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], colliderMeshes = colliderMeshes.asInstanceOf[js.Any], disableMaterial = disableMaterial.asInstanceOf[js.Any], dragBehavior = dragBehavior.asInstanceOf[js.Any], gizmoMeshes = gizmoMeshes.asInstanceOf[js.Any], hoverMaterial = hoverMaterial.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any])
    __obj.asInstanceOf[GizmoAxisCache]
  }
  
  extension [Self <: GizmoAxisCache](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setColliderMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "colliderMeshes", value.asInstanceOf[js.Any])
    
    inline def setColliderMeshesVarargs(value: Mesh*): Self = StObject.set(x, "colliderMeshes", js.Array(value*))
    
    inline def setDisableMaterial(value: StandardMaterial): Self = StObject.set(x, "disableMaterial", value.asInstanceOf[js.Any])
    
    inline def setDragBehavior(value: PointerDragBehavior): Self = StObject.set(x, "dragBehavior", value.asInstanceOf[js.Any])
    
    inline def setGizmoMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "gizmoMeshes", value.asInstanceOf[js.Any])
    
    inline def setGizmoMeshesVarargs(value: Mesh*): Self = StObject.set(x, "gizmoMeshes", js.Array(value*))
    
    inline def setHoverMaterial(value: StandardMaterial): Self = StObject.set(x, "hoverMaterial", value.asInstanceOf[js.Any])
    
    inline def setMaterial(value: StandardMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
  }
}
