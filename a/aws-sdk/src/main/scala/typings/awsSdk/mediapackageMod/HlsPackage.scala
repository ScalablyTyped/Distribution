package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsPackage extends StObject {
  
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
  implicit class HlsPackageMutableBuilder[Self <: HlsPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdMarkers(value: AdMarkers): Self = StObject.set(x, "AdMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdMarkersUndefined: Self = StObject.set(x, "AdMarkers", js.undefined)
    
    @scala.inline
    def setAdTriggers(value: AdTriggers): Self = StObject.set(x, "AdTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdTriggersUndefined: Self = StObject.set(x, "AdTriggers", js.undefined)
    
    @scala.inline
    def setAdTriggersVarargs(value: AdTriggersElement*): Self = StObject.set(x, "AdTriggers", js.Array(value :_*))
    
    @scala.inline
    def setAdsOnDeliveryRestrictions(value: AdsOnDeliveryRestrictions): Self = StObject.set(x, "AdsOnDeliveryRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsOnDeliveryRestrictionsUndefined: Self = StObject.set(x, "AdsOnDeliveryRestrictions", js.undefined)
    
    @scala.inline
    def setEncryption(value: HlsEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setIncludeIframeOnlyStream(value: boolean): Self = StObject.set(x, "IncludeIframeOnlyStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeIframeOnlyStreamUndefined: Self = StObject.set(x, "IncludeIframeOnlyStream", js.undefined)
    
    @scala.inline
    def setPlaylistType(value: PlaylistType): Self = StObject.set(x, "PlaylistType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistTypeUndefined: Self = StObject.set(x, "PlaylistType", js.undefined)
    
    @scala.inline
    def setPlaylistWindowSeconds(value: integer): Self = StObject.set(x, "PlaylistWindowSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistWindowSecondsUndefined: Self = StObject.set(x, "PlaylistWindowSeconds", js.undefined)
    
    @scala.inline
    def setProgramDateTimeIntervalSeconds(value: integer): Self = StObject.set(x, "ProgramDateTimeIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramDateTimeIntervalSecondsUndefined: Self = StObject.set(x, "ProgramDateTimeIntervalSeconds", js.undefined)
    
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = StObject.set(x, "SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentDurationSecondsUndefined: Self = StObject.set(x, "SegmentDurationSeconds", js.undefined)
    
    @scala.inline
    def setStreamSelection(value: StreamSelection): Self = StObject.set(x, "StreamSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamSelectionUndefined: Self = StObject.set(x, "StreamSelection", js.undefined)
    
    @scala.inline
    def setUseAudioRenditionGroup(value: boolean): Self = StObject.set(x, "UseAudioRenditionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAudioRenditionGroupUndefined: Self = StObject.set(x, "UseAudioRenditionGroup", js.undefined)
  }
}
