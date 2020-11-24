package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBandwidthRateLimitOutput extends js.Object {
  
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
  implicit class DescribeBandwidthRateLimitOutputOps[Self <: DescribeBandwidthRateLimitOutput] (val x: Self) extends AnyVal {
    
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
    def setAverageDownloadRateLimitInBitsPerSec(value: BandwidthDownloadRateLimit): Self = this.set("AverageDownloadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageDownloadRateLimitInBitsPerSec: Self = this.set("AverageDownloadRateLimitInBitsPerSec", js.undefined)
    
    @scala.inline
    def setAverageUploadRateLimitInBitsPerSec(value: BandwidthUploadRateLimit): Self = this.set("AverageUploadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageUploadRateLimitInBitsPerSec: Self = this.set("AverageUploadRateLimitInBitsPerSec", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
  }
}
