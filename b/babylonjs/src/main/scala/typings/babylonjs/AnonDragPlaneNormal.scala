package typings.babylonjs

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragPlaneNormal extends js.Object {
  var delta: Vector3
  var dragDistance: Double
  var dragPlaneNormal: Vector3
  var dragPlanePoint: Vector3
  var pointerId: Double
}

object AnonDragPlaneNormal {
  @scala.inline
  def apply(
    delta: Vector3,
    dragDistance: Double,
    dragPlaneNormal: Vector3,
    dragPlanePoint: Vector3,
    pointerId: Double
  ): AnonDragPlaneNormal = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], dragDistance = dragDistance.asInstanceOf[js.Any], dragPlaneNormal = dragPlaneNormal.asInstanceOf[js.Any], dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDragPlaneNormal]
  }
}

