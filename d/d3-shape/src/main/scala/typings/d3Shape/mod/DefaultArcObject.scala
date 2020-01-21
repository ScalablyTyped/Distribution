package typings.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultArcObject extends js.Object {
  /**
    * End angle of arc. The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var endAngle: Double
  /**
    * Inner radius of arc.
    */
  var innerRadius: Double
  /**
    * Outer radius of arc.
    */
  var outerRadius: Double
  /**
    * Optional. Pad angle of arc in radians.
    */
  var padAngle: js.UndefOr[Double] = js.undefined
  /**
    * Start angle of arc. The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var startAngle: Double
}

object DefaultArcObject {
  @scala.inline
  def apply(
    endAngle: Double,
    innerRadius: Double,
    outerRadius: Double,
    startAngle: Double,
    padAngle: Int | Double = null
  ): DefaultArcObject = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultArcObject]
  }
}

