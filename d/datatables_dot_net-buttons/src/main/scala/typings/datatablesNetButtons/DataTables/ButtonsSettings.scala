package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region "Button Settings"
@js.native
trait ButtonsSettings extends StObject {
  
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
  implicit class ButtonsSettingsMutableBuilder[Self <: ButtonsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[String | FunctionButtom | ButtonSettings]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: (String | FunctionButtom | ButtonSettings)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setDom(value: ButtonDomSettings): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
