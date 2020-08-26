package typings.d3Delaunay.mod.Delaunay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the moveTo() method of the CanvasPathMethods API.
  */
@js.native
trait MoveContext extends js.Object {
  /**
    * moveTo() method of the CanvasPathMethods API.
    */
  def moveTo(x: Double, y: Double): Unit = js.native
}

object MoveContext {
  @scala.inline
  def apply(moveTo: (Double, Double) => Unit): MoveContext = {
    val __obj = js.Dynamic.literal(moveTo = js.Any.fromFunction2(moveTo))
    __obj.asInstanceOf[MoveContext]
  }
  @scala.inline
  implicit class MoveContextOps[Self <: MoveContext] (val x: Self) extends AnyVal {
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
    def setMoveTo(value: (Double, Double) => Unit): Self = this.set("moveTo", js.Any.fromFunction2(value))
  }
  
}

