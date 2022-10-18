package typings.blueprintjsTable.anon

import typings.blueprintjsTable.libEsmCommonGridMod.Grid
import typings.blueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType
import typings.react.mod.CSSProperties
import typings.react.mod.EventHandler
import typings.react.mod.NativeUIEvent
import typings.react.mod.Ref
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/quadrants/tableQuadrant.ITableQuadrantProps> */
trait PartialITableQuadrantProp extends StObject {
  
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
  
  var columnHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenColumnsOnly */ Boolean, js.UndefOr[Element]]] = js.undefined
  
  var enableColumnHeader: js.UndefOr[Boolean] = js.undefined
  
  var enableRowHeader: js.UndefOr[Boolean] = js.undefined
  
  var grid: js.UndefOr[Grid] = js.undefined
  
  var menuRenderer: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  
  var onScroll: js.UndefOr[EventHandler[UIEvent[HTMLDivElement, NativeUIEvent]]] = js.undefined
  
  var onWheel: js.UndefOr[EventHandler[WheelEvent[HTMLDivElement]]] = js.undefined
  
  var quadrantRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  
  var quadrantType: js.UndefOr[QuadrantType] = js.undefined
  
  var rowHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenRowsOnly */ Boolean, js.UndefOr[Element]]] = js.undefined
  
  var scrollContainerRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object PartialITableQuadrantProp {
  
  inline def apply(): PartialITableQuadrantProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITableQuadrantProp]
  }
  
  extension [Self <: PartialITableQuadrantProp](x: Self) {
    
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
    
    inline def setColumnHeaderCellRenderer(value: /* showFrozenColumnsOnly */ Boolean => js.UndefOr[Element]): Self = StObject.set(x, "columnHeaderCellRenderer", js.Any.fromFunction1(value))
    
    inline def setColumnHeaderCellRendererUndefined: Self = StObject.set(x, "columnHeaderCellRenderer", js.undefined)
    
    inline def setEnableColumnHeader(value: Boolean): Self = StObject.set(x, "enableColumnHeader", value.asInstanceOf[js.Any])
    
    inline def setEnableColumnHeaderUndefined: Self = StObject.set(x, "enableColumnHeader", js.undefined)
    
    inline def setEnableRowHeader(value: Boolean): Self = StObject.set(x, "enableRowHeader", value.asInstanceOf[js.Any])
    
    inline def setEnableRowHeaderUndefined: Self = StObject.set(x, "enableRowHeader", js.undefined)
    
    inline def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setMenuRenderer(value: () => js.UndefOr[Element]): Self = StObject.set(x, "menuRenderer", js.Any.fromFunction0(value))
    
    inline def setMenuRendererUndefined: Self = StObject.set(x, "menuRenderer", js.undefined)
    
    inline def setOnScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnWheel(value: WheelEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setQuadrantRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "quadrantRef", value.asInstanceOf[js.Any])
    
    inline def setQuadrantRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "quadrantRef", js.Any.fromFunction1(value))
    
    inline def setQuadrantRefNull: Self = StObject.set(x, "quadrantRef", null)
    
    inline def setQuadrantRefUndefined: Self = StObject.set(x, "quadrantRef", js.undefined)
    
    inline def setQuadrantType(value: QuadrantType): Self = StObject.set(x, "quadrantType", value.asInstanceOf[js.Any])
    
    inline def setQuadrantTypeUndefined: Self = StObject.set(x, "quadrantType", js.undefined)
    
    inline def setRowHeaderCellRenderer(value: /* showFrozenRowsOnly */ Boolean => js.UndefOr[Element]): Self = StObject.set(x, "rowHeaderCellRenderer", js.Any.fromFunction1(value))
    
    inline def setRowHeaderCellRendererUndefined: Self = StObject.set(x, "rowHeaderCellRenderer", js.undefined)
    
    inline def setScrollContainerRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "scrollContainerRef", value.asInstanceOf[js.Any])
    
    inline def setScrollContainerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "scrollContainerRef", js.Any.fromFunction1(value))
    
    inline def setScrollContainerRefNull: Self = StObject.set(x, "scrollContainerRef", null)
    
    inline def setScrollContainerRefUndefined: Self = StObject.set(x, "scrollContainerRef", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
