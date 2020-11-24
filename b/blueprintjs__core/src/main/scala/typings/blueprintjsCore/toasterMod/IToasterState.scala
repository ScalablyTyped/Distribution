package typings.blueprintjsCore.toasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToasterState extends js.Object {
  
  var toasts: js.Array[IToastOptions] = js.native
}
object IToasterState {
  
  @scala.inline
  def apply(toasts: js.Array[IToastOptions]): IToasterState = {
    val __obj = js.Dynamic.literal(toasts = toasts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToasterState]
  }
  
  @scala.inline
  implicit class IToasterStateOps[Self <: IToasterState] (val x: Self) extends AnyVal {
    
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
    def setToastsVarargs(value: IToastOptions*): Self = this.set("toasts", js.Array(value :_*))
    
    @scala.inline
    def setToasts(value: js.Array[IToastOptions]): Self = this.set("toasts", value.asInstanceOf[js.Any])
  }
}
