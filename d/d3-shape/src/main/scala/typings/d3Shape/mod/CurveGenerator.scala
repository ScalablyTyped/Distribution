package typings.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveGenerator extends CurveGeneratorLineOnly {
  /**
    * Indicates the end of the current area segment.
    */
  def areaEnd(): Unit
  /**
    * Indicates the start of a new area segment.
    * Each area segment consists of exactly two line segments: the topline, followed by the baseline, with the baseline points in reverse order.
    */
  def areaStart(): Unit
}

object CurveGenerator {
  @scala.inline
  def apply(
    areaEnd: () => Unit,
    areaStart: () => Unit,
    lineEnd: () => Unit,
    lineStart: () => Unit,
    point: (Double, Double) => Unit
  ): CurveGenerator = {
    val __obj = js.Dynamic.literal(areaEnd = js.Any.fromFunction0(areaEnd), areaStart = js.Any.fromFunction0(areaStart), lineEnd = js.Any.fromFunction0(lineEnd), lineStart = js.Any.fromFunction0(lineStart), point = js.Any.fromFunction2(point))
  
    __obj.asInstanceOf[CurveGenerator]
  }
}

