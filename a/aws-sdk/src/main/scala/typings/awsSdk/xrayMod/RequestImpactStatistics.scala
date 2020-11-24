package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestImpactStatistics extends js.Object {
  
  /**
    * The number of requests that have resulted in a fault,
    */
  var FaultCount: js.UndefOr[NullableLong] = js.native
  
  /**
    * The number of successful requests.
    */
  var OkCount: js.UndefOr[NullableLong] = js.native
  
  /**
    * The total number of requests to the service.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.native
}
object RequestImpactStatistics {
  
  @scala.inline
  def apply(): RequestImpactStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestImpactStatistics]
  }
  
  @scala.inline
  implicit class RequestImpactStatisticsOps[Self <: RequestImpactStatistics] (val x: Self) extends AnyVal {
    
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
    def setFaultCount(value: NullableLong): Self = this.set("FaultCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaultCount: Self = this.set("FaultCount", js.undefined)
    
    @scala.inline
    def setOkCount(value: NullableLong): Self = this.set("OkCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkCount: Self = this.set("OkCount", js.undefined)
    
    @scala.inline
    def setTotalCount(value: NullableLong): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
  }
}
