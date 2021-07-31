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
  
  @scala.inline
  def apply(): RenderItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderItemProps]
  }
  
  @scala.inline
  implicit class RenderItemPropsMutableBuilder[Self <: RenderItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    @scala.inline
    def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHighlightedUndefined: Self = StObject.set(x, "isHighlighted", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setResetMenu(value: () => js.Any): Self = StObject.set(x, "resetMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetMenuUndefined: Self = StObject.set(x, "resetMenu", js.undefined)
  }
}
