package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined,
    AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined,
    GatewayARN: GatewayARN = null
  ): DescribeBandwidthRateLimitOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AverageDownloadRateLimitInBitsPerSec)) __obj.updateDynamic("AverageDownloadRateLimitInBitsPerSec")(AverageDownloadRateLimitInBitsPerSec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AverageUploadRateLimitInBitsPerSec)) __obj.updateDynamic("AverageUploadRateLimitInBitsPerSec")(AverageUploadRateLimitInBitsPerSec.get.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBandwidthRateLimitOutput]
  }
}

