package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorSwitchChoice extends StObject {
  
  /**
    * True to make a line
    */
  var div: Boolean
  
  var icon: Icon
  
  var id: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var order: js.UndefOr[Double] = js.undefined
  
  var selected: js.UndefOr[Boolean | PseudoBoolean] = js.undefined
}
object SelectorSwitchChoice {
  
  inline def apply(div: Boolean, icon: Icon, name: String): SelectorSwitchChoice = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorSwitchChoice]
  }
  
  extension [Self <: SelectorSwitchChoice](x: Self) {
    
    inline def setDiv(value: Boolean): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setSelected(value: Boolean | PseudoBoolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
