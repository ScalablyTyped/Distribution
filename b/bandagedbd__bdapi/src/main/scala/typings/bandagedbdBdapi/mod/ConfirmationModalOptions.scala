package typings.bandagedbdBdapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmationModalOptions extends js.Object {
  
  var cancelText: js.UndefOr[String] = js.native
  
  var confirmText: js.UndefOr[String] = js.native
  
  var danger: js.UndefOr[Boolean] = js.native
  
  var onCancel: js.UndefOr[js.Function0[_]] = js.native
  
  var onConfirm: js.UndefOr[js.Function0[_]] = js.native
}
object ConfirmationModalOptions {
  
  @scala.inline
  def apply(): ConfirmationModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmationModalOptions]
  }
  
  @scala.inline
  implicit class ConfirmationModalOptionsOps[Self <: ConfirmationModalOptions] (val x: Self) extends AnyVal {
    
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
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = this.set("confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmText: Self = this.set("confirmText", js.undefined)
    
    @scala.inline
    def setDanger(value: Boolean): Self = this.set("danger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDanger: Self = this.set("danger", js.undefined)
    
    @scala.inline
    def setOnCancel(value: () => _): Self = this.set("onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: () => _): Self = this.set("onConfirm", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
  }
}
