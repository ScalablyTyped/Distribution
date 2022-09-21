package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGizmo
  extends StObject
     with IDisposable {
  
  /** The root mesh of the gizmo */
  var _rootMesh: Mesh
  
  /**
    * Mesh that the gizmo will be attached to. (eg. on a drag gizmo the mesh that will be dragged)
    * * When set, interactions will be enabled
    */
  var attachedMesh: Nullable[AbstractMesh]
  
  /**
    * Node that the gizmo will be attached to. (eg. on a drag gizmo the mesh, bone or NodeTransform that will be dragged)
    * * When set, interactions will be enabled
    */
  var attachedNode: Nullable[Node]
  
  /**
    * posture that the gizmo will be display
    * When set null, default value will be used (Quaternion(0, 0, 0, 1))
    */
  var customRotationQuaternion: Nullable[Quaternion]
  
  /** The utility layer the gizmo will be added to */
  var gizmoLayer: UtilityLayerRenderer
  
  /** True when the mouse pointer is hovered a gizmo mesh */
  val isHovered: Boolean
  
  /** Ratio for the scale of the gizmo */
  var scaleRatio: Double
  
  /** Disposes and replaces the current meshes in the gizmo with the specified mesh */
  def setCustomMesh(mesh: Mesh): Unit
  
  /**
    * If set the gizmo's position will be updated to match the attached mesh each frame (Default: true)
    */
  var updateGizmoPositionToMatchAttachedMesh: Boolean
  
  /**
    * If set the gizmo's rotation will be updated to match the attached mesh each frame (Default: true)
    */
  var updateGizmoRotationToMatchAttachedMesh: Boolean
  
  /**
    * When set, the gizmo will always appear the same size no matter where the camera is (default: true)
    */
  var updateScale: Boolean
}
object IGizmo {
  
  inline def apply(
    _rootMesh: Mesh,
    dispose: () => Unit,
    gizmoLayer: UtilityLayerRenderer,
    isHovered: Boolean,
    scaleRatio: Double,
    setCustomMesh: Mesh => Unit,
    updateGizmoPositionToMatchAttachedMesh: Boolean,
    updateGizmoRotationToMatchAttachedMesh: Boolean,
    updateScale: Boolean
  ): IGizmo = {
    val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
    __obj.asInstanceOf[IGizmo]
  }
  
  extension [Self <: IGizmo](x: Self) {
    
    inline def setAttachedMesh(value: Nullable[AbstractMesh]): Self = StObject.set(x, "attachedMesh", value.asInstanceOf[js.Any])
    
    inline def setAttachedMeshNull: Self = StObject.set(x, "attachedMesh", null)
    
    inline def setAttachedNode(value: Nullable[Node]): Self = StObject.set(x, "attachedNode", value.asInstanceOf[js.Any])
    
    inline def setAttachedNodeNull: Self = StObject.set(x, "attachedNode", null)
    
    inline def setCustomRotationQuaternion(value: Nullable[Quaternion]): Self = StObject.set(x, "customRotationQuaternion", value.asInstanceOf[js.Any])
    
    inline def setCustomRotationQuaternionNull: Self = StObject.set(x, "customRotationQuaternion", null)
    
    inline def setGizmoLayer(value: UtilityLayerRenderer): Self = StObject.set(x, "gizmoLayer", value.asInstanceOf[js.Any])
    
    inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
    
    inline def setScaleRatio(value: Double): Self = StObject.set(x, "scaleRatio", value.asInstanceOf[js.Any])
    
    inline def setSetCustomMesh(value: Mesh => Unit): Self = StObject.set(x, "setCustomMesh", js.Any.fromFunction1(value))
    
    inline def setUpdateGizmoPositionToMatchAttachedMesh(value: Boolean): Self = StObject.set(x, "updateGizmoPositionToMatchAttachedMesh", value.asInstanceOf[js.Any])
    
    inline def setUpdateGizmoRotationToMatchAttachedMesh(value: Boolean): Self = StObject.set(x, "updateGizmoRotationToMatchAttachedMesh", value.asInstanceOf[js.Any])
    
    inline def setUpdateScale(value: Boolean): Self = StObject.set(x, "updateScale", value.asInstanceOf[js.Any])
    
    inline def set_rootMesh(value: Mesh): Self = StObject.set(x, "_rootMesh", value.asInstanceOf[js.Any])
  }
}
