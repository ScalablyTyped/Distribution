package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Info for a bounding data of a mesh
     */
@JSImport("babylonjs", "BoundingInfo")
@js.native
class BoundingInfo protected ()
  extends babylonjsLib.BABYLONNs.BoundingInfo {
  /**
           * Constructs bounding info
           * @param minimum min vector of the bounding box/sphere
           * @param maximum max vector of the bounding box/sphere
           */
  def this(minimum: babylonjsLib.BABYLONNs.Vector3, maximum: babylonjsLib.BABYLONNs.Vector3) = this()
}

