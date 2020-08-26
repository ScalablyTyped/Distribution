package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ABC extends js.Object {
  var A: Point = js.native
  var B: Point = js.native
  var C: Point = js.native
}

object ABC {
  @scala.inline
  def apply(A: Point, B: Point, C: Point): ABC = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], B = B.asInstanceOf[js.Any], C = C.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABC]
  }
  @scala.inline
  implicit class ABCOps[Self <: ABC] (val x: Self) extends AnyVal {
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
    def setA(value: Point): Self = this.set("A", value.asInstanceOf[js.Any])
    @scala.inline
    def setB(value: Point): Self = this.set("B", value.asInstanceOf[js.Any])
    @scala.inline
    def setC(value: Point): Self = this.set("C", value.asInstanceOf[js.Any])
  }
  
}

