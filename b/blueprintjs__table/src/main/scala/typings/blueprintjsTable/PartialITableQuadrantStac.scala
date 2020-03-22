package typings.blueprintjsTable

import typings.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.tableQuadrantMod.QuadrantType
import typings.react.mod.EventHandler
import typings.react.mod.SyntheticEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack.ITableQuadrantStackProps> */
trait PartialITableQuadrantStac extends js.Object {
  var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.undefined
  var bodyRenderer: js.UndefOr[
    js.Function3[
      /* quadrantType */ QuadrantType, 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columnHeaderCellRenderer: js.UndefOr[
    js.Function4[
      /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], 
      /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], 
      /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.undefined
  var columnHeaderRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.undefined
  var enableColumnInteractionBar: js.UndefOr[Boolean] = js.undefined
  var enableRowHeader: js.UndefOr[Boolean] = js.undefined
  var grid: js.UndefOr[Grid] = js.undefined
  var handleColumnResizeGuide: js.UndefOr[js.Function1[/* verticalGuides */ js.Array[Double], Unit]] = js.undefined
  var handleColumnsReordering: js.UndefOr[js.Function1[/* verticalGuides */ js.Array[Double], Unit]] = js.undefined
  var handleRowResizeGuide: js.UndefOr[js.Function1[/* horizontalGuides */ js.Array[Double], Unit]] = js.undefined
  var handleRowsReordering: js.UndefOr[js.Function1[/* horizontalGuides */ js.Array[Double], Unit]] = js.undefined
  var isHorizontalScrollDisabled: js.UndefOr[Boolean] = js.undefined
  var isVerticalScrollDisabled: js.UndefOr[Boolean] = js.undefined
  var loadingOptions: js.UndefOr[js.Array[TableLoadingOption]] = js.undefined
  var menuRenderer: js.UndefOr[
    js.Function1[/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], Element]
  ] = js.undefined
  var numColumns: js.UndefOr[Double] = js.undefined
  var numFrozenColumns: js.UndefOr[Double] = js.undefined
  var numFrozenRows: js.UndefOr[Double] = js.undefined
  var numRows: js.UndefOr[Double] = js.undefined
  var onScroll: js.UndefOr[EventHandler[SyntheticEvent[HTMLElement, Event_]]] = js.undefined
  var quadrantRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.undefined
  var rowHeaderCellRenderer: js.UndefOr[
    js.Function4[
      /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], 
      /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], 
      /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.undefined
  var rowHeaderRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.undefined
  var scrollContainerRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.undefined
  var throttleScrolling: js.UndefOr[Boolean] = js.undefined
  var viewSyncDelay: js.UndefOr[Double] = js.undefined
}

object PartialITableQuadrantStac {
  @scala.inline
  def apply(
    bodyRef: /* ref */ HTMLElement | Null => _ = null,
    bodyRenderer: (/* quadrantType */ QuadrantType, /* showFrozenRowsOnly */ js.UndefOr[Boolean], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => Element = null,
    className: String = null,
    columnHeaderCellRenderer: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => Element = null,
    columnHeaderRef: /* ref */ HTMLElement | Null => Unit = null,
    enableColumnInteractionBar: js.UndefOr[Boolean] = js.undefined,
    enableRowHeader: js.UndefOr[Boolean] = js.undefined,
    grid: Grid = null,
    handleColumnResizeGuide: /* verticalGuides */ js.Array[Double] => Unit = null,
    handleColumnsReordering: /* verticalGuides */ js.Array[Double] => Unit = null,
    handleRowResizeGuide: /* horizontalGuides */ js.Array[Double] => Unit = null,
    handleRowsReordering: /* horizontalGuides */ js.Array[Double] => Unit = null,
    isHorizontalScrollDisabled: js.UndefOr[Boolean] = js.undefined,
    isVerticalScrollDisabled: js.UndefOr[Boolean] = js.undefined,
    loadingOptions: js.Array[TableLoadingOption] = null,
    menuRenderer: /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit] => Element = null,
    numColumns: Int | Double = null,
    numFrozenColumns: Int | Double = null,
    numFrozenRows: Int | Double = null,
    numRows: Int | Double = null,
    onScroll: SyntheticEvent[HTMLElement, Event_] => Unit = null,
    quadrantRef: /* ref */ HTMLElement | Null => Unit = null,
    rowHeaderCellRenderer: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenRowsOnly */ js.UndefOr[Boolean]) => Element = null,
    rowHeaderRef: /* ref */ HTMLElement | Null => _ = null,
    scrollContainerRef: /* ref */ HTMLElement | Null => _ = null,
    throttleScrolling: js.UndefOr[Boolean] = js.undefined,
    viewSyncDelay: Int | Double = null
  ): PartialITableQuadrantStac = {
    val __obj = js.Dynamic.literal()
    if (bodyRef != null) __obj.updateDynamic("bodyRef")(js.Any.fromFunction1(bodyRef))
    if (bodyRenderer != null) __obj.updateDynamic("bodyRenderer")(js.Any.fromFunction3(bodyRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction4(columnHeaderCellRenderer))
    if (columnHeaderRef != null) __obj.updateDynamic("columnHeaderRef")(js.Any.fromFunction1(columnHeaderRef))
    if (!js.isUndefined(enableColumnInteractionBar)) __obj.updateDynamic("enableColumnInteractionBar")(enableColumnInteractionBar.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowHeader)) __obj.updateDynamic("enableRowHeader")(enableRowHeader.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handleColumnResizeGuide != null) __obj.updateDynamic("handleColumnResizeGuide")(js.Any.fromFunction1(handleColumnResizeGuide))
    if (handleColumnsReordering != null) __obj.updateDynamic("handleColumnsReordering")(js.Any.fromFunction1(handleColumnsReordering))
    if (handleRowResizeGuide != null) __obj.updateDynamic("handleRowResizeGuide")(js.Any.fromFunction1(handleRowResizeGuide))
    if (handleRowsReordering != null) __obj.updateDynamic("handleRowsReordering")(js.Any.fromFunction1(handleRowsReordering))
    if (!js.isUndefined(isHorizontalScrollDisabled)) __obj.updateDynamic("isHorizontalScrollDisabled")(isHorizontalScrollDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isVerticalScrollDisabled)) __obj.updateDynamic("isVerticalScrollDisabled")(isVerticalScrollDisabled.asInstanceOf[js.Any])
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1(menuRenderer))
    if (numColumns != null) __obj.updateDynamic("numColumns")(numColumns.asInstanceOf[js.Any])
    if (numFrozenColumns != null) __obj.updateDynamic("numFrozenColumns")(numFrozenColumns.asInstanceOf[js.Any])
    if (numFrozenRows != null) __obj.updateDynamic("numFrozenRows")(numFrozenRows.asInstanceOf[js.Any])
    if (numRows != null) __obj.updateDynamic("numRows")(numRows.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (quadrantRef != null) __obj.updateDynamic("quadrantRef")(js.Any.fromFunction1(quadrantRef))
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction4(rowHeaderCellRenderer))
    if (rowHeaderRef != null) __obj.updateDynamic("rowHeaderRef")(js.Any.fromFunction1(rowHeaderRef))
    if (scrollContainerRef != null) __obj.updateDynamic("scrollContainerRef")(js.Any.fromFunction1(scrollContainerRef))
    if (!js.isUndefined(throttleScrolling)) __obj.updateDynamic("throttleScrolling")(throttleScrolling.asInstanceOf[js.Any])
    if (viewSyncDelay != null) __obj.updateDynamic("viewSyncDelay")(viewSyncDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialITableQuadrantStac]
  }
}

