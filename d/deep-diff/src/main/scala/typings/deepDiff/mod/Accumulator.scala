package typings.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accumulator[LHS, RHS] extends js.Object {
  var length: Double = js.native
  def push(diff: Diff_[LHS, RHS]): Unit = js.native
}

object Accumulator {
  @scala.inline
  def apply[LHS, RHS](length: Double, push: Diff_[LHS, RHS] => Unit): Accumulator[LHS, RHS] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[Accumulator[LHS, RHS]]
  }
  @scala.inline
  implicit class AccumulatorOps[Self <: Accumulator[_, _], LHS, RHS] (val x: Self with (Accumulator[LHS, RHS])) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setPush(value: Diff_[LHS, RHS] => Unit): Self = this.set("push", js.Any.fromFunction1(value))
  }
  
}

