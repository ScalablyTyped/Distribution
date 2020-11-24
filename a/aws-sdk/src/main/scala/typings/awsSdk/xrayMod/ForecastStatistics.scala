package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForecastStatistics extends js.Object {
  
  /**
    * The upper limit of fault counts for a service.
    */
  var FaultCountHigh: js.UndefOr[NullableLong] = js.native
  
  /**
    * The lower limit of fault counts for a service.
    */
  var FaultCountLow: js.UndefOr[NullableLong] = js.native
}
object ForecastStatistics {
  
  @scala.inline
  def apply(): ForecastStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastStatistics]
  }
  
  @scala.inline
  implicit class ForecastStatisticsOps[Self <: ForecastStatistics] (val x: Self) extends AnyVal {
    
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
    def setFaultCountHigh(value: NullableLong): Self = this.set("FaultCountHigh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaultCountHigh: Self = this.set("FaultCountHigh", js.undefined)
    
    @scala.inline
    def setFaultCountLow(value: NullableLong): Self = this.set("FaultCountLow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaultCountLow: Self = this.set("FaultCountLow", js.undefined)
  }
}
