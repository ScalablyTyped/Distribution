package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gizmo that enables rotating a mesh along 3 axis
  */
@JSGlobal("BABYLON.RotationGizmo")
@js.native
/**
  * Creates a RotationGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param tessellation Amount of tessellation to be used when creating rotation circles
  */
class RotationGizmo () extends Gizmo {
  def this(gizmoLayer: UtilityLayerRenderer) = this()
  def this(gizmoLayer: UtilityLayerRenderer, tessellation: scala.Double) = this()
  /** Fires an event when any of it's sub gizmos are released from dragging */
  var onDragEndObservable: Observable[js.Object] = js.native
  /** Fires an event when any of it's sub gizmos are dragged */
  var onDragStartObservable: Observable[js.Object] = js.native
  /**
    * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
    */
  var snapDistance: scala.Double = js.native
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
}

