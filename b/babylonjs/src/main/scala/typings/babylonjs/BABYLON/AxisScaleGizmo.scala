package typings.babylonjs.BABYLON

import typings.babylonjs.anon.SnapDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisScaleGizmo extends Gizmo {
  
  var _coloredMaterial: js.Any = js.native
  
  /** Create Geometry for Gizmo */
  var _createGizmoMesh: js.Any = js.native
  
  var _disableMaterial: js.Any = js.native
  
  var _dragging: js.Any = js.native
  
  var _gizmoMesh: js.Any = js.native
  
  var _hoverMaterial: js.Any = js.native
  
  var _isEnabled: js.Any = js.native
  
  var _parent: js.Any = js.native
  
  var _pointerObserver: js.Any = js.native
  
  var _tmpMatrix: js.Any = js.native
  
  var _tmpMatrix2: js.Any = js.native
  
  var _tmpVector: js.Any = js.native
  
  /**
    * Drag behavior responsible for the gizmos dragging interactions
    */
  var dragBehavior: PointerDragBehavior = js.native
  
  def isEnabled: Boolean = js.native
  /**
    * If the gizmo is enabled
    */
  def isEnabled_=(value: Boolean): Unit = js.native
  
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
