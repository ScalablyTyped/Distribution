package typings.awsSdkClientXrayNode.typesFaultStatisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaultStatistics extends js.Object {
  
  /**
    * <p>The number of requests that failed with untracked 5xx Server Error status codes.</p>
    */
  var OtherCount: js.UndefOr[Double] = js.native
  
  /**
    * <p>The total number of requests that failed with a 5xx Server Error status code.</p>
    */
  var TotalCount: js.UndefOr[Double] = js.native
}
object FaultStatistics {
  
  @scala.inline
  def apply(): FaultStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaultStatistics]
  }
  
  @scala.inline
  implicit class FaultStatisticsOps[Self <: FaultStatistics] (val x: Self) extends AnyVal {
    
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
    def setOtherCount(value: Double): Self = this.set("OtherCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherCount: Self = this.set("OtherCount", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
  }
}
