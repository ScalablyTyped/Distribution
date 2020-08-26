package typings.d3Delaunay.mod.Delaunay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the lineTo() method of the CanvasPathMethods API.
  */
@js.native
trait LineContext extends js.Object {
  /**
    * lineTo() method of the CanvasPathMethods API.
    */
  def lineTo(x: Double, y: Double): Unit = js.native
}

object LineContext {
  @scala.inline
  def apply(lineTo: (Double, Double) => Unit): LineContext = {
    val __obj = js.Dynamic.literal(lineTo = js.Any.fromFunction2(lineTo))
    __obj.asInstanceOf[LineContext]
  }
  @scala.inline
  implicit class LineContextOps[Self <: LineContext] (val x: Self) extends AnyVal {
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
    def setLineTo(value: (Double, Double) => Unit): Self = this.set("lineTo", js.Any.fromFunction2(value))
  }
  
}

