package typings.babylonjs

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPointerId extends js.Object {
  var dragPlanePoint: Vector3
  var pointerId: Double
}

object AnonPointerId {
  @scala.inline
  def apply(dragPlanePoint: Vector3, pointerId: Double): AnonPointerId = {
    val __obj = js.Dynamic.literal(dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPointerId]
  }
}

