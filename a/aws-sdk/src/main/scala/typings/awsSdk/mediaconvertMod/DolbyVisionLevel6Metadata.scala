package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DolbyVisionLevel6Metadata extends js.Object {
  /**
    * Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire stream. Measured in nits.
    */
  var MaxCll: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average brightness in the entire stream. Measured in nits.
    */
  var MaxFall: js.UndefOr[integerMin0Max65535] = js.native
}

object DolbyVisionLevel6Metadata {
  @scala.inline
  def apply(
    MaxCll: js.UndefOr[integerMin0Max65535] = js.undefined,
    MaxFall: js.UndefOr[integerMin0Max65535] = js.undefined
  ): DolbyVisionLevel6Metadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxCll)) __obj.updateDynamic("MaxCll")(MaxCll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxFall)) __obj.updateDynamic("MaxFall")(MaxFall.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DolbyVisionLevel6Metadata]
  }
}

