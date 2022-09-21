package typings.babylonjs.BABYLON

import typings.babylonjs.anon.SnapDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAxisScaleGizmo
  extends StObject
     with IGizmo {
  
  /** Drag behavior responsible for the gizmos dragging interactions */
  var dragBehavior: PointerDragBehavior
  
  /** The magnitude of the drag strength (scaling factor) */
  var dragScale: Double
  
  /** If the gizmo is enabled */
  var isEnabled: Boolean
  
  /**
    * Event that fires each time the gizmo snaps to a new location.
    * * snapDistance is the the change in distance
    */
  var onSnapObservable: Observable[SnapDistance]
  
  /** Custom sensitivity value for the drag strength */
  var sensitivity: Double
  
  /** Drag distance in babylon units that the gizmo will snap to when dragged */
  var snapDistance: Double
  
  /** If the scaling operation should be done on all axis */
  var uniformScaling: Boolean
}
object IAxisScaleGizmo {
  
  inline def apply(
    _rootMesh: Mesh,
    dispose: () => Unit,
    dragBehavior: PointerDragBehavior,
    dragScale: Double,
    gizmoLayer: UtilityLayerRenderer,
    isEnabled: Boolean,
    isHovered: Boolean,
    onSnapObservable: Observable[SnapDistance],
    scaleRatio: Double,
    sensitivity: Double,
    setCustomMesh: Mesh => Unit,
    snapDistance: Double,
    uniformScaling: Boolean,
    updateGizmoPositionToMatchAttachedMesh: Boolean,
    updateGizmoRotationToMatchAttachedMesh: Boolean,
    updateScale: Boolean
  ): IAxisScaleGizmo = {
    val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), dragBehavior = dragBehavior.asInstanceOf[js.Any], dragScale = dragScale.asInstanceOf[js.Any], gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onSnapObservable = onSnapObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), snapDistance = snapDistance.asInstanceOf[js.Any], uniformScaling = uniformScaling.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
    __obj.asInstanceOf[IAxisScaleGizmo]
  }
  
  extension [Self <: IAxisScaleGizmo](x: Self) {
    
    inline def setDragBehavior(value: PointerDragBehavior): Self = StObject.set(x, "dragBehavior", value.asInstanceOf[js.Any])
    
    inline def setDragScale(value: Double): Self = StObject.set(x, "dragScale", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setOnSnapObservable(value: Observable[SnapDistance]): Self = StObject.set(x, "onSnapObservable", value.asInstanceOf[js.Any])
    
    inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
    
    inline def setUniformScaling(value: Boolean): Self = StObject.set(x, "uniformScaling", value.asInstanceOf[js.Any])
  }
}
