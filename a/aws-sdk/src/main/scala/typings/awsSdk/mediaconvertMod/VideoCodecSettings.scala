package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoCodecSettings extends js.Object {
  /**
    * Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
    */
  var Av1Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Av1Settings] = js.native
  /**
    * Specifies the video codec. This must be equal to one of the enum values defined by the object  VideoCodec.
    */
  var Codec: js.UndefOr[VideoCodec] = js.native
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
    */
  var FrameCaptureSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.FrameCaptureSettings] = js.native
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
    */
  var H264Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.H264Settings] = js.native
  /**
    * Settings for H265 codec
    */
  var H265Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.H265Settings] = js.native
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
    */
  var Mpeg2Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Mpeg2Settings] = js.native
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
    */
  var ProresSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.ProresSettings] = js.native
}

object VideoCodecSettings {
  @scala.inline
  def apply(
    Av1Settings: Av1Settings = null,
    Codec: VideoCodec = null,
    FrameCaptureSettings: FrameCaptureSettings = null,
    H264Settings: H264Settings = null,
    H265Settings: H265Settings = null,
    Mpeg2Settings: Mpeg2Settings = null,
    ProresSettings: ProresSettings = null
  ): VideoCodecSettings = {
    val __obj = js.Dynamic.literal()
    if (Av1Settings != null) __obj.updateDynamic("Av1Settings")(Av1Settings.asInstanceOf[js.Any])
    if (Codec != null) __obj.updateDynamic("Codec")(Codec.asInstanceOf[js.Any])
    if (FrameCaptureSettings != null) __obj.updateDynamic("FrameCaptureSettings")(FrameCaptureSettings.asInstanceOf[js.Any])
    if (H264Settings != null) __obj.updateDynamic("H264Settings")(H264Settings.asInstanceOf[js.Any])
    if (H265Settings != null) __obj.updateDynamic("H265Settings")(H265Settings.asInstanceOf[js.Any])
    if (Mpeg2Settings != null) __obj.updateDynamic("Mpeg2Settings")(Mpeg2Settings.asInstanceOf[js.Any])
    if (ProresSettings != null) __obj.updateDynamic("ProresSettings")(ProresSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoCodecSettings]
  }
}

