package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoCodecSettings extends StObject {
  
  /**
    * Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
    */
  var Av1Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Av1Settings] = js.undefined
  
  /**
    * Required when you choose AVC-Intra for your output video codec. For more information about the AVC-Intra settings, see the relevant specification. For detailed information about SD and HD in AVC-Intra, see https://ieeexplore.ieee.org/document/7290936. For information about 4K/2K in AVC-Intra, see https://pro-av.panasonic.net/en/avc-ultra/AVC-ULTRAoverview.pdf.
    */
  var AvcIntraSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AvcIntraSettings] = js.undefined
  
  /**
    * Specifies the video codec. This must be equal to one of the enum values defined by the object  VideoCodec.
    */
  var Codec: js.UndefOr[VideoCodec] = js.undefined
  
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
    */
  var FrameCaptureSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.FrameCaptureSettings] = js.undefined
  
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
    */
  var H264Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.H264Settings] = js.undefined
  
  /**
    * Settings for H265 codec
    */
  var H265Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.H265Settings] = js.undefined
  
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
    */
  var Mpeg2Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Mpeg2Settings] = js.undefined
  
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
    */
  var ProresSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.ProresSettings] = js.undefined
  
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VC3
    */
  var Vc3Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Vc3Settings] = js.undefined
  
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8.
    */
  var Vp8Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Vp8Settings] = js.undefined
  
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP9.
    */
  var Vp9Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Vp9Settings] = js.undefined
  
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value XAVC.
    */
  var XavcSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.XavcSettings] = js.undefined
}
object VideoCodecSettings {
  
  inline def apply(): VideoCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoCodecSettings]
  }
  
  extension [Self <: VideoCodecSettings](x: Self) {
    
    inline def setAv1Settings(value: Av1Settings): Self = StObject.set(x, "Av1Settings", value.asInstanceOf[js.Any])
    
    inline def setAv1SettingsUndefined: Self = StObject.set(x, "Av1Settings", js.undefined)
    
    inline def setAvcIntraSettings(value: AvcIntraSettings): Self = StObject.set(x, "AvcIntraSettings", value.asInstanceOf[js.Any])
    
    inline def setAvcIntraSettingsUndefined: Self = StObject.set(x, "AvcIntraSettings", js.undefined)
    
    inline def setCodec(value: VideoCodec): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    inline def setFrameCaptureSettings(value: FrameCaptureSettings): Self = StObject.set(x, "FrameCaptureSettings", value.asInstanceOf[js.Any])
    
    inline def setFrameCaptureSettingsUndefined: Self = StObject.set(x, "FrameCaptureSettings", js.undefined)
    
    inline def setH264Settings(value: H264Settings): Self = StObject.set(x, "H264Settings", value.asInstanceOf[js.Any])
    
    inline def setH264SettingsUndefined: Self = StObject.set(x, "H264Settings", js.undefined)
    
    inline def setH265Settings(value: H265Settings): Self = StObject.set(x, "H265Settings", value.asInstanceOf[js.Any])
    
    inline def setH265SettingsUndefined: Self = StObject.set(x, "H265Settings", js.undefined)
    
    inline def setMpeg2Settings(value: Mpeg2Settings): Self = StObject.set(x, "Mpeg2Settings", value.asInstanceOf[js.Any])
    
    inline def setMpeg2SettingsUndefined: Self = StObject.set(x, "Mpeg2Settings", js.undefined)
    
    inline def setProresSettings(value: ProresSettings): Self = StObject.set(x, "ProresSettings", value.asInstanceOf[js.Any])
    
    inline def setProresSettingsUndefined: Self = StObject.set(x, "ProresSettings", js.undefined)
    
    inline def setVc3Settings(value: Vc3Settings): Self = StObject.set(x, "Vc3Settings", value.asInstanceOf[js.Any])
    
    inline def setVc3SettingsUndefined: Self = StObject.set(x, "Vc3Settings", js.undefined)
    
    inline def setVp8Settings(value: Vp8Settings): Self = StObject.set(x, "Vp8Settings", value.asInstanceOf[js.Any])
    
    inline def setVp8SettingsUndefined: Self = StObject.set(x, "Vp8Settings", js.undefined)
    
    inline def setVp9Settings(value: Vp9Settings): Self = StObject.set(x, "Vp9Settings", value.asInstanceOf[js.Any])
    
    inline def setVp9SettingsUndefined: Self = StObject.set(x, "Vp9Settings", js.undefined)
    
    inline def setXavcSettings(value: XavcSettings): Self = StObject.set(x, "XavcSettings", value.asInstanceOf[js.Any])
    
    inline def setXavcSettingsUndefined: Self = StObject.set(x, "XavcSettings", js.undefined)
  }
}
