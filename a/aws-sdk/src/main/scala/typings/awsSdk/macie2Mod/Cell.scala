package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell extends StObject {
  
  /**
    * The location of the cell, as an absolute cell reference, that contains the data. For example, Sheet2!C5 for cell C5 on Sheet2 in a Microsoft Excel workbook. This value is null for CSV and TSV files.
    */
  var cellReference: js.UndefOr[string] = js.undefined
  
  /**
    * The column number of the column that contains the data. For a Microsoft Excel workbook, this value correlates to the alphabetical character(s) for a column identifier. For example, 1 for column A, 2 for column B, and so on.
    */
  var column: js.UndefOr[long] = js.undefined
  
  /**
    * The name of the column that contains the data, if available.
    */
  var columnName: js.UndefOr[string] = js.undefined
  
  /**
    * The row number of the row that contains the data.
    */
  var row: js.UndefOr[long] = js.undefined
}
object Cell {
  
  @scala.inline
  def apply(): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit class CellMutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellReference(value: string): Self = StObject.set(x, "cellReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellReferenceUndefined: Self = StObject.set(x, "cellReference", js.undefined)
    
    @scala.inline
    def setColumn(value: long): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnName(value: string): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setRow(value: long): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
