package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region "Button Settings"
trait ButtonsSettings extends StObject {
  
  var buttons: js.Array[String | FunctionButtom | ButtonSettings]
  
  var dom: js.UndefOr[ButtonDomSettings] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
}
object ButtonsSettings {
  
  inline def apply(buttons: js.Array[String | FunctionButtom | ButtonSettings]): ButtonsSettings = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsSettings]
  }
  
  extension [Self <: ButtonsSettings](x: Self) {
    
    inline def setButtons(value: js.Array[String | FunctionButtom | ButtonSettings]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: (String | FunctionButtom | ButtonSettings)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDom(value: ButtonDomSettings): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
