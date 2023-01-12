package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRotationGizmo
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
  
  /** Drag distance in babylon units that the gizmo will snap to when dragged */
  var snapDistance: Double
  
  /** Internal gizmo used for interactions on the x axis */
  var xGizmo: IPlaneRotationGizmo
  
  /** Internal gizmo used for interactions on the y axis */
  var yGizmo: IPlaneRotationGizmo
  
  /** Internal gizmo used for interactions on the z axis */
  var zGizmo: IPlaneRotationGizmo
}
object IRotationGizmo {
  
  inline def apply(
    _rootMesh: Mesh,
    addToAxisCache: (Mesh, GizmoAxisCache) => Unit,
    dispose: () => Unit,
    gizmoLayer: UtilityLayerRenderer,
    isHovered: Boolean,
    onDragEndObservable: Observable[Any],
    onDragStartObservable: Observable[Any],
    scaleRatio: Double,
    setCustomMesh: Mesh => Unit,
    snapDistance: Double,
    updateGizmoPositionToMatchAttachedMesh: Boolean,
    updateGizmoRotationToMatchAttachedMesh: Boolean,
    updateScale: Boolean,
    xGizmo: IPlaneRotationGizmo,
    yGizmo: IPlaneRotationGizmo,
    zGizmo: IPlaneRotationGizmo
  ): IRotationGizmo = {
    val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], addToAxisCache = js.Any.fromFunction2(addToAxisCache), dispose = js.Any.fromFunction0(dispose), gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onDragEndObservable = onDragEndObservable.asInstanceOf[js.Any], onDragStartObservable = onDragStartObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), snapDistance = snapDistance.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], xGizmo = xGizmo.asInstanceOf[js.Any], yGizmo = yGizmo.asInstanceOf[js.Any], zGizmo = zGizmo.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
    __obj.asInstanceOf[IRotationGizmo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRotationGizmo] (val x: Self) extends AnyVal {
    
    inline def setAddToAxisCache(value: (Mesh, GizmoAxisCache) => Unit): Self = StObject.set(x, "addToAxisCache", js.Any.fromFunction2(value))
    
    inline def setOnDragEndObservable(value: Observable[Any]): Self = StObject.set(x, "onDragEndObservable", value.asInstanceOf[js.Any])
    
    inline def setOnDragStartObservable(value: Observable[Any]): Self = StObject.set(x, "onDragStartObservable", value.asInstanceOf[js.Any])
    
    inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
    
    inline def setXGizmo(value: IPlaneRotationGizmo): Self = StObject.set(x, "xGizmo", value.asInstanceOf[js.Any])
    
    inline def setYGizmo(value: IPlaneRotationGizmo): Self = StObject.set(x, "yGizmo", value.asInstanceOf[js.Any])
    
    inline def setZGizmo(value: IPlaneRotationGizmo): Self = StObject.set(x, "zGizmo", value.asInstanceOf[js.Any])
  }
}
