package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Gizmo that enables scaling a mesh along 3 axis
     */
@JSGlobal("BABYLON.ScaleGizmo")
@js.native
class ScaleGizmo () extends Gizmo {
  /**
           * Creates a ScaleGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           */
  def this(gizmoLayer: UtilityLayerRenderer) = this()
  /** Fires an event when any of it's sub gizmos are released from dragging */
  var onDragEndObservable: Observable[js.Object] = js.native
  /** Fires an event when any of it's sub gizmos are dragged */
  var onDragStartObservable: Observable[js.Object] = js.native
  /**
           * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
           */
  var snapDistance: scala.Double = js.native
  /**
           * Internal gizmo used to scale all axis equally
           */
  var uniformScaleGizmo: AxisScaleGizmo = js.native
  /**
           * Internal gizmo used for interactions on the x axis
           */
  var xGizmo: AxisScaleGizmo = js.native
  /**
           * Internal gizmo used for interactions on the y axis
           */
  var yGizmo: AxisScaleGizmo = js.native
  /**
           * Internal gizmo used for interactions on the z axis
           */
  var zGizmo: AxisScaleGizmo = js.native
}

