package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsManifest extends StObject {
  
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
  var AdMarkers: js.UndefOr[typings.awsSdk.mediapackageMod.AdMarkers] = js.undefined
  
  /**
    * The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
    */
  var Id: string
  
  /**
    * When enabled, an I-Frame only stream will be included in the output.
    */
  var IncludeIframeOnlyStream: js.UndefOr[boolean] = js.undefined
  
  /**
    * An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
    */
  var ManifestName: js.UndefOr[string] = js.undefined
  
  /**
    * The HTTP Live Streaming (HLS) playlist type.
  When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE
  entry will be included in the media playlist.
    */
  var PlaylistType: js.UndefOr[typings.awsSdk.mediapackageMod.PlaylistType] = js.undefined
  
  /**
    * Time window (in seconds) contained in each parent manifest.
    */
  var PlaylistWindowSeconds: js.UndefOr[integer] = js.undefined
  
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
  var ProgramDateTimeIntervalSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * The URL of the packaged OriginEndpoint for consumption.
    */
  var Url: js.UndefOr[string] = js.undefined
}
object HlsManifest {
  
  @scala.inline
  def apply(Id: string): HlsManifest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsManifest]
  }
  
  @scala.inline
  implicit class HlsManifestMutableBuilder[Self <: HlsManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdMarkers(value: AdMarkers): Self = StObject.set(x, "AdMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdMarkersUndefined: Self = StObject.set(x, "AdMarkers", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeIframeOnlyStream(value: boolean): Self = StObject.set(x, "IncludeIframeOnlyStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeIframeOnlyStreamUndefined: Self = StObject.set(x, "IncludeIframeOnlyStream", js.undefined)
    
    @scala.inline
    def setManifestName(value: string): Self = StObject.set(x, "ManifestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestNameUndefined: Self = StObject.set(x, "ManifestName", js.undefined)
    
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
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
