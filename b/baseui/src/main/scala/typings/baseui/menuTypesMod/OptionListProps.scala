package typings.baseui.menuTypesMod

import typings.baseui.anon.ListItem
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionListProps extends StObject {
  
  /** Is the item disabled */
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  
  /** Is the parent menu focused. determines if highlighted item should be blue or black */
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.undefined
  
  /** Renders UI in 'highlighted' state. */
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.undefined
  
  /** Is the item disabled */
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  
  /** Is the item selected */
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  
  /** Used to render a sub menu at this menu item. You'll often render another menu from this function. */
  var getChildMenu: js.UndefOr[js.Function1[/* item */ Item, ReactNode]] = js.undefined
  
  /** Function used to get the string label for each item. */
  var getItemLabel: GetItemLabelFn
  
  /** Id of the item */
  var id: js.UndefOr[String] = js.undefined
  
  /** Item to parse and render. */
  var item: Item
  
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
  
  /** Callback used to change highlighted index in stateful menu. */
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
  
  /** Callback used to change highlighted index in stateful menu. */
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
  
  var overrides: js.UndefOr[ListItem] = js.undefined
  
  /** Renders all menu content for SEO purposes regardless of menu  state */
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  var renderHrefAsAnchor: js.UndefOr[Boolean] = js.undefined
  
  /** Utility to reset menu to default state. Useful for rendering child menus. */
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Accessibility role of the item */
  var role: js.UndefOr[String] = js.undefined
  
  /** Renders UI in defined scale. */
  var size: js.UndefOr[default_ | compact] = js.undefined
}
object OptionListProps {
  
  inline def apply(getItemLabel: /* item */ Item => ReactNode, item: Item): OptionListProps = {
    val __obj = js.Dynamic.literal(getItemLabel = js.Any.fromFunction1(getItemLabel), item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionListProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionListProps] (val x: Self) extends AnyVal {
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
    
    inline def set$isFocusedUndefined: Self = StObject.set(x, "$isFocused", js.undefined)
    
    inline def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
    
    inline def set$isHighlightedUndefined: Self = StObject.set(x, "$isHighlighted", js.undefined)
    
    inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    inline def setGetChildMenu(value: /* item */ Item => ReactNode): Self = StObject.set(x, "getChildMenu", js.Any.fromFunction1(value))
    
    inline def setGetChildMenuUndefined: Self = StObject.set(x, "getChildMenu", js.undefined)
    
    inline def setGetItemLabel(value: /* item */ Item => ReactNode): Self = StObject.set(x, "getItemLabel", js.Any.fromFunction1(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseDown(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Any): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOverrides(value: ListItem): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    inline def setRenderHrefAsAnchor(value: Boolean): Self = StObject.set(x, "renderHrefAsAnchor", value.asInstanceOf[js.Any])
    
    inline def setRenderHrefAsAnchorUndefined: Self = StObject.set(x, "renderHrefAsAnchor", js.undefined)
    
    inline def setResetMenu(value: () => Unit): Self = StObject.set(x, "resetMenu", js.Any.fromFunction0(value))
    
    inline def setResetMenuUndefined: Self = StObject.set(x, "resetMenu", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSize(value: default_ | compact): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
