package typings.blueprintjsCore

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.anon.PartialOverflowListPropsa
import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactChild
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overflowListMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList")
  @js.native
  open class OverflowList[T] protected () extends Component[OverflowListProps[T], IOverflowListState[T], Any] {
    def this(props: OverflowListProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OverflowListProps[T], context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MOverflowList(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MOverflowList(prevProps: OverflowListProps[T], prevState: IOverflowListState[T]): Unit = js.native
    
    /* private */ var defaultChopSize: Any = js.native
    
    /* private */ var isFirstPartitionCycle: Any = js.native
    
    /* private */ var maybeRenderOverflow: Any = js.native
    
    /* private */ var repartition: Any = js.native
    
    /* private */ var resize: Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MOverflowList(nextProps: OverflowListProps[T], nextState: IOverflowListState[T]): Boolean = js.native
    
    /* private */ var spacer: Any = js.native
  }
  /* static members */
  object OverflowList {
    
    @JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList.defaultProps")
    @js.native
    def defaultProps: PartialOverflowListPropsa = js.native
    inline def defaultProps_=(x: PartialOverflowListPropsa): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def ofType[U](): Instantiable1[/* props */ OverflowListProps[U], OverflowList[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ OverflowListProps[U], OverflowList[U]]]
  }
  
  trait IOverflowListProps[T]
    extends StObject
       with IProps {
    
    /**
      * Whether to force the overflowRenderer to always be called, even if there are zero items
      * overflowing. This may be useful, for example, if your overflow renderer contains a Popover
      * which you do not want to close as the list is resized.
      *
      * @default false
      */
    var alwaysRenderOverflow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Which direction the items should collapse from: start or end of the
      * children. This also determines whether `overflowRenderer` appears before
      * (`START`) or after (`END`) the visible items.
      *
      * @default Boundary.START
      */
    var collapseFrom: js.UndefOr[Boundary] = js.undefined
    
    /**
      * All items to display in the list. Items that do not fit in the container
      * will be rendered in the overflow instead.
      */
    var items: js.Array[T]
    
    /**
      * The minimum number of visible items that should never collapse into the
      * overflow menu, regardless of DOM dimensions.
      *
      * @default 0
      */
    var minVisibleItems: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, all parent DOM elements of the container will also be
      * observed. If changes to a parent's size is detected, the overflow will be
      * recalculated.
      *
      * Only enable this prop if the overflow should be recalculated when a
      * parent element resizes in a way that does not also cause the
      * `OverflowList` to resize.
      *
      * @default false
      */
    var observeParents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback invoked when the overflowed items change. This is called once
      * after the DOM has settled, rather that on every intermediate change. It
      * is not invoked if resizing produces an unchanged overflow state.
      */
    var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[T], Unit]] = js.undefined
    
    /**
      * Callback invoked to render the overflowed items. Unlike
      * `visibleItemRenderer`, this prop is invoked once with all items that do
      * not fit in the container.
      *
      * Typical use cases for this prop will put overflowed items in a dropdown
      * menu or display a "+X items" label.
      */
    def overflowRenderer(overflowItems: js.Array[T]): ReactNode
    
    /** CSS properties to apply to the root element. */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * HTML tag name for the container element.
      *
      * @default "div"
      */
    var tagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ Any
      ] = js.undefined
    
    /**
      * Callback invoked to render each visible item.
      * Remember to set a `key` on the rendered element!
      */
    def visibleItemRenderer(item: T, index: Double): ReactChild
  }
  object IOverflowListProps {
    
    inline def apply[T](
      items: js.Array[T],
      overflowRenderer: js.Array[T] => ReactNode,
      visibleItemRenderer: (T, Double) => ReactChild
    ): IOverflowListProps[T] = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], overflowRenderer = js.Any.fromFunction1(overflowRenderer), visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
      __obj.asInstanceOf[IOverflowListProps[T]]
    }
    
    extension [Self <: IOverflowListProps[?], T](x: Self & IOverflowListProps[T]) {
      
      inline def setAlwaysRenderOverflow(value: Boolean): Self = StObject.set(x, "alwaysRenderOverflow", value.asInstanceOf[js.Any])
      
      inline def setAlwaysRenderOverflowUndefined: Self = StObject.set(x, "alwaysRenderOverflow", js.undefined)
      
      inline def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
      
      inline def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMinVisibleItems(value: Double): Self = StObject.set(x, "minVisibleItems", value.asInstanceOf[js.Any])
      
      inline def setMinVisibleItemsUndefined: Self = StObject.set(x, "minVisibleItems", js.undefined)
      
      inline def setObserveParents(value: Boolean): Self = StObject.set(x, "observeParents", value.asInstanceOf[js.Any])
      
      inline def setObserveParentsUndefined: Self = StObject.set(x, "observeParents", js.undefined)
      
      inline def setOnOverflow(value: /* overflowItems */ js.Array[T] => Unit): Self = StObject.set(x, "onOverflow", js.Any.fromFunction1(value))
      
      inline def setOnOverflowUndefined: Self = StObject.set(x, "onOverflow", js.undefined)
      
      inline def setOverflowRenderer(value: js.Array[T] => ReactNode): Self = StObject.set(x, "overflowRenderer", js.Any.fromFunction1(value))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setVisibleItemRenderer(value: (T, Double) => ReactChild): Self = StObject.set(x, "visibleItemRenderer", js.Any.fromFunction2(value))
    }
  }
  
  trait IOverflowListState[T] extends StObject {
    
    /** Pointer for the binary search algorithm used to find the finished non-overflowing state */
    var chopSize: Double
    
    var lastChopSize: Double | Null
    
    /** Length of last overflow to dedupe `onOverflow` calls during smooth resizing. */
    var lastOverflowCount: Double
    
    var overflow: js.Array[T]
    
    /** Whether repartitioning is still active. An overflow can take several frames to settle. */
    var repartitioning: Boolean
    
    var visible: js.Array[T]
  }
  object IOverflowListState {
    
    inline def apply[T](
      chopSize: Double,
      lastOverflowCount: Double,
      overflow: js.Array[T],
      repartitioning: Boolean,
      visible: js.Array[T]
    ): IOverflowListState[T] = {
      val __obj = js.Dynamic.literal(chopSize = chopSize.asInstanceOf[js.Any], lastOverflowCount = lastOverflowCount.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], repartitioning = repartitioning.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], lastChopSize = null)
      __obj.asInstanceOf[IOverflowListState[T]]
    }
    
    extension [Self <: IOverflowListState[?], T](x: Self & IOverflowListState[T]) {
      
      inline def setChopSize(value: Double): Self = StObject.set(x, "chopSize", value.asInstanceOf[js.Any])
      
      inline def setLastChopSize(value: Double): Self = StObject.set(x, "lastChopSize", value.asInstanceOf[js.Any])
      
      inline def setLastChopSizeNull: Self = StObject.set(x, "lastChopSize", null)
      
      inline def setLastOverflowCount(value: Double): Self = StObject.set(x, "lastOverflowCount", value.asInstanceOf[js.Any])
      
      inline def setOverflow(value: js.Array[T]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowVarargs(value: T*): Self = StObject.set(x, "overflow", js.Array(value*))
      
      inline def setRepartitioning(value: Boolean): Self = StObject.set(x, "repartitioning", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: js.Array[T]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleVarargs(value: T*): Self = StObject.set(x, "visible", js.Array(value*))
    }
  }
  
  type OverflowListProps[T] = IOverflowListProps[T]
}
