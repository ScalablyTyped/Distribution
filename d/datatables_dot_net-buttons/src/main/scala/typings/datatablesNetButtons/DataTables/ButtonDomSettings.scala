package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonDomSettings extends js.Object {
  
  var button: js.UndefOr[ButtonDomButtomButton] = js.native
  
  var buttonContainer: js.UndefOr[ButtonDomButtomCommon] = js.native
  
  var buttonLiner: js.UndefOr[ButtonDomButtomCommon] = js.native
  
  var collection: js.UndefOr[ButtonDomButtomCommon] = js.native
  
  var container: js.UndefOr[ButtonDomButtomCommon] = js.native
}
object ButtonDomSettings {
  
  @scala.inline
  def apply(): ButtonDomSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonDomSettings]
  }
  
  @scala.inline
  implicit class ButtonDomSettingsOps[Self <: ButtonDomSettings] (val x: Self) extends AnyVal {
    
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
    def setButton(value: ButtonDomButtomButton): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setButtonContainer(value: ButtonDomButtomCommon): Self = this.set("buttonContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonContainer: Self = this.set("buttonContainer", js.undefined)
    
    @scala.inline
    def setButtonLiner(value: ButtonDomButtomCommon): Self = this.set("buttonLiner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonLiner: Self = this.set("buttonLiner", js.undefined)
    
    @scala.inline
    def setCollection(value: ButtonDomButtomCommon): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    
    @scala.inline
    def setContainer(value: ButtonDomButtomCommon): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
  }
}
