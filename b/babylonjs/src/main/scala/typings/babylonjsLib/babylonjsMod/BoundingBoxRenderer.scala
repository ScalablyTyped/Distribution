package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component responsible of rendering the bounding box of the meshes in a scene.
  * This is usually used through the mesh.showBoundingBox or the scene.forceShowBoundingBoxes properties
  */
@JSImport("babylonjs", "BoundingBoxRenderer")
@js.native
class BoundingBoxRenderer protected ()
  extends babylonjsLib.BABYLONNs.BoundingBoxRenderer {
  /**
    * Instantiates a new bounding box renderer in a scene.
    * @param scene the scene the  renderer renders in
    */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
}

