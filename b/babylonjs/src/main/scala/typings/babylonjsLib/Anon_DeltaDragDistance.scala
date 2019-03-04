package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeltaDragDistance extends js.Object {
  var delta: babylonjsLib.BABYLONNs.Vector3
  var dragDistance: scala.Double
  var dragPlaneNormal: babylonjsLib.BABYLONNs.Vector3
  var dragPlanePoint: babylonjsLib.BABYLONNs.Vector3
  var pointerId: scala.Double
}

object Anon_DeltaDragDistance {
  @scala.inline
  def apply(
    delta: babylonjsLib.BABYLONNs.Vector3,
    dragDistance: scala.Double,
    dragPlaneNormal: babylonjsLib.BABYLONNs.Vector3,
    dragPlanePoint: babylonjsLib.BABYLONNs.Vector3,
    pointerId: scala.Double
  ): Anon_DeltaDragDistance = {
    val __obj = js.Dynamic.literal(delta = delta, dragDistance = dragDistance, dragPlaneNormal = dragPlaneNormal, dragPlanePoint = dragPlanePoint, pointerId = pointerId)
  
    __obj.asInstanceOf[Anon_DeltaDragDistance]
  }
}

