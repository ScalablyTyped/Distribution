package typings.blueprintjsCore.anon

import typings.blueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactChild
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/overflow-list/overflowList.OverflowListProps<any>> */
trait PartialOverflowListPropsa extends StObject {
  
  var alwaysRenderOverflow: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  
  var items: js.UndefOr[js.Array[Any]] = js.undefined
  
  var minVisibleItems: js.UndefOr[Double] = js.undefined
  
  var observeParents: js.UndefOr[Boolean] = js.undefined
  
  var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[Any], Unit]] = js.undefined
  
  var overflowRenderer: js.UndefOr[js.Function1[/* overflowItems */ js.Array[Any], ReactNode]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
  ] = js.undefined
  
  var visibleItemRenderer: js.UndefOr[js.Function2[/* item */ Any, /* index */ Double, ReactChild]] = js.undefined
}
object PartialOverflowListPropsa {
  
  inline def apply(): PartialOverflowListPropsa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverflowListPropsa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOverflowListPropsa] (val x: Self) extends AnyVal {
    
    inline def setAlwaysRenderOverflow(value: Boolean): Self = StObject.set(x, "alwaysRenderOverflow", value.asInstanceOf[js.Any])
    
    inline def setAlwaysRenderOverflowUndefined: Self = StObject.set(x, "alwaysRenderOverflow", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
    
    inline def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMinVisibleItems(value: Double): Self = StObject.set(x, "minVisibleItems", value.asInstanceOf[js.Any])
    
    inline def setMinVisibleItemsUndefined: Self = StObject.set(x, "minVisibleItems", js.undefined)
    
    inline def setObserveParents(value: Boolean): Self = StObject.set(x, "observeParents", value.asInstanceOf[js.Any])
    
    inline def setObserveParentsUndefined: Self = StObject.set(x, "observeParents", js.undefined)
    
    inline def setOnOverflow(value: /* overflowItems */ js.Array[Any] => Unit): Self = StObject.set(x, "onOverflow", js.Any.fromFunction1(value))
    
    inline def setOnOverflowUndefined: Self = StObject.set(x, "onOverflow", js.undefined)
    
    inline def setOverflowRenderer(value: /* overflowItems */ js.Array[Any] => ReactNode): Self = StObject.set(x, "overflowRenderer", js.Any.fromFunction1(value))
    
    inline def setOverflowRendererUndefined: Self = StObject.set(x, "overflowRenderer", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTagName(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
    ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    inline def setVisibleItemRenderer(value: (/* item */ Any, /* index */ Double) => ReactChild): Self = StObject.set(x, "visibleItemRenderer", js.Any.fromFunction2(value))
    
    inline def setVisibleItemRendererUndefined: Self = StObject.set(x, "visibleItemRenderer", js.undefined)
  }
}
