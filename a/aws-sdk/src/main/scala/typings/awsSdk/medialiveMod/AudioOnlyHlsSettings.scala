package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioOnlyHlsSettings extends StObject {
  
  /**
    * Specifies the group to which the audio Rendition belongs.
    */
  var AudioGroupId: js.UndefOr[string] = js.undefined
  
  /**
    * Optional. Specifies the .jpg or .png image to use as the cover art for an audio-only output. We recommend a low bit-size file because the image increases the output audio bandwidth.
  The image is attached to the audio as an ID3 tag, frame type APIC, picture type 0x10, as per the "ID3 tag version 2.4.0 - Native Frames" standard.
    */
  var AudioOnlyImage: js.UndefOr[InputLocation] = js.undefined
  
  /**
    * Four types of audio-only tracks are supported:
  Audio-Only Variant Stream
  The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
  Alternate Audio, Auto Select, Default
  Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
  Alternate Audio, Auto Select, Not Default
  Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
  Alternate Audio, not Auto Select
  Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
    */
  var AudioTrackType: js.UndefOr[AudioOnlyHlsTrackType] = js.undefined
  
  /**
    * Specifies the segment type.
    */
  var SegmentType: js.UndefOr[AudioOnlyHlsSegmentType] = js.undefined
}
object AudioOnlyHlsSettings {
  
  inline def apply(): AudioOnlyHlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioOnlyHlsSettings]
  }
  
  extension [Self <: AudioOnlyHlsSettings](x: Self) {
    
    inline def setAudioGroupId(value: string): Self = StObject.set(x, "AudioGroupId", value.asInstanceOf[js.Any])
    
    inline def setAudioGroupIdUndefined: Self = StObject.set(x, "AudioGroupId", js.undefined)
    
    inline def setAudioOnlyImage(value: InputLocation): Self = StObject.set(x, "AudioOnlyImage", value.asInstanceOf[js.Any])
    
    inline def setAudioOnlyImageUndefined: Self = StObject.set(x, "AudioOnlyImage", js.undefined)
    
    inline def setAudioTrackType(value: AudioOnlyHlsTrackType): Self = StObject.set(x, "AudioTrackType", value.asInstanceOf[js.Any])
    
    inline def setAudioTrackTypeUndefined: Self = StObject.set(x, "AudioTrackType", js.undefined)
    
    inline def setSegmentType(value: AudioOnlyHlsSegmentType): Self = StObject.set(x, "SegmentType", value.asInstanceOf[js.Any])
    
    inline def setSegmentTypeUndefined: Self = StObject.set(x, "SegmentType", js.undefined)
  }
}
