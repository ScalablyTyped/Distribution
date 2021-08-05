package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResultContinuation extends StObject {
  
  var tableService: TableService
}
object QueryResultContinuation {
  
  inline def apply(tableService: TableService): QueryResultContinuation = {
    val __obj = js.Dynamic.literal(tableService = tableService.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultContinuation]
  }
  
  extension [Self <: QueryResultContinuation](x: Self) {
    
    inline def setTableService(value: TableService): Self = StObject.set(x, "tableService", value.asInstanceOf[js.Any])
  }
}
