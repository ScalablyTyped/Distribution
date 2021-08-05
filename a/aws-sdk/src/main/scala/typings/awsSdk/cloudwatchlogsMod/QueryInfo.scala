package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryInfo extends StObject {
  
  /**
    * The date and time that this query was created.
    */
  var createTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the log group scanned by this query.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * The unique ID number of this query.
    */
  var queryId: js.UndefOr[QueryId] = js.undefined
  
  /**
    * The query string used in this query.
    */
  var queryString: js.UndefOr[QueryString] = js.undefined
  
  /**
    * The status of this query. Possible values are Cancelled, Complete, Failed, Running, Scheduled, and Unknown.
    */
  var status: js.UndefOr[QueryStatus] = js.undefined
}
object QueryInfo {
  
  inline def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  
  extension [Self <: QueryInfo](x: Self) {
    
    inline def setCreateTime(value: Timestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    inline def setQueryId(value: QueryId): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    inline def setStatus(value: QueryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
