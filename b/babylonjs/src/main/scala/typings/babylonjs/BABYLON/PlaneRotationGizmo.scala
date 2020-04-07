package typings.babylonjs.BABYLON

import typings.babylonjs.AnonSnapDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PlaneRotationGizmo")
@js.native
class PlaneRotationGizmo protected () extends Gizmo {
  /**
    * Creates a PlaneRotationGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
    * @param color The color of the gizmo
    * @param tessellation Amount of tessellation to be used when creating rotation circles
    * @param useEulerRotation Use and update Euler angle instead of quaternion
    */
  def this(planeNormal: Vector3) = this()
  def this(planeNormal: Vector3, color: Color3) = this()
  def this(planeNormal: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
  def this(planeNormal: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer, tessellation: Double) = this()
  def this(
    planeNormal: Vector3,
    color: Color3,
    gizmoLayer: UtilityLayerRenderer,
    tessellation: Double,
    parent: Nullable[RotationGizmo]
  ) = this()
  def this(
    planeNormal: Vector3,
    color: Color3,
    gizmoLayer: UtilityLayerRenderer,
    tessellation: Double,
    parent: Nullable[RotationGizmo],
    useEulerRotation: Boolean
  ) = this()
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
    * Rotation distance in radians that the gizmo will snap to (Default: 0)
    */
  var snapDistance: Double = js.native
  def isEnabled(): Boolean = js.native
  /**
    * If the gizmo is enabled
    */
  def isEnabled(value: Boolean): js.Any = js.native
}

