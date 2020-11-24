package typings.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurveGenerator extends CurveGeneratorLineOnly {
  
  /**
    * Indicates the end of the current area segment.
    */
  def areaEnd(): Unit = js.native
  
  /**
    * Indicates the start of a new area segment.
    * Each area segment consists of exactly two line segments: the topline, followed by the baseline, with the baseline points in reverse order.
    */
  def areaStart(): Unit = js.native
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
  
  @scala.inline
  implicit class CurveGeneratorOps[Self <: CurveGenerator] (val x: Self) extends AnyVal {
    
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
    def setAreaEnd(value: () => Unit): Self = this.set("areaEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAreaStart(value: () => Unit): Self = this.set("areaStart", js.Any.fromFunction0(value))
  }
}
