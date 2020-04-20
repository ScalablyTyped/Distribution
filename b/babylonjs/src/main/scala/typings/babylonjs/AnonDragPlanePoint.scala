package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragPlanePoint extends js.Object {
  var dragPlanePoint: Vector3
  var pointerId: Double
}

object AnonDragPlanePoint {
  @scala.inline
  def apply(dragPlanePoint: Vector3, pointerId: Double): AnonDragPlanePoint = {
    val __obj = js.Dynamic.literal(dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDragPlanePoint]
  }
}

