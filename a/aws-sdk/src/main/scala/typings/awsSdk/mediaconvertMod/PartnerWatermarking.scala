package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartnerWatermarking extends js.Object {
  /**
    * For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking. MediaConvert supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
    */
  var NexguardFileMarkerSettings: js.UndefOr[NexGuardFileMarkerSettings] = js.native
}

object PartnerWatermarking {
  @scala.inline
  def apply(NexguardFileMarkerSettings: NexGuardFileMarkerSettings = null): PartnerWatermarking = {
    val __obj = js.Dynamic.literal()
    if (NexguardFileMarkerSettings != null) __obj.updateDynamic("NexguardFileMarkerSettings")(NexguardFileMarkerSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnerWatermarking]
  }
}

