package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryStatistics extends js.Object {
  
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
  implicit class QueryStatisticsOps[Self <: QueryStatistics] (val x: Self) extends AnyVal {
    
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
    def setBytesScanned(value: StatsValue): Self = this.set("bytesScanned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesScanned: Self = this.set("bytesScanned", js.undefined)
    
    @scala.inline
    def setRecordsMatched(value: StatsValue): Self = this.set("recordsMatched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordsMatched: Self = this.set("recordsMatched", js.undefined)
    
    @scala.inline
    def setRecordsScanned(value: StatsValue): Self = this.set("recordsScanned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordsScanned: Self = this.set("recordsScanned", js.undefined)
  }
}
