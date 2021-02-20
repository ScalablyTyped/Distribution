package typings.blueprintjsTable.anon

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack.ITableQuadrantStackProps> */
@js.native
trait PartialITableQuadrantStac extends StObject {
  
  var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  
  var bodyRenderer: js.UndefOr[
    js.Function3[
      /* quadrantType */ QuadrantType, 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var columnHeaderCellRenderer: js.UndefOr[
    js.Function4[
      /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], 
      /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], 
      /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.native
  
  var columnHeaderRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
  
  var enableColumnInteractionBar: js.UndefOr[Boolean] = js.native
  
  var enableRowHeader: js.UndefOr[Boolean] = js.native
  
  var grid: js.UndefOr[Grid] = js.native
  
  var handleColumnResizeGuide: js.UndefOr[js.Function1[/* verticalGuides */ js.Array[Double], Unit]] = js.native
  
  var handleColumnsReordering: js.UndefOr[js.Function1[/* verticalGuides */ js.Array[Double], Unit]] = js.native
  
  var handleRowResizeGuide: js.UndefOr[js.Function1[/* horizontalGuides */ js.Array[Double], Unit]] = js.native
  
  var handleRowsReordering: js.UndefOr[js.Function1[/* horizontalGuides */ js.Array[Double], Unit]] = js.native
  
  var isHorizontalScrollDisabled: js.UndefOr[Boolean] = js.native
  
  var isVerticalScrollDisabled: js.UndefOr[Boolean] = js.native
  
  var loadingOptions: js.UndefOr[js.Array[TableLoadingOption]] = js.native
  
  var menuRenderer: js.UndefOr[
    js.Function1[/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], Element]
  ] = js.native
  
  var numColumns: js.UndefOr[Double] = js.native
  
  var numFrozenColumns: js.UndefOr[Double] = js.native
  
  var numFrozenRows: js.UndefOr[Double] = js.native
  
  var numRows: js.UndefOr[Double] = js.native
  
  var onScroll: js.UndefOr[EventHandler[SyntheticEvent[HTMLElement, Event]]] = js.native
  
  var quadrantRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
  
  var rowHeaderCellRenderer: js.UndefOr[
    js.Function4[
      /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], 
      /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], 
      /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.native
  
  var rowHeaderRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  
  var scrollContainerRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  
  var throttleScrolling: js.UndefOr[Boolean] = js.native
  
  var viewSyncDelay: js.UndefOr[Double] = js.native
}
object PartialITableQuadrantStac {
  
  @scala.inline
  def apply(): PartialITableQuadrantStac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITableQuadrantStac]
  }
  
  @scala.inline
  implicit class PartialITableQuadrantStacMutableBuilder[Self <: PartialITableQuadrantStac] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyRef(value: /* ref */ HTMLElement | Null => _): Self = StObject.set(x, "bodyRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBodyRefUndefined: Self = StObject.set(x, "bodyRef", js.undefined)
    
    @scala.inline
    def setBodyRenderer(
      value: (/* quadrantType */ QuadrantType, /* showFrozenRowsOnly */ js.UndefOr[Boolean], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => Element
    ): Self = StObject.set(x, "bodyRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBodyRendererUndefined: Self = StObject.set(x, "bodyRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColumnHeaderCellRenderer(
      value: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => Element
    ): Self = StObject.set(x, "columnHeaderCellRenderer", js.Any.fromFunction4(value))
    
    @scala.inline
    def setColumnHeaderCellRendererUndefined: Self = StObject.set(x, "columnHeaderCellRenderer", js.undefined)
    
    @scala.inline
    def setColumnHeaderRef(value: /* ref */ HTMLElement | Null => Unit): Self = StObject.set(x, "columnHeaderRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnHeaderRefUndefined: Self = StObject.set(x, "columnHeaderRef", js.undefined)
    
    @scala.inline
    def setEnableColumnInteractionBar(value: Boolean): Self = StObject.set(x, "enableColumnInteractionBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableColumnInteractionBarUndefined: Self = StObject.set(x, "enableColumnInteractionBar", js.undefined)
    
    @scala.inline
    def setEnableRowHeader(value: Boolean): Self = StObject.set(x, "enableRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRowHeaderUndefined: Self = StObject.set(x, "enableRowHeader", js.undefined)
    
    @scala.inline
    def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setHandleColumnResizeGuide(value: /* verticalGuides */ js.Array[Double] => Unit): Self = StObject.set(x, "handleColumnResizeGuide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleColumnResizeGuideUndefined: Self = StObject.set(x, "handleColumnResizeGuide", js.undefined)
    
    @scala.inline
    def setHandleColumnsReordering(value: /* verticalGuides */ js.Array[Double] => Unit): Self = StObject.set(x, "handleColumnsReordering", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleColumnsReorderingUndefined: Self = StObject.set(x, "handleColumnsReordering", js.undefined)
    
    @scala.inline
    def setHandleRowResizeGuide(value: /* horizontalGuides */ js.Array[Double] => Unit): Self = StObject.set(x, "handleRowResizeGuide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleRowResizeGuideUndefined: Self = StObject.set(x, "handleRowResizeGuide", js.undefined)
    
    @scala.inline
    def setHandleRowsReordering(value: /* horizontalGuides */ js.Array[Double] => Unit): Self = StObject.set(x, "handleRowsReordering", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleRowsReorderingUndefined: Self = StObject.set(x, "handleRowsReordering", js.undefined)
    
    @scala.inline
    def setIsHorizontalScrollDisabled(value: Boolean): Self = StObject.set(x, "isHorizontalScrollDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHorizontalScrollDisabledUndefined: Self = StObject.set(x, "isHorizontalScrollDisabled", js.undefined)
    
    @scala.inline
    def setIsVerticalScrollDisabled(value: Boolean): Self = StObject.set(x, "isVerticalScrollDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVerticalScrollDisabledUndefined: Self = StObject.set(x, "isVerticalScrollDisabled", js.undefined)
    
    @scala.inline
    def setLoadingOptions(value: js.Array[TableLoadingOption]): Self = StObject.set(x, "loadingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingOptionsUndefined: Self = StObject.set(x, "loadingOptions", js.undefined)
    
    @scala.inline
    def setLoadingOptionsVarargs(value: TableLoadingOption*): Self = StObject.set(x, "loadingOptions", js.Array(value :_*))
    
    @scala.inline
    def setMenuRenderer(value: /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit] => Element): Self = StObject.set(x, "menuRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMenuRendererUndefined: Self = StObject.set(x, "menuRenderer", js.undefined)
    
    @scala.inline
    def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
    
    @scala.inline
    def setNumFrozenColumns(value: Double): Self = StObject.set(x, "numFrozenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFrozenColumnsUndefined: Self = StObject.set(x, "numFrozenColumns", js.undefined)
    
    @scala.inline
    def setNumFrozenRows(value: Double): Self = StObject.set(x, "numFrozenRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFrozenRowsUndefined: Self = StObject.set(x, "numFrozenRows", js.undefined)
    
    @scala.inline
    def setNumRows(value: Double): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRowsUndefined: Self = StObject.set(x, "numRows", js.undefined)
    
    @scala.inline
    def setOnScroll(value: SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setQuadrantRef(value: /* ref */ HTMLElement | Null => Unit): Self = StObject.set(x, "quadrantRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuadrantRefUndefined: Self = StObject.set(x, "quadrantRef", js.undefined)
    
    @scala.inline
    def setRowHeaderCellRenderer(
      value: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenRowsOnly */ js.UndefOr[Boolean]) => Element
    ): Self = StObject.set(x, "rowHeaderCellRenderer", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRowHeaderCellRendererUndefined: Self = StObject.set(x, "rowHeaderCellRenderer", js.undefined)
    
    @scala.inline
    def setRowHeaderRef(value: /* ref */ HTMLElement | Null => _): Self = StObject.set(x, "rowHeaderRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowHeaderRefUndefined: Self = StObject.set(x, "rowHeaderRef", js.undefined)
    
    @scala.inline
    def setScrollContainerRef(value: /* ref */ HTMLElement | Null => _): Self = StObject.set(x, "scrollContainerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollContainerRefUndefined: Self = StObject.set(x, "scrollContainerRef", js.undefined)
    
    @scala.inline
    def setThrottleScrolling(value: Boolean): Self = StObject.set(x, "throttleScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleScrollingUndefined: Self = StObject.set(x, "throttleScrolling", js.undefined)
    
    @scala.inline
    def setViewSyncDelay(value: Double): Self = StObject.set(x, "viewSyncDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewSyncDelayUndefined: Self = StObject.set(x, "viewSyncDelay", js.undefined)
  }
}
