package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelQueryRequest extends StObject {
  
  /**
    *  The id of the query that needs to be cancelled. QueryID is returned as part of QueryResult. 
    */
  var QueryId: typings.awsSdk.timestreamqueryMod.QueryId = js.native
}
object CancelQueryRequest {
  
  @scala.inline
  def apply(QueryId: QueryId): CancelQueryRequest = {
    val __obj = js.Dynamic.literal(QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelQueryRequest]
  }
  
  @scala.inline
  implicit class CancelQueryRequestMutableBuilder[Self <: CancelQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryId(value: QueryId): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
  }
}
