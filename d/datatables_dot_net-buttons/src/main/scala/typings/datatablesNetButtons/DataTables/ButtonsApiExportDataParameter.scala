package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonsApiExportDataParameter extends js.Object {
  
  var columns: js.UndefOr[js.Any] = js.native
  
  var decodeEntities: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[js.Any] = js.native
  
  var modifier: js.UndefOr[js.Any] = js.native
  
  var orthogonal: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[js.Any] = js.native
  
  var stripHtml: js.UndefOr[Boolean] = js.native
  
  var stripNewlines: js.UndefOr[Boolean] = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
}
object ButtonsApiExportDataParameter {
  
  @scala.inline
  def apply(): ButtonsApiExportDataParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonsApiExportDataParameter]
  }
  
  @scala.inline
  implicit class ButtonsApiExportDataParameterOps[Self <: ButtonsApiExportDataParameter] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: js.Any): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDecodeEntities(value: Boolean): Self = this.set("decodeEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeEntities: Self = this.set("decodeEntities", js.undefined)
    
    @scala.inline
    def setFormat(value: js.Any): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setModifier(value: js.Any): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    
    @scala.inline
    def setOrthogonal(value: String): Self = this.set("orthogonal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrthogonal: Self = this.set("orthogonal", js.undefined)
    
    @scala.inline
    def setRows(value: js.Any): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setStripHtml(value: Boolean): Self = this.set("stripHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripHtml: Self = this.set("stripHtml", js.undefined)
    
    @scala.inline
    def setStripNewlines(value: Boolean): Self = this.set("stripNewlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripNewlines: Self = this.set("stripNewlines", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
}
