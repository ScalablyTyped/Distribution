package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.excelExporter.DataGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelCell extends StObject {
  
  var excelCell: js.UndefOr[Any] = js.undefined
  
  var gridCell: js.UndefOr[DataGridCell] = js.undefined
}
object ExcelCell {
  
  inline def apply(): ExcelCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelCell]
  }
  
  extension [Self <: ExcelCell](x: Self) {
    
    inline def setExcelCell(value: Any): Self = StObject.set(x, "excelCell", value.asInstanceOf[js.Any])
    
    inline def setExcelCellUndefined: Self = StObject.set(x, "excelCell", js.undefined)
    
    inline def setGridCell(value: DataGridCell): Self = StObject.set(x, "gridCell", value.asInstanceOf[js.Any])
    
    inline def setGridCellUndefined: Self = StObject.set(x, "gridCell", js.undefined)
  }
}
