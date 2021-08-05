package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecuteBatchNotificationParams extends StObject {
  
  var batchSummary: BatchSummary
  
  var ownerUri: String
}
object QueryExecuteBatchNotificationParams {
  
  inline def apply(batchSummary: BatchSummary, ownerUri: String): QueryExecuteBatchNotificationParams = {
    val __obj = js.Dynamic.literal(batchSummary = batchSummary.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteBatchNotificationParams]
  }
  
  extension [Self <: QueryExecuteBatchNotificationParams](x: Self) {
    
    inline def setBatchSummary(value: BatchSummary): Self = StObject.set(x, "batchSummary", value.asInstanceOf[js.Any])
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
  }
}
