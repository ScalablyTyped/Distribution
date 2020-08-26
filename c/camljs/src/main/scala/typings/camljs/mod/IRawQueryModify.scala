package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRawQueryModify extends js.Object {
  def AppendAnd(): IFieldExpression = js.native
  def AppendOr(): IFieldExpression = js.native
}

object IRawQueryModify {
  @scala.inline
  def apply(AppendAnd: () => IFieldExpression, AppendOr: () => IFieldExpression): IRawQueryModify = {
    val __obj = js.Dynamic.literal(AppendAnd = js.Any.fromFunction0(AppendAnd), AppendOr = js.Any.fromFunction0(AppendOr))
    __obj.asInstanceOf[IRawQueryModify]
  }
  @scala.inline
  implicit class IRawQueryModifyOps[Self <: IRawQueryModify] (val x: Self) extends AnyVal {
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
    def setAppendAnd(value: () => IFieldExpression): Self = this.set("AppendAnd", js.Any.fromFunction0(value))
    @scala.inline
    def setAppendOr(value: () => IFieldExpression): Self = this.set("AppendOr", js.Any.fromFunction0(value))
  }
  
}

