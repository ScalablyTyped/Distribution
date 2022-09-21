package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionStatistics extends StObject {
  
  /**
    * The average time the request took to be executed.
    */
  var AverageExecutionTimeMillis: js.UndefOr[NumberOfMilliseconds] = js.undefined
  
  /**
    * The amount of data that was scanned in bytes.
    */
  var DataScannedBytes: js.UndefOr[NumberOfBytes] = js.undefined
  
  /**
    * The number of work units executed.
    */
  var WorkUnitsExecutedCount: js.UndefOr[NumberOfItems] = js.undefined
}
object ExecutionStatistics {
  
  inline def apply(): ExecutionStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStatistics]
  }
  
  extension [Self <: ExecutionStatistics](x: Self) {
    
    inline def setAverageExecutionTimeMillis(value: NumberOfMilliseconds): Self = StObject.set(x, "AverageExecutionTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setAverageExecutionTimeMillisUndefined: Self = StObject.set(x, "AverageExecutionTimeMillis", js.undefined)
    
    inline def setDataScannedBytes(value: NumberOfBytes): Self = StObject.set(x, "DataScannedBytes", value.asInstanceOf[js.Any])
    
    inline def setDataScannedBytesUndefined: Self = StObject.set(x, "DataScannedBytes", js.undefined)
    
    inline def setWorkUnitsExecutedCount(value: NumberOfItems): Self = StObject.set(x, "WorkUnitsExecutedCount", value.asInstanceOf[js.Any])
    
    inline def setWorkUnitsExecutedCountUndefined: Self = StObject.set(x, "WorkUnitsExecutedCount", js.undefined)
  }
}
