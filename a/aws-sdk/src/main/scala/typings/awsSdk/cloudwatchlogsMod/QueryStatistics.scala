package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryStatistics extends StObject {
  
  /**
    * The total number of bytes in the log events scanned during the query.
    */
  var bytesScanned: js.UndefOr[StatsValue] = js.native
  
  /**
    * The number of log events that matched the query string.
    */
  var recordsMatched: js.UndefOr[StatsValue] = js.native
  
  /**
    * The total number of log events scanned during the query.
    */
  var recordsScanned: js.UndefOr[StatsValue] = js.native
}
object QueryStatistics {
  
  @scala.inline
  def apply(): QueryStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStatistics]
  }
  
  @scala.inline
  implicit class QueryStatisticsMutableBuilder[Self <: QueryStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesScanned(value: StatsValue): Self = StObject.set(x, "bytesScanned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesScannedUndefined: Self = StObject.set(x, "bytesScanned", js.undefined)
    
    @scala.inline
    def setRecordsMatched(value: StatsValue): Self = StObject.set(x, "recordsMatched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsMatchedUndefined: Self = StObject.set(x, "recordsMatched", js.undefined)
    
    @scala.inline
    def setRecordsScanned(value: StatsValue): Self = StObject.set(x, "recordsScanned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsScannedUndefined: Self = StObject.set(x, "recordsScanned", js.undefined)
  }
}
