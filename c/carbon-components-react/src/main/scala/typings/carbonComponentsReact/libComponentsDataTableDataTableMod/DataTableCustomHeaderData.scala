package typings.carbonComponentsReact.libComponentsDataTableDataTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCustomHeaderData[H /* <: DataTableHeader[String] */] extends StObject {
  
  var header: H
  
  var isSortable: js.UndefOr[Boolean] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
}
object DataTableCustomHeaderData {
  
  inline def apply[H /* <: DataTableHeader[String] */](header: H): DataTableCustomHeaderData[H] = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCustomHeaderData[H]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableCustomHeaderData[?], H /* <: DataTableHeader[String] */] (val x: Self & DataTableCustomHeaderData[H]) extends AnyVal {
    
    inline def setHeader(value: H): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    inline def setOnClick(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
