package typings.carbonComponentsReact.dataTableDataTableMod

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
  
  extension [Self <: DenormalizedRow](x: Self) {
    
    inline def setCells(value: js.Array[DataTableCell[Any, DataTableHeader[String]]]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: (DataTableCell[Any, DataTableHeader[String]])*): Self = StObject.set(x, "cells", js.Array(value*))
  }
}
