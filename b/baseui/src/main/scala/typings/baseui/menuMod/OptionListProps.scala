package typings.baseui.menuMod

import typings.baseui.anon.ChildMenuPopover
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionListProps extends BaseMenuPropsT {
  
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.native
  
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, ReactNode]] = js.native
  
  def getItemLabel(item: js.Any): ReactNode = js.native
  
  var item: js.Any = js.native
  
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.native
  
  var overrides: js.UndefOr[ChildMenuPopover] = js.native
  
  var renderHrefAsAnchor: js.UndefOr[Boolean] = js.native
  
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.native
  
  var size: js.UndefOr[default_ | compact] = js.native
}
object OptionListProps {
  
  @scala.inline
  def apply(getItemLabel: js.Any => ReactNode, item: js.Any): OptionListProps = {
    val __obj = js.Dynamic.literal(getItemLabel = js.Any.fromFunction1(getItemLabel), item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionListProps]
  }
  
  @scala.inline
  implicit class OptionListPropsOps[Self <: OptionListProps] (val x: Self) extends AnyVal {
    
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
    def setGetItemLabel(value: js.Any => ReactNode): Self = this.set("getItemLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isFocused(value: Boolean): Self = this.set("$isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$isFocused: Self = this.set("$isFocused", js.undefined)
    
    @scala.inline
    def set$isHighlighted(value: Boolean): Self = this.set("$isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$isHighlighted: Self = this.set("$isHighlighted", js.undefined)
    
    @scala.inline
    def setGetChildMenu(value: /* item */ js.Any => ReactNode): Self = this.set("getChildMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetChildMenu: Self = this.set("getChildMenu", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* event */ MouseEvent => _): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOverrides(value: ChildMenuPopover): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setRenderHrefAsAnchor(value: Boolean): Self = this.set("renderHrefAsAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderHrefAsAnchor: Self = this.set("renderHrefAsAnchor", js.undefined)
    
    @scala.inline
    def setResetMenu(value: () => Unit): Self = this.set("resetMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResetMenu: Self = this.set("resetMenu", js.undefined)
    
    @scala.inline
    def setSize(value: default_ | compact): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
