package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBandwidthRateLimitScheduleInput extends js.Object {
  
  /**
    *  An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit intervals have been scheduled, the array is empty. 
    */
  var BandwidthRateLimitIntervals: typings.awsSdk.storagegatewayMod.BandwidthRateLimitIntervals = js.native
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}
object UpdateBandwidthRateLimitScheduleInput {
  
  @scala.inline
  def apply(BandwidthRateLimitIntervals: BandwidthRateLimitIntervals, GatewayARN: GatewayARN): UpdateBandwidthRateLimitScheduleInput = {
    val __obj = js.Dynamic.literal(BandwidthRateLimitIntervals = BandwidthRateLimitIntervals.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBandwidthRateLimitScheduleInput]
  }
  
  @scala.inline
  implicit class UpdateBandwidthRateLimitScheduleInputOps[Self <: UpdateBandwidthRateLimitScheduleInput] (val x: Self) extends AnyVal {
    
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
    def setBandwidthRateLimitIntervalsVarargs(value: BandwidthRateLimitInterval*): Self = this.set("BandwidthRateLimitIntervals", js.Array(value :_*))
    
    @scala.inline
    def setBandwidthRateLimitIntervals(value: BandwidthRateLimitIntervals): Self = this.set("BandwidthRateLimitIntervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
  }
}
