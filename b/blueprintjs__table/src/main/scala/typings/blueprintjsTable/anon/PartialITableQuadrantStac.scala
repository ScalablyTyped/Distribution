package typings.blueprintjsTable.anon

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

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack.ITableQuadrantStackProps> */
trait PartialITableQuadrantStac extends StObject {
  
  var bodyRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  
  var bodyRenderer: js.UndefOr[
    js.Function3[
      /* quadrantType */ QuadrantType, 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      js.UndefOr[Element]
    ]
  ] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var columnHeaderRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  
  var columnHeaderRenderer: js.UndefOr[
    js.Function4[
      /* refHandler */ Ref[HTMLDivElement], 
      /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double] | Null, Unit], 
      /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      js.UndefOr[Element]
    ]
  ] = js.undefined
  
  var didHeadersMount: js.UndefOr[Boolean] = js.undefined
  
  var enableColumnHeader: js.UndefOr[Boolean] = js.undefined
  
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
  
  var menuRenderer: js.UndefOr[js.Function1[/* refHandler */ js.UndefOr[Ref[HTMLDivElement]], Element]] = js.undefined
  
  var numColumns: js.UndefOr[Double] = js.undefined
  
  var numFrozenColumns: js.UndefOr[Double] = js.undefined
  
  var numFrozenRows: js.UndefOr[Double] = js.undefined
  
  var numRows: js.UndefOr[Double] = js.undefined
  
  var onScroll: js.UndefOr[EventHandler[SyntheticEvent[HTMLElement, Event]]] = js.undefined
  
  var quadrantRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  
  var rowHeaderRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  
  var rowHeaderRenderer: js.UndefOr[
    js.Function4[
      /* refHandler */ Ref[HTMLDivElement], 
      /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double] | Null, Unit], 
      /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      js.UndefOr[Element]
    ]
  ] = js.undefined
  
  var scrollContainerRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  
  var throttleScrolling: js.UndefOr[Boolean] = js.undefined
  
  var viewSyncDelay: js.UndefOr[Double] = js.undefined
}
object PartialITableQuadrantStac {
  
  inline def apply(): PartialITableQuadrantStac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITableQuadrantStac]
  }
  
  extension [Self <: PartialITableQuadrantStac](x: Self) {
    
    inline def setBodyRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "bodyRef", value.asInstanceOf[js.Any])
    
    inline def setBodyRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "bodyRef", js.Any.fromFunction1(value))
    
    inline def setBodyRefNull: Self = StObject.set(x, "bodyRef", null)
    
    inline def setBodyRefUndefined: Self = StObject.set(x, "bodyRef", js.undefined)
    
    inline def setBodyRenderer(
      value: (/* quadrantType */ QuadrantType, /* showFrozenRowsOnly */ js.UndefOr[Boolean], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => js.UndefOr[Element]
    ): Self = StObject.set(x, "bodyRenderer", js.Any.fromFunction3(value))
    
    inline def setBodyRendererUndefined: Self = StObject.set(x, "bodyRenderer", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColumnHeaderRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "columnHeaderRef", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "columnHeaderRef", js.Any.fromFunction1(value))
    
    inline def setColumnHeaderRefNull: Self = StObject.set(x, "columnHeaderRef", null)
    
    inline def setColumnHeaderRefUndefined: Self = StObject.set(x, "columnHeaderRef", js.undefined)
    
    inline def setColumnHeaderRenderer(
      value: (/* refHandler */ Ref[HTMLDivElement], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double] | Null, Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => js.UndefOr[Element]
    ): Self = StObject.set(x, "columnHeaderRenderer", js.Any.fromFunction4(value))
    
    inline def setColumnHeaderRendererUndefined: Self = StObject.set(x, "columnHeaderRenderer", js.undefined)
    
    inline def setDidHeadersMount(value: Boolean): Self = StObject.set(x, "didHeadersMount", value.asInstanceOf[js.Any])
    
    inline def setDidHeadersMountUndefined: Self = StObject.set(x, "didHeadersMount", js.undefined)
    
    inline def setEnableColumnHeader(value: Boolean): Self = StObject.set(x, "enableColumnHeader", value.asInstanceOf[js.Any])
    
    inline def setEnableColumnHeaderUndefined: Self = StObject.set(x, "enableColumnHeader", js.undefined)
    
    inline def setEnableColumnInteractionBar(value: Boolean): Self = StObject.set(x, "enableColumnInteractionBar", value.asInstanceOf[js.Any])
    
    inline def setEnableColumnInteractionBarUndefined: Self = StObject.set(x, "enableColumnInteractionBar", js.undefined)
    
    inline def setEnableRowHeader(value: Boolean): Self = StObject.set(x, "enableRowHeader", value.asInstanceOf[js.Any])
    
    inline def setEnableRowHeaderUndefined: Self = StObject.set(x, "enableRowHeader", js.undefined)
    
    inline def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setHandleColumnResizeGuide(value: /* verticalGuides */ js.Array[Double] => Unit): Self = StObject.set(x, "handleColumnResizeGuide", js.Any.fromFunction1(value))
    
    inline def setHandleColumnResizeGuideUndefined: Self = StObject.set(x, "handleColumnResizeGuide", js.undefined)
    
    inline def setHandleColumnsReordering(value: /* verticalGuides */ js.Array[Double] => Unit): Self = StObject.set(x, "handleColumnsReordering", js.Any.fromFunction1(value))
    
    inline def setHandleColumnsReorderingUndefined: Self = StObject.set(x, "handleColumnsReordering", js.undefined)
    
    inline def setHandleRowResizeGuide(value: /* horizontalGuides */ js.Array[Double] => Unit): Self = StObject.set(x, "handleRowResizeGuide", js.Any.fromFunction1(value))
    
    inline def setHandleRowResizeGuideUndefined: Self = StObject.set(x, "handleRowResizeGuide", js.undefined)
    
    inline def setHandleRowsReordering(value: /* horizontalGuides */ js.Array[Double] => Unit): Self = StObject.set(x, "handleRowsReordering", js.Any.fromFunction1(value))
    
    inline def setHandleRowsReorderingUndefined: Self = StObject.set(x, "handleRowsReordering", js.undefined)
    
    inline def setIsHorizontalScrollDisabled(value: Boolean): Self = StObject.set(x, "isHorizontalScrollDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsHorizontalScrollDisabledUndefined: Self = StObject.set(x, "isHorizontalScrollDisabled", js.undefined)
    
    inline def setIsVerticalScrollDisabled(value: Boolean): Self = StObject.set(x, "isVerticalScrollDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsVerticalScrollDisabledUndefined: Self = StObject.set(x, "isVerticalScrollDisabled", js.undefined)
    
    inline def setLoadingOptions(value: js.Array[TableLoadingOption]): Self = StObject.set(x, "loadingOptions", value.asInstanceOf[js.Any])
    
    inline def setLoadingOptionsUndefined: Self = StObject.set(x, "loadingOptions", js.undefined)
    
    inline def setLoadingOptionsVarargs(value: TableLoadingOption*): Self = StObject.set(x, "loadingOptions", js.Array(value*))
    
    inline def setMenuRenderer(value: /* refHandler */ js.UndefOr[Ref[HTMLDivElement]] => Element): Self = StObject.set(x, "menuRenderer", js.Any.fromFunction1(value))
    
    inline def setMenuRendererUndefined: Self = StObject.set(x, "menuRenderer", js.undefined)
    
    inline def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
    
    inline def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
    
    inline def setNumFrozenColumns(value: Double): Self = StObject.set(x, "numFrozenColumns", value.asInstanceOf[js.Any])
    
    inline def setNumFrozenColumnsUndefined: Self = StObject.set(x, "numFrozenColumns", js.undefined)
    
    inline def setNumFrozenRows(value: Double): Self = StObject.set(x, "numFrozenRows", value.asInstanceOf[js.Any])
    
    inline def setNumFrozenRowsUndefined: Self = StObject.set(x, "numFrozenRows", js.undefined)
    
    inline def setNumRows(value: Double): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
    
    inline def setNumRowsUndefined: Self = StObject.set(x, "numRows", js.undefined)
    
    inline def setOnScroll(value: SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setQuadrantRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "quadrantRef", value.asInstanceOf[js.Any])
    
    inline def setQuadrantRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "quadrantRef", js.Any.fromFunction1(value))
    
    inline def setQuadrantRefNull: Self = StObject.set(x, "quadrantRef", null)
    
    inline def setQuadrantRefUndefined: Self = StObject.set(x, "quadrantRef", js.undefined)
    
    inline def setRowHeaderRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "rowHeaderRef", value.asInstanceOf[js.Any])
    
    inline def setRowHeaderRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "rowHeaderRef", js.Any.fromFunction1(value))
    
    inline def setRowHeaderRefNull: Self = StObject.set(x, "rowHeaderRef", null)
    
    inline def setRowHeaderRefUndefined: Self = StObject.set(x, "rowHeaderRef", js.undefined)
    
    inline def setRowHeaderRenderer(
      value: (/* refHandler */ Ref[HTMLDivElement], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double] | Null, Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenRowsOnly */ js.UndefOr[Boolean]) => js.UndefOr[Element]
    ): Self = StObject.set(x, "rowHeaderRenderer", js.Any.fromFunction4(value))
    
    inline def setRowHeaderRendererUndefined: Self = StObject.set(x, "rowHeaderRenderer", js.undefined)
    
    inline def setScrollContainerRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "scrollContainerRef", value.asInstanceOf[js.Any])
    
    inline def setScrollContainerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "scrollContainerRef", js.Any.fromFunction1(value))
    
    inline def setScrollContainerRefNull: Self = StObject.set(x, "scrollContainerRef", null)
    
    inline def setScrollContainerRefUndefined: Self = StObject.set(x, "scrollContainerRef", js.undefined)
    
    inline def setThrottleScrolling(value: Boolean): Self = StObject.set(x, "throttleScrolling", value.asInstanceOf[js.Any])
    
    inline def setThrottleScrollingUndefined: Self = StObject.set(x, "throttleScrolling", js.undefined)
    
    inline def setViewSyncDelay(value: Double): Self = StObject.set(x, "viewSyncDelay", value.asInstanceOf[js.Any])
    
    inline def setViewSyncDelayUndefined: Self = StObject.set(x, "viewSyncDelay", js.undefined)
  }
}
