package typings.cliTable2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOptions extends js.Object {
  
  var colAligns: js.Array[HorizontalAlignment] = js.native
  
  var colWidths: js.Array[Double | Null] = js.native
  
  var head: js.Array[Cell] = js.native
  
  var rowAligns: js.Array[VerticalAlignment] = js.native
  
  var rowHeights: js.Array[Double | Null] = js.native
  
  var truncate: String = js.native
  
  var wordWrap: Boolean = js.native
}
object TableOptions {
  
  @scala.inline
  def apply(
    colAligns: js.Array[HorizontalAlignment],
    colWidths: js.Array[Double | Null],
    head: js.Array[Cell],
    rowAligns: js.Array[VerticalAlignment],
    rowHeights: js.Array[Double | Null],
    truncate: String,
    wordWrap: Boolean
  ): TableOptions = {
    val __obj = js.Dynamic.literal(colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
  
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
    
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
    def setColAlignsVarargs(value: HorizontalAlignment*): Self = this.set("colAligns", js.Array(value :_*))
    
    @scala.inline
    def setColAligns(value: js.Array[HorizontalAlignment]): Self = this.set("colAligns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColWidthsVarargs(value: (Double | Null)*): Self = this.set("colWidths", js.Array(value :_*))
    
    @scala.inline
    def setColWidths(value: js.Array[Double | Null]): Self = this.set("colWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadVarargs(value: Cell*): Self = this.set("head", js.Array(value :_*))
    
    @scala.inline
    def setHead(value: js.Array[Cell]): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowAlignsVarargs(value: VerticalAlignment*): Self = this.set("rowAligns", js.Array(value :_*))
    
    @scala.inline
    def setRowAligns(value: js.Array[VerticalAlignment]): Self = this.set("rowAligns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightsVarargs(value: (Double | Null)*): Self = this.set("rowHeights", js.Array(value :_*))
    
    @scala.inline
    def setRowHeights(value: js.Array[Double | Null]): Self = this.set("rowHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncate(value: String): Self = this.set("truncate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
  }
}
