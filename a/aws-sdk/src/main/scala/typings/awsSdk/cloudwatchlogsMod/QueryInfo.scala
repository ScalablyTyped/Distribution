package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryInfo extends js.Object {
  
  /**
    * The date and time that this query was created.
    */
  var createTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the log group scanned by this query.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  
  /**
    * The unique ID number of this query.
    */
  var queryId: js.UndefOr[QueryId] = js.native
  
  /**
    * The query string used in this query.
    */
  var queryString: js.UndefOr[QueryString] = js.native
  
  /**
    * The status of this query. Possible values are Cancelled, Complete, Failed, Running, Scheduled, and Unknown.
    */
  var status: js.UndefOr[QueryStatus] = js.native
}
object QueryInfo {
  
  @scala.inline
  def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  
  @scala.inline
  implicit class QueryInfoOps[Self <: QueryInfo] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: Timestamp): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupName: Self = this.set("logGroupName", js.undefined)
    
    @scala.inline
    def setQueryId(value: QueryId): Self = this.set("queryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryId: Self = this.set("queryId", js.undefined)
    
    @scala.inline
    def setQueryString(value: QueryString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryString: Self = this.set("queryString", js.undefined)
    
    @scala.inline
    def setStatus(value: QueryStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
