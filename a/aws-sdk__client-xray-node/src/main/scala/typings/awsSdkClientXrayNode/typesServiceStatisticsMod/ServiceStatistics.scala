package typings.awsSdkClientXrayNode.typesServiceStatisticsMod

import typings.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics
import typings.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceStatistics extends js.Object {
  
  /**
    * <p>Information about requests that failed with a 4xx Client Error status code.</p>
    */
  var ErrorStatistics: js.UndefOr[typings.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics] = js.native
  
  /**
    * <p>Information about requests that failed with a 5xx Server Error status code.</p>
    */
  var FaultStatistics: js.UndefOr[typings.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics] = js.native
  
  /**
    * <p>The number of requests that completed with a 2xx Success status code.</p>
    */
  var OkCount: js.UndefOr[Double] = js.native
  
  /**
    * <p>The total number of completed requests.</p>
    */
  var TotalCount: js.UndefOr[Double] = js.native
  
  /**
    * <p>The aggregate response time of completed requests.</p>
    */
  var TotalResponseTime: js.UndefOr[Double] = js.native
}
object ServiceStatistics {
  
  @scala.inline
  def apply(): ServiceStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceStatistics]
  }
  
  @scala.inline
  implicit class ServiceStatisticsOps[Self <: ServiceStatistics] (val x: Self) extends AnyVal {
    
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
    def setErrorStatistics(value: ErrorStatistics): Self = this.set("ErrorStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorStatistics: Self = this.set("ErrorStatistics", js.undefined)
    
    @scala.inline
    def setFaultStatistics(value: FaultStatistics): Self = this.set("FaultStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaultStatistics: Self = this.set("FaultStatistics", js.undefined)
    
    @scala.inline
    def setOkCount(value: Double): Self = this.set("OkCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkCount: Self = this.set("OkCount", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
    
    @scala.inline
    def setTotalResponseTime(value: Double): Self = this.set("TotalResponseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalResponseTime: Self = this.set("TotalResponseTime", js.undefined)
  }
}
