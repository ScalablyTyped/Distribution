package typings
package d3DashShapeLib.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultArcObject extends js.Object {
  /**
    * End angle of arc. The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var endAngle: scala.Double
  /**
    * Inner radius of arc.
    */
  var innerRadius: scala.Double
  /**
    * Outer radius of arc.
    */
  var outerRadius: scala.Double
  /**
    * Optional. Pad angle of arc in radians.
    */
  var padAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Start angle of arc. The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var startAngle: scala.Double
}

object DefaultArcObject {
  @scala.inline
  def apply(
    endAngle: scala.Double,
    innerRadius: scala.Double,
    outerRadius: scala.Double,
    startAngle: scala.Double,
    padAngle: scala.Int | scala.Double = null
  ): DefaultArcObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endAngle")(endAngle)
    __obj.updateDynamic("innerRadius")(innerRadius)
    __obj.updateDynamic("outerRadius")(outerRadius)
    __obj.updateDynamic("startAngle")(startAngle)
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultArcObject]
  }
}

