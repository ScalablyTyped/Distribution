package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecuteSubsetParams extends StObject {
  
  var batchIndex: Double
  
  var ownerUri: String
  
  var resultSetIndex: Double
  
  var rowsCount: Double
  
  var rowsStartIndex: Double
}
object QueryExecuteSubsetParams {
  
  inline def apply(
    batchIndex: Double,
    ownerUri: String,
    resultSetIndex: Double,
    rowsCount: Double,
    rowsStartIndex: Double
  ): QueryExecuteSubsetParams = {
    val __obj = js.Dynamic.literal(batchIndex = batchIndex.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], resultSetIndex = resultSetIndex.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], rowsStartIndex = rowsStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteSubsetParams]
  }
  
  extension [Self <: QueryExecuteSubsetParams](x: Self) {
    
    inline def setBatchIndex(value: Double): Self = StObject.set(x, "batchIndex", value.asInstanceOf[js.Any])
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    inline def setResultSetIndex(value: Double): Self = StObject.set(x, "resultSetIndex", value.asInstanceOf[js.Any])
    
    inline def setRowsCount(value: Double): Self = StObject.set(x, "rowsCount", value.asInstanceOf[js.Any])
    
    inline def setRowsStartIndex(value: Double): Self = StObject.set(x, "rowsStartIndex", value.asInstanceOf[js.Any])
  }
}
