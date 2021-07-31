package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartQueryResponse extends StObject {
  
  /**
    * The unique ID of the query. 
    */
  var queryId: js.UndefOr[QueryId] = js.undefined
}
object StartQueryResponse {
  
  @scala.inline
  def apply(): StartQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartQueryResponse]
  }
  
  @scala.inline
  implicit class StartQueryResponseMutableBuilder[Self <: StartQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryId(value: QueryId): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
  }
}
