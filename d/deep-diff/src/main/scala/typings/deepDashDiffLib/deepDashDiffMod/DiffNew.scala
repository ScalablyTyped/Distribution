package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffNew[RHS]
  extends Diff[js.Any, RHS] {
  var kind: deepDashDiffLib.deepDashDiffLibStrings.N
  var path: js.UndefOr[js.Array[_]] = js.undefined
  var rhs: RHS
}

object DiffNew {
  @scala.inline
  def apply[RHS](kind: deepDashDiffLib.deepDashDiffLibStrings.N, rhs: RHS, path: js.Array[_] = null): DiffNew[RHS] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("rhs")(rhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[DiffNew[RHS]]
  }
}

