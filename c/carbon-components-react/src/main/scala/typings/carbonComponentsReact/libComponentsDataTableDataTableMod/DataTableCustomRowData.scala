package typings.carbonComponentsReact.libComponentsDataTableDataTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCustomRowData[R /* <: DataTableRow[String] */] extends StObject {
  
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
  
  var row: R
}
object DataTableCustomRowData {
  
  inline def apply[R /* <: DataTableRow[String] */](row: R): DataTableCustomRowData[R] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCustomRowData[R]]
  }
  
  extension [Self <: DataTableCustomRowData[?], R /* <: DataTableRow[String] */](x: Self & DataTableCustomRowData[R]) {
    
    inline def setOnClick(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setRow(value: R): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
