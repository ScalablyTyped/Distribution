package typings.blueprintjsCore.anon

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactChild
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/overflow-list/overflowList.IOverflowListProps<any>> */
trait PartialIOverflowListPropsClassName extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var minVisibleItems: js.UndefOr[Double] = js.undefined
  
  var observeParents: js.UndefOr[Boolean] = js.undefined
  
  var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[js.Any], Unit]] = js.undefined
  
  var overflowRenderer: js.UndefOr[js.Function1[/* overflowItems */ js.Array[js.Any], ReactNode]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.undefined
  
  var visibleItemRenderer: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, ReactChild]] = js.undefined
}
object PartialIOverflowListPropsClassName {
  
  inline def apply(): PartialIOverflowListPropsClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOverflowListPropsClassName]
  }
  
  extension [Self <: PartialIOverflowListPropsClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
    
    inline def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
    
    inline def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setMinVisibleItems(value: Double): Self = StObject.set(x, "minVisibleItems", value.asInstanceOf[js.Any])
    
    inline def setMinVisibleItemsUndefined: Self = StObject.set(x, "minVisibleItems", js.undefined)
    
    inline def setObserveParents(value: Boolean): Self = StObject.set(x, "observeParents", value.asInstanceOf[js.Any])
    
    inline def setObserveParentsUndefined: Self = StObject.set(x, "observeParents", js.undefined)
    
    inline def setOnOverflow(value: /* overflowItems */ js.Array[js.Any] => Unit): Self = StObject.set(x, "onOverflow", js.Any.fromFunction1(value))
    
    inline def setOnOverflowUndefined: Self = StObject.set(x, "onOverflow", js.undefined)
    
    inline def setOverflowRenderer(value: /* overflowItems */ js.Array[js.Any] => ReactNode): Self = StObject.set(x, "overflowRenderer", js.Any.fromFunction1(value))
    
    inline def setOverflowRendererUndefined: Self = StObject.set(x, "overflowRenderer", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    inline def setVisibleItemRenderer(value: (/* item */ js.Any, /* index */ Double) => ReactChild): Self = StObject.set(x, "visibleItemRenderer", js.Any.fromFunction2(value))
    
    inline def setVisibleItemRendererUndefined: Self = StObject.set(x, "visibleItemRenderer", js.undefined)
  }
}
