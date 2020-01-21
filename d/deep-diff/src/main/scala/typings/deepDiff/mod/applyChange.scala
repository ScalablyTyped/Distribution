package typings.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-diff", "applyChange")
@js.native
object applyChange extends js.Object {
  def apply[LHS](target: LHS, source: js.Any, change: Diff_[LHS, _]): Unit = js.native
}

