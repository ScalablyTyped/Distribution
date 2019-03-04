package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffDeleted[LHS]
  extends Diff[LHS, js.Any] {
  var kind: deepDashDiffLib.deepDashDiffLibStrings.D
  var lhs: LHS
  var path: js.UndefOr[js.Array[_]] = js.undefined
}

object DiffDeleted {
  @scala.inline
  def apply[LHS](kind: deepDashDiffLib.deepDashDiffLibStrings.D, lhs: LHS, path: js.Array[_] = null): DiffDeleted[LHS] = {
    val __obj = js.Dynamic.literal(kind = kind, lhs = lhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[DiffDeleted[LHS]]
  }
}

