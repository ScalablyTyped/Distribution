package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Helps setup gizmo's in the scene to rotate/scale/position meshes
     */
@JSImport("babylonjs", "GizmoManager")
@js.native
class GizmoManager protected ()
  extends babylonjsLib.BABYLONNs.GizmoManager {
  /**
           * Instatiates a gizmo manager
           * @param scene the scene to overlay the gizmos on top of
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
}

