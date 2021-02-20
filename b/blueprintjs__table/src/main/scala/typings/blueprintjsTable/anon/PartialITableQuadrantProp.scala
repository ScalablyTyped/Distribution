package typings.blueprintjsTable.anon

import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.tableQuadrantMod.QuadrantType
import typings.react.mod.CSSProperties
import typings.react.mod.EventHandler
import typings.react.mod.NativeUIEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/quadrants/tableQuadrant.ITableQuadrantProps> */
@js.native
trait PartialITableQuadrantProp extends StObject {
  
  var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  
  var bodyRenderer: js.UndefOr[
    js.Function3[
      /* quadrantType */ js.UndefOr[QuadrantType], 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var columnHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenColumnsOnly */ js.UndefOr[Boolean], Element]] = js.native
  
  var enableRowHeader: js.UndefOr[Boolean] = js.native
  
  var grid: js.UndefOr[Grid] = js.native
  
  var menuRenderer: js.UndefOr[js.Function0[Element]] = js.native
  
  var onScroll: js.UndefOr[EventHandler[UIEvent[HTMLDivElement, NativeUIEvent]]] = js.native
  
  var onWheel: js.UndefOr[EventHandler[WheelEvent[HTMLDivElement]]] = js.native
  
  var quadrantRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  
  var quadrantType: js.UndefOr[QuadrantType] = js.native
  
  var rowHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenRowsOnly */ js.UndefOr[Boolean], Element]] = js.native
  
  var scrollContainerRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object PartialITableQuadrantProp {
  
  @scala.inline
  def apply(): PartialITableQuadrantProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITableQuadrantProp]
  }
  
  @scala.inline
  implicit class PartialITableQuadrantPropMutableBuilder[Self <: PartialITableQuadrantProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyRef(value: /* ref */ HTMLElement | Null => _): Self = StObject.set(x, "bodyRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBodyRefUndefined: Self = StObject.set(x, "bodyRef", js.undefined)
    
    @scala.inline
    def setBodyRenderer(
      value: (/* quadrantType */ js.UndefOr[QuadrantType], /* showFrozenRowsOnly */ js.UndefOr[Boolean], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => Element
    ): Self = StObject.set(x, "bodyRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBodyRendererUndefined: Self = StObject.set(x, "bodyRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColumnHeaderCellRenderer(value: /* showFrozenColumnsOnly */ js.UndefOr[Boolean] => Element): Self = StObject.set(x, "columnHeaderCellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnHeaderCellRendererUndefined: Self = StObject.set(x, "columnHeaderCellRenderer", js.undefined)
    
    @scala.inline
    def setEnableRowHeader(value: Boolean): Self = StObject.set(x, "enableRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRowHeaderUndefined: Self = StObject.set(x, "enableRowHeader", js.undefined)
    
    @scala.inline
    def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setMenuRenderer(value: () => Element): Self = StObject.set(x, "menuRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMenuRendererUndefined: Self = StObject.set(x, "menuRenderer", js.undefined)
    
    @scala.inline
    def setOnScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnWheel(value: WheelEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    @scala.inline
    def setQuadrantRef(value: /* ref */ HTMLElement | Null => _): Self = StObject.set(x, "quadrantRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuadrantRefUndefined: Self = StObject.set(x, "quadrantRef", js.undefined)
    
    @scala.inline
    def setQuadrantType(value: QuadrantType): Self = StObject.set(x, "quadrantType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadrantTypeUndefined: Self = StObject.set(x, "quadrantType", js.undefined)
    
    @scala.inline
    def setRowHeaderCellRenderer(value: /* showFrozenRowsOnly */ js.UndefOr[Boolean] => Element): Self = StObject.set(x, "rowHeaderCellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowHeaderCellRendererUndefined: Self = StObject.set(x, "rowHeaderCellRenderer", js.undefined)
    
    @scala.inline
    def setScrollContainerRef(value: /* ref */ HTMLElement | Null => _): Self = StObject.set(x, "scrollContainerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollContainerRefUndefined: Self = StObject.set(x, "scrollContainerRef", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
