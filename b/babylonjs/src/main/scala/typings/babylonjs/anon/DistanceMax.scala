package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMax extends js.Object {
  var distance: Double
  var max: Vector3
  var min: Vector3
}

object DistanceMax {
  @scala.inline
  def apply(distance: Double, max: Vector3, min: Vector3): DistanceMax = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMax]
  }
}

