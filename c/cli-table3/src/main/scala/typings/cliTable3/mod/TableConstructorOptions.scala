package typings.cliTable3.mod

import typings.cliTable3.anon.Border
import typings.cliTable3.anon.PartialRecordCharNamestri
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<cli-table3.cli-table3.TableOptions> */
@js.native
trait TableConstructorOptions extends js.Object {
  
  var chars: js.UndefOr[PartialRecordCharNamestri] = js.native
  
  var colAligns: js.UndefOr[js.Array[HorizontalAlignment]] = js.native
  
  var colWidths: js.UndefOr[js.Array[Double | Null]] = js.native
  
  var head: js.UndefOr[js.Array[String]] = js.native
  
  var rowAligns: js.UndefOr[js.Array[VerticalAlignment]] = js.native
  
  var rowHeights: js.UndefOr[js.Array[Double | Null]] = js.native
  
  var style: js.UndefOr[Partial[Border]] = js.native
  
  var truncate: js.UndefOr[String] = js.native
  
  var wordWrap: js.UndefOr[Boolean] = js.native
}
object TableConstructorOptions {
  
  @scala.inline
  def apply(): TableConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableConstructorOptions]
  }
  
  @scala.inline
  implicit class TableConstructorOptionsOps[Self <: TableConstructorOptions] (val x: Self) extends AnyVal {
    
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
    def setChars(value: PartialRecordCharNamestri): Self = this.set("chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChars: Self = this.set("chars", js.undefined)
    
    @scala.inline
    def setColAlignsVarargs(value: HorizontalAlignment*): Self = this.set("colAligns", js.Array(value :_*))
    
    @scala.inline
    def setColAligns(value: js.Array[HorizontalAlignment]): Self = this.set("colAligns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColAligns: Self = this.set("colAligns", js.undefined)
    
    @scala.inline
    def setColWidthsVarargs(value: (Double | Null)*): Self = this.set("colWidths", js.Array(value :_*))
    
    @scala.inline
    def setColWidths(value: js.Array[Double | Null]): Self = this.set("colWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColWidths: Self = this.set("colWidths", js.undefined)
    
    @scala.inline
    def setHeadVarargs(value: String*): Self = this.set("head", js.Array(value :_*))
    
    @scala.inline
    def setHead(value: js.Array[String]): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setRowAlignsVarargs(value: VerticalAlignment*): Self = this.set("rowAligns", js.Array(value :_*))
    
    @scala.inline
    def setRowAligns(value: js.Array[VerticalAlignment]): Self = this.set("rowAligns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowAligns: Self = this.set("rowAligns", js.undefined)
    
    @scala.inline
    def setRowHeightsVarargs(value: (Double | Null)*): Self = this.set("rowHeights", js.Array(value :_*))
    
    @scala.inline
    def setRowHeights(value: js.Array[Double | Null]): Self = this.set("rowHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeights: Self = this.set("rowHeights", js.undefined)
    
    @scala.inline
    def setStyle(value: Partial[Border]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTruncate(value: String): Self = this.set("truncate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
}
