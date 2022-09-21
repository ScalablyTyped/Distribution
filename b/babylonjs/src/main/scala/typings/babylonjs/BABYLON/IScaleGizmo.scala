package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScaleGizmo
  extends StObject
     with IGizmo {
  
  /**
    * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
    * @param mesh Axis gizmo mesh
    * @param cache Gizmo axis definition used for reactive gizmo UI
    */
  def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit
  
  /** Fires an event when any of it's sub gizmos are released from dragging */
  var onDragEndObservable: Observable[Any]
  
  /** Fires an event when any of it's sub gizmos are dragged */
  var onDragStartObservable: Observable[Any]
  
  /** Sensitivity factor for dragging */
  var sensitivity: Double
  
  /** Drag distance in babylon units that the gizmo will snap to when dragged */
  var snapDistance: Double
  
  /** Internal gizmo used to scale all axis equally*/
  var uniformScaleGizmo: IAxisScaleGizmo
  
  /** Internal gizmo used for interactions on the x axis */
  var xGizmo: IAxisScaleGizmo
  
  /** Internal gizmo used for interactions on the y axis */
  var yGizmo: IAxisScaleGizmo
  
  /** Internal gizmo used for interactions on the z axis */
  var zGizmo: IAxisScaleGizmo
}
object IScaleGizmo {
  
  inline def apply(
    _rootMesh: Mesh,
    addToAxisCache: (Mesh, GizmoAxisCache) => Unit,
    dispose: () => Unit,
    gizmoLayer: UtilityLayerRenderer,
    isHovered: Boolean,
    onDragEndObservable: Observable[Any],
    onDragStartObservable: Observable[Any],
    scaleRatio: Double,
    sensitivity: Double,
    setCustomMesh: Mesh => Unit,
    snapDistance: Double,
    uniformScaleGizmo: IAxisScaleGizmo,
    updateGizmoPositionToMatchAttachedMesh: Boolean,
    updateGizmoRotationToMatchAttachedMesh: Boolean,
    updateScale: Boolean,
    xGizmo: IAxisScaleGizmo,
    yGizmo: IAxisScaleGizmo,
    zGizmo: IAxisScaleGizmo
  ): IScaleGizmo = {
    val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], addToAxisCache = js.Any.fromFunction2(addToAxisCache), dispose = js.Any.fromFunction0(dispose), gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onDragEndObservable = onDragEndObservable.asInstanceOf[js.Any], onDragStartObservable = onDragStartObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), snapDistance = snapDistance.asInstanceOf[js.Any], uniformScaleGizmo = uniformScaleGizmo.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], xGizmo = xGizmo.asInstanceOf[js.Any], yGizmo = yGizmo.asInstanceOf[js.Any], zGizmo = zGizmo.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
    __obj.asInstanceOf[IScaleGizmo]
  }
  
  extension [Self <: IScaleGizmo](x: Self) {
    
    inline def setAddToAxisCache(value: (Mesh, GizmoAxisCache) => Unit): Self = StObject.set(x, "addToAxisCache", js.Any.fromFunction2(value))
    
    inline def setOnDragEndObservable(value: Observable[Any]): Self = StObject.set(x, "onDragEndObservable", value.asInstanceOf[js.Any])
    
    inline def setOnDragStartObservable(value: Observable[Any]): Self = StObject.set(x, "onDragStartObservable", value.asInstanceOf[js.Any])
    
    inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
    
    inline def setUniformScaleGizmo(value: IAxisScaleGizmo): Self = StObject.set(x, "uniformScaleGizmo", value.asInstanceOf[js.Any])
    
    inline def setXGizmo(value: IAxisScaleGizmo): Self = StObject.set(x, "xGizmo", value.asInstanceOf[js.Any])
    
    inline def setYGizmo(value: IAxisScaleGizmo): Self = StObject.set(x, "yGizmo", value.asInstanceOf[js.Any])
    
    inline def setZGizmo(value: IAxisScaleGizmo): Self = StObject.set(x, "zGizmo", value.asInstanceOf[js.Any])
  }
}
