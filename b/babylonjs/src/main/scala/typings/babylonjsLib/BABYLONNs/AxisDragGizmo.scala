package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Single axis drag gizmo
     */
@JSGlobal("BABYLON.AxisDragGizmo")
@js.native
class AxisDragGizmo protected () extends Gizmo {
  /**
           * Creates an AxisDragGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to drag on
           * @param color The color of the gizmo
           */
  def this(dragAxis: Vector3) = this()
  /**
           * Creates an AxisDragGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to drag on
           * @param color The color of the gizmo
           */
  def this(dragAxis: Vector3, color: Color3) = this()
  /**
           * Creates an AxisDragGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to drag on
           * @param color The color of the gizmo
           */
  def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
  var _pointerObserver: js.Any = js.native
  /**
           * Drag behavior responsible for the gizmos dragging interactions
           */
  var dragBehavior: PointerDragBehavior = js.native
  /**
           * Event that fires each time the gizmo snaps to a new location.
           * * snapDistance is the the change in distance
           */
  var onSnapObservable: Observable[babylonjsLib.Anon_SnapDistance] = js.native
  /**
           * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
           */
  var snapDistance: scala.Double = js.native
}

