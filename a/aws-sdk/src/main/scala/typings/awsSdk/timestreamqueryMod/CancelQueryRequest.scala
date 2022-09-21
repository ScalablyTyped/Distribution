package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelQueryRequest extends StObject {
  
  /**
    *  The ID of the query that needs to be cancelled. QueryID is returned as part of the query result. 
    */
  var QueryId: typings.awsSdk.timestreamqueryMod.QueryId
}
object CancelQueryRequest {
  
  inline def apply(QueryId: QueryId): CancelQueryRequest = {
    val __obj = js.Dynamic.literal(QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelQueryRequest]
  }
  
  extension [Self <: CancelQueryRequest](x: Self) {
    
    inline def setQueryId(value: QueryId): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
  }
}
