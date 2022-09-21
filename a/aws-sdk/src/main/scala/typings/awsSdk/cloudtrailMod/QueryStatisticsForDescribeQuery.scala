package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStatisticsForDescribeQuery extends StObject {
  
  /**
    * The total bytes that the query scanned in the event data store. This value matches the number of bytes for which your account is billed for the query, unless the query is still running.
    */
  var BytesScanned: js.UndefOr[Long] = js.undefined
  
  /**
    * The creation time of the query.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of events that matched a query.
    */
  var EventsMatched: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of events that the query scanned in the event data store.
    */
  var EventsScanned: js.UndefOr[Long] = js.undefined
  
  /**
    * The query's run time, in milliseconds.
    */
  var ExecutionTimeInMillis: js.UndefOr[Integer] = js.undefined
}
object QueryStatisticsForDescribeQuery {
  
  inline def apply(): QueryStatisticsForDescribeQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStatisticsForDescribeQuery]
  }
  
  extension [Self <: QueryStatisticsForDescribeQuery](x: Self) {
    
    inline def setBytesScanned(value: Long): Self = StObject.set(x, "BytesScanned", value.asInstanceOf[js.Any])
    
    inline def setBytesScannedUndefined: Self = StObject.set(x, "BytesScanned", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEventsMatched(value: Long): Self = StObject.set(x, "EventsMatched", value.asInstanceOf[js.Any])
    
    inline def setEventsMatchedUndefined: Self = StObject.set(x, "EventsMatched", js.undefined)
    
    inline def setEventsScanned(value: Long): Self = StObject.set(x, "EventsScanned", value.asInstanceOf[js.Any])
    
    inline def setEventsScannedUndefined: Self = StObject.set(x, "EventsScanned", js.undefined)
    
    inline def setExecutionTimeInMillis(value: Integer): Self = StObject.set(x, "ExecutionTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeInMillisUndefined: Self = StObject.set(x, "ExecutionTimeInMillis", js.undefined)
  }
}
