package typings.baiduApp.swan

import typings.baiduApp.anon.Cancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 取消按钮的文字颜色，默认为"#000000"
    */
  var cancelColor: js.UndefOr[String] = js.native
  
  /**
    * 取消按钮的文字，默认为"取消"，最多 4 个字符
    */
  var cancelText: js.UndefOr[String] = js.native
  
  /**
    * 确定按钮的文字颜色，默认为"#3CC51F"
    */
  var confirmColor: js.UndefOr[String] = js.native
  
  /**
    * 确定按钮的文字，默认为"确定"，最多 4 个字符
    */
  var confirmText: js.UndefOr[String] = js.native
  
  /**
    * 提示的内容
    */
  var content: String = js.native
  
  /**
    * 是否显示取消按钮，默认为 true
    */
  var showCancel: js.UndefOr[Boolean] = js.native
  
  @JSName("success")
  var success_ModalOptions: js.UndefOr[js.Function1[/* res */ Cancel, Unit]] = js.native
  
  /**
    * 提示的标题
    */
  var title: String = js.native
}
object ModalOptions {
  
  @scala.inline
  def apply(content: String, title: String): ModalOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
  
  @scala.inline
  implicit class ModalOptionsOps[Self <: ModalOptions] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelColor(value: String): Self = this.set("cancelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelColor: Self = this.set("cancelColor", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setConfirmColor(value: String): Self = this.set("confirmColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmColor: Self = this.set("confirmColor", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = this.set("confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmText: Self = this.set("confirmText", js.undefined)
    
    @scala.inline
    def setShowCancel(value: Boolean): Self = this.set("showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCancel: Self = this.set("showCancel", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ Cancel => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
