package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecuteCompleteNotificationResult extends StObject {
  
  var batchSummaries: js.Array[BatchSummary]
  
  var ownerUri: String
}
object QueryExecuteCompleteNotificationResult {
  
  inline def apply(batchSummaries: js.Array[BatchSummary], ownerUri: String): QueryExecuteCompleteNotificationResult = {
    val __obj = js.Dynamic.literal(batchSummaries = batchSummaries.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteCompleteNotificationResult]
  }
  
  extension [Self <: QueryExecuteCompleteNotificationResult](x: Self) {
    
    inline def setBatchSummaries(value: js.Array[BatchSummary]): Self = StObject.set(x, "batchSummaries", value.asInstanceOf[js.Any])
    
    inline def setBatchSummariesVarargs(value: BatchSummary*): Self = StObject.set(x, "batchSummaries", js.Array(value :_*))
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
  }
}
