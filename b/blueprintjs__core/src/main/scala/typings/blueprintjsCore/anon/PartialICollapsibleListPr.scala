package typings.blueprintjsCore.anon

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.menuItemMod.IMenuItemProps
import typings.blueprintjsCore.popoverMod.IPopoverProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/collapsible-list/collapsibleList.ICollapsibleListProps> */
@js.native
trait PartialICollapsibleListPr extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var collapseFrom: js.UndefOr[Boundary] = js.native
  
  var dropdownProps: js.UndefOr[IPopoverProps] = js.native
  
  var dropdownTarget: js.UndefOr[Element] = js.native
  
  var visibleItemClassName: js.UndefOr[String] = js.native
  
  var visibleItemCount: js.UndefOr[Double] = js.native
  
  var visibleItemRenderer: js.UndefOr[js.Function2[/* props */ IMenuItemProps, /* index */ Double, Element]] = js.native
}
object PartialICollapsibleListPr {
  
  @scala.inline
  def apply(): PartialICollapsibleListPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialICollapsibleListPr]
  }
  
  @scala.inline
  implicit class PartialICollapsibleListPrOps[Self <: PartialICollapsibleListPr] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCollapseFrom(value: Boundary): Self = this.set("collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseFrom: Self = this.set("collapseFrom", js.undefined)
    
    @scala.inline
    def setDropdownProps(value: IPopoverProps): Self = this.set("dropdownProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownProps: Self = this.set("dropdownProps", js.undefined)
    
    @scala.inline
    def setDropdownTarget(value: Element): Self = this.set("dropdownTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownTarget: Self = this.set("dropdownTarget", js.undefined)
    
    @scala.inline
    def setVisibleItemClassName(value: String): Self = this.set("visibleItemClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleItemClassName: Self = this.set("visibleItemClassName", js.undefined)
    
    @scala.inline
    def setVisibleItemCount(value: Double): Self = this.set("visibleItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleItemCount: Self = this.set("visibleItemCount", js.undefined)
    
    @scala.inline
    def setVisibleItemRenderer(value: (/* props */ IMenuItemProps, /* index */ Double) => Element): Self = this.set("visibleItemRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteVisibleItemRenderer: Self = this.set("visibleItemRenderer", js.undefined)
  }
}
