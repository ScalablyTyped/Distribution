package typings.blueprintjsCore

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.anon.PartialIOverflowListPropsClassName
import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactChild
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overflowListMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList")
  @js.native
  class OverflowList[T] protected ()
    extends Component[IOverflowListProps[T], IOverflowListState[T], js.Any] {
    def this(props: IOverflowListProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IOverflowListProps[T], context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MOverflowList(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MOverflowList(prevProps: IOverflowListProps[T], prevState: IOverflowListState[T]): Unit = js.native
    
    var maybeRenderOverflow: js.Any = js.native
    
    /** A cache containing the widths of all elements being observed to detect growing/shrinking */
    var previousWidths: js.Any = js.native
    
    var repartition: js.Any = js.native
    
    var resize: js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MOverflowList(_nextProps: IOverflowListProps[T], nextState: IOverflowListState[T]): Boolean = js.native
    
    var spacer: js.Any = js.native
  }
  /* static members */
  object OverflowList {
    
    @JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList.defaultProps")
    @js.native
    def defaultProps: PartialIOverflowListPropsClassName = js.native
    @scala.inline
    def defaultProps_=(x: PartialIOverflowListPropsClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList.ofType")
    @js.native
    def ofType[U](): Instantiable1[/* props */ IOverflowListProps[U], OverflowList[U]] = js.native
  }
  
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
    implicit class IOverflowListPropsMutableBuilder[Self <: IOverflowListProps[_], T] (val x: Self with IOverflowListProps[T]) extends AnyVal {
      
      @scala.inline
      def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMinVisibleItems(value: Double): Self = StObject.set(x, "minVisibleItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVisibleItemsUndefined: Self = StObject.set(x, "minVisibleItems", js.undefined)
      
      @scala.inline
      def setObserveParents(value: Boolean): Self = StObject.set(x, "observeParents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserveParentsUndefined: Self = StObject.set(x, "observeParents", js.undefined)
      
      @scala.inline
      def setOnOverflow(value: /* overflowItems */ js.Array[T] => Unit): Self = StObject.set(x, "onOverflow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOverflowUndefined: Self = StObject.set(x, "onOverflow", js.undefined)
      
      @scala.inline
      def setOverflowRenderer(value: js.Array[T] => ReactNode): Self = StObject.set(x, "overflowRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setVisibleItemRenderer(value: (T, Double) => ReactChild): Self = StObject.set(x, "visibleItemRenderer", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait IOverflowListState[T] extends StObject {
    
    /** Length of last overflow to dedupe `onOverflow` calls during smooth resizing. */
    var lastOverflowCount: Double = js.native
    
    var overflow: js.Array[T] = js.native
    
    var visible: js.Array[T] = js.native
  }
  object IOverflowListState {
    
    @scala.inline
    def apply[T](lastOverflowCount: Double, overflow: js.Array[T], visible: js.Array[T]): IOverflowListState[T] = {
      val __obj = js.Dynamic.literal(lastOverflowCount = lastOverflowCount.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverflowListState[T]]
    }
    
    @scala.inline
    implicit class IOverflowListStateMutableBuilder[Self <: IOverflowListState[_], T] (val x: Self with IOverflowListState[T]) extends AnyVal {
      
      @scala.inline
      def setLastOverflowCount(value: Double): Self = StObject.set(x, "lastOverflowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflow(value: js.Array[T]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowVarargs(value: T*): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      @scala.inline
      def setVisible(value: js.Array[T]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleVarargs(value: T*): Self = StObject.set(x, "visible", js.Array(value :_*))
    }
  }
}
