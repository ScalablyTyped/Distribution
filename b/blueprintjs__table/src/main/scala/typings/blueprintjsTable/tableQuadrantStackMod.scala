package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.anon.PartialITableQuadrantStac
import typings.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.tableQuadrantMod.QuadrantType
import typings.react.mod.EventHandler
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableQuadrantStackMod {
  
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack", "TableQuadrantStack")
  @js.native
  class TableQuadrantStack protected ()
    extends AbstractComponent2[ITableQuadrantStackProps, js.Object, js.Object] {
    def this(props: ITableQuadrantStackProps) = this()
    def this(props: ITableQuadrantStackProps, context: js.Any) = this()
    
    /* private */ var adjustHorizontalGuides: js.Any = js.native
    
    /* private */ var adjustVerticalGuides: js.Any = js.native
    
    /* private */ var cache: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTableQuadrantStack(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTableQuadrantStack(prevProps: ITableQuadrantStackProps): Unit = js.native
    
    /* private */ var debouncedViewSyncInterval: js.Any = js.native
    
    /* private */ var emitRefs: js.Any = js.native
    
    /* private */ var generateQuadrantRefHandlers: js.Any = js.native
    
    /* private */ var getNextScrollOffset: js.Any = js.native
    
    /**
      * Returns the width or height of *only the grid* in the secondary quadrants
      * (TOP, LEFT, TOP_LEFT), based on the number of frozen rows and columns.
      */
    /* private */ var getSecondaryQuadrantGridSize: js.Any = js.native
    
    /* private */ var handleColumnResizeGuideLeft: js.Any = js.native
    
    /* private */ var handleColumnResizeGuideMain: js.Any = js.native
    
    /* private */ var handleColumnResizeGuideTop: js.Any = js.native
    
    /* private */ var handleColumnResizeGuideTopLeft: js.Any = js.native
    
    /* private */ var handleColumnsReordering: js.Any = js.native
    
    /* private */ var handleMainQuadrantScroll: js.Any = js.native
    
    /* private */ var handleRowResizeGuideLeft: js.Any = js.native
    
    /* private */ var handleRowResizeGuideMain: js.Any = js.native
    
    /* private */ var handleRowResizeGuideTop: js.Any = js.native
    
    /* private */ var handleRowResizeGuideTopLeft: js.Any = js.native
    
    /* private */ var handleRowsReordering: js.Any = js.native
    
    /* private */ var handleScrollOffsetChange: js.Any = js.native
    
    /* private */ var handleWheel: js.Any = js.native
    
    /* private */ var invokeColumnResizeHandler: js.Any = js.native
    
    /* private */ var invokeRowResizeHandler: js.Any = js.native
    
    /* private */ var maybeIncreaseToDefaultColumnHeaderHeight: js.Any = js.native
    
    /* private */ var maybeSetQuadrantMenuElementSize: js.Any = js.native
    
    /* private */ var maybeSetQuadrantMenuElementSizes: js.Any = js.native
    
    /* private */ var maybeSetQuadrantPositionOffset: js.Any = js.native
    
    /* private */ var maybeSetQuadrantRowHeaderSize: js.Any = js.native
    
    /* private */ var maybeSetQuadrantScrollOffset: js.Any = js.native
    
    /* private */ var maybeSetQuadrantSizes: js.Any = js.native
    
    /* private */ var maybesSetQuadrantRowHeaderSizes: js.Any = js.native
    
    /* private */ var maybesSetQuadrantSize: js.Any = js.native
    
    /**
      * Measures the desired height of the column header based on its tallest
      * contents.
      */
    /* private */ var measureDesiredColumnHeaderHeight: js.Any = js.native
    
    /**
      * Measures the desired width of the row header based on its tallest
      * contents.
      */
    /* private */ var measureDesiredRowHeaderWidth: js.Any = js.native
    
    /* private */ var quadrantRefHandlers: js.Any = js.native
    
    /* private */ var quadrantRefs: js.Any = js.native
    
    /* private */ var renderLeftQuadrantColumnHeader: js.Any = js.native
    
    /* private */ var renderLeftQuadrantMenu: js.Any = js.native
    
    /* private */ var renderLeftQuadrantRowHeader: js.Any = js.native
    
    /* private */ var renderMainQuadrantColumnHeader: js.Any = js.native
    
    /* private */ var renderMainQuadrantMenu: js.Any = js.native
    
    /* private */ var renderMainQuadrantRowHeader: js.Any = js.native
    
    /* private */ var renderTopLeftQuadrantColumnHeader: js.Any = js.native
    
    /* private */ var renderTopLeftQuadrantMenu: js.Any = js.native
    
    /* private */ var renderTopLeftQuadrantRowHeader: js.Any = js.native
    
    /* private */ var renderTopQuadrantColumnHeader: js.Any = js.native
    
    /* private */ var renderTopQuadrantMenu: js.Any = js.native
    
    /* private */ var renderTopQuadrantRowHeader: js.Any = js.native
    
    /**
      * Scroll the main quadrant to the specified scroll offset, keeping all other quadrants in sync.
      */
    def scrollToPosition(scrollLeft: Double, scrollTop: Double): Unit = js.native
    
    /* private */ var shouldRenderLeftQuadrants: js.Any = js.native
    
    /* private */ var syncQuadrantViews: js.Any = js.native
    
    /* private */ var syncQuadrantViewsDebounced: js.Any = js.native
    
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
    
    /* private */ var throttledHandleMainQuadrantScroll: js.Any = js.native
    
    /* private */ var throttledHandleWheel: js.Any = js.native
    
    /* private */ var updateScrollContainerClientSize: js.Any = js.native
    
    /* private */ var wasMainQuadrantScrollTriggeredByWheelEvent: js.Any = js.native
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
    var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, js.Any]] = js.native
    
    /**
      * A callback that renders either all of or just frozen sections of the table body.
      */
    def bodyRenderer(quadrantType: QuadrantType): Element = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean): Element = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean, showFrozenColumnsOnly: Boolean): Element = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Unit, showFrozenColumnsOnly: Boolean): Element = js.native
    
    /**
      * A callback that renders either all of or just the frozen section of the column header.
      */
    var columnHeaderCellRenderer: js.UndefOr[
        js.Function4[
          /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], 
          /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], 
          /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
          /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
          Element
        ]
      ] = js.native
    
    /**
      * A callback that receives a `ref` to the main quadrant's column-header container.
      */
    var columnHeaderRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
    
    /**
      * If `true`, adds an interaction bar on top of all column header cells, and
      * moves interaction triggers into it. Affects the layout of the table, so
      * we need to know when this changes in order to synchronize quadrant sizes
      * properly.
      *
      * This value defaults to `undefined` so that, by default, it won't override
      * the `enableColumnInteractionBar` values that you might have provided directly to
      * each `<ColumnHeaderCell>`.
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
      * @default false
      */
    var isHorizontalScrollDisabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether vertical scrolling is currently disabled.
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
    var menuRenderer: js.UndefOr[
        js.Function1[/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], Element]
      ] = js.native
    
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
    var numFrozenColumns: js.UndefOr[Double] = js.native
    
    /**
      * The number of frozen rows. Affects the layout of the table, so we need to
      * know when this changes in order to synchronize quadrant sizes properly.
      *
      * REQUIRES QUADRANT RESYNC
      */
    var numFrozenRows: js.UndefOr[Double] = js.native
    
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
    var quadrantRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
    
    /**
      * A callback that renders either all of or just the frozen section of the row header.
      */
    var rowHeaderCellRenderer: js.UndefOr[
        js.Function4[
          /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], 
          /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], 
          /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
          /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
          Element
        ]
      ] = js.native
    
    /**
      * A callback that receives a `ref` to the main quadrant's row-header container.
      */
    var rowHeaderRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, js.Any]] = js.native
    
    /**
      * A callback that receives a `ref` to the main quadrant's scroll-container element.
      */
    var scrollContainerRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, js.Any]] = js.native
    
    /**
      * Whether "scroll" and "wheel" events should be throttled using
      * requestAnimationFrame. Disabling this can be useful for unit testing,
      * because tests can then be synchronous.
      * @default true
      */
    var throttleScrolling: js.UndefOr[Boolean] = js.native
    
    /**
      * The amount of time in milliseconds the component should wait before
      * synchronizing quadrant sizes and offsets after the user has stopped
      * scrolling. If this value is negative, the updates will happen
      * synchronously (this is helpful for unit testing).
      * @default 500
      */
    var viewSyncDelay: js.UndefOr[Double] = js.native
  }
}
