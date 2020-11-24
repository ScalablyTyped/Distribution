package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopQueryRequest extends js.Object {
  
  /**
    * The ID number of the query to stop. To find this ID number, use DescribeQueries.
    */
  var queryId: QueryId = js.native
}
object StopQueryRequest {
  
  @scala.inline
  def apply(queryId: QueryId): StopQueryRequest = {
    val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopQueryRequest]
  }
  
  @scala.inline
  implicit class StopQueryRequestOps[Self <: StopQueryRequest] (val x: Self) extends AnyVal {
    
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
  }
}
