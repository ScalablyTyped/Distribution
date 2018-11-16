package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contains position, normal and uv vectors for a vertex
     */
@JSImport("babylonjs", "PositionNormalTextureVertex")
@js.native
class PositionNormalTextureVertex ()
  extends babylonjsLib.BABYLONNs.PositionNormalTextureVertex {
  /**
           * Creates a PositionNormalTextureVertex
           * @param position the position of the vertex (defaut: 0,0,0)
           * @param normal the normal of the vertex (defaut: 0,1,0)
           * @param uv the uv of the vertex (default: 0,0)
           */
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: babylonjsLib.BABYLONNs.Vector3) = this()
  /**
           * Creates a PositionNormalTextureVertex
           * @param position the position of the vertex (defaut: 0,0,0)
           * @param normal the normal of the vertex (defaut: 0,1,0)
           * @param uv the uv of the vertex (default: 0,0)
           */
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: babylonjsLib.BABYLONNs.Vector3, /** the normal of the vertex (defaut: 0,1,0) */
  normal: babylonjsLib.BABYLONNs.Vector3) = this()
  /**
           * Creates a PositionNormalTextureVertex
           * @param position the position of the vertex (defaut: 0,0,0)
           * @param normal the normal of the vertex (defaut: 0,1,0)
           * @param uv the uv of the vertex (default: 0,0)
           */
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: babylonjsLib.BABYLONNs.Vector3, /** the normal of the vertex (defaut: 0,1,0) */
  normal: babylonjsLib.BABYLONNs.Vector3, /** the uv of the vertex (default: 0,0) */
  uv: babylonjsLib.BABYLONNs.Vector2) = this()
}

