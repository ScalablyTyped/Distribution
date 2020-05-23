package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBandwidthRateLimitInput extends js.Object {
  /**
    * The average download bandwidth rate limit in bits per second.
    */
  var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.native
  /**
    * The average upload bandwidth rate limit in bits per second.
    */
  var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.native
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object UpdateBandwidthRateLimitInput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN,
    AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined,
    AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined
  ): UpdateBandwidthRateLimitInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    if (!js.isUndefined(AverageDownloadRateLimitInBitsPerSec)) __obj.updateDynamic("AverageDownloadRateLimitInBitsPerSec")(AverageDownloadRateLimitInBitsPerSec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AverageUploadRateLimitInBitsPerSec)) __obj.updateDynamic("AverageUploadRateLimitInBitsPerSec")(AverageUploadRateLimitInBitsPerSec.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBandwidthRateLimitInput]
  }
}

