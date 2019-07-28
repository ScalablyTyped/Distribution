package typings.deepDashDiff.deepDashDiffMod

import typings.deepDashDiff.deepDashDiffStrings.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffArray[LHS, RHS] extends Diff[LHS, RHS] {
  var index: Double
  var item: Diff[LHS, RHS]
  var kind: A
  var path: js.UndefOr[js.Array[_]] = js.undefined
}

object DiffArray {
  @scala.inline
  def apply[LHS, RHS](index: Double, item: Diff[LHS, RHS], kind: A, path: js.Array[_] = null): DiffArray[LHS, RHS] = {
    val __obj = js.Dynamic.literal(index = index, item = item, kind = kind)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[DiffArray[LHS, RHS]]
  }
}

