package typings.baseui.menuMod

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStatelessProps extends StObject {
  
  var activedescendantId: js.UndefOr[String] = js.undefined
  
  var focusMenu: js.UndefOr[js.Function1[/* event */ FocusEvent | MouseEvent | KeyboardEvent, js.Any]] = js.undefined
  
  var getRequiredItemProps: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, RenderItemProps]] = js.undefined
  
  var handleKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, js.Any]] = js.undefined
  
  var highlightedIndex: js.UndefOr[Double] = js.undefined
  
  var isFocused: js.UndefOr[Boolean] = js.undefined
  
  var items: ItemsT
  
  var noResultsMsg: js.UndefOr[ReactNode] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* event */ typings.react.mod.FocusEvent[HTMLElement], js.Any]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* event */ typings.react.mod.FocusEvent[HTMLElement], js.Any]] = js.undefined
  
  var rootRef: js.UndefOr[Ref[js.Any]] = js.undefined
  
  var unfocusMenu: js.UndefOr[js.Function0[js.Any]] = js.undefined
}
object SharedStatelessProps {
  
  @scala.inline
  def apply(items: ItemsT): SharedStatelessProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStatelessProps]
  }
  
  @scala.inline
  implicit class SharedStatelessPropsMutableBuilder[Self <: SharedStatelessProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivedescendantId(value: String): Self = StObject.set(x, "activedescendantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivedescendantIdUndefined: Self = StObject.set(x, "activedescendantId", js.undefined)
    
    @scala.inline
    def setFocusMenu(value: /* event */ FocusEvent | MouseEvent | KeyboardEvent => js.Any): Self = StObject.set(x, "focusMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocusMenuUndefined: Self = StObject.set(x, "focusMenu", js.undefined)
    
    @scala.inline
    def setGetRequiredItemProps(value: (/* item */ js.Any, /* index */ Double) => RenderItemProps): Self = StObject.set(x, "getRequiredItemProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRequiredItemPropsUndefined: Self = StObject.set(x, "getRequiredItemProps", js.undefined)
    
    @scala.inline
    def setHandleKeyDown(value: /* event */ KeyboardEvent => js.Any): Self = StObject.set(x, "handleKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleKeyDownUndefined: Self = StObject.set(x, "handleKeyDown", js.undefined)
    
    @scala.inline
    def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    @scala.inline
    def setItems(value: ItemsT): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ItemT*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setNoResultsMsg(value: ReactNode): Self = StObject.set(x, "noResultsMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResultsMsgUndefined: Self = StObject.set(x, "noResultsMsg", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* event */ typings.react.mod.FocusEvent[HTMLElement] => js.Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* event */ typings.react.mod.FocusEvent[HTMLElement] => js.Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setRootRef(value: Ref[js.Any]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "rootRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRootRefNull: Self = StObject.set(x, "rootRef", null)
    
    @scala.inline
    def setRootRefUndefined: Self = StObject.set(x, "rootRef", js.undefined)
    
    @scala.inline
    def setUnfocusMenu(value: () => js.Any): Self = StObject.set(x, "unfocusMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnfocusMenuUndefined: Self = StObject.set(x, "unfocusMenu", js.undefined)
  }
}
