package typings.carbonComponentsReact.libComponentsDataTableDataTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCustomSelectionData[R /* <: DataTableRow[String] */] extends StObject {
  
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
  
  var row: js.UndefOr[R] = js.undefined
}
object DataTableCustomSelectionData {
  
  inline def apply[R /* <: DataTableRow[String] */](): DataTableCustomSelectionData[R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTableCustomSelectionData[R]]
  }
  
  extension [Self <: DataTableCustomSelectionData[?], R /* <: DataTableRow[String] */](x: Self & DataTableCustomSelectionData[R]) {
    
    inline def setOnClick(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setRow(value: R): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
