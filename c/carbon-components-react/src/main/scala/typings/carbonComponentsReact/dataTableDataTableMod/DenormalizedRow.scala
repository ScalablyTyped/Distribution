package typings.carbonComponentsReact.dataTableDataTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DenormalizedRow
  extends StObject
     with DataTableRow[String] {
  
  var cells: js.Array[DataTableCell[js.Any, DataTableHeader[String]]]
}
object DenormalizedRow {
  
  @scala.inline
  def apply(cells: js.Array[DataTableCell[js.Any, DataTableHeader[String]]], id: String): DenormalizedRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DenormalizedRow]
  }
  
  @scala.inline
  implicit class DenormalizedRowMutableBuilder[Self <: DenormalizedRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[DataTableCell[js.Any, DataTableHeader[String]]]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsVarargs(value: (DataTableCell[js.Any, DataTableHeader[String]])*): Self = StObject.set(x, "cells", js.Array(value :_*))
  }
}
