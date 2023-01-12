package typings.blueprintjsCore.anon

import typings.blueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typings.blueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbMod.BreadcrumbProps
import typings.blueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumbs.BreadcrumbsProps> */
trait PartialBreadcrumbsProps extends StObject {
  
  var breadcrumbRenderer: js.UndefOr[js.Function1[/* props */ BreadcrumbProps, Element]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  
  var currentBreadcrumbRenderer: js.UndefOr[js.Function1[/* props */ BreadcrumbProps, Element]] = js.undefined
  
  var items: js.UndefOr[js.Array[BreadcrumbProps]] = js.undefined
  
  var minVisibleItems: js.UndefOr[Double] = js.undefined
  
  var overflowListProps: js.UndefOr[PartialOverflowListPropsB] = js.undefined
  
  var popoverProps: js.UndefOr[IPopoverProps] = js.undefined
}
object PartialBreadcrumbsProps {
  
  inline def apply(): PartialBreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBreadcrumbsProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBreadcrumbsProps] (val x: Self) extends AnyVal {
    
    inline def setBreadcrumbRenderer(value: /* props */ BreadcrumbProps => Element): Self = StObject.set(x, "breadcrumbRenderer", js.Any.fromFunction1(value))
    
    inline def setBreadcrumbRendererUndefined: Self = StObject.set(x, "breadcrumbRenderer", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
    
    inline def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
    
    inline def setCurrentBreadcrumbRenderer(value: /* props */ BreadcrumbProps => Element): Self = StObject.set(x, "currentBreadcrumbRenderer", js.Any.fromFunction1(value))
    
    inline def setCurrentBreadcrumbRendererUndefined: Self = StObject.set(x, "currentBreadcrumbRenderer", js.undefined)
    
    inline def setItems(value: js.Array[BreadcrumbProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: BreadcrumbProps*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMinVisibleItems(value: Double): Self = StObject.set(x, "minVisibleItems", value.asInstanceOf[js.Any])
    
    inline def setMinVisibleItemsUndefined: Self = StObject.set(x, "minVisibleItems", js.undefined)
    
    inline def setOverflowListProps(value: PartialOverflowListPropsB): Self = StObject.set(x, "overflowListProps", value.asInstanceOf[js.Any])
    
    inline def setOverflowListPropsUndefined: Self = StObject.set(x, "overflowListProps", js.undefined)
    
    inline def setPopoverProps(value: IPopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
    
    inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
  }
}
