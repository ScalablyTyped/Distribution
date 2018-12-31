package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains position and normal vectors for a vertex
  */
@JSImport("babylonjs", "PositionNormalVertex")
@js.native
/**
  * Creates a PositionNormalVertex
  * @param position the position of the vertex (defaut: 0,0,0)
  * @param normal the normal of the vertex (defaut: 0,1,0)
  */
class PositionNormalVertex ()
  extends babylonjsLib.BABYLONNs.PositionNormalVertex {
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: babylonjsLib.BABYLONNs.Vector3) = this()
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: babylonjsLib.BABYLONNs.Vector3, /** the normal of the vertex (defaut: 0,1,0) */
  normal: babylonjsLib.BABYLONNs.Vector3) = this()
}

