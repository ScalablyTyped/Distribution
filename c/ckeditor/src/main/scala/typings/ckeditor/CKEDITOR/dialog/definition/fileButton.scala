package typings.ckeditor.CKEDITOR.dialog.definition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait fileButton extends uiElement {
  
  var filebrowser: js.UndefOr[String] = js.native
  
  var `for`: js.UndefOr[String] = js.native
  
  var validate: js.UndefOr[js.Function0[Boolean]] = js.native
}
object fileButton {
  
  @scala.inline
  def apply(): fileButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[fileButton]
  }
  
  @scala.inline
  implicit class fileButtonOps[Self <: fileButton] (val x: Self) extends AnyVal {
    
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
    def setFilebrowser(value: String): Self = this.set("filebrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowser: Self = this.set("filebrowser", js.undefined)
    
    @scala.inline
    def setFor(value: String): Self = this.set("for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFor: Self = this.set("for", js.undefined)
    
    @scala.inline
    def setValidate(value: () => Boolean): Self = this.set("validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
