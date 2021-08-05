package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSummary extends StObject {
  
  var executionElapsed: String
  
  var executionEnd: String
  
  var executionStart: String
  
  var hasError: Boolean
  
  var id: Double
  
  var resultSetSummaries: js.Array[ResultSetSummary]
  
  var selection: ISelectionData
}
object BatchSummary {
  
  inline def apply(
    executionElapsed: String,
    executionEnd: String,
    executionStart: String,
    hasError: Boolean,
    id: Double,
    resultSetSummaries: js.Array[ResultSetSummary],
    selection: ISelectionData
  ): BatchSummary = {
    val __obj = js.Dynamic.literal(executionElapsed = executionElapsed.asInstanceOf[js.Any], executionEnd = executionEnd.asInstanceOf[js.Any], executionStart = executionStart.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resultSetSummaries = resultSetSummaries.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSummary]
  }
  
  extension [Self <: BatchSummary](x: Self) {
    
    inline def setExecutionElapsed(value: String): Self = StObject.set(x, "executionElapsed", value.asInstanceOf[js.Any])
    
    inline def setExecutionEnd(value: String): Self = StObject.set(x, "executionEnd", value.asInstanceOf[js.Any])
    
    inline def setExecutionStart(value: String): Self = StObject.set(x, "executionStart", value.asInstanceOf[js.Any])
    
    inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResultSetSummaries(value: js.Array[ResultSetSummary]): Self = StObject.set(x, "resultSetSummaries", value.asInstanceOf[js.Any])
    
    inline def setResultSetSummariesVarargs(value: ResultSetSummary*): Self = StObject.set(x, "resultSetSummaries", js.Array(value :_*))
    
    inline def setSelection(value: ISelectionData): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
