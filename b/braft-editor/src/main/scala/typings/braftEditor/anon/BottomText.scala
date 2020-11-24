package typings.braftEditor.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomText extends js.Object {
  
  var bottomText: js.UndefOr[ReactNode] = js.native
  
  var cancelText: js.UndefOr[String] = js.native
  
  var children: ReactNode = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  
  var closeOnCancel: js.UndefOr[Boolean] = js.native
  
  var closeOnConfirm: js.UndefOr[Boolean] = js.native
  
  var confirmText: js.UndefOr[String] = js.native
  
  var confirmable: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var id: String = js.native
  
  var onBlur: js.UndefOr[js.Function] = js.native
  
  var onCancel: js.UndefOr[js.Function] = js.native
  
  var onClose: js.UndefOr[js.Function] = js.native
  
  var onConfirm: js.UndefOr[js.Function] = js.native
  
  var showCancel: js.UndefOr[Boolean] = js.native
  
  var showClose: js.UndefOr[Boolean] = js.native
  
  var showConfirm: js.UndefOr[Boolean] = js.native
  
  var showFooter: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object BottomText {
  
  @scala.inline
  def apply(id: String): BottomText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomText]
  }
  
  @scala.inline
  implicit class BottomTextOps[Self <: BottomText] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomText(value: ReactNode): Self = this.set("bottomText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomText: Self = this.set("bottomText", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCloseOnBlur(value: Boolean): Self = this.set("closeOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnBlur: Self = this.set("closeOnBlur", js.undefined)
    
    @scala.inline
    def setCloseOnCancel(value: Boolean): Self = this.set("closeOnCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnCancel: Self = this.set("closeOnCancel", js.undefined)
    
    @scala.inline
    def setCloseOnConfirm(value: Boolean): Self = this.set("closeOnConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnConfirm: Self = this.set("closeOnConfirm", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = this.set("confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmText: Self = this.set("confirmText", js.undefined)
    
    @scala.inline
    def setConfirmable(value: Boolean): Self = this.set("confirmable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmable: Self = this.set("confirmable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOnBlur(value: js.Function): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnCancel(value: js.Function): Self = this.set("onCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnClose(value: js.Function): Self = this.set("onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: js.Function): Self = this.set("onConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
    
    @scala.inline
    def setShowCancel(value: Boolean): Self = this.set("showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCancel: Self = this.set("showCancel", js.undefined)
    
    @scala.inline
    def setShowClose(value: Boolean): Self = this.set("showClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClose: Self = this.set("showClose", js.undefined)
    
    @scala.inline
    def setShowConfirm(value: Boolean): Self = this.set("showConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowConfirm: Self = this.set("showConfirm", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
