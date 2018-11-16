package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contains position, normal and uv vectors for a vertex
     */
@JSGlobal("BABYLON.PositionNormalTextureVertex")
@js.native
class PositionNormalTextureVertex () extends js.Object {
  /**
           * Creates a PositionNormalTextureVertex
           * @param position the position of the vertex (defaut: 0,0,0)
           * @param normal the normal of the vertex (defaut: 0,1,0)
           * @param uv the uv of the vertex (default: 0,0)
           */
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: Vector3) = this()
  /**
           * Creates a PositionNormalTextureVertex
           * @param position the position of the vertex (defaut: 0,0,0)
           * @param normal the normal of the vertex (defaut: 0,1,0)
           * @param uv the uv of the vertex (default: 0,0)
           */
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: Vector3, /** the normal of the vertex (defaut: 0,1,0) */
  normal: Vector3) = this()
  /**
           * Creates a PositionNormalTextureVertex
           * @param position the position of the vertex (defaut: 0,0,0)
           * @param normal the normal of the vertex (defaut: 0,1,0)
           * @param uv the uv of the vertex (default: 0,0)
           */
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: Vector3, /** the normal of the vertex (defaut: 0,1,0) */
  normal: Vector3, /** the uv of the vertex (default: 0,0) */
  uv: Vector2) = this()
  /** the normal of the vertex (defaut: 0,1,0) */
  var normal: Vector3 = js.native
  /** the position of the vertex (defaut: 0,0,0) */
  var position: Vector3 = js.native
  /** the uv of the vertex (default: 0,0) */
  var uv: Vector2 = js.native
}

