package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Single axis scale gizmo
     */
@JSImport("babylonjs", "AxisScaleGizmo")
@js.native
class AxisScaleGizmo protected ()
  extends babylonjsLib.BABYLONNs.AxisScaleGizmo {
  /**
           * Creates an AxisScaleGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to scale on
           * @param color The color of the gizmo
           */
  def this(dragAxis: babylonjsLib.BABYLONNs.Vector3) = this()
  /**
           * Creates an AxisScaleGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to scale on
           * @param color The color of the gizmo
           */
  def this(dragAxis: babylonjsLib.BABYLONNs.Vector3, color: babylonjsLib.BABYLONNs.Color3) = this()
  /**
           * Creates an AxisScaleGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param dragAxis The axis which the gizmo will be able to scale on
           * @param color The color of the gizmo
           */
  def this(dragAxis: babylonjsLib.BABYLONNs.Vector3, color: babylonjsLib.BABYLONNs.Color3, gizmoLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer) = this()
}

