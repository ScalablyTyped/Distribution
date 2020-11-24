package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveResultsRequestParams extends js.Object {
  
  var batchIndex: Double = js.native
  
  var columnEndIndex: Double = js.native
  
  var columnStartIndex: Double = js.native
  
  var delimiter: js.UndefOr[String] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var filePath: String = js.native
  
  var formatted: js.UndefOr[Boolean] = js.native
  
  var includeHeaders: js.UndefOr[Boolean] = js.native
  
  var lineSeperator: js.UndefOr[String] = js.native
  
  var ownerUri: String = js.native
  
  /**
    * 'csv', 'json', 'excel', 'xml'
    */
  var resultFormat: String = js.native
  
  var resultSetIndex: Double = js.native
  
  var rowEndIndex: Double = js.native
  
  var rowStartIndex: Double = js.native
  
  var textIdentifier: js.UndefOr[String] = js.native
}
object SaveResultsRequestParams {
  
  @scala.inline
  def apply(
    batchIndex: Double,
    columnEndIndex: Double,
    columnStartIndex: Double,
    filePath: String,
    ownerUri: String,
    resultFormat: String,
    resultSetIndex: Double,
    rowEndIndex: Double,
    rowStartIndex: Double
  ): SaveResultsRequestParams = {
    val __obj = js.Dynamic.literal(batchIndex = batchIndex.asInstanceOf[js.Any], columnEndIndex = columnEndIndex.asInstanceOf[js.Any], columnStartIndex = columnStartIndex.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], resultFormat = resultFormat.asInstanceOf[js.Any], resultSetIndex = resultSetIndex.asInstanceOf[js.Any], rowEndIndex = rowEndIndex.asInstanceOf[js.Any], rowStartIndex = rowStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResultsRequestParams]
  }
  
  @scala.inline
  implicit class SaveResultsRequestParamsOps[Self <: SaveResultsRequestParams] (val x: Self) extends AnyVal {
    
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
    def setBatchIndex(value: Double): Self = this.set("batchIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnEndIndex(value: Double): Self = this.set("columnEndIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStartIndex(value: Double): Self = this.set("columnStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUri(value: String): Self = this.set("ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultFormat(value: String): Self = this.set("resultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetIndex(value: Double): Self = this.set("resultSetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowEndIndex(value: Double): Self = this.set("rowEndIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStartIndex(value: Double): Self = this.set("rowStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFormatted(value: Boolean): Self = this.set("formatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatted: Self = this.set("formatted", js.undefined)
    
    @scala.inline
    def setIncludeHeaders(value: Boolean): Self = this.set("includeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeHeaders: Self = this.set("includeHeaders", js.undefined)
    
    @scala.inline
    def setLineSeperator(value: String): Self = this.set("lineSeperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSeperator: Self = this.set("lineSeperator", js.undefined)
    
    @scala.inline
    def setTextIdentifier(value: String): Self = this.set("textIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextIdentifier: Self = this.set("textIdentifier", js.undefined)
  }
}
