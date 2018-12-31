package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A behavior that when attached to a mesh will will place a specified node on the meshes face pointing towards the camera
  */
@JSImport("babylonjs", "AttachToBoxBehavior")
@js.native
class AttachToBoxBehavior protected ()
  extends babylonjsLib.BABYLONNs.AttachToBoxBehavior {
  /**
    * Creates the AttachToBoxBehavior, used to attach UI to the closest face of the box to a camera
    * @param ui The transform node that should be attched to the mesh
    */
  def this(ui: babylonjsLib.BABYLONNs.TransformNode) = this()
}

