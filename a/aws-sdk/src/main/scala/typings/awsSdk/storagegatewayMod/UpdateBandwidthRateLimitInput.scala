package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBandwidthRateLimitInput extends StObject {
  
  /**
    * The average download bandwidth rate limit in bits per second.
    */
  var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined
  
  /**
    * The average upload bandwidth rate limit in bits per second.
    */
  var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object UpdateBandwidthRateLimitInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): UpdateBandwidthRateLimitInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBandwidthRateLimitInput]
  }
  
  @scala.inline
  implicit class UpdateBandwidthRateLimitInputMutableBuilder[Self <: UpdateBandwidthRateLimitInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageDownloadRateLimitInBitsPerSec(value: BandwidthDownloadRateLimit): Self = StObject.set(x, "AverageDownloadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageDownloadRateLimitInBitsPerSecUndefined: Self = StObject.set(x, "AverageDownloadRateLimitInBitsPerSec", js.undefined)
    
    @scala.inline
    def setAverageUploadRateLimitInBitsPerSec(value: BandwidthUploadRateLimit): Self = StObject.set(x, "AverageUploadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUploadRateLimitInBitsPerSecUndefined: Self = StObject.set(x, "AverageUploadRateLimitInBitsPerSec", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
