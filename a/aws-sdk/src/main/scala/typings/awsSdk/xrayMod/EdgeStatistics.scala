package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeStatistics extends js.Object {
  
  /**
    * Information about requests that failed with a 4xx Client Error status code.
    */
  var ErrorStatistics: js.UndefOr[typings.awsSdk.xrayMod.ErrorStatistics] = js.native
  
  /**
    * Information about requests that failed with a 5xx Server Error status code.
    */
  var FaultStatistics: js.UndefOr[typings.awsSdk.xrayMod.FaultStatistics] = js.native
  
  /**
    * The number of requests that completed with a 2xx Success status code.
    */
  var OkCount: js.UndefOr[NullableLong] = js.native
  
  /**
    * The total number of completed requests.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.native
  
  /**
    * The aggregate response time of completed requests.
    */
  var TotalResponseTime: js.UndefOr[NullableDouble] = js.native
}
object EdgeStatistics {
  
  @scala.inline
  def apply(): EdgeStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeStatistics]
  }
  
  @scala.inline
  implicit class EdgeStatisticsOps[Self <: EdgeStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorStatistics(value: ErrorStatistics): Self = this.set("ErrorStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorStatistics: Self = this.set("ErrorStatistics", js.undefined)
    
    @scala.inline
    def setFaultStatistics(value: FaultStatistics): Self = this.set("FaultStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaultStatistics: Self = this.set("FaultStatistics", js.undefined)
    
    @scala.inline
    def setOkCount(value: NullableLong): Self = this.set("OkCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkCount: Self = this.set("OkCount", js.undefined)
    
    @scala.inline
    def setTotalCount(value: NullableLong): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
    
    @scala.inline
    def setTotalResponseTime(value: NullableDouble): Self = this.set("TotalResponseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalResponseTime: Self = this.set("TotalResponseTime", js.undefined)
  }
}
