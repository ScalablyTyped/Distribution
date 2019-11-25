package typings.deepDashDiff.deepDashDiffMod

import typings.deepDashDiff.deepDashDiffStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffNew[RHS]
  extends Diff[js.Any, RHS] {
  var kind: N
  var path: js.UndefOr[js.Array[_]] = js.undefined
  var rhs: RHS
}

object DiffNew {
  @scala.inline
  def apply[RHS](kind: N, rhs: RHS, path: js.Array[_] = null): DiffNew[RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffNew[RHS]]
  }
}

