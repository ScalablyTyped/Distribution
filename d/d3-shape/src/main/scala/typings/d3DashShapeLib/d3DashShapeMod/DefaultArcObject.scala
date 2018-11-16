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

