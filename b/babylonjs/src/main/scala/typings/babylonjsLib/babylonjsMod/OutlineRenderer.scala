package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class is responsible to draw bothe outline/overlay of meshes.
     * It should not be used directly but through the available method on mesh.
     */
@JSImport("babylonjs", "OutlineRenderer")
@js.native
class OutlineRenderer protected ()
  extends babylonjsLib.BABYLONNs.OutlineRenderer {
  /**
           * Instantiates a new outline renderer. (There could be only one per scene).
           * @param scene Defines the scene it belongs to
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
}

