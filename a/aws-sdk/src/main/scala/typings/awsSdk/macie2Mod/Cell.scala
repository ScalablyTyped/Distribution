package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cell extends js.Object {
  
  /**
    * The location of the cell, as an absolute cell reference, that contains the data. For example, Sheet2!C5 for cell C5 on Sheet2 in a Microsoft Excel workbook. This value is null for CSV and TSV files.
    */
  var cellReference: js.UndefOr[string] = js.native
  
  /**
    * The column number of the column that contains the data. For a Microsoft Excel workbook, this value correlates to the alphabetical character(s) for a column identifier. For example, 1 for column A, 2 for column B, and so on.
    */
  var column: js.UndefOr[long] = js.native
  
  /**
    * The name of the column that contains the data, if available.
    */
  var columnName: js.UndefOr[string] = js.native
  
  /**
    * The row number of the row that contains the data.
    */
  var row: js.UndefOr[long] = js.native
}
object Cell {
  
  @scala.inline
  def apply(): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellReference(value: string): Self = this.set("cellReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellReference: Self = this.set("cellReference", js.undefined)
    
    @scala.inline
    def setColumn(value: long): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setColumnName(value: string): Self = this.set("columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    
    @scala.inline
    def setRow(value: long): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
  }
}
