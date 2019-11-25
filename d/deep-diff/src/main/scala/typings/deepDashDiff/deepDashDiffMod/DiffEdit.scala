package typings.deepDashDiff.deepDashDiffMod

import typings.deepDashDiff.deepDashDiffStrings.E
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffEdit[LHS, RHS] extends Diff[LHS, RHS] {
  var kind: E
  var lhs: LHS
  var path: js.UndefOr[js.Array[_]] = js.undefined
  var rhs: RHS
}

object DiffEdit {
  @scala.inline
  def apply[LHS, RHS](kind: E, lhs: LHS, rhs: RHS, path: js.Array[_] = null): DiffEdit[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffEdit[LHS, RHS]]
  }
}

