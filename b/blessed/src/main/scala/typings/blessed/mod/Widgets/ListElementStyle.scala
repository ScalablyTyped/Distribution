package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListElementStyle extends StObject {
  
  var item: js.UndefOr[Any] = js.undefined
  
  var selected: js.UndefOr[Any] = js.undefined
}
object ListElementStyle {
  
  inline def apply(): ListElementStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListElementStyle]
  }
  
  extension [Self <: ListElementStyle](x: Self) {
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setSelected(value: Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
