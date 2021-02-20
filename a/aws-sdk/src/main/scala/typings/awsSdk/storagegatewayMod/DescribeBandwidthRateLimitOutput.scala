package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBandwidthRateLimitOutput extends StObject {
  
  /**
    * The average download bandwidth rate limit in bits per second. This field does not appear in the response if the download rate limit is not set.
    */
  var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.native
  
  /**
    * The average upload bandwidth rate limit in bits per second. This field does not appear in the response if the upload rate limit is not set.
    */
  var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.native
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}
object DescribeBandwidthRateLimitOutput {
  
  @scala.inline
  def apply(): DescribeBandwidthRateLimitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBandwidthRateLimitOutput]
  }
  
  @scala.inline
  implicit class DescribeBandwidthRateLimitOutputMutableBuilder[Self <: DescribeBandwidthRateLimitOutput] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
