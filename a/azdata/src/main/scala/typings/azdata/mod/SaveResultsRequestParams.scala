package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveResultsRequestParams extends StObject {
  
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
  implicit class SaveResultsRequestParamsMutableBuilder[Self <: SaveResultsRequestParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchIndex(value: Double): Self = StObject.set(x, "batchIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnEndIndex(value: Double): Self = StObject.set(x, "columnEndIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStartIndex(value: Double): Self = StObject.set(x, "columnStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatted(value: Boolean): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
    
    @scala.inline
    def setIncludeHeaders(value: Boolean): Self = StObject.set(x, "includeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHeadersUndefined: Self = StObject.set(x, "includeHeaders", js.undefined)
    
    @scala.inline
    def setLineSeperator(value: String): Self = StObject.set(x, "lineSeperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSeperatorUndefined: Self = StObject.set(x, "lineSeperator", js.undefined)
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultFormat(value: String): Self = StObject.set(x, "resultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetIndex(value: Double): Self = StObject.set(x, "resultSetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowEndIndex(value: Double): Self = StObject.set(x, "rowEndIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStartIndex(value: Double): Self = StObject.set(x, "rowStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextIdentifier(value: String): Self = StObject.set(x, "textIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextIdentifierUndefined: Self = StObject.set(x, "textIdentifier", js.undefined)
  }
}
