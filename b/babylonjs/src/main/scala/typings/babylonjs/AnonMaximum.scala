package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaximum extends js.Object {
  var maximum: Vector3
  var minimum: Vector3
}

object AnonMaximum {
  @scala.inline
  def apply(maximum: Vector3, minimum: Vector3): AnonMaximum = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaximum]
  }
}

