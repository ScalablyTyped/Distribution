package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecuteResultSetNotificationParams extends StObject {
  
  var ownerUri: String
  
  var resultSetSummary: ResultSetSummary
}
object QueryExecuteResultSetNotificationParams {
  
  @scala.inline
  def apply(ownerUri: String, resultSetSummary: ResultSetSummary): QueryExecuteResultSetNotificationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], resultSetSummary = resultSetSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteResultSetNotificationParams]
  }
  
  @scala.inline
  implicit class QueryExecuteResultSetNotificationParamsMutableBuilder[Self <: QueryExecuteResultSetNotificationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetSummary(value: ResultSetSummary): Self = StObject.set(x, "resultSetSummary", value.asInstanceOf[js.Any])
  }
}
