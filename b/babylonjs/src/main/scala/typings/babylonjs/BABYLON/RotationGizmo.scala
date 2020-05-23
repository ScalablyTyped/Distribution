package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotationGizmo extends Gizmo {
  var _meshAttached: js.Any = js.native
  /** Fires an event when any of it's sub gizmos are released from dragging */
  var onDragEndObservable: Observable[_] = js.native
  /** Fires an event when any of it's sub gizmos are dragged */
  var onDragStartObservable: Observable[_] = js.native
  /**
    * Internal gizmo used for interactions on the x axis
    */
  var xGizmo: PlaneRotationGizmo = js.native
  /**
    * Internal gizmo used for interactions on the y axis
    */
  var yGizmo: PlaneRotationGizmo = js.native
  /**
    * Internal gizmo used for interactions on the z axis
    */
  var zGizmo: PlaneRotationGizmo = js.native
  @JSName("scaleRatio")
  def scaleRatio_MRotationGizmo: Double = js.native
  /**
    * Ratio for the scale of the gizmo (Default: 1)
    */
  @JSName("scaleRatio")
  def scaleRatio_MRotationGizmo(value: Double): js.Any = js.native
  def snapDistance: Double = js.native
  /**
    * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
    */
  def snapDistance(value: Double): js.Any = js.native
  @JSName("updateGizmoRotationToMatchAttachedMesh")
  def updateGizmoRotationToMatchAttachedMesh_MRotationGizmo: Boolean = js.native
  @JSName("updateGizmoRotationToMatchAttachedMesh")
  def updateGizmoRotationToMatchAttachedMesh_MRotationGizmo(value: Boolean): js.Any = js.native
}

