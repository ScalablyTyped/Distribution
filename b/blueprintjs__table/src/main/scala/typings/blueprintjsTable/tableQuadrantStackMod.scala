package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.anon.PartialITableQuadrantStac
import typings.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.tableQuadrantMod.QuadrantType
import typings.react.mod.EventHandler
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableQuadrantStackMod {
  
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack", "TableQuadrantStack")
  @js.native
  open class TableQuadrantStack protected ()
    extends AbstractComponent2[ITableQuadrantStackProps, js.Object, js.Object] {
    def this(props: ITableQuadrantStackProps) = this()
    def this(props: ITableQuadrantStackProps, context: Any) = this()
    
    /* private */ var adjustHorizontalGuides: Any = js.native
    
    /* private */ var adjustVerticalGuides: Any = js.native
    
    /* private */ var cache: Any = js.native
    
    /* private */ var cancelPendingViewSync: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTableQuadrantStack(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTableQuadrantStack(prevProps: ITableQuadrantStackProps): Unit = js.native
    
    /** Returns true the cumulative width of all frozen columns in the grid changed. */
    /* private */ var didFrozenColumnWidthsChange: Any = js.native
    
    /** Returns true the cumulative height of all frozen rows in the grid changed. */
    /* private */ var didFrozenRowHeightsChange: Any = js.native
    
    /* private */ var emitRefs: Any = js.native
    
    /* private */ var generateQuadrantRefHandlers: Any = js.native
    
    /* private */ var getNextScrollOffset: Any = js.native
    
    /**
      * Returns the width or height of *only the grid* in the secondary quadrants
      * (TOP, LEFT, TOP_LEFT), based on the number of frozen rows and columns.
      */
    /* private */ var getSecondaryQuadrantGridSize: Any = js.native
    
    /* private */ var handleColumnResizeGuideLeft: Any = js.native
    
    /* private */ var handleColumnResizeGuideMain: Any = js.native
    
    /* private */ var handleColumnResizeGuideTop: Any = js.native
    
    /* private */ var handleColumnResizeGuideTopLeft: Any = js.native
    
    /* private */ var handleColumnsReordering: Any = js.native
    
    /* private */ var handleMainQuadrantScroll: Any = js.native
    
    /* private */ var handleRowResizeGuideLeft: Any = js.native
    
    /* private */ var handleRowResizeGuideMain: Any = js.native
    
    /* private */ var handleRowResizeGuideTop: Any = js.native
    
    /* private */ var handleRowResizeGuideTopLeft: Any = js.native
    
    /* private */ var handleRowsReordering: Any = js.native
    
    /* private */ var handleScrollOffsetChange: Any = js.native
    
    /* private */ var handleWheel: Any = js.native
    
    /* private */ var invokeColumnResizeHandler: Any = js.native
    
    /* private */ var invokeRowResizeHandler: Any = js.native
    
    /* private */ var maybeIncreaseToMinColHeaderHeight: Any = js.native
    
    /* private */ var maybeSetQuadrantMenuElementSize: Any = js.native
    
    /* private */ var maybeSetQuadrantMenuElementSizes: Any = js.native
    
    /* private */ var maybeSetQuadrantPositionOffset: Any = js.native
    
    /* private */ var maybeSetQuadrantRowHeaderSize: Any = js.native
    
    /* private */ var maybeSetQuadrantScrollOffset: Any = js.native
    
    /* private */ var maybeSetQuadrantSizes: Any = js.native
    
    /* private */ var maybesSetQuadrantRowHeaderSizes: Any = js.native
    
    /* private */ var maybesSetQuadrantSize: Any = js.native
    
    /**
      * Measures the desired height of the column header based on its tallest
      * contents.
      */
    /* private */ var measureDesiredColumnHeaderHeight: Any = js.native
    
    /**
      * Measures the desired width of the row header based on its tallest
      * contents.
      */
    /* private */ var measureDesiredRowHeaderWidth: Any = js.native
    
    /* private */ var quadrantRefHandlers: Any = js.native
    
    /* private */ var quadrantRefs: Any = js.native
    
    /* private */ var renderLeftQuadrantColumnHeader: Any = js.native
    
    /* private */ var renderLeftQuadrantMenu: Any = js.native
    
    /* private */ var renderLeftQuadrantRowHeader: Any = js.native
    
    /* private */ var renderMainQuadrantColumnHeader: Any = js.native
    
    /* private */ var renderMainQuadrantMenu: Any = js.native
    
    /* private */ var renderMainQuadrantRowHeader: Any = js.native
    
    /* private */ var renderTopLeftQuadrantColumnHeader: Any = js.native
    
    /* private */ var renderTopLeftQuadrantMenu: Any = js.native
    
    /* private */ var renderTopLeftQuadrantRowHeader: Any = js.native
    
    /* private */ var renderTopQuadrantColumnHeader: Any = js.native
    
    /* private */ var renderTopQuadrantMenu: Any = js.native
    
    /* private */ var renderTopQuadrantRowHeader: Any = js.native
    
    /**
      * Scroll the main quadrant to the specified scroll offset, keeping all other quadrants in sync.
      */
    def scrollToPosition(scrollLeft: Double, scrollTop: Double): Unit = js.native
    
    /* private */ var shouldRenderLeftQuadrants: Any = js.native
    
    /* private */ var syncQuadrantViews: Any = js.native
    
    /* private */ var syncQuadrantViewsDebounced: Any = js.native
    
    /**
      * Synchronizes quadrant sizes and scroll offsets based on the current
      * column, row, and header sizes. Useful for correcting quadrant sizes after
      * explicitly resizing columns and rows, for instance.
      *
      * Invoking this method imperatively is cheaper than providing columnWidths
      * or rowHeights array props to TableQuadrantStack and forcing it to run
      * expensive array diffs upon every update.
      */
    def synchronizeQuadrantViews(): Unit = js.native
    
    /* private */ var throttledHandleMainQuadrantScroll: Any = js.native
    
    /* private */ var throttledHandleWheel: Any = js.native
    
    /* private */ var updateScrollContainerClientSize: Any = js.native
    
    /* private */ var wasMainQuadrantScrollTriggeredByWheelEvent: Any = js.native
  }
  /* static members */
  object TableQuadrantStack {
    
    @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack", "TableQuadrantStack")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack", "TableQuadrantStack.defaultProps")
    @js.native
    def defaultProps: PartialITableQuadrantStac = js.native
    inline def defaultProps_=(x: PartialITableQuadrantStac): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITableQuadrantStackProps
    extends StObject
       with IProps {
    
    /**
      * A callback that receives a `ref` to the main quadrant's table-body element.
      */
    var bodyRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    /**
      * A callback that renders either all of or just frozen sections of the table body.
      * May return undefined if the table is not attached to the DOM yet.
      */
    def bodyRenderer(quadrantType: QuadrantType): js.UndefOr[Element] = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean): js.UndefOr[Element] = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean, showFrozenColumnsOnly: Boolean): js.UndefOr[Element] = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Unit, showFrozenColumnsOnly: Boolean): js.UndefOr[Element] = js.native
    
    /**
      * A callback that receives a `ref` to the main quadrant's column-header container.
      */
    var columnHeaderRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    /**
      * A callback that renders either all of or just the frozen section of the column header.
      * May return undefined if the table is not attached to the DOM yet.
      */
    var columnHeaderRenderer: js.UndefOr[
        js.Function4[
          /* refHandler */ Ref[HTMLDivElement], 
          /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double] | Null, Unit], 
          /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
          /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
          js.UndefOr[Element]
        ]
      ] = js.native
    
    /**
      * Flag indicating that both the column headers (if present)
      * and row headers (if present) have been rendered and mounted, including any
      * custom renderers which may affect quadrant layout measurements.
      */
    var didHeadersMount: Boolean = js.native
    
    /**
      * If `false`, hides the column headers. Affects the layout
      * of the table, so we need to know when this changes in order to
      * synchronize quadrant sizes properly.
      *
      * REQUIRES QUADRANT RESYNC
      *
      * @default true
      */
    var enableColumnHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, adds an interaction bar on top of all column header cells, and
      * moves interaction triggers into it. Affects the layout of the table, so
      * we need to know when this changes in order to synchronize quadrant sizes
      * properly.
      *
      * This value defaults to `undefined` so that, by default, it won't override
      * the `enableColumnInteractionBar` values that you might have provided directly to
      * each `<ColumnHeaderCell2>`.
      *
      * REQUIRES QUADRANT RESYNC
      *
      * @default undefined
      */
    var enableColumnInteractionBar: js.UndefOr[Boolean] = js.native
    
    /**
      * If `false`, hides the row headers and settings menu. Affects the layout
      * of the table, so we need to know when this changes in order to
      * synchronize quadrant sizes properly.
      *
      * REQUIRES QUADRANT RESYNC
      *
      * @default true
      */
    var enableRowHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * The grid computes sizes of cells, rows, or columns from the
      * configurable `columnWidths` and `rowHeights`.
      */
    var grid: Grid = js.native
    
    /**
      * An optional callback for reacting to column-resize events.
      */
    var handleColumnResizeGuide: js.UndefOr[js.Function1[/* verticalGuides */ js.Array[Double], Unit]] = js.native
    
    /**
      * An optional callback for reacting to column-reordering events.
      */
    var handleColumnsReordering: js.UndefOr[js.Function1[/* verticalGuides */ js.Array[Double], Unit]] = js.native
    
    /**
      * An optional callback for reacting to row-resize events.
      */
    var handleRowResizeGuide: js.UndefOr[js.Function1[/* horizontalGuides */ js.Array[Double], Unit]] = js.native
    
    /**
      * An optional callback for reacting to column-reordering events.
      */
    var handleRowsReordering: js.UndefOr[js.Function1[/* horizontalGuides */ js.Array[Double], Unit]] = js.native
    
    /**
      * Whether horizontal scrolling is currently disabled.
      *
      * @default false
      */
    var isHorizontalScrollDisabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether vertical scrolling is currently disabled.
      *
      * @default false
      */
    var isVerticalScrollDisabled: js.UndefOr[Boolean] = js.native
    
    /**
      * A list of `TableLoadingOption`. Loading cells may have different sizes
      * from potentially custom cells in the header or body, so we need to know
      * when the loading states change in order to synchronize quadrant sizes
      * properly.
      *
      * REQUIRES QUADRANT RESYNC
      */
    var loadingOptions: js.UndefOr[js.Array[TableLoadingOption]] = js.native
    
    /**
      * A callback that renders the table menu (the rectangle in the top-left corner).
      */
    var menuRenderer: js.UndefOr[js.Function1[/* refHandler */ js.UndefOr[Ref[HTMLDivElement]], Element]] = js.native
    
    /**
      * The number of columns. Affects the layout of the table, so we need to
      * know when this changes in order to synchronize quadrant sizes properly.
      *
      * REQUIRES QUADRANT RESYNC
      */
    var numColumns: js.UndefOr[Double] = js.native
    
    /**
      * The number of frozen columns. Affects the layout of the table, so we need
      * to know when this changes in order to synchronize quadrant sizes
      * properly.
      *
      * REQUIRES QUADRANT RESYNC
      */
    var numFrozenColumns: Double = js.native
    
    /**
      * The number of frozen rows. Affects the layout of the table, so we need to
      * know when this changes in order to synchronize quadrant sizes properly.
      *
      * REQUIRES QUADRANT RESYNC
      */
    var numFrozenRows: Double = js.native
    
    /**
      * The number of rows. Affects the layout of the table, so we need to know
      * when this changes in order to synchronize quadrant sizes properly.
      *
      * REQUIRES QUADRANT RESYNC
      */
    var numRows: js.UndefOr[Double] = js.native
    
    /**
      * An optional callback invoked the quadrants are scrolled.
      */
    var onScroll: js.UndefOr[EventHandler[SyntheticEvent[HTMLElement, Event]]] = js.native
    
    /**
      * A callback that receives a `ref` to the main-quadrant element.
      */
    var quadrantRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    /**
      * A callback that receives a `ref` to the main quadrant's row-header container.
      */
    var rowHeaderRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    /**
      * A callback that renders either all of or just the frozen section of the row header.
      * May return undefined if the table is not attached to the DOM yet.
      */
    var rowHeaderRenderer: js.UndefOr[
        js.Function4[
          /* refHandler */ Ref[HTMLDivElement], 
          /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double] | Null, Unit], 
          /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
          /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
          js.UndefOr[Element]
        ]
      ] = js.native
    
    /**
      * A callback that receives a `ref` to the main quadrant's scroll-container element.
      */
    var scrollContainerRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    /**
      * Whether "scroll" and "wheel" events should be throttled using
      * requestAnimationFrame. Disabling this can be useful for unit testing,
      * because tests can then be synchronous.
      *
      * @default true
      */
    var throttleScrolling: js.UndefOr[Boolean] = js.native
    
    /**
      * The amount of time in milliseconds the component should wait before
      * synchronizing quadrant sizes and offsets after the user has stopped
      * scrolling. If this value is negative, the updates will happen
      * synchronously (this is helpful for unit testing).
      *
      * @default 500
      */
    var viewSyncDelay: js.UndefOr[Double] = js.native
  }
}
