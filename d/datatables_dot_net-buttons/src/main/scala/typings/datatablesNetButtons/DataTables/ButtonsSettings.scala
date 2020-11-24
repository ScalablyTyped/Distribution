package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region "Button Settings"
@js.native
trait ButtonsSettings extends js.Object {
  
  var buttons: js.Array[String | FunctionButtom | ButtonSettings] = js.native
  
  var dom: js.UndefOr[ButtonDomSettings] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
}
object ButtonsSettings {
  
  @scala.inline
  def apply(buttons: js.Array[String | FunctionButtom | ButtonSettings]): ButtonsSettings = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsSettings]
  }
  
  @scala.inline
  implicit class ButtonsSettingsOps[Self <: ButtonsSettings] (val x: Self) extends AnyVal {
    
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
    def setButtonsVarargs(value: (String | FunctionButtom | ButtonSettings)*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[String | FunctionButtom | ButtonSettings]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDom(value: ButtonDomSettings): Self = this.set("dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDom: Self = this.set("dom", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
}
