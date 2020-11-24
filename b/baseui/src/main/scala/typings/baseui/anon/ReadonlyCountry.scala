package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<baseui.baseui/phone-input.Country> */
@js.native
trait ReadonlyCountry extends js.Object {
  
  val dialCode: String = js.native
  
  val id: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any = js.native
  
  val label: String = js.native
}
object ReadonlyCountry {
  
  @scala.inline
  def apply(
    dialCode: String,
    id: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any,
    label: String
  ): ReadonlyCountry = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCountry]
  }
  
  @scala.inline
  implicit class ReadonlyCountryOps[Self <: ReadonlyCountry] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: String): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(
      value: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any
    ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
