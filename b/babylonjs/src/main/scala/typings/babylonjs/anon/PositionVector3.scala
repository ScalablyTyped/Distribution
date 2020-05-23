package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionVector3 extends js.Object {
  var position: Vector3
}

object PositionVector3 {
  @scala.inline
  def apply(position: Vector3): PositionVector3 = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionVector3]
  }
}

