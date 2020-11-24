package typings.deepDiff.mod

import typings.deepDiff.deepDiffStrings.E
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffEdit[LHS, RHS] extends Diff_[LHS, RHS] {
  
  var kind: E = js.native
  
  var lhs: LHS = js.native
  
  var path: js.UndefOr[js.Array[_]] = js.native
  
  var rhs: RHS = js.native
}
object DiffEdit {
  
  @scala.inline
  def apply[LHS, RHS](kind: E, lhs: LHS, rhs: RHS): DiffEdit[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffEdit[LHS, RHS]]
  }
  
  @scala.inline
  implicit class DiffEditOps[Self <: DiffEdit[_, _], LHS, RHS] (val x: Self with (DiffEdit[LHS, RHS])) extends AnyVal {
    
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
    def setKind(value: E): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLhs(value: LHS): Self = this.set("lhs", value.asInstanceOf[js.Any])
    
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
