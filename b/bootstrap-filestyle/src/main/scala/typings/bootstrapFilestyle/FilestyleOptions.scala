package typings.bootstrapFilestyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilestyleOptions extends js.Object {
  
  var badge: js.UndefOr[Boolean] = js.native
  
  var buttonBefore: js.UndefOr[Boolean] = js.native
  
  var buttonName: js.UndefOr[String] = js.native
  
  var buttonText: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[Boolean] = js.native
  
  var iconName: js.UndefOr[String] = js.native
  
  var input: js.UndefOr[Boolean] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
}
object FilestyleOptions {
  
  @scala.inline
  def apply(): FilestyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilestyleOptions]
  }
  
  @scala.inline
  implicit class FilestyleOptionsOps[Self <: FilestyleOptions] (val x: Self) extends AnyVal {
    
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
    def setBadge(value: Boolean): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setButtonBefore(value: Boolean): Self = this.set("buttonBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonBefore: Self = this.set("buttonBefore", js.undefined)
    
    @scala.inline
    def setButtonName(value: String): Self = this.set("buttonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonName: Self = this.set("buttonName", js.undefined)
    
    @scala.inline
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: Boolean): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconName(value: String): Self = this.set("iconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconName: Self = this.set("iconName", js.undefined)
    
    @scala.inline
    def setInput(value: Boolean): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
