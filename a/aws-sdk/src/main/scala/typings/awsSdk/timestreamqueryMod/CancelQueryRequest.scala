package typings.awsSdk.timestreamqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelQueryRequest extends js.Object {
  
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
  implicit class CancelQueryRequestOps[Self <: CancelQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQueryId(value: QueryId): Self = this.set("QueryId", value.asInstanceOf[js.Any])
  }
}
