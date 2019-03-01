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
  def intersections(shape: Shape): js.Array[js.Array[java.lang.String]] | js.Array[js.Array[scala.Double]]
}

object Shape {
  @scala.inline
  def apply(
    back: Bezier,
    bbox: BBox,
    endcap: BezierCap,
    forward: Bezier,
    intersections: js.Function1[Shape, js.Array[js.Array[java.lang.String]] | js.Array[js.Array[scala.Double]]],
    startcap: BezierCap
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("back")(back)
    __obj.updateDynamic("bbox")(bbox)
    __obj.updateDynamic("endcap")(endcap)
    __obj.updateDynamic("forward")(forward)
    __obj.updateDynamic("intersections")(intersections)
    __obj.updateDynamic("startcap")(startcap)
    __obj.asInstanceOf[Shape]
  }
}

