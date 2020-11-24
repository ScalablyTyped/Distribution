package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsPackage extends js.Object {
  
  /**
    * This setting controls how ad markers are included in the packaged OriginEndpoint.
  "NONE" will omit all SCTE-35 ad markers from the output.
  "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
  markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest.
  "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35
  messages in the input source.
  "DATERANGE" inserts EXT-X-DATERANGE tags to signal ad and program transition events 
  in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value 
  that is greater than 0.
    */
  var AdMarkers: js.UndefOr[typings.awsSdk.mediapackageMod.AdMarkers] = js.native
  
  var AdTriggers: js.UndefOr[typings.awsSdk.mediapackageMod.AdTriggers] = js.native
  
  var AdsOnDeliveryRestrictions: js.UndefOr[typings.awsSdk.mediapackageMod.AdsOnDeliveryRestrictions] = js.native
  
  var Encryption: js.UndefOr[HlsEncryption] = js.native
  
  /**
    * When enabled, an I-Frame only stream will be included in the output.
    */
  var IncludeIframeOnlyStream: js.UndefOr[boolean] = js.native
  
  /**
    * The HTTP Live Streaming (HLS) playlist type.
  When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE
  entry will be included in the media playlist.
    */
  var PlaylistType: js.UndefOr[typings.awsSdk.mediapackageMod.PlaylistType] = js.native
  
  /**
    * Time window (in seconds) contained in each parent manifest.
    */
  var PlaylistWindowSeconds: js.UndefOr[integer] = js.native
  
  /**
    * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag
  inserted into manifests. Additionally, when an interval is specified
  ID3Timed Metadata messages will be generated every 5 seconds using the
  ingest time of the content.
  If the interval is not specified, or set to 0, then
  no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no
  ID3Timed Metadata messages will be generated. Note that irrespective
  of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input,
  it will be passed through to HLS output.
    */
  var ProgramDateTimeIntervalSeconds: js.UndefOr[integer] = js.native
  
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  
  var StreamSelection: js.UndefOr[typings.awsSdk.mediapackageMod.StreamSelection] = js.native
  
  /**
    * When enabled, audio streams will be placed in rendition groups in the output.
    */
  var UseAudioRenditionGroup: js.UndefOr[boolean] = js.native
}
object HlsPackage {
  
  @scala.inline
  def apply(): HlsPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsPackage]
  }
  
  @scala.inline
  implicit class HlsPackageOps[Self <: HlsPackage] (val x: Self) extends AnyVal {
    
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
    def setAdMarkers(value: AdMarkers): Self = this.set("AdMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdMarkers: Self = this.set("AdMarkers", js.undefined)
    
    @scala.inline
    def setAdTriggersVarargs(value: AdTriggersElement*): Self = this.set("AdTriggers", js.Array(value :_*))
    
    @scala.inline
    def setAdTriggers(value: AdTriggers): Self = this.set("AdTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdTriggers: Self = this.set("AdTriggers", js.undefined)
    
    @scala.inline
    def setAdsOnDeliveryRestrictions(value: AdsOnDeliveryRestrictions): Self = this.set("AdsOnDeliveryRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdsOnDeliveryRestrictions: Self = this.set("AdsOnDeliveryRestrictions", js.undefined)
    
    @scala.inline
    def setEncryption(value: HlsEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    
    @scala.inline
    def setIncludeIframeOnlyStream(value: boolean): Self = this.set("IncludeIframeOnlyStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeIframeOnlyStream: Self = this.set("IncludeIframeOnlyStream", js.undefined)
    
    @scala.inline
    def setPlaylistType(value: PlaylistType): Self = this.set("PlaylistType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylistType: Self = this.set("PlaylistType", js.undefined)
    
    @scala.inline
    def setPlaylistWindowSeconds(value: integer): Self = this.set("PlaylistWindowSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylistWindowSeconds: Self = this.set("PlaylistWindowSeconds", js.undefined)
    
    @scala.inline
    def setProgramDateTimeIntervalSeconds(value: integer): Self = this.set("ProgramDateTimeIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgramDateTimeIntervalSeconds: Self = this.set("ProgramDateTimeIntervalSeconds", js.undefined)
    
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = this.set("SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentDurationSeconds: Self = this.set("SegmentDurationSeconds", js.undefined)
    
    @scala.inline
    def setStreamSelection(value: StreamSelection): Self = this.set("StreamSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamSelection: Self = this.set("StreamSelection", js.undefined)
    
    @scala.inline
    def setUseAudioRenditionGroup(value: boolean): Self = this.set("UseAudioRenditionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAudioRenditionGroup: Self = this.set("UseAudioRenditionGroup", js.undefined)
  }
}
