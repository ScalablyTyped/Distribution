package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Gizmo that enables rotating a mesh along 3 axis
     */
@JSImport("babylonjs", "RotationGizmo")
@js.native
class RotationGizmo ()
  extends babylonjsLib.BABYLONNs.RotationGizmo {
  /**
           * Creates a RotationGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param tessellation Amount of tessellation to be used when creating rotation circles
           */
  def this(gizmoLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer) = this()
  /**
           * Creates a RotationGizmo
           * @param gizmoLayer The utility layer the gizmo will be added to
           * @param tessellation Amount of tessellation to be used when creating rotation circles
           */
  def this(gizmoLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer, tessellation: scala.Double) = this()
}

