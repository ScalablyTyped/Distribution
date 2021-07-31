package typings.carbonComponentsReact.dataTableDataTableMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterRowsData[R /* <: DataTableRow[String] */, H /* <: DataTableHeader[String] */] extends StObject {
  
  var cellsById: StringDictionary[DataTableCell[js.Any, DataTableHeader[String]]]
  
  var headers: js.Array[H]
  
  var inputValue: String
  
  var rowIds: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: R['id'] */ js.Any
  ]
}
object FilterRowsData {
  
  @scala.inline
  def apply[R /* <: DataTableRow[String] */, H /* <: DataTableHeader[String] */](
    cellsById: StringDictionary[DataTableCell[js.Any, DataTableHeader[String]]],
    headers: js.Array[H],
    inputValue: String,
    rowIds: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: R['id'] */ js.Any
    ]
  ): FilterRowsData[R, H] = {
    val __obj = js.Dynamic.literal(cellsById = cellsById.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], rowIds = rowIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterRowsData[R, H]]
  }
  
  @scala.inline
  implicit class FilterRowsDataMutableBuilder[Self <: FilterRowsData[?, ?], R /* <: DataTableRow[String] */, H /* <: DataTableHeader[String] */] (val x: Self & (FilterRowsData[R, H])) extends AnyVal {
    
    @scala.inline
    def setCellsById(value: StringDictionary[DataTableCell[js.Any, DataTableHeader[String]]]): Self = StObject.set(x, "cellsById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Array[H]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: H*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIds(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: R['id'] */ js.Any
        ]
    ): Self = StObject.set(x, "rowIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIdsVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: R['id'] */ js.Any)*): Self = StObject.set(x, "rowIds", js.Array(value :_*))
  }
}
