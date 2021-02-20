package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResultContinuation extends StObject {
  
  var tableService: TableService = js.native
}
object QueryResultContinuation {
  
  @scala.inline
  def apply(tableService: TableService): QueryResultContinuation = {
    val __obj = js.Dynamic.literal(tableService = tableService.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultContinuation]
  }
  
  @scala.inline
  implicit class QueryResultContinuationMutableBuilder[Self <: QueryResultContinuation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableService(value: TableService): Self = StObject.set(x, "tableService", value.asInstanceOf[js.Any])
  }
}
