package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBandwidthRateLimitScheduleOutput extends js.Object {
  
  /**
    *  An array that contains the bandwidth rate limit intervals for a tape or volume gateway. 
    */
  var BandwidthRateLimitIntervals: js.UndefOr[typings.awsSdk.storagegatewayMod.BandwidthRateLimitIntervals] = js.native
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}
object DescribeBandwidthRateLimitScheduleOutput {
  
  @scala.inline
  def apply(): DescribeBandwidthRateLimitScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBandwidthRateLimitScheduleOutput]
  }
  
  @scala.inline
  implicit class DescribeBandwidthRateLimitScheduleOutputOps[Self <: DescribeBandwidthRateLimitScheduleOutput] (val x: Self) extends AnyVal {
    
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
    def deleteBandwidthRateLimitIntervals: Self = this.set("BandwidthRateLimitIntervals", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
  }
}
