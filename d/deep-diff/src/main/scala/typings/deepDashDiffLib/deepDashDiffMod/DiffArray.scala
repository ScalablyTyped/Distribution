package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffArray[LHS, RHS] extends Diff[LHS, RHS] {
  var index: scala.Double
  var item: Diff[LHS, RHS]
  var kind: deepDashDiffLib.deepDashDiffLibStrings.A
  var path: js.UndefOr[js.Array[_]] = js.undefined
}

object DiffArray {
  @scala.inline
  def apply[LHS, RHS](
    index: scala.Double,
    item: Diff[LHS, RHS],
    kind: deepDashDiffLib.deepDashDiffLibStrings.A,
    path: js.Array[_] = null
  ): DiffArray[LHS, RHS] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("kind")(kind)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[DiffArray[LHS, RHS]]
  }
}

