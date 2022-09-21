package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPositionGizmo
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
  
  /**
    * If the planar drag gizmo is enabled
    * setting this will enable/disable XY, XZ and YZ planes regardless of individual gizmo settings.
    */
  var planarGizmoEnabled: Boolean
  
  /** Drag distance in babylon units that the gizmo will snap to when dragged */
  var snapDistance: Double
  
  /** Internal gizmo used for interactions on the x axis */
  var xGizmo: IAxisDragGizmo
  
  /** Internal gizmo used for interactions on the yz plane */
  var xPlaneGizmo: IPlaneDragGizmo
  
  /** Internal gizmo used for interactions on the y axis */
  var yGizmo: IAxisDragGizmo
  
  /** Internal gizmo used for interactions on the xz plane */
  var yPlaneGizmo: IPlaneDragGizmo
  
  /** Internal gizmo used for interactions on the z axis */
  var zGizmo: IAxisDragGizmo
  
  /** Internal gizmo used for interactions on the xy plane */
  var zPlaneGizmo: IPlaneDragGizmo
}
object IPositionGizmo {
  
  inline def apply(
    _rootMesh: Mesh,
    addToAxisCache: (Mesh, GizmoAxisCache) => Unit,
    dispose: () => Unit,
    gizmoLayer: UtilityLayerRenderer,
    isHovered: Boolean,
    onDragEndObservable: Observable[Any],
    onDragStartObservable: Observable[Any],
    planarGizmoEnabled: Boolean,
    scaleRatio: Double,
    setCustomMesh: Mesh => Unit,
    snapDistance: Double,
    updateGizmoPositionToMatchAttachedMesh: Boolean,
    updateGizmoRotationToMatchAttachedMesh: Boolean,
    updateScale: Boolean,
    xGizmo: IAxisDragGizmo,
    xPlaneGizmo: IPlaneDragGizmo,
    yGizmo: IAxisDragGizmo,
    yPlaneGizmo: IPlaneDragGizmo,
    zGizmo: IAxisDragGizmo,
    zPlaneGizmo: IPlaneDragGizmo
  ): IPositionGizmo = {
    val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], addToAxisCache = js.Any.fromFunction2(addToAxisCache), dispose = js.Any.fromFunction0(dispose), gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onDragEndObservable = onDragEndObservable.asInstanceOf[js.Any], onDragStartObservable = onDragStartObservable.asInstanceOf[js.Any], planarGizmoEnabled = planarGizmoEnabled.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), snapDistance = snapDistance.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], xGizmo = xGizmo.asInstanceOf[js.Any], xPlaneGizmo = xPlaneGizmo.asInstanceOf[js.Any], yGizmo = yGizmo.asInstanceOf[js.Any], yPlaneGizmo = yPlaneGizmo.asInstanceOf[js.Any], zGizmo = zGizmo.asInstanceOf[js.Any], zPlaneGizmo = zPlaneGizmo.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
    __obj.asInstanceOf[IPositionGizmo]
  }
  
  extension [Self <: IPositionGizmo](x: Self) {
    
    inline def setAddToAxisCache(value: (Mesh, GizmoAxisCache) => Unit): Self = StObject.set(x, "addToAxisCache", js.Any.fromFunction2(value))
    
    inline def setOnDragEndObservable(value: Observable[Any]): Self = StObject.set(x, "onDragEndObservable", value.asInstanceOf[js.Any])
    
    inline def setOnDragStartObservable(value: Observable[Any]): Self = StObject.set(x, "onDragStartObservable", value.asInstanceOf[js.Any])
    
    inline def setPlanarGizmoEnabled(value: Boolean): Self = StObject.set(x, "planarGizmoEnabled", value.asInstanceOf[js.Any])
    
    inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
    
    inline def setXGizmo(value: IAxisDragGizmo): Self = StObject.set(x, "xGizmo", value.asInstanceOf[js.Any])
    
    inline def setXPlaneGizmo(value: IPlaneDragGizmo): Self = StObject.set(x, "xPlaneGizmo", value.asInstanceOf[js.Any])
    
    inline def setYGizmo(value: IAxisDragGizmo): Self = StObject.set(x, "yGizmo", value.asInstanceOf[js.Any])
    
    inline def setYPlaneGizmo(value: IPlaneDragGizmo): Self = StObject.set(x, "yPlaneGizmo", value.asInstanceOf[js.Any])
    
    inline def setZGizmo(value: IAxisDragGizmo): Self = StObject.set(x, "zGizmo", value.asInstanceOf[js.Any])
    
    inline def setZPlaneGizmo(value: IPlaneDragGizmo): Self = StObject.set(x, "zPlaneGizmo", value.asInstanceOf[js.Any])
  }
}
