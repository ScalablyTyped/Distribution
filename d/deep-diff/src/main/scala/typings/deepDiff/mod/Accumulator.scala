package typings.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accumulator[LHS, RHS] extends js.Object {
  var length: Double
  def push(diff: Diff_[LHS, RHS]): Unit
}

object Accumulator {
  @scala.inline
  def apply[LHS, RHS](length: Double, push: Diff_[LHS, RHS] => Unit): Accumulator[LHS, RHS] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[Accumulator[LHS, RHS]]
  }
}

