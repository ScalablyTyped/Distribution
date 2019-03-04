package typings
package d3DashShapeLib.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveGeneratorLineOnly extends js.Object {
  /**
    * Indicates the end of the current line segment.
    */
  def lineEnd(): scala.Unit
  /**
    * Indicates the start of a new line segment. Zero or more points will follow.
    */
  def lineStart(): scala.Unit
  /**
    * Indicates a new point in the current line segment with the given x- and y-values.
    */
  def point(x: scala.Double, y: scala.Double): scala.Unit
}

object CurveGeneratorLineOnly {
  @scala.inline
  def apply(
    lineEnd: js.Function0[scala.Unit],
    lineStart: js.Function0[scala.Unit],
    point: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): CurveGeneratorLineOnly = {
    val __obj = js.Dynamic.literal(lineEnd = lineEnd, lineStart = lineStart, point = point)
  
    __obj.asInstanceOf[CurveGeneratorLineOnly]
  }
}

