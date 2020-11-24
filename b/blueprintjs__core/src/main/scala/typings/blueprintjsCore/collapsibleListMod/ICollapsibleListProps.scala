package typings.blueprintjsCore.collapsibleListMod

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.menuItemMod.IMenuItemProps
import typings.blueprintjsCore.popoverMod.IPopoverProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollapsibleListProps extends IProps {
  
  /**
    * Which direction the items should collapse from: start or end of the children.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[Boundary] = js.native
  
  /**
    * Props to pass to the dropdown.
    */
  var dropdownProps: js.UndefOr[IPopoverProps] = js.native
  
  /**
    * Element to render as dropdown target with `CLICK` interaction to show collapsed menu.
    */
  var dropdownTarget: Element = js.native
  
  /**
    * CSS class names to add to `<li>` tags containing each visible item and the dropdown.
    */
  var visibleItemClassName: js.UndefOr[String] = js.native
  
  /**
    * Exact number of visible items.
    * @default 3
    */
  var visibleItemCount: js.UndefOr[Double] = js.native
  
  /**
    * Callback invoked to render each visible item. The item will be wrapped in an `li` with
    * the optional `visibleItemClassName` prop.
    */
  def visibleItemRenderer(props: IMenuItemProps, index: Double): Element = js.native
}
object ICollapsibleListProps {
  
  @scala.inline
  def apply(dropdownTarget: Element, visibleItemRenderer: (IMenuItemProps, Double) => Element): ICollapsibleListProps = {
    val __obj = js.Dynamic.literal(dropdownTarget = dropdownTarget.asInstanceOf[js.Any], visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    __obj.asInstanceOf[ICollapsibleListProps]
  }
  
  @scala.inline
  implicit class ICollapsibleListPropsOps[Self <: ICollapsibleListProps] (val x: Self) extends AnyVal {
    
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
    def setDropdownTarget(value: Element): Self = this.set("dropdownTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleItemRenderer(value: (IMenuItemProps, Double) => Element): Self = this.set("visibleItemRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapseFrom(value: Boundary): Self = this.set("collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseFrom: Self = this.set("collapseFrom", js.undefined)
    
    @scala.inline
    def setDropdownProps(value: IPopoverProps): Self = this.set("dropdownProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownProps: Self = this.set("dropdownProps", js.undefined)
    
    @scala.inline
    def setVisibleItemClassName(value: String): Self = this.set("visibleItemClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleItemClassName: Self = this.set("visibleItemClassName", js.undefined)
    
    @scala.inline
    def setVisibleItemCount(value: Double): Self = this.set("visibleItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleItemCount: Self = this.set("visibleItemCount", js.undefined)
  }
}
