package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryInfo extends StObject {
  
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
  implicit class QueryInfoMutableBuilder[Self <: QueryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: Timestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    @scala.inline
    def setQueryId(value: QueryId): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
    
    @scala.inline
    def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    @scala.inline
    def setStatus(value: QueryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
