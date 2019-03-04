package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffEdit[LHS, RHS] extends Diff[LHS, RHS] {
  var kind: deepDashDiffLib.deepDashDiffLibStrings.E
  var lhs: LHS
  var path: js.UndefOr[js.Array[_]] = js.undefined
  var rhs: RHS
}

object DiffEdit {
  @scala.inline
  def apply[LHS, RHS](kind: deepDashDiffLib.deepDashDiffLibStrings.E, lhs: LHS, rhs: RHS, path: js.Array[_] = null): DiffEdit[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind, lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[DiffEdit[LHS, RHS]]
  }
}

