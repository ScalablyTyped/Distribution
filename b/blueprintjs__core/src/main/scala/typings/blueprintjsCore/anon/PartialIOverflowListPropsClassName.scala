package typings.blueprintjsCore.anon

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactChild
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/overflow-list/overflowList.IOverflowListProps<any>> */
@js.native
trait PartialIOverflowListPropsClassName extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var collapseFrom: js.UndefOr[Boundary] = js.native
  
  var items: js.UndefOr[js.Array[_]] = js.native
  
  var minVisibleItems: js.UndefOr[Double] = js.native
  
  var observeParents: js.UndefOr[Boolean] = js.native
  
  var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[_], Unit]] = js.native
  
  var overflowRenderer: js.UndefOr[js.Function1[/* overflowItems */ js.Array[_], ReactNode]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  
  var visibleItemRenderer: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, ReactChild]] = js.native
}
object PartialIOverflowListPropsClassName {
  
  @scala.inline
  def apply(): PartialIOverflowListPropsClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOverflowListPropsClassName]
  }
  
  @scala.inline
  implicit class PartialIOverflowListPropsClassNameMutableBuilder[Self <: PartialIOverflowListPropsClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMinVisibleItems(value: Double): Self = StObject.set(x, "minVisibleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVisibleItemsUndefined: Self = StObject.set(x, "minVisibleItems", js.undefined)
    
    @scala.inline
    def setObserveParents(value: Boolean): Self = StObject.set(x, "observeParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveParentsUndefined: Self = StObject.set(x, "observeParents", js.undefined)
    
    @scala.inline
    def setOnOverflow(value: /* overflowItems */ js.Array[_] => Unit): Self = StObject.set(x, "onOverflow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOverflowUndefined: Self = StObject.set(x, "onOverflow", js.undefined)
    
    @scala.inline
    def setOverflowRenderer(value: /* overflowItems */ js.Array[_] => ReactNode): Self = StObject.set(x, "overflowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOverflowRendererUndefined: Self = StObject.set(x, "overflowRenderer", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    @scala.inline
    def setVisibleItemRenderer(value: (/* item */ js.Any, /* index */ Double) => ReactChild): Self = StObject.set(x, "visibleItemRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisibleItemRendererUndefined: Self = StObject.set(x, "visibleItemRenderer", js.undefined)
  }
}
