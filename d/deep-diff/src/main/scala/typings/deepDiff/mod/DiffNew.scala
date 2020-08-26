package typings.deepDiff.mod

import typings.deepDiff.deepDiffStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffNew[RHS]
  extends Diff_[js.Any, RHS] {
  var kind: N = js.native
  var path: js.UndefOr[js.Array[_]] = js.native
  var rhs: RHS = js.native
}

object DiffNew {
  @scala.inline
  def apply[RHS](kind: N, rhs: RHS): DiffNew[RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffNew[RHS]]
  }
  @scala.inline
  implicit class DiffNewOps[Self <: DiffNew[_], RHS] (val x: Self with DiffNew[RHS]) extends AnyVal {
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
    def setKind(value: N): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setRhs(value: RHS): Self = this.set("rhs", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: js.Any*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[_]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

