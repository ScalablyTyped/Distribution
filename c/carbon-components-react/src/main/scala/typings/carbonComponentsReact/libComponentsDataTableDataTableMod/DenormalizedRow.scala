package typings.carbonComponentsReact.libComponentsDataTableDataTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DenormalizedRow
  extends StObject
     with DataTableRow[String] {
  
  var cells: js.Array[DataTableCell[Any, DataTableHeader[String]]]
}
object DenormalizedRow {
  
  inline def apply(cells: js.Array[DataTableCell[Any, DataTableHeader[String]]], id: String): DenormalizedRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DenormalizedRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DenormalizedRow] (val x: Self) extends AnyVal {
    
    inline def setCells(value: js.Array[DataTableCell[Any, DataTableHeader[String]]]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: (DataTableCell[Any, DataTableHeader[String]])*): Self = StObject.set(x, "cells", js.Array(value*))
  }
}
