package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxMin extends js.Object {
  var max: Vector3
  var min: Vector3
}

object MaxMin {
  @scala.inline
  def apply(max: Vector3, min: Vector3): MaxMin = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxMin]
  }
}

