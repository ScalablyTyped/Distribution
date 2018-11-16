package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contains position and normal vectors for a vertex
     */
@JSGlobal("BABYLON.PositionNormalVertex")
@js.native
class PositionNormalVertex () extends js.Object {
  /**
           * Creates a PositionNormalVertex
           * @param position the position of the vertex (defaut: 0,0,0)
           * @param normal the normal of the vertex (defaut: 0,1,0)
           */
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: Vector3) = this()
  /**
           * Creates a PositionNormalVertex
           * @param position the position of the vertex (defaut: 0,0,0)
           * @param normal the normal of the vertex (defaut: 0,1,0)
           */
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: Vector3, /** the normal of the vertex (defaut: 0,1,0) */
  normal: Vector3) = this()
  /** the normal of the vertex (defaut: 0,1,0) */
  var normal: Vector3 = js.native
  /** the position of the vertex (defaut: 0,0,0) */
  var position: Vector3 = js.native
}

