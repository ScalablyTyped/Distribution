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
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8.
    */
  var Vp8Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Vp8Settings] = js.native
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP9.
    */
  var Vp9Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Vp9Settings] = js.native
}

object VideoCodecSettings {
  @scala.inline
  def apply(): VideoCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoCodecSettings]
  }
  @scala.inline
  implicit class VideoCodecSettingsOps[Self <: VideoCodecSettings] (val x: Self) extends AnyVal {
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
    def setAv1Settings(value: Av1Settings): Self = this.set("Av1Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAv1Settings: Self = this.set("Av1Settings", js.undefined)
    @scala.inline
    def setCodec(value: VideoCodec): Self = this.set("Codec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec: Self = this.set("Codec", js.undefined)
    @scala.inline
    def setFrameCaptureSettings(value: FrameCaptureSettings): Self = this.set("FrameCaptureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameCaptureSettings: Self = this.set("FrameCaptureSettings", js.undefined)
    @scala.inline
    def setH264Settings(value: H264Settings): Self = this.set("H264Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH264Settings: Self = this.set("H264Settings", js.undefined)
    @scala.inline
    def setH265Settings(value: H265Settings): Self = this.set("H265Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH265Settings: Self = this.set("H265Settings", js.undefined)
    @scala.inline
    def setMpeg2Settings(value: Mpeg2Settings): Self = this.set("Mpeg2Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpeg2Settings: Self = this.set("Mpeg2Settings", js.undefined)
    @scala.inline
    def setProresSettings(value: ProresSettings): Self = this.set("ProresSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProresSettings: Self = this.set("ProresSettings", js.undefined)
    @scala.inline
    def setVp8Settings(value: Vp8Settings): Self = this.set("Vp8Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVp8Settings: Self = this.set("Vp8Settings", js.undefined)
    @scala.inline
    def setVp9Settings(value: Vp9Settings): Self = this.set("Vp9Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVp9Settings: Self = this.set("Vp9Settings", js.undefined)
  }
  
}

