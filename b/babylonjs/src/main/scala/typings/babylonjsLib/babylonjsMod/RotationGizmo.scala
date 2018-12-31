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
/**
  * Creates a RotationGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param tessellation Amount of tessellation to be used when creating rotation circles
  */
class RotationGizmo ()
  extends babylonjsLib.BABYLONNs.RotationGizmo {
  def this(gizmoLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer) = this()
  def this(gizmoLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer, tessellation: scala.Double) = this()
}

