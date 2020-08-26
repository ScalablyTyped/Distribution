package typings.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurveGeneratorLineOnly extends js.Object {
  /**
    * Indicates the end of the current line segment.
    */
  def lineEnd(): Unit = js.native
  /**
    * Indicates the start of a new line segment. Zero or more points will follow.
    */
  def lineStart(): Unit = js.native
  /**
    * Indicates a new point in the current line segment with the given x- and y-values.
    */
  def point(x: Double, y: Double): Unit = js.native
}

object CurveGeneratorLineOnly {
  @scala.inline
  def apply(lineEnd: () => Unit, lineStart: () => Unit, point: (Double, Double) => Unit): CurveGeneratorLineOnly = {
    val __obj = js.Dynamic.literal(lineEnd = js.Any.fromFunction0(lineEnd), lineStart = js.Any.fromFunction0(lineStart), point = js.Any.fromFunction2(point))
    __obj.asInstanceOf[CurveGeneratorLineOnly]
  }
  @scala.inline
  implicit class CurveGeneratorLineOnlyOps[Self <: CurveGeneratorLineOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLineEnd(value: () => Unit): Self = this.set("lineEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setLineStart(value: () => Unit): Self = this.set("lineStart", js.Any.fromFunction0(value))
    @scala.inline
    def setPoint(value: (Double, Double) => Unit): Self = this.set("point", js.Any.fromFunction2(value))
  }
  
}

