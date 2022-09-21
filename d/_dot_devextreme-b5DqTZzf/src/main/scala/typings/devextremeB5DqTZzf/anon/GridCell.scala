package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.pdfExporter.PdfDataGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridCell extends StObject {
  
  var gridCell: js.UndefOr[PdfDataGridCell] = js.undefined
  
  var pdfCell: js.UndefOr[Any] = js.undefined
}
object GridCell {
  
  inline def apply(): GridCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridCell]
  }
  
  extension [Self <: GridCell](x: Self) {
    
    inline def setGridCell(value: PdfDataGridCell): Self = StObject.set(x, "gridCell", value.asInstanceOf[js.Any])
    
    inline def setGridCellUndefined: Self = StObject.set(x, "gridCell", js.undefined)
    
    inline def setPdfCell(value: Any): Self = StObject.set(x, "pdfCell", value.asInstanceOf[js.Any])
    
    inline def setPdfCellUndefined: Self = StObject.set(x, "pdfCell", js.undefined)
  }
}
