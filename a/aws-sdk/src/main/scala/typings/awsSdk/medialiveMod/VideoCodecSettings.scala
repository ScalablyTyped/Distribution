package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoCodecSettings extends js.Object {
  var FrameCaptureSettings: js.UndefOr[typings.awsSdk.medialiveMod.FrameCaptureSettings] = js.native
  var H264Settings: js.UndefOr[typings.awsSdk.medialiveMod.H264Settings] = js.native
  var H265Settings: js.UndefOr[typings.awsSdk.medialiveMod.H265Settings] = js.native
}

object VideoCodecSettings {
  @scala.inline
  def apply(
    FrameCaptureSettings: FrameCaptureSettings = null,
    H264Settings: H264Settings = null,
    H265Settings: H265Settings = null
  ): VideoCodecSettings = {
    val __obj = js.Dynamic.literal()
    if (FrameCaptureSettings != null) __obj.updateDynamic("FrameCaptureSettings")(FrameCaptureSettings.asInstanceOf[js.Any])
    if (H264Settings != null) __obj.updateDynamic("H264Settings")(H264Settings.asInstanceOf[js.Any])
    if (H265Settings != null) __obj.updateDynamic("H265Settings")(H265Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoCodecSettings]
  }
}

