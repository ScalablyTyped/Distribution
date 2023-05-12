package typings.blessed.mod.Widgets

import typings.blessed.mod.Widgets.Types.TStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListElementStyle
  extends StObject
     with TStyle {
  
  var item: js.UndefOr[Any] = js.undefined
  
  var selected: js.UndefOr[Any] = js.undefined
}
object ListElementStyle {
  
  inline def apply(): ListElementStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListElementStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListElementStyle] (val x: Self) extends AnyVal {
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setSelected(value: Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
