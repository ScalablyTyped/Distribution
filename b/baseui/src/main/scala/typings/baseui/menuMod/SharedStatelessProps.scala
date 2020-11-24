package typings.baseui.menuMod

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedStatelessProps extends js.Object {
  
  var activedescendantId: js.UndefOr[String] = js.native
  
  var focusMenu: js.UndefOr[js.Function1[/* event */ FocusEvent | MouseEvent | KeyboardEvent, _]] = js.native
  
  var getRequiredItemProps: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, RenderItemProps]] = js.native
  
  var handleKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, _]] = js.native
  
  var highlightedIndex: js.UndefOr[Double] = js.native
  
  var isFocused: js.UndefOr[Boolean] = js.native
  
  var items: ItemsT = js.native
  
  var noResultsMsg: js.UndefOr[ReactNode] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* event */ typings.react.mod.FocusEvent[HTMLElement], _]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* event */ typings.react.mod.FocusEvent[HTMLElement], _]] = js.native
  
  var rootRef: js.UndefOr[Ref[_]] = js.native
  
  var unfocusMenu: js.UndefOr[js.Function0[_]] = js.native
}
object SharedStatelessProps {
  
  @scala.inline
  def apply(items: ItemsT): SharedStatelessProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStatelessProps]
  }
  
  @scala.inline
  implicit class SharedStatelessPropsOps[Self <: SharedStatelessProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: ItemT*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: ItemsT): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivedescendantId(value: String): Self = this.set("activedescendantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivedescendantId: Self = this.set("activedescendantId", js.undefined)
    
    @scala.inline
    def setFocusMenu(value: /* event */ FocusEvent | MouseEvent | KeyboardEvent => _): Self = this.set("focusMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusMenu: Self = this.set("focusMenu", js.undefined)
    
    @scala.inline
    def setGetRequiredItemProps(value: (/* item */ js.Any, /* index */ Double) => RenderItemProps): Self = this.set("getRequiredItemProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetRequiredItemProps: Self = this.set("getRequiredItemProps", js.undefined)
    
    @scala.inline
    def setHandleKeyDown(value: /* event */ KeyboardEvent => _): Self = this.set("handleKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleKeyDown: Self = this.set("handleKeyDown", js.undefined)
    
    @scala.inline
    def setHighlightedIndex(value: Double): Self = this.set("highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightedIndex: Self = this.set("highlightedIndex", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    
    @scala.inline
    def setNoResultsMsg(value: ReactNode): Self = this.set("noResultsMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResultsMsg: Self = this.set("noResultsMsg", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* event */ typings.react.mod.FocusEvent[HTMLElement] => _): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* event */ typings.react.mod.FocusEvent[HTMLElement] => _): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setRootRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("rootRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRootRef(value: Ref[_]): Self = this.set("rootRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootRef: Self = this.set("rootRef", js.undefined)
    
    @scala.inline
    def setRootRefNull: Self = this.set("rootRef", null)
    
    @scala.inline
    def setUnfocusMenu(value: () => _): Self = this.set("unfocusMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUnfocusMenu: Self = this.set("unfocusMenu", js.undefined)
  }
}
