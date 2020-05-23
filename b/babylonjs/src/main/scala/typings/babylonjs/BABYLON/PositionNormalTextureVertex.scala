package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionNormalTextureVertex extends js.Object {
  /** the normal of the vertex (defaut: 0,1,0) */
  var normal: Vector3
  /** the position of the vertex (defaut: 0,0,0) */
  var position: Vector3
  /** the uv of the vertex (default: 0,0) */
  var uv: Vector2
}

object PositionNormalTextureVertex {
  @scala.inline
  def apply(normal: Vector3, position: Vector3, uv: Vector2): PositionNormalTextureVertex = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionNormalTextureVertex]
  }
}

