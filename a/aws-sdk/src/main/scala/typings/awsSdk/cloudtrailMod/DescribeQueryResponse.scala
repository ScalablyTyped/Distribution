package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQueryResponse extends StObject {
  
  /**
    * The error message returned if a query failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.cloudtrailMod.ErrorMessage] = js.undefined
  
  /**
    * The ID of the query.
    */
  var QueryId: js.UndefOr[UUID] = js.undefined
  
  /**
    * Metadata about a query, including the number of events that were matched, the total number of events scanned, the query run time in milliseconds, and the query's creation time.
    */
  var QueryStatistics: js.UndefOr[QueryStatisticsForDescribeQuery] = js.undefined
  
  /**
    * The status of a query. Values for QueryStatus include QUEUED, RUNNING, FINISHED, FAILED, TIMED_OUT, or CANCELLED 
    */
  var QueryStatus: js.UndefOr[typings.awsSdk.cloudtrailMod.QueryStatus] = js.undefined
  
  /**
    * The SQL code of a query.
    */
  var QueryString: js.UndefOr[QueryStatement] = js.undefined
}
object DescribeQueryResponse {
  
  inline def apply(): DescribeQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueryResponse]
  }
  
  extension [Self <: DescribeQueryResponse](x: Self) {
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setQueryId(value: UUID): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "QueryId", js.undefined)
    
    inline def setQueryStatistics(value: QueryStatisticsForDescribeQuery): Self = StObject.set(x, "QueryStatistics", value.asInstanceOf[js.Any])
    
    inline def setQueryStatisticsUndefined: Self = StObject.set(x, "QueryStatistics", js.undefined)
    
    inline def setQueryStatus(value: QueryStatus): Self = StObject.set(x, "QueryStatus", value.asInstanceOf[js.Any])
    
    inline def setQueryStatusUndefined: Self = StObject.set(x, "QueryStatus", js.undefined)
    
    inline def setQueryString(value: QueryStatement): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "QueryString", js.undefined)
  }
}
