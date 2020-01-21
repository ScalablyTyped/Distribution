package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsManifest extends js.Object {
  /**
    * This setting controls how ad markers are included in the packaged OriginEndpoint.
  "NONE" will omit all SCTE-35 ad markers from the output.
  "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
  markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest.
  "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35
  messages in the input source.
    */
  var AdMarkers: js.UndefOr[typings.awsSdk.mediapackageMod.AdMarkers] = js.native
  /**
    * The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
    */
  var Id: string = js.native
  /**
    * When enabled, an I-Frame only stream will be included in the output.
    */
  var IncludeIframeOnlyStream: js.UndefOr[boolean] = js.native
  /**
    * An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
    */
  var ManifestName: js.UndefOr[string] = js.native
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
    * The URL of the packaged OriginEndpoint for consumption.
    */
  var Url: js.UndefOr[string] = js.native
}

object HlsManifest {
  @scala.inline
  def apply(
    Id: string,
    AdMarkers: AdMarkers = null,
    IncludeIframeOnlyStream: js.UndefOr[Boolean] = js.undefined,
    ManifestName: string = null,
    PlaylistType: PlaylistType = null,
    PlaylistWindowSeconds: Int | Double = null,
    ProgramDateTimeIntervalSeconds: Int | Double = null,
    Url: string = null
  ): HlsManifest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (AdMarkers != null) __obj.updateDynamic("AdMarkers")(AdMarkers.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeIframeOnlyStream)) __obj.updateDynamic("IncludeIframeOnlyStream")(IncludeIframeOnlyStream.asInstanceOf[js.Any])
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName.asInstanceOf[js.Any])
    if (PlaylistType != null) __obj.updateDynamic("PlaylistType")(PlaylistType.asInstanceOf[js.Any])
    if (PlaylistWindowSeconds != null) __obj.updateDynamic("PlaylistWindowSeconds")(PlaylistWindowSeconds.asInstanceOf[js.Any])
    if (ProgramDateTimeIntervalSeconds != null) __obj.updateDynamic("ProgramDateTimeIntervalSeconds")(ProgramDateTimeIntervalSeconds.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsManifest]
  }
}

