package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.dialog.select()
trait DialogSelectConfig extends StObject {
  
  var buttons: js.UndefOr[js.Array[Any]] = js.undefined
  
  // TODO interface for buttons
  var list: js.Array[DialogSelectConfigItem]
  
  var message: js.UndefOr[String] = js.undefined
  
  var multiselect: js.UndefOr[Boolean] = js.undefined
  
  var quickfind: js.UndefOr[Boolean] = js.undefined
  
  var title: String
}
object DialogSelectConfig {
  
  inline def apply(list: js.Array[DialogSelectConfigItem], title: String): DialogSelectConfig = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectConfig]
  }
  
  extension [Self <: DialogSelectConfig](x: Self) {
    
    inline def setButtons(value: js.Array[Any]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: Any*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setList(value: js.Array[DialogSelectConfigItem]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListVarargs(value: DialogSelectConfigItem*): Self = StObject.set(x, "list", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    inline def setQuickfind(value: Boolean): Self = StObject.set(x, "quickfind", value.asInstanceOf[js.Any])
    
    inline def setQuickfindUndefined: Self = StObject.set(x, "quickfind", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
