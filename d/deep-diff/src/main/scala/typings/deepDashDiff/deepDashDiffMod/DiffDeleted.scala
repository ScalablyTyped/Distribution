package typings.deepDashDiff.deepDashDiffMod

import typings.deepDashDiff.deepDashDiffStrings.D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffDeleted[LHS]
  extends Diff[LHS, js.Any] {
  var kind: D
  var lhs: LHS
  var path: js.UndefOr[js.Array[_]] = js.undefined
}

object DiffDeleted {
  @scala.inline
  def apply[LHS](kind: D, lhs: LHS, path: js.Array[_] = null): DiffDeleted[LHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffDeleted[LHS]]
  }
}

