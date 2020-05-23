package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerId extends js.Object {
  var dragPlanePoint: Vector3
  var pointerId: Double
}

object PointerId {
  @scala.inline
  def apply(dragPlanePoint: Vector3, pointerId: Double): PointerId = {
    val __obj = js.Dynamic.literal(dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerId]
  }
}

