package typings.blueprintjsTable.anon

import typings.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.tableQuadrantMod.QuadrantType
import typings.react.mod.EventHandler
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack.ITableQuadrantStackProps> */
@js.native
trait PartialITableQuadrantStac extends js.Object {
  
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
  implicit class PartialITableQuadrantStacOps[Self <: PartialITableQuadrantStac] (val x: Self) extends AnyVal {
    
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
    def setBodyRef(value: /* ref */ HTMLElement | Null => _): Self = this.set("bodyRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBodyRef: Self = this.set("bodyRef", js.undefined)
    
    @scala.inline
    def setBodyRenderer(
      value: (/* quadrantType */ QuadrantType, /* showFrozenRowsOnly */ js.UndefOr[Boolean], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => Element
    ): Self = this.set("bodyRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBodyRenderer: Self = this.set("bodyRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColumnHeaderCellRenderer(
      value: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => Element
    ): Self = this.set("columnHeaderCellRenderer", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteColumnHeaderCellRenderer: Self = this.set("columnHeaderCellRenderer", js.undefined)
    
    @scala.inline
    def setColumnHeaderRef(value: /* ref */ HTMLElement | Null => Unit): Self = this.set("columnHeaderRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnHeaderRef: Self = this.set("columnHeaderRef", js.undefined)
    
    @scala.inline
    def setEnableColumnInteractionBar(value: Boolean): Self = this.set("enableColumnInteractionBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnInteractionBar: Self = this.set("enableColumnInteractionBar", js.undefined)
    
    @scala.inline
    def setEnableRowHeader(value: Boolean): Self = this.set("enableRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRowHeader: Self = this.set("enableRowHeader", js.undefined)
    
    @scala.inline
    def setGrid(value: Grid): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setHandleColumnResizeGuide(value: /* verticalGuides */ js.Array[Double] => Unit): Self = this.set("handleColumnResizeGuide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleColumnResizeGuide: Self = this.set("handleColumnResizeGuide", js.undefined)
    
    @scala.inline
    def setHandleColumnsReordering(value: /* verticalGuides */ js.Array[Double] => Unit): Self = this.set("handleColumnsReordering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleColumnsReordering: Self = this.set("handleColumnsReordering", js.undefined)
    
    @scala.inline
    def setHandleRowResizeGuide(value: /* horizontalGuides */ js.Array[Double] => Unit): Self = this.set("handleRowResizeGuide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleRowResizeGuide: Self = this.set("handleRowResizeGuide", js.undefined)
    
    @scala.inline
    def setHandleRowsReordering(value: /* horizontalGuides */ js.Array[Double] => Unit): Self = this.set("handleRowsReordering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleRowsReordering: Self = this.set("handleRowsReordering", js.undefined)
    
    @scala.inline
    def setIsHorizontalScrollDisabled(value: Boolean): Self = this.set("isHorizontalScrollDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHorizontalScrollDisabled: Self = this.set("isHorizontalScrollDisabled", js.undefined)
    
    @scala.inline
    def setIsVerticalScrollDisabled(value: Boolean): Self = this.set("isVerticalScrollDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVerticalScrollDisabled: Self = this.set("isVerticalScrollDisabled", js.undefined)
    
    @scala.inline
    def setLoadingOptionsVarargs(value: TableLoadingOption*): Self = this.set("loadingOptions", js.Array(value :_*))
    
    @scala.inline
    def setLoadingOptions(value: js.Array[TableLoadingOption]): Self = this.set("loadingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingOptions: Self = this.set("loadingOptions", js.undefined)
    
    @scala.inline
    def setMenuRenderer(value: /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit] => Element): Self = this.set("menuRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMenuRenderer: Self = this.set("menuRenderer", js.undefined)
    
    @scala.inline
    def setNumColumns(value: Double): Self = this.set("numColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumColumns: Self = this.set("numColumns", js.undefined)
    
    @scala.inline
    def setNumFrozenColumns(value: Double): Self = this.set("numFrozenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumFrozenColumns: Self = this.set("numFrozenColumns", js.undefined)
    
    @scala.inline
    def setNumFrozenRows(value: Double): Self = this.set("numFrozenRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumFrozenRows: Self = this.set("numFrozenRows", js.undefined)
    
    @scala.inline
    def setNumRows(value: Double): Self = this.set("numRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumRows: Self = this.set("numRows", js.undefined)
    
    @scala.inline
    def setOnScroll(value: SyntheticEvent[HTMLElement, Event] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setQuadrantRef(value: /* ref */ HTMLElement | Null => Unit): Self = this.set("quadrantRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteQuadrantRef: Self = this.set("quadrantRef", js.undefined)
    
    @scala.inline
    def setRowHeaderCellRenderer(
      value: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenRowsOnly */ js.UndefOr[Boolean]) => Element
    ): Self = this.set("rowHeaderCellRenderer", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteRowHeaderCellRenderer: Self = this.set("rowHeaderCellRenderer", js.undefined)
    
    @scala.inline
    def setRowHeaderRef(value: /* ref */ HTMLElement | Null => _): Self = this.set("rowHeaderRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowHeaderRef: Self = this.set("rowHeaderRef", js.undefined)
    
    @scala.inline
    def setScrollContainerRef(value: /* ref */ HTMLElement | Null => _): Self = this.set("scrollContainerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollContainerRef: Self = this.set("scrollContainerRef", js.undefined)
    
    @scala.inline
    def setThrottleScrolling(value: Boolean): Self = this.set("throttleScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottleScrolling: Self = this.set("throttleScrolling", js.undefined)
    
    @scala.inline
    def setViewSyncDelay(value: Double): Self = this.set("viewSyncDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewSyncDelay: Self = this.set("viewSyncDelay", js.undefined)
  }
}
