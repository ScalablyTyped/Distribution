package typings.d3DashShape.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveGeneratorLineOnly extends js.Object {
  /**
    * Indicates the end of the current line segment.
    */
  def lineEnd(): Unit
  /**
    * Indicates the start of a new line segment. Zero or more points will follow.
    */
  def lineStart(): Unit
  /**
    * Indicates a new point in the current line segment with the given x- and y-values.
    */
  def point(x: Double, y: Double): Unit
}

object CurveGeneratorLineOnly {
  @scala.inline
  def apply(lineEnd: () => Unit, lineStart: () => Unit, point: (Double, Double) => Unit): CurveGeneratorLineOnly = {
    val __obj = js.Dynamic.literal(lineEnd = js.Any.fromFunction0(lineEnd), lineStart = js.Any.fromFunction0(lineStart), point = js.Any.fromFunction2(point))
  
    __obj.asInstanceOf[CurveGeneratorLineOnly]
  }
}

