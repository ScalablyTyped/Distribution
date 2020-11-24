package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioOnlyHlsSettings extends js.Object {
  
  /**
    * Specifies the group to which the audio Rendition belongs.
    */
  var AudioGroupId: js.UndefOr[string] = js.native
  
  /**
    * Optional. Specifies the .jpg or .png image to use as the cover art for an audio-only output. We recommend a low bit-size file because the image increases the output audio bandwidth.
  The image is attached to the audio as an ID3 tag, frame type APIC, picture type 0x10, as per the "ID3 tag version 2.4.0 - Native Frames" standard.
    */
  var AudioOnlyImage: js.UndefOr[InputLocation] = js.native
  
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
  var AudioTrackType: js.UndefOr[AudioOnlyHlsTrackType] = js.native
  
  /**
    * Specifies the segment type.
    */
  var SegmentType: js.UndefOr[AudioOnlyHlsSegmentType] = js.native
}
object AudioOnlyHlsSettings {
  
  @scala.inline
  def apply(): AudioOnlyHlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioOnlyHlsSettings]
  }
  
  @scala.inline
  implicit class AudioOnlyHlsSettingsOps[Self <: AudioOnlyHlsSettings] (val x: Self) extends AnyVal {
    
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
    def setAudioGroupId(value: string): Self = this.set("AudioGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioGroupId: Self = this.set("AudioGroupId", js.undefined)
    
    @scala.inline
    def setAudioOnlyImage(value: InputLocation): Self = this.set("AudioOnlyImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioOnlyImage: Self = this.set("AudioOnlyImage", js.undefined)
    
    @scala.inline
    def setAudioTrackType(value: AudioOnlyHlsTrackType): Self = this.set("AudioTrackType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioTrackType: Self = this.set("AudioTrackType", js.undefined)
    
    @scala.inline
    def setSegmentType(value: AudioOnlyHlsSegmentType): Self = this.set("SegmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentType: Self = this.set("SegmentType", js.undefined)
  }
}
