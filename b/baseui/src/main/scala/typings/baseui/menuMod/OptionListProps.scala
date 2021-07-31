package typings.baseui.menuMod

import typings.baseui.anon.ChildMenuPopover
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionListProps
  extends StObject
     with BaseMenuPropsT {
  
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.undefined
  
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, ReactNode]] = js.undefined
  
  def getItemLabel(item: js.Any): ReactNode
  
  var item: js.Any
  
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent, js.Any]] = js.undefined
  
  var overrides: js.UndefOr[ChildMenuPopover] = js.undefined
  
  var renderHrefAsAnchor: js.UndefOr[Boolean] = js.undefined
  
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var size: js.UndefOr[default_ | compact] = js.undefined
}
object OptionListProps {
  
  @scala.inline
  def apply(getItemLabel: js.Any => ReactNode, item: js.Any): OptionListProps = {
    val __obj = js.Dynamic.literal(getItemLabel = js.Any.fromFunction1(getItemLabel), item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionListProps]
  }
  
  @scala.inline
  implicit class OptionListPropsMutableBuilder[Self <: OptionListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isFocusedUndefined: Self = StObject.set(x, "$isFocused", js.undefined)
    
    @scala.inline
    def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isHighlightedUndefined: Self = StObject.set(x, "$isHighlighted", js.undefined)
    
    @scala.inline
    def setGetChildMenu(value: /* item */ js.Any => ReactNode): Self = StObject.set(x, "getChildMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildMenuUndefined: Self = StObject.set(x, "getChildMenu", js.undefined)
    
    @scala.inline
    def setGetItemLabel(value: js.Any => ReactNode): Self = StObject.set(x, "getItemLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseEnter(value: /* event */ MouseEvent => js.Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOverrides(value: ChildMenuPopover): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setRenderHrefAsAnchor(value: Boolean): Self = StObject.set(x, "renderHrefAsAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderHrefAsAnchorUndefined: Self = StObject.set(x, "renderHrefAsAnchor", js.undefined)
    
    @scala.inline
    def setResetMenu(value: () => Unit): Self = StObject.set(x, "resetMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetMenuUndefined: Self = StObject.set(x, "resetMenu", js.undefined)
    
    @scala.inline
    def setSize(value: default_ | compact): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
