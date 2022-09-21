package typings.babylonjs.BABYLON

import typings.babylonjs.anon.SnapDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.IDisposable because Already inherited
- typings.babylonjs.BABYLON.IGizmo because Already inherited
- typings.babylonjs.BABYLON.IAxisDragGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined dragBehavior, snapDistance, onSnapObservable, isEnabled */ @js.native
trait AxisDragGizmo
  extends StObject
     with Gizmo {
  
  /* protected */ var _coloredMaterial: StandardMaterial = js.native
  
  /* protected */ var _disableMaterial: StandardMaterial = js.native
  
  /* protected */ var _dragging: Boolean = js.native
  
  /* protected */ var _gizmoMesh: Mesh = js.native
  
  /* protected */ var _hoverMaterial: StandardMaterial = js.native
  
  /* protected */ var _isEnabled: Boolean = js.native
  
  /* protected */ var _parent: Nullable[PositionGizmo] = js.native
  
  /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
  
  /**
    * Drag behavior responsible for the gizmos dragging interactions
    */
  var dragBehavior: PointerDragBehavior = js.native
  
  def isEnabled: Boolean = js.native
  /**
    * If the gizmo is enabled
    */
  def isEnabled_=(value: Boolean): Unit = js.native
  /** If the gizmo is enabled */
  @JSName("isEnabled")
  var isEnabled_FAxisDragGizmo: Boolean = js.native
  
  /**
    * Event that fires each time the gizmo snaps to a new location.
    * * snapDistance is the the change in distance
    */
  var onSnapObservable: Observable[SnapDistance] = js.native
  
  /**
    * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
    */
  var snapDistance: Double = js.native
}
