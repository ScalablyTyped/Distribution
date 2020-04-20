package typings.babylonjs

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinimum extends js.Object {
  var maximum: Vector3
  var minimum: Vector3
}

object AnonMinimum {
  @scala.inline
  def apply(maximum: Vector3, minimum: Vector3): AnonMinimum = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinimum]
  }
}

