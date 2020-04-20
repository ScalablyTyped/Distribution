package typings.babylonjs

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPositionVector3 extends js.Object {
  var position: Vector3
}

object AnonPositionVector3 {
  @scala.inline
  def apply(position: Vector3): AnonPositionVector3 = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPositionVector3]
  }
}

