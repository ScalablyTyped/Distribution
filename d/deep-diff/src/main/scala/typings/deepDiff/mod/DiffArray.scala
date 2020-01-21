package typings.deepDiff.mod

import typings.deepDiff.deepDiffStrings.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffArray[LHS, RHS] extends Diff_[LHS, RHS] {
  var index: Double
  var item: Diff_[LHS, RHS]
  var kind: A
  var path: js.UndefOr[js.Array[_]] = js.undefined
}

object DiffArray {
  @scala.inline
  def apply[LHS, RHS](index: Double, item: Diff_[LHS, RHS], kind: A, path: js.Array[_] = null): DiffArray[LHS, RHS] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffArray[LHS, RHS]]
  }
}

