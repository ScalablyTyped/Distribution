package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecuteResultSetNotificationParams extends StObject {
  
  var ownerUri: String
  
  var resultSetSummary: ResultSetSummary
}
object QueryExecuteResultSetNotificationParams {
  
  inline def apply(ownerUri: String, resultSetSummary: ResultSetSummary): QueryExecuteResultSetNotificationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], resultSetSummary = resultSetSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteResultSetNotificationParams]
  }
  
  extension [Self <: QueryExecuteResultSetNotificationParams](x: Self) {
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    inline def setResultSetSummary(value: ResultSetSummary): Self = StObject.set(x, "resultSetSummary", value.asInstanceOf[js.Any])
  }
}
