package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionStats extends StObject {
  
  /**
    * Bytes metered for a single scheduled query run.
    */
  var BytesMetered: js.UndefOr[Long] = js.undefined
  
  /**
    * Data writes metered for records ingested in a single scheduled query run.
    */
  var DataWrites: js.UndefOr[Long] = js.undefined
  
  /**
    * Total time, measured in milliseconds, that was needed for the scheduled query run to complete.
    */
  var ExecutionTimeInMillis: js.UndefOr[Long] = js.undefined
  
  /**
    * Number of rows present in the output from running a query before ingestion to destination data source.
    */
  var QueryResultRows: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of records ingested for a single scheduled query run. 
    */
  var RecordsIngested: js.UndefOr[Long] = js.undefined
}
object ExecutionStats {
  
  inline def apply(): ExecutionStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionStats] (val x: Self) extends AnyVal {
    
    inline def setBytesMetered(value: Long): Self = StObject.set(x, "BytesMetered", value.asInstanceOf[js.Any])
    
    inline def setBytesMeteredUndefined: Self = StObject.set(x, "BytesMetered", js.undefined)
    
    inline def setDataWrites(value: Long): Self = StObject.set(x, "DataWrites", value.asInstanceOf[js.Any])
    
    inline def setDataWritesUndefined: Self = StObject.set(x, "DataWrites", js.undefined)
    
    inline def setExecutionTimeInMillis(value: Long): Self = StObject.set(x, "ExecutionTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeInMillisUndefined: Self = StObject.set(x, "ExecutionTimeInMillis", js.undefined)
    
    inline def setQueryResultRows(value: Long): Self = StObject.set(x, "QueryResultRows", value.asInstanceOf[js.Any])
    
    inline def setQueryResultRowsUndefined: Self = StObject.set(x, "QueryResultRows", js.undefined)
    
    inline def setRecordsIngested(value: Long): Self = StObject.set(x, "RecordsIngested", value.asInstanceOf[js.Any])
    
    inline def setRecordsIngestedUndefined: Self = StObject.set(x, "RecordsIngested", js.undefined)
  }
}
