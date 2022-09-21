package typings.babylonjs.BABYLON

import typings.babylonjs.anon.ArrowTail
import typings.babylonjs.anon.SnapDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.IDisposable because Already inherited
- typings.babylonjs.BABYLON.IGizmo because Already inherited
- typings.babylonjs.BABYLON.IAxisScaleGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined dragBehavior, snapDistance, onSnapObservable, uniformScaling, sensitivity, dragScale, isEnabled */ @js.native
trait AxisScaleGizmo
  extends StObject
     with Gizmo {
  
  /* protected */ var _coloredMaterial: StandardMaterial = js.native
  
  /**
    * Create Geometry for Gizmo
    * @param parentMesh
    * @param thickness
    * @param isCollider
    */
  /* protected */ def _createGizmoMesh(parentMesh: AbstractMesh, thickness: Double): ArrowTail = js.native
  /* protected */ def _createGizmoMesh(parentMesh: AbstractMesh, thickness: Double, isCollider: Boolean): ArrowTail = js.native
  
  /* protected */ var _disableMaterial: StandardMaterial = js.native
  
  /* protected */ var _dragging: Boolean = js.native
  
  /* protected */ var _gizmoMesh: Mesh = js.native
  
  /* protected */ var _hoverMaterial: StandardMaterial = js.native
  
  /* protected */ var _isEnabled: Boolean = js.native
  
  /* protected */ var _parent: Nullable[ScaleGizmo] = js.native
  
  /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
  
  /* protected */ var _tmpMatrix: Matrix = js.native
  
  /* protected */ var _tmpMatrix2: Matrix = js.native
  
  /* protected */ var _tmpVector: Vector3 = js.native
  
  /**
    * Drag behavior responsible for the gizmos dragging interactions
    */
  var dragBehavior: PointerDragBehavior = js.native
  
  /**
    * The magnitude of the drag strength (scaling factor)
    */
  var dragScale: Double = js.native
  
  def isEnabled: Boolean = js.native
  /**
    * If the gizmo is enabled
    */
  def isEnabled_=(value: Boolean): Unit = js.native
  /** If the gizmo is enabled */
  @JSName("isEnabled")
  var isEnabled_FAxisScaleGizmo: Boolean = js.native
  
  /**
    * Event that fires each time the gizmo snaps to a new location.
    * * snapDistance is the the change in distance
    */
  var onSnapObservable: Observable[SnapDistance] = js.native
  
  /**
    * Custom sensitivity value for the drag strength
    */
  var sensitivity: Double = js.native
  
  def setCustomMesh(mesh: Mesh, useGizmoMaterial: Boolean): Unit = js.native
  
  /**
    * Scale distance in babylon units that the gizmo will snap to when dragged (Default: 0)
    */
  var snapDistance: Double = js.native
  
  /**
    * If the scaling operation should be done on all axis (default: false)
    */
  var uniformScaling: Boolean = js.native
}
