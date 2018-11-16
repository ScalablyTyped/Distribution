package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Single axis drag gizmo
     */
@JSImport("babylonjs", "AxisDragGizmo")
@js.native
class AxisDragGizmo protected ()
  extends babylonjsLib.BABYLONNs.AxisDragGizmo {
  /**
           * Creates an AxisDragGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to drag on
           * @param color The color of the gizmo
           */
  def this(dragAxis: babylonjsLib.BABYLONNs.Vector3) = this()
  /**
           * Creates an AxisDragGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to drag on
           * @param color The color of the gizmo
           */
  def this(dragAxis: babylonjsLib.BABYLONNs.Vector3, color: babylonjsLib.BABYLONNs.Color3) = this()
  /**
           * Creates an AxisDragGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to drag on
           * @param color The color of the gizmo
           */
  def this(dragAxis: babylonjsLib.BABYLONNs.Vector3, color: babylonjsLib.BABYLONNs.Color3, gizmoLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer) = this()
}

