package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Minimum extends js.Object {
  var maximum: Vector3
  var minimum: Vector3
}

object Minimum {
  @scala.inline
  def apply(maximum: Vector3, minimum: Vector3): Minimum = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minimum]
  }
}

