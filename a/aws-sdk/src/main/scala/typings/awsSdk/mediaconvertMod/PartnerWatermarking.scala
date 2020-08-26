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
  def apply(): PartnerWatermarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerWatermarking]
  }
  @scala.inline
  implicit class PartnerWatermarkingOps[Self <: PartnerWatermarking] (val x: Self) extends AnyVal {
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
    def setNexguardFileMarkerSettings(value: NexGuardFileMarkerSettings): Self = this.set("NexguardFileMarkerSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNexguardFileMarkerSettings: Self = this.set("NexguardFileMarkerSettings", js.undefined)
  }
  
}

