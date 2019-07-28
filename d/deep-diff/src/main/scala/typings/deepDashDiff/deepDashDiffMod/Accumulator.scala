package typings.deepDashDiff.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accumulator[LHS, RHS] extends js.Object {
  var length: Double
  def push(diff: Diff[LHS, RHS]): Unit
}

object Accumulator {
  @scala.inline
  def apply[LHS, RHS](length: Double, push: Diff[LHS, RHS] => Unit): Accumulator[LHS, RHS] = {
    val __obj = js.Dynamic.literal(length = length, push = js.Any.fromFunction1(push))
  
    __obj.asInstanceOf[Accumulator[LHS, RHS]]
  }
}

