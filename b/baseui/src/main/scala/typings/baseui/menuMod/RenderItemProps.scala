package typings.baseui.menuMod

import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderItemProps extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var isFocused: js.UndefOr[Boolean] = js.undefined
  
  var isHighlighted: js.UndefOr[Boolean] = js.undefined
  
  var ref: js.UndefOr[Ref[js.Any]] = js.undefined
  
  var resetMenu: js.UndefOr[js.Function0[js.Any]] = js.undefined
}
object RenderItemProps {
  
  inline def apply(): RenderItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderItemProps]
  }
  
  extension [Self <: RenderItemProps](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    inline def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
    
    inline def setIsHighlightedUndefined: Self = StObject.set(x, "isHighlighted", js.undefined)
    
    inline def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setResetMenu(value: () => js.Any): Self = StObject.set(x, "resetMenu", js.Any.fromFunction0(value))
    
    inline def setResetMenuUndefined: Self = StObject.set(x, "resetMenu", js.undefined)
  }
}
