package typings
package d3DashShapeLib.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveGenerator extends CurveGeneratorLineOnly {
  /**
    * Indicates the end of the current area segment.
    */
  def areaEnd(): scala.Unit
  /**
    * Indicates the start of a new area segment.
    * Each area segment consists of exactly two line segments: the topline, followed by the baseline, with the baseline points in reverse order.
    */
  def areaStart(): scala.Unit
}

object CurveGenerator {
  @scala.inline
  def apply(
    areaEnd: js.Function0[scala.Unit],
    areaStart: js.Function0[scala.Unit],
    lineEnd: js.Function0[scala.Unit],
    lineStart: js.Function0[scala.Unit],
    point: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): CurveGenerator = {
    val __obj = js.Dynamic.literal(areaEnd = areaEnd, areaStart = areaStart, lineEnd = lineEnd, lineStart = lineStart, point = point)
  
    __obj.asInstanceOf[CurveGenerator]
  }
}

