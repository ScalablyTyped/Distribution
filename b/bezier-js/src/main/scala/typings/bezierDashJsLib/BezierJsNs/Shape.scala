package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var back: Bezier
  var bbox: BBox
  var endcap: BezierCap
  var forward: Bezier
  var startcap: BezierCap
  def intersections(shape: Shape): js.Array[js.Array[scala.Double | java.lang.String]]
}

object Shape {
  @scala.inline
  def apply(
    back: Bezier,
    bbox: BBox,
    endcap: BezierCap,
    forward: Bezier,
    intersections: Shape => js.Array[js.Array[scala.Double | java.lang.String]],
    startcap: BezierCap
  ): Shape = {
    val __obj = js.Dynamic.literal(back = back, bbox = bbox, endcap = endcap, forward = forward, intersections = js.Any.fromFunction1(intersections), startcap = startcap)
  
    __obj.asInstanceOf[Shape]
  }
}

