package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsSettings extends js.Object {
  
  /**
    * Specifies the group to which the audio Rendition belongs.
    */
  var AudioGroupId: js.UndefOr[string] = js.native
  
  /**
    * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw container. Regardless of the value that you specify here, if this output has video, the service will place the output into an MPEG2-TS container.
    */
  var AudioOnlyContainer: js.UndefOr[HlsAudioOnlyContainer] = js.native
  
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[string] = js.native
  
  /**
    * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
    */
  var AudioTrackType: js.UndefOr[HlsAudioTrackType] = js.native
  
  /**
    * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
    */
  var IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest] = js.native
  
  /**
    * Use this setting to add an identifying string to the filename of each segment. The service adds this string between the name modifier and segment index number. You can use format identifiers in the string. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/using-variables-in-your-job-settings.html
    */
  var SegmentModifier: js.UndefOr[string] = js.native
}
object HlsSettings {
  
  @scala.inline
  def apply(): HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsSettings]
  }
  
  @scala.inline
  implicit class HlsSettingsOps[Self <: HlsSettings] (val x: Self) extends AnyVal {
    
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
    def setAudioOnlyContainer(value: HlsAudioOnlyContainer): Self = this.set("AudioOnlyContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioOnlyContainer: Self = this.set("AudioOnlyContainer", js.undefined)
    
    @scala.inline
    def setAudioRenditionSets(value: string): Self = this.set("AudioRenditionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioRenditionSets: Self = this.set("AudioRenditionSets", js.undefined)
    
    @scala.inline
    def setAudioTrackType(value: HlsAudioTrackType): Self = this.set("AudioTrackType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioTrackType: Self = this.set("AudioTrackType", js.undefined)
    
    @scala.inline
    def setIFrameOnlyManifest(value: HlsIFrameOnlyManifest): Self = this.set("IFrameOnlyManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIFrameOnlyManifest: Self = this.set("IFrameOnlyManifest", js.undefined)
    
    @scala.inline
    def setSegmentModifier(value: string): Self = this.set("SegmentModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentModifier: Self = this.set("SegmentModifier", js.undefined)
  }
}
