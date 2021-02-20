package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoCodecSettings extends StObject {
  
  /**
    * Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
    */
  var Av1Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Av1Settings] = js.native
  
  /**
    * Required when you set your output video codec to AVC-Intra. For more information about the AVC-I settings, see the relevant specification. For detailed information about SD and HD in AVC-I, see https://ieeexplore.ieee.org/document/7290936.
    */
  var AvcIntraSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AvcIntraSettings] = js.native
  
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
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VC3
    */
  var Vc3Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Vc3Settings] = js.native
  
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
  implicit class VideoCodecSettingsMutableBuilder[Self <: VideoCodecSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAv1Settings(value: Av1Settings): Self = StObject.set(x, "Av1Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAv1SettingsUndefined: Self = StObject.set(x, "Av1Settings", js.undefined)
    
    @scala.inline
    def setAvcIntraSettings(value: AvcIntraSettings): Self = StObject.set(x, "AvcIntraSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvcIntraSettingsUndefined: Self = StObject.set(x, "AvcIntraSettings", js.undefined)
    
    @scala.inline
    def setCodec(value: VideoCodec): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    @scala.inline
    def setFrameCaptureSettings(value: FrameCaptureSettings): Self = StObject.set(x, "FrameCaptureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameCaptureSettingsUndefined: Self = StObject.set(x, "FrameCaptureSettings", js.undefined)
    
    @scala.inline
    def setH264Settings(value: H264Settings): Self = StObject.set(x, "H264Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH264SettingsUndefined: Self = StObject.set(x, "H264Settings", js.undefined)
    
    @scala.inline
    def setH265Settings(value: H265Settings): Self = StObject.set(x, "H265Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH265SettingsUndefined: Self = StObject.set(x, "H265Settings", js.undefined)
    
    @scala.inline
    def setMpeg2Settings(value: Mpeg2Settings): Self = StObject.set(x, "Mpeg2Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpeg2SettingsUndefined: Self = StObject.set(x, "Mpeg2Settings", js.undefined)
    
    @scala.inline
    def setProresSettings(value: ProresSettings): Self = StObject.set(x, "ProresSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProresSettingsUndefined: Self = StObject.set(x, "ProresSettings", js.undefined)
    
    @scala.inline
    def setVc3Settings(value: Vc3Settings): Self = StObject.set(x, "Vc3Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVc3SettingsUndefined: Self = StObject.set(x, "Vc3Settings", js.undefined)
    
    @scala.inline
    def setVp8Settings(value: Vp8Settings): Self = StObject.set(x, "Vp8Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVp8SettingsUndefined: Self = StObject.set(x, "Vp8Settings", js.undefined)
    
    @scala.inline
    def setVp9Settings(value: Vp9Settings): Self = StObject.set(x, "Vp9Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVp9SettingsUndefined: Self = StObject.set(x, "Vp9Settings", js.undefined)
  }
}
