package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsGroupSettings extends js.Object {
  
  /**
    * Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
    */
  var AdMarkers: js.UndefOr[listOfHlsAdMarkers] = js.native
  
  /**
    * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
    */
  var BaseUrlContent: js.UndefOr[string] = js.native
  
  /**
    * Optional. One value per output group.
  This field is required only if you are completing Base URL content A, and the downstream system has notified you that the media files for pipeline 1 of all outputs are in a location different from the media files for pipeline 0.
    */
  var BaseUrlContent1: js.UndefOr[string] = js.native
  
  /**
    * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
    */
  var BaseUrlManifest: js.UndefOr[string] = js.native
  
  /**
    * Optional. One value per output group.
  Complete this field only if you are completing Base URL manifest A, and the downstream system has notified you that the child manifest files for pipeline 1 of all outputs are in a location different from the child manifest files for pipeline 0.
    */
  var BaseUrlManifest1: js.UndefOr[string] = js.native
  
  /**
    * Mapping of up to 4 caption channels to caption languages.  Is only meaningful if captionLanguageSetting is set to "insert".
    */
  var CaptionLanguageMappings: js.UndefOr[listOfCaptionLanguageMapping] = js.native
  
  /**
    * Applies only to 608 Embedded output captions.
  insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions.
  none: Include CLOSED-CAPTIONS=NONE line in the manifest.
  omit: Omit any CLOSED-CAPTIONS line from the manifest.
    */
  var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.native
  
  /**
    * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from saving media segments for later replay.
    */
  var ClientCache: js.UndefOr[HlsClientCache] = js.native
  
  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  var CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.native
  
  /**
    * For use with encryptionType. This is a 128-bit, 16-byte hex value represented by a 32-character text string. If ivSource is set to "explicit" then this parameter is required and is used as the IV for encryption.
    */
  var ConstantIv: js.UndefOr[stringMin32Max32] = js.native
  
  /**
    * A directory or HTTP destination for the HLS segments, manifest files, and encryption keys (if enabled).
    */
  var Destination: OutputLocationRef = js.native
  
  /**
    * Place segments in subdirectories.
    */
  var DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.native
  
  /**
    * Specifies whether to insert EXT-X-DISCONTINUITY tags in the HLS child manifests for this output group.
  Typically, choose Insert because these tags are required in the manifest (according to the HLS specification) and serve an important purpose.
  Choose Never Insert only if the downstream system is doing real-time failover (without using the MediaLive automatic failover feature) and only if that downstream system has advised you to exclude the tags.
    */
  var DiscontinuityTags: js.UndefOr[HlsDiscontinuityTags] = js.native
  
  /**
    * Encrypts the segments with the given encryption scheme.  Exclude this parameter if no encryption is desired.
    */
  var EncryptionType: js.UndefOr[HlsEncryptionType] = js.native
  
  /**
    * Parameters that control interactions with the CDN.
    */
  var HlsCdnSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsCdnSettings] = js.native
  
  /**
    * State of HLS ID3 Segment Tagging
    */
  var HlsId3SegmentTagging: js.UndefOr[HlsId3SegmentTaggingState] = js.native
  
  /**
    * DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according to the Output Selection field).
  STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other manifests (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame position. For example, #EXT-X-BYTERANGE:160364@1461888"
    */
  var IFrameOnlyPlaylists: js.UndefOr[IFrameOnlyPlaylistType] = js.native
  
  /**
    * Specifies whether to include the final (incomplete) segment in the media output when the pipeline stops producing output because of a channel stop, a channel pause or a loss of input to the pipeline.
  Auto means that MediaLive decides whether to include the final segment, depending on the channel class and the types of output groups.
  Suppress means to never include the incomplete segment. We recommend you choose Auto and let MediaLive control the behavior.
    */
  var IncompleteSegmentBehavior: js.UndefOr[HlsIncompleteSegmentBehavior] = js.native
  
  /**
    * Applies only if Mode field is LIVE.
  Specifies the maximum number of segments in the media manifest file. After this maximum, older segments are removed from the media manifest. This number must be smaller than the number in the Keep Segments field.
    */
  var IndexNSegments: js.UndefOr[integerMin3] = js.native
  
  /**
    * Parameter that control output group behavior on input loss.
    */
  var InputLossAction: js.UndefOr[InputLossActionForHlsOut] = js.native
  
  /**
    * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not in the manifest.
    */
  var IvInManifest: js.UndefOr[HlsIvInManifest] = js.native
  
  /**
    * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change every segment (to match the segment number). If this is set to "explicit", you must enter a constantIv value.
    */
  var IvSource: js.UndefOr[HlsIvSource] = js.native
  
  /**
    * Applies only if Mode field is LIVE.
  Specifies the number of media segments to retain in the destination directory. This number should be bigger than indexNSegments (Num segments). We recommend (value = (2 x indexNsegments) + 1).
  If this "keep segments" number is too low, the following might happen: the player is still reading a media manifest file that lists this segment, but that segment has been removed from the destination directory (as directed by indexNSegments). This situation would result in a 404 HTTP error on the player.
    */
  var KeepSegments: js.UndefOr[integerMin1] = js.native
  
  /**
    * The value specifies how the key is represented in the resource identified by the URI.  If parameter is absent, an implicit value of "identity" is used.  A reverse DNS string can also be given.
    */
  var KeyFormat: js.UndefOr[string] = js.native
  
  /**
    * Either a single positive integer version value or a slash delimited list of version values (1/2/3).
    */
  var KeyFormatVersions: js.UndefOr[string] = js.native
  
  /**
    * The key provider settings.
    */
  var KeyProviderSettings: js.UndefOr[typings.awsSdk.medialiveMod.KeyProviderSettings] = js.native
  
  /**
    * When set to gzip, compresses HLS playlist.
    */
  var ManifestCompression: js.UndefOr[HlsManifestCompression] = js.native
  
  /**
    * Indicates whether the output manifest should use floating point or integer values for segment duration.
    */
  var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.native
  
  /**
    * When set, minimumSegmentLength is enforced by looking ahead and back within the specified range for a nearby avail and extending the segment size if needed.
    */
  var MinSegmentLength: js.UndefOr[integerMin0] = js.native
  
  /**
    * If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only the number segments specified in keepSegments and indexNSegments are kept; newer segments replace older segments, which may prevent players from rewinding all the way to the beginning of the event.
  VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type manifest on completion of the stream.
    */
  var Mode: js.UndefOr[HlsMode] = js.native
  
  /**
    * MANIFESTS_AND_SEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this output group.
  VARIANT_MANIFESTS_AND_SEGMENTS: Generates media manifests for this output group, but not a master manifest.
  SEGMENTS_ONLY: Does not generate any manifests for this output group.
    */
  var OutputSelection: js.UndefOr[HlsOutputSelection] = js.native
  
  /**
    * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestampOffset.
    */
  var ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.native
  
  /**
    * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
    */
  var ProgramDateTimePeriod: js.UndefOr[integerMin0Max3600] = js.native
  
  /**
    * ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines: first its own media files, then the media files of the other pipeline. This feature allows playout device that support stale manifest detection to switch from one manifest to the other, when the current manifest seems to be stale. There are still two destinations and two master manifests, but both master manifests reference the media files from both pipelines.
  DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline only.
  For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed. MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is irrelevant.
    */
  var RedundantManifest: js.UndefOr[HlsRedundantManifest] = js.native
  
  /**
    * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer.
    */
  var SegmentLength: js.UndefOr[integerMin1] = js.native
  
  /**
    * useInputSegmentation has been deprecated. The configured segment size is always used.
    */
  var SegmentationMode: js.UndefOr[HlsSegmentationMode] = js.native
  
  /**
    * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be subdirectoryPerStream for this setting to have an effect.
    */
  var SegmentsPerSubdirectory: js.UndefOr[integerMin1] = js.native
  
  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  var StreamInfResolution: js.UndefOr[HlsStreamInfResolution] = js.native
  
  /**
    * Indicates ID3 frame that has the timecode.
    */
  var TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame] = js.native
  
  /**
    * Timed Metadata interval in seconds.
    */
  var TimedMetadataId3Period: js.UndefOr[integerMin0] = js.native
  
  /**
    * Provides an extra millisecond delta offset to fine tune the timestamps.
    */
  var TimestampDeltaMilliseconds: js.UndefOr[integerMin0] = js.native
  
  /**
    * SEGMENTED_FILES: Emit the program as segments - multiple .ts media files.
  SINGLE_FILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media manifest includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is when sending the output to AWS Elemental MediaConvert, which can accept only a single media file. Playback while the channel is running is not guaranteed due to HTTP server caching.
    */
  var TsFileMode: js.UndefOr[HlsTsFileMode] = js.native
}
object HlsGroupSettings {
  
  @scala.inline
  def apply(Destination: OutputLocationRef): HlsGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsGroupSettings]
  }
  
  @scala.inline
  implicit class HlsGroupSettingsOps[Self <: HlsGroupSettings] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: OutputLocationRef): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdMarkersVarargs(value: HlsAdMarkers*): Self = this.set("AdMarkers", js.Array(value :_*))
    
    @scala.inline
    def setAdMarkers(value: listOfHlsAdMarkers): Self = this.set("AdMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdMarkers: Self = this.set("AdMarkers", js.undefined)
    
    @scala.inline
    def setBaseUrlContent(value: string): Self = this.set("BaseUrlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrlContent: Self = this.set("BaseUrlContent", js.undefined)
    
    @scala.inline
    def setBaseUrlContent1(value: string): Self = this.set("BaseUrlContent1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrlContent1: Self = this.set("BaseUrlContent1", js.undefined)
    
    @scala.inline
    def setBaseUrlManifest(value: string): Self = this.set("BaseUrlManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrlManifest: Self = this.set("BaseUrlManifest", js.undefined)
    
    @scala.inline
    def setBaseUrlManifest1(value: string): Self = this.set("BaseUrlManifest1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrlManifest1: Self = this.set("BaseUrlManifest1", js.undefined)
    
    @scala.inline
    def setCaptionLanguageMappingsVarargs(value: CaptionLanguageMapping*): Self = this.set("CaptionLanguageMappings", js.Array(value :_*))
    
    @scala.inline
    def setCaptionLanguageMappings(value: listOfCaptionLanguageMapping): Self = this.set("CaptionLanguageMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionLanguageMappings: Self = this.set("CaptionLanguageMappings", js.undefined)
    
    @scala.inline
    def setCaptionLanguageSetting(value: HlsCaptionLanguageSetting): Self = this.set("CaptionLanguageSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionLanguageSetting: Self = this.set("CaptionLanguageSetting", js.undefined)
    
    @scala.inline
    def setClientCache(value: HlsClientCache): Self = this.set("ClientCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCache: Self = this.set("ClientCache", js.undefined)
    
    @scala.inline
    def setCodecSpecification(value: HlsCodecSpecification): Self = this.set("CodecSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodecSpecification: Self = this.set("CodecSpecification", js.undefined)
    
    @scala.inline
    def setConstantIv(value: stringMin32Max32): Self = this.set("ConstantIv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstantIv: Self = this.set("ConstantIv", js.undefined)
    
    @scala.inline
    def setDirectoryStructure(value: HlsDirectoryStructure): Self = this.set("DirectoryStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryStructure: Self = this.set("DirectoryStructure", js.undefined)
    
    @scala.inline
    def setDiscontinuityTags(value: HlsDiscontinuityTags): Self = this.set("DiscontinuityTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscontinuityTags: Self = this.set("DiscontinuityTags", js.undefined)
    
    @scala.inline
    def setEncryptionType(value: HlsEncryptionType): Self = this.set("EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionType: Self = this.set("EncryptionType", js.undefined)
    
    @scala.inline
    def setHlsCdnSettings(value: HlsCdnSettings): Self = this.set("HlsCdnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsCdnSettings: Self = this.set("HlsCdnSettings", js.undefined)
    
    @scala.inline
    def setHlsId3SegmentTagging(value: HlsId3SegmentTaggingState): Self = this.set("HlsId3SegmentTagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsId3SegmentTagging: Self = this.set("HlsId3SegmentTagging", js.undefined)
    
    @scala.inline
    def setIFrameOnlyPlaylists(value: IFrameOnlyPlaylistType): Self = this.set("IFrameOnlyPlaylists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIFrameOnlyPlaylists: Self = this.set("IFrameOnlyPlaylists", js.undefined)
    
    @scala.inline
    def setIncompleteSegmentBehavior(value: HlsIncompleteSegmentBehavior): Self = this.set("IncompleteSegmentBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncompleteSegmentBehavior: Self = this.set("IncompleteSegmentBehavior", js.undefined)
    
    @scala.inline
    def setIndexNSegments(value: integerMin3): Self = this.set("IndexNSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexNSegments: Self = this.set("IndexNSegments", js.undefined)
    
    @scala.inline
    def setInputLossAction(value: InputLossActionForHlsOut): Self = this.set("InputLossAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLossAction: Self = this.set("InputLossAction", js.undefined)
    
    @scala.inline
    def setIvInManifest(value: HlsIvInManifest): Self = this.set("IvInManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIvInManifest: Self = this.set("IvInManifest", js.undefined)
    
    @scala.inline
    def setIvSource(value: HlsIvSource): Self = this.set("IvSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIvSource: Self = this.set("IvSource", js.undefined)
    
    @scala.inline
    def setKeepSegments(value: integerMin1): Self = this.set("KeepSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepSegments: Self = this.set("KeepSegments", js.undefined)
    
    @scala.inline
    def setKeyFormat(value: string): Self = this.set("KeyFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyFormat: Self = this.set("KeyFormat", js.undefined)
    
    @scala.inline
    def setKeyFormatVersions(value: string): Self = this.set("KeyFormatVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyFormatVersions: Self = this.set("KeyFormatVersions", js.undefined)
    
    @scala.inline
    def setKeyProviderSettings(value: KeyProviderSettings): Self = this.set("KeyProviderSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyProviderSettings: Self = this.set("KeyProviderSettings", js.undefined)
    
    @scala.inline
    def setManifestCompression(value: HlsManifestCompression): Self = this.set("ManifestCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestCompression: Self = this.set("ManifestCompression", js.undefined)
    
    @scala.inline
    def setManifestDurationFormat(value: HlsManifestDurationFormat): Self = this.set("ManifestDurationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestDurationFormat: Self = this.set("ManifestDurationFormat", js.undefined)
    
    @scala.inline
    def setMinSegmentLength(value: integerMin0): Self = this.set("MinSegmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSegmentLength: Self = this.set("MinSegmentLength", js.undefined)
    
    @scala.inline
    def setMode(value: HlsMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    
    @scala.inline
    def setOutputSelection(value: HlsOutputSelection): Self = this.set("OutputSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSelection: Self = this.set("OutputSelection", js.undefined)
    
    @scala.inline
    def setProgramDateTime(value: HlsProgramDateTime): Self = this.set("ProgramDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgramDateTime: Self = this.set("ProgramDateTime", js.undefined)
    
    @scala.inline
    def setProgramDateTimePeriod(value: integerMin0Max3600): Self = this.set("ProgramDateTimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgramDateTimePeriod: Self = this.set("ProgramDateTimePeriod", js.undefined)
    
    @scala.inline
    def setRedundantManifest(value: HlsRedundantManifest): Self = this.set("RedundantManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedundantManifest: Self = this.set("RedundantManifest", js.undefined)
    
    @scala.inline
    def setSegmentLength(value: integerMin1): Self = this.set("SegmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentLength: Self = this.set("SegmentLength", js.undefined)
    
    @scala.inline
    def setSegmentationMode(value: HlsSegmentationMode): Self = this.set("SegmentationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentationMode: Self = this.set("SegmentationMode", js.undefined)
    
    @scala.inline
    def setSegmentsPerSubdirectory(value: integerMin1): Self = this.set("SegmentsPerSubdirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentsPerSubdirectory: Self = this.set("SegmentsPerSubdirectory", js.undefined)
    
    @scala.inline
    def setStreamInfResolution(value: HlsStreamInfResolution): Self = this.set("StreamInfResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamInfResolution: Self = this.set("StreamInfResolution", js.undefined)
    
    @scala.inline
    def setTimedMetadataId3Frame(value: HlsTimedMetadataId3Frame): Self = this.set("TimedMetadataId3Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimedMetadataId3Frame: Self = this.set("TimedMetadataId3Frame", js.undefined)
    
    @scala.inline
    def setTimedMetadataId3Period(value: integerMin0): Self = this.set("TimedMetadataId3Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimedMetadataId3Period: Self = this.set("TimedMetadataId3Period", js.undefined)
    
    @scala.inline
    def setTimestampDeltaMilliseconds(value: integerMin0): Self = this.set("TimestampDeltaMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampDeltaMilliseconds: Self = this.set("TimestampDeltaMilliseconds", js.undefined)
    
    @scala.inline
    def setTsFileMode(value: HlsTsFileMode): Self = this.set("TsFileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTsFileMode: Self = this.set("TsFileMode", js.undefined)
  }
}
