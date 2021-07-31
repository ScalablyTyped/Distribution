package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBandwidthRateLimitScheduleOutput extends StObject {
  
  /**
    *  An array that contains the bandwidth rate limit intervals for a tape or volume gateway. 
    */
  var BandwidthRateLimitIntervals: js.UndefOr[typings.awsSdk.storagegatewayMod.BandwidthRateLimitIntervals] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
}
object DescribeBandwidthRateLimitScheduleOutput {
  
  @scala.inline
  def apply(): DescribeBandwidthRateLimitScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBandwidthRateLimitScheduleOutput]
  }
  
  @scala.inline
  implicit class DescribeBandwidthRateLimitScheduleOutputMutableBuilder[Self <: DescribeBandwidthRateLimitScheduleOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidthRateLimitIntervals(value: BandwidthRateLimitIntervals): Self = StObject.set(x, "BandwidthRateLimitIntervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthRateLimitIntervalsUndefined: Self = StObject.set(x, "BandwidthRateLimitIntervals", js.undefined)
    
    @scala.inline
    def setBandwidthRateLimitIntervalsVarargs(value: BandwidthRateLimitInterval*): Self = StObject.set(x, "BandwidthRateLimitIntervals", js.Array(value :_*))
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
