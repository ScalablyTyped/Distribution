package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store bounding sphere information
  */
@JSImport("babylonjs", "BoundingSphere")
@js.native
class BoundingSphere protected ()
  extends babylonjsLib.BABYLONNs.BoundingSphere {
  /**
    * Creates a new bounding sphere
    * @param min defines the minimum vector (in local space)
    * @param max defines the maximum vector (in local space)
    */
  def this(min: babylonjsLib.BABYLONNs.Vector3, max: babylonjsLib.BABYLONNs.Vector3) = this()
}

/**
  * Class used to store bounding sphere information
  */
@JSImport("babylonjs", "BoundingSphere")
@js.native
object BoundingSphere extends js.Object {
  /**
    * Checks if two sphere intersct
    * @param sphere0 sphere 0
    * @param sphere1 sphere 1
    * @returns true if the speres intersect
    */
  def Intersects(sphere0: babylonjsLib.BABYLONNs.BoundingSphere, sphere1: babylonjsLib.BABYLONNs.BoundingSphere): scala.Boolean = js.native
}

