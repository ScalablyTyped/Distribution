package typings.deepDiff.mod

import typings.deepDiff.deepDiffStrings.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffArray[LHS, RHS] extends Diff_[LHS, RHS] {
  var index: Double = js.native
  var item: Diff_[LHS, RHS] = js.native
  var kind: A = js.native
  var path: js.UndefOr[js.Array[_]] = js.native
}

object DiffArray {
  @scala.inline
  def apply[LHS, RHS](index: Double, item: Diff_[LHS, RHS], kind: A): DiffArray[LHS, RHS] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffArray[LHS, RHS]]
  }
  @scala.inline
  implicit class DiffArrayOps[Self <: DiffArray[_, _], LHS, RHS] (val x: Self with (DiffArray[LHS, RHS])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Diff_[LHS, RHS]): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: A): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: js.Any*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[_]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

