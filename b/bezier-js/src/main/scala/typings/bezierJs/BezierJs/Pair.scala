package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pair extends js.Object {
  var left: Bezier = js.native
  var right: Bezier = js.native
}

object Pair {
  @scala.inline
  def apply(left: Bezier, right: Bezier): Pair = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair]
  }
  @scala.inline
  implicit class PairOps[Self <: Pair] (val x: Self) extends AnyVal {
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
    def setLeft(value: Bezier): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Bezier): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}

