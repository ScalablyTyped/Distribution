package typings.baseui.phoneInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlagProps extends js.Object {
  
  var iso: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any = js.native
  
  var width: js.UndefOr[String] = js.native
}
object FlagProps {
  
  @scala.inline
  def apply(iso: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any): FlagProps = {
    val __obj = js.Dynamic.literal(iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagProps]
  }
  
  @scala.inline
  implicit class FlagPropsOps[Self <: FlagProps] (val x: Self) extends AnyVal {
    
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
    def setIso(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any): Self = this.set("iso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
