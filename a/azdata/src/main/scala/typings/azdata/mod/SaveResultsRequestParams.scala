package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveResultsRequestParams extends StObject {
  
  var batchIndex: Double
  
  var columnEndIndex: Double
  
  var columnStartIndex: Double
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var filePath: String
  
  var formatted: js.UndefOr[Boolean] = js.undefined
  
  var includeHeaders: js.UndefOr[Boolean] = js.undefined
  
  var lineSeperator: js.UndefOr[String] = js.undefined
  
  var ownerUri: String
  
  /**
    * 'csv', 'json', 'excel', 'xml'
    */
  var resultFormat: String
  
  var resultSetIndex: Double
  
  var rowEndIndex: Double
  
  var rowStartIndex: Double
  
  var textIdentifier: js.UndefOr[String] = js.undefined
}
object SaveResultsRequestParams {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SaveResultsRequestParams] (val x: Self) extends AnyVal {
    
    inline def setBatchIndex(value: Double): Self = StObject.set(x, "batchIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnEndIndex(value: Double): Self = StObject.set(x, "columnEndIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnStartIndex(value: Double): Self = StObject.set(x, "columnStartIndex", value.asInstanceOf[js.Any])
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFormatted(value: Boolean): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    inline def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
    
    inline def setIncludeHeaders(value: Boolean): Self = StObject.set(x, "includeHeaders", value.asInstanceOf[js.Any])
    
    inline def setIncludeHeadersUndefined: Self = StObject.set(x, "includeHeaders", js.undefined)
    
    inline def setLineSeperator(value: String): Self = StObject.set(x, "lineSeperator", value.asInstanceOf[js.Any])
    
    inline def setLineSeperatorUndefined: Self = StObject.set(x, "lineSeperator", js.undefined)
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    inline def setResultFormat(value: String): Self = StObject.set(x, "resultFormat", value.asInstanceOf[js.Any])
    
    inline def setResultSetIndex(value: Double): Self = StObject.set(x, "resultSetIndex", value.asInstanceOf[js.Any])
    
    inline def setRowEndIndex(value: Double): Self = StObject.set(x, "rowEndIndex", value.asInstanceOf[js.Any])
    
    inline def setRowStartIndex(value: Double): Self = StObject.set(x, "rowStartIndex", value.asInstanceOf[js.Any])
    
    inline def setTextIdentifier(value: String): Self = StObject.set(x, "textIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTextIdentifierUndefined: Self = StObject.set(x, "textIdentifier", js.undefined)
  }
}
