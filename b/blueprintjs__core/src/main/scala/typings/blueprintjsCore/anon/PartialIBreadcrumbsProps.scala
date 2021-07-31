package typings.blueprintjsCore.anon

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typings.blueprintjsCore.popoverMod.IPopoverProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumbs.IBreadcrumbsProps> */
trait PartialIBreadcrumbsProps extends StObject {
  
  var breadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, Element]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  
  var currentBreadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, Element]] = js.undefined
  
  var items: js.UndefOr[js.Array[IBreadcrumbProps]] = js.undefined
  
  var minVisibleItems: js.UndefOr[Double] = js.undefined
  
  var overflowListProps: js.UndefOr[PartialIOverflowListProps] = js.undefined
  
  var popoverProps: js.UndefOr[IPopoverProps] = js.undefined
}
object PartialIBreadcrumbsProps {
  
  @scala.inline
  def apply(): PartialIBreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIBreadcrumbsProps]
  }
  
  @scala.inline
  implicit class PartialIBreadcrumbsPropsMutableBuilder[Self <: PartialIBreadcrumbsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreadcrumbRenderer(value: /* props */ IBreadcrumbProps => Element): Self = StObject.set(x, "breadcrumbRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBreadcrumbRendererUndefined: Self = StObject.set(x, "breadcrumbRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
    
    @scala.inline
    def setCurrentBreadcrumbRenderer(value: /* props */ IBreadcrumbProps => Element): Self = StObject.set(x, "currentBreadcrumbRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentBreadcrumbRendererUndefined: Self = StObject.set(x, "currentBreadcrumbRenderer", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[IBreadcrumbProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: IBreadcrumbProps*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMinVisibleItems(value: Double): Self = StObject.set(x, "minVisibleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVisibleItemsUndefined: Self = StObject.set(x, "minVisibleItems", js.undefined)
    
    @scala.inline
    def setOverflowListProps(value: PartialIOverflowListProps): Self = StObject.set(x, "overflowListProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowListPropsUndefined: Self = StObject.set(x, "overflowListProps", js.undefined)
    
    @scala.inline
    def setPopoverProps(value: IPopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
  }
}
