package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: Vector3
  var min: Vector3
}

object AnonMax {
  @scala.inline
  def apply(max: Vector3, min: Vector3): AnonMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

