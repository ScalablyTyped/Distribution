package typings.blueprintjsCore.anon

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.menuItemMod.IMenuItemProps
import typings.blueprintjsCore.popoverMod.IPopoverProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/collapsible-list/collapsibleList.ICollapsibleListProps> */
@js.native
trait PartialICollapsibleListPr extends StObject {
  
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
  implicit class PartialICollapsibleListPrMutableBuilder[Self <: PartialICollapsibleListPr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
    
    @scala.inline
    def setDropdownProps(value: IPopoverProps): Self = StObject.set(x, "dropdownProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownPropsUndefined: Self = StObject.set(x, "dropdownProps", js.undefined)
    
    @scala.inline
    def setDropdownTarget(value: Element): Self = StObject.set(x, "dropdownTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownTargetUndefined: Self = StObject.set(x, "dropdownTarget", js.undefined)
    
    @scala.inline
    def setVisibleItemClassName(value: String): Self = StObject.set(x, "visibleItemClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleItemClassNameUndefined: Self = StObject.set(x, "visibleItemClassName", js.undefined)
    
    @scala.inline
    def setVisibleItemCount(value: Double): Self = StObject.set(x, "visibleItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleItemCountUndefined: Self = StObject.set(x, "visibleItemCount", js.undefined)
    
    @scala.inline
    def setVisibleItemRenderer(value: (/* props */ IMenuItemProps, /* index */ Double) => Element): Self = StObject.set(x, "visibleItemRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisibleItemRendererUndefined: Self = StObject.set(x, "visibleItemRenderer", js.undefined)
  }
}
