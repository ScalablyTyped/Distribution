package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRawQuery extends js.Object {
  
  def ModifyWhere(): IRawQueryModify = js.native
  
  /** Change Where clause */
  def ReplaceWhere(): IFieldExpression = js.native
}
object IRawQuery {
  
  @scala.inline
  def apply(ModifyWhere: () => IRawQueryModify, ReplaceWhere: () => IFieldExpression): IRawQuery = {
    val __obj = js.Dynamic.literal(ModifyWhere = js.Any.fromFunction0(ModifyWhere), ReplaceWhere = js.Any.fromFunction0(ReplaceWhere))
    __obj.asInstanceOf[IRawQuery]
  }
  
  @scala.inline
  implicit class IRawQueryOps[Self <: IRawQuery] (val x: Self) extends AnyVal {
    
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
    def setModifyWhere(value: () => IRawQueryModify): Self = this.set("ModifyWhere", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceWhere(value: () => IFieldExpression): Self = this.set("ReplaceWhere", js.Any.fromFunction0(value))
  }
}
