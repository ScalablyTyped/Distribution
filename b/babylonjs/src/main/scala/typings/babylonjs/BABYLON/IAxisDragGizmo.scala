package typings.babylonjs.BABYLON

import typings.babylonjs.anon.SnapDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAxisDragGizmo
  extends StObject
     with IGizmo {
  
  /** Default material used to render when gizmo is not disabled or hovered */
  var coloredMaterial: StandardMaterial
  
  /** Material used to render when gizmo is disabled. typically grey.*/
  var disableMaterial: StandardMaterial
  
  /** Drag behavior responsible for the gizmos dragging interactions */
  var dragBehavior: PointerDragBehavior
  
  /** Material used to render when gizmo is hovered with mouse*/
  var hoverMaterial: StandardMaterial
  
  /** If the gizmo is enabled */
  var isEnabled: Boolean
  
  /**
    * Event that fires each time the gizmo snaps to a new location.
    * * snapDistance is the the change in distance
    */
  var onSnapObservable: Observable[SnapDistance]
  
  /** Drag distance in babylon units that the gizmo will snap to when dragged */
  var snapDistance: Double
}
object IAxisDragGizmo {
  
  inline def apply(
    _rootMesh: Mesh,
    coloredMaterial: StandardMaterial,
    disableMaterial: StandardMaterial,
    dispose: () => Unit,
    dragBehavior: PointerDragBehavior,
    gizmoLayer: UtilityLayerRenderer,
    hoverMaterial: StandardMaterial,
    isEnabled: Boolean,
    isHovered: Boolean,
    onSnapObservable: Observable[SnapDistance],
    scaleRatio: Double,
    setCustomMesh: Mesh => Unit,
    snapDistance: Double,
    updateGizmoPositionToMatchAttachedMesh: Boolean,
    updateGizmoRotationToMatchAttachedMesh: Boolean,
    updateScale: Boolean
  ): IAxisDragGizmo = {
    val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], coloredMaterial = coloredMaterial.asInstanceOf[js.Any], disableMaterial = disableMaterial.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), dragBehavior = dragBehavior.asInstanceOf[js.Any], gizmoLayer = gizmoLayer.asInstanceOf[js.Any], hoverMaterial = hoverMaterial.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onSnapObservable = onSnapObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), snapDistance = snapDistance.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
    __obj.asInstanceOf[IAxisDragGizmo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAxisDragGizmo] (val x: Self) extends AnyVal {
    
    inline def setColoredMaterial(value: StandardMaterial): Self = StObject.set(x, "coloredMaterial", value.asInstanceOf[js.Any])
    
    inline def setDisableMaterial(value: StandardMaterial): Self = StObject.set(x, "disableMaterial", value.asInstanceOf[js.Any])
    
    inline def setDragBehavior(value: PointerDragBehavior): Self = StObject.set(x, "dragBehavior", value.asInstanceOf[js.Any])
    
    inline def setHoverMaterial(value: StandardMaterial): Self = StObject.set(x, "hoverMaterial", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setOnSnapObservable(value: Observable[SnapDistance]): Self = StObject.set(x, "onSnapObservable", value.asInstanceOf[js.Any])
    
    inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
  }
}
