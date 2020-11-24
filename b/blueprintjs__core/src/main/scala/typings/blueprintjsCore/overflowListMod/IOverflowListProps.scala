package typings.blueprintjsCore.overflowListMod

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactChild
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverflowListProps[T] extends IProps {
  
  /**
    * Which direction the items should collapse from: start or end of the
    * children. This also determines whether `overflowRenderer` appears before
    * (`START`) or after (`END`) the visible items.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[Boundary] = js.native
  
  /**
    * All items to display in the list. Items that do not fit in the container
    * will be rendered in the overflow instead.
    */
  var items: js.Array[T] = js.native
  
  /**
    * The minimum number of visible items that should never collapse into the
    * overflow menu, regardless of DOM dimensions.
    * @default 0
    */
  var minVisibleItems: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, all parent DOM elements of the container will also be
    * observed. If changes to a parent's size is detected, the overflow will be
    * recalculated.
    *
    * Only enable this prop if the overflow should be recalculated when a
    * parent element resizes in a way that does not also cause the
    * `OverflowList` to resize.
    * @default false
    */
  var observeParents: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback invoked when the overflowed items change. This is called once
    * after the DOM has settled, rather that on every intermediate change. It
    * is not invoked if resizing produces an unchanged overflow state.
    */
  var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[T], Unit]] = js.native
  
  /**
    * Callback invoked to render the overflowed items. Unlike
    * `visibleItemRenderer`, this prop is invoked once with all items that do
    * not fit in the container.
    *
    * Typical use cases for this prop will put overflowed items in a dropdown
    * menu or display a "+X items" label.
    */
  def overflowRenderer(overflowItems: js.Array[T]): ReactNode = js.native
  
  /** CSS properties to apply to the root element. */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * HTML tag name for the container element.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  
  /**
    * Callback invoked to render each visible item.
    * Remember to set a `key` on the rendered element!
    */
  def visibleItemRenderer(item: T, index: Double): ReactChild = js.native
}
object IOverflowListProps {
  
  @scala.inline
  def apply[T](
    items: js.Array[T],
    overflowRenderer: js.Array[T] => ReactNode,
    visibleItemRenderer: (T, Double) => ReactChild
  ): IOverflowListProps[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], overflowRenderer = js.Any.fromFunction1(overflowRenderer), visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    __obj.asInstanceOf[IOverflowListProps[T]]
  }
  
  @scala.inline
  implicit class IOverflowListPropsOps[Self <: IOverflowListProps[_], T] (val x: Self with IOverflowListProps[T]) extends AnyVal {
    
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
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowRenderer(value: js.Array[T] => ReactNode): Self = this.set("overflowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisibleItemRenderer(value: (T, Double) => ReactChild): Self = this.set("visibleItemRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapseFrom(value: Boundary): Self = this.set("collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseFrom: Self = this.set("collapseFrom", js.undefined)
    
    @scala.inline
    def setMinVisibleItems(value: Double): Self = this.set("minVisibleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVisibleItems: Self = this.set("minVisibleItems", js.undefined)
    
    @scala.inline
    def setObserveParents(value: Boolean): Self = this.set("observeParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObserveParents: Self = this.set("observeParents", js.undefined)
    
    @scala.inline
    def setOnOverflow(value: /* overflowItems */ js.Array[T] => Unit): Self = this.set("onOverflow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOverflow: Self = this.set("onOverflow", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
}
