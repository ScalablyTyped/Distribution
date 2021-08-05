package typings.blueprintjsTable.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowHeaderCellRenderer extends StObject {
  
  var rowHeaderCellRenderer: js.Function1[/* rowIndex */ Double, Element]
}
object RowHeaderCellRenderer {
  
  inline def apply(rowHeaderCellRenderer: /* rowIndex */ Double => Element): RowHeaderCellRenderer = {
    val __obj = js.Dynamic.literal(rowHeaderCellRenderer = js.Any.fromFunction1(rowHeaderCellRenderer))
    __obj.asInstanceOf[RowHeaderCellRenderer]
  }
  
  extension [Self <: RowHeaderCellRenderer](x: Self) {
    
    inline def setRowHeaderCellRenderer(value: /* rowIndex */ Double => Element): Self = StObject.set(x, "rowHeaderCellRenderer", js.Any.fromFunction1(value))
  }
}
