package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartQueryResponse extends js.Object {
  
  /**
    * The unique ID of the query. 
    */
  var queryId: js.UndefOr[QueryId] = js.native
}
object StartQueryResponse {
  
  @scala.inline
  def apply(): StartQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartQueryResponse]
  }
  
  @scala.inline
  implicit class StartQueryResponseOps[Self <: StartQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQueryId(value: QueryId): Self = this.set("queryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryId: Self = this.set("queryId", js.undefined)
  }
}
