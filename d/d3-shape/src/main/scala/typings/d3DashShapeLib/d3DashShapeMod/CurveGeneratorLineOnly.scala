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
    lineEnd: () => scala.Unit,
    lineStart: () => scala.Unit,
    point: (scala.Double, scala.Double) => scala.Unit
  ): CurveGeneratorLineOnly = {
    val __obj = js.Dynamic.literal(lineEnd = js.Any.fromFunction0(lineEnd), lineStart = js.Any.fromFunction0(lineStart), point = js.Any.fromFunction2(point))
  
    __obj.asInstanceOf[CurveGeneratorLineOnly]
  }
}

