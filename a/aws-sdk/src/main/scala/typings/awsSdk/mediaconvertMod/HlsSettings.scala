package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsSettings extends StObject {
  
  /**
    * Specifies the group to which the audio Rendition belongs.
    */
  var AudioGroupId: js.UndefOr[string] = js.undefined
  
  /**
    * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw container. Regardless of the value that you specify here, if this output has video, the service will place the output into an MPEG2-TS container.
    */
  var AudioOnlyContainer: js.UndefOr[HlsAudioOnlyContainer] = js.undefined
  
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[string] = js.undefined
  
  /**
    * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
    */
  var AudioTrackType: js.UndefOr[HlsAudioTrackType] = js.undefined
  
  /**
    * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
    */
  var IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest] = js.undefined
  
  /**
    * Use this setting to add an identifying string to the filename of each segment. The service adds this string between the name modifier and segment index number. You can use format identifiers in the string. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/using-variables-in-your-job-settings.html
    */
  var SegmentModifier: js.UndefOr[string] = js.undefined
}
object HlsSettings {
  
  inline def apply(): HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsSettings]
  }
  
  extension [Self <: HlsSettings](x: Self) {
    
    inline def setAudioGroupId(value: string): Self = StObject.set(x, "AudioGroupId", value.asInstanceOf[js.Any])
    
    inline def setAudioGroupIdUndefined: Self = StObject.set(x, "AudioGroupId", js.undefined)
    
    inline def setAudioOnlyContainer(value: HlsAudioOnlyContainer): Self = StObject.set(x, "AudioOnlyContainer", value.asInstanceOf[js.Any])
    
    inline def setAudioOnlyContainerUndefined: Self = StObject.set(x, "AudioOnlyContainer", js.undefined)
    
    inline def setAudioRenditionSets(value: string): Self = StObject.set(x, "AudioRenditionSets", value.asInstanceOf[js.Any])
    
    inline def setAudioRenditionSetsUndefined: Self = StObject.set(x, "AudioRenditionSets", js.undefined)
    
    inline def setAudioTrackType(value: HlsAudioTrackType): Self = StObject.set(x, "AudioTrackType", value.asInstanceOf[js.Any])
    
    inline def setAudioTrackTypeUndefined: Self = StObject.set(x, "AudioTrackType", js.undefined)
    
    inline def setIFrameOnlyManifest(value: HlsIFrameOnlyManifest): Self = StObject.set(x, "IFrameOnlyManifest", value.asInstanceOf[js.Any])
    
    inline def setIFrameOnlyManifestUndefined: Self = StObject.set(x, "IFrameOnlyManifest", js.undefined)
    
    inline def setSegmentModifier(value: string): Self = StObject.set(x, "SegmentModifier", value.asInstanceOf[js.Any])
    
    inline def setSegmentModifierUndefined: Self = StObject.set(x, "SegmentModifier", js.undefined)
  }
}
