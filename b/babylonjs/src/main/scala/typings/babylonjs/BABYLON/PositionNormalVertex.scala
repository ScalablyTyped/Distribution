package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionNormalVertex extends js.Object {
  /** the normal of the vertex (defaut: 0,1,0) */
  var normal: Vector3
  /** the position of the vertex (defaut: 0,0,0) */
  var position: Vector3
}

object PositionNormalVertex {
  @scala.inline
  def apply(normal: Vector3, position: Vector3): PositionNormalVertex = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionNormalVertex]
  }
}

