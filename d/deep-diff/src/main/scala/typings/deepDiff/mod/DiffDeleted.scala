package typings.deepDiff.mod

import typings.deepDiff.deepDiffStrings.D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffDeleted[LHS]
  extends Diff_[LHS, js.Any] {
  
  var kind: D = js.native
  
  var lhs: LHS = js.native
  
  var path: js.UndefOr[js.Array[_]] = js.native
}
object DiffDeleted {
  
  @scala.inline
  def apply[LHS](kind: D, lhs: LHS): DiffDeleted[LHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffDeleted[LHS]]
  }
  
  @scala.inline
  implicit class DiffDeletedOps[Self <: DiffDeleted[_], LHS] (val x: Self with DiffDeleted[LHS]) extends AnyVal {
    
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
    def setKind(value: D): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLhs(value: LHS): Self = this.set("lhs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: js.Any*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[_]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
