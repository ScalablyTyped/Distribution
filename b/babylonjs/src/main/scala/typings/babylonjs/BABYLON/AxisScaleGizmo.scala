package typings.babylonjs.BABYLON

import typings.babylonjs.AnonSnapDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AxisScaleGizmo")
@js.native
class AxisScaleGizmo protected () extends Gizmo {
  /**
    * Creates an AxisScaleGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragAxis The axis which the gizmo will be able to scale on
    * @param color The color of the gizmo
    */
  def this(dragAxis: Vector3) = this()
  def this(dragAxis: Vector3, color: Color3) = this()
  def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
  def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer, parent: Nullable[ScaleGizmo]) = this()
  var _arrow: js.Any = js.native
  var _coloredMaterial: js.Any = js.native
  var _hoverMaterial: js.Any = js.native
  var _isEnabled: js.Any = js.native
  var _parent: js.Any = js.native
  var _pointerObserver: js.Any = js.native
  /**
    * Drag behavior responsible for the gizmos dragging interactions
    */
  var dragBehavior: PointerDragBehavior = js.native
  /**
    * Event that fires each time the gizmo snaps to a new location.
    * * snapDistance is the the change in distance
    */
  var onSnapObservable: Observable[AnonSnapDistance] = js.native
  /**
    * Custom sensitivity value for the drag strength
    */
  var sensitivity: Double = js.native
  /**
    * Scale distance in babylon units that the gizmo will snap to when dragged (Default: 0)
    */
  var snapDistance: Double = js.native
  /**
    * If the scaling operation should be done on all axis (default: false)
    */
  var uniformScaling: Boolean = js.native
  def isEnabled(): Boolean = js.native
  /**
    * If the gizmo is enabled
    */
  def isEnabled(value: Boolean): js.Any = js.native
  def setCustomMesh(mesh: Mesh, useGizmoMaterial: Boolean): Unit = js.native
}

